.class public final Landroidx/compose/material/icons/outlined/SettingsSuggestKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _settingsSuggest:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsSuggest(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SettingsSuggestKt;->_settingsSuggest:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SettingsSuggest"

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
    const/high16 v0, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v2, 0x41200000    # 10.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x3f800000    # 1.0f

    .line 78
    .line 79
    const/high16 v18, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const v13, 0x3f0ccccd    # 0.55f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const v16, 0x3ee66666    # 0.45f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, 0x3f800000    # 1.0f

    .line 94
    .line 95
    const v2, -0x4119999a    # -0.45f

    .line 96
    .line 97
    .line 98
    const/high16 v4, -0x40800000    # -1.0f

    .line 99
    .line 100
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v0, -0x4119999a    # -0.45f

    .line 104
    .line 105
    .line 106
    const/high16 v2, -0x40800000    # -1.0f

    .line 107
    .line 108
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x41173333    # 9.45f

    .line 112
    .line 113
    .line 114
    const/high16 v2, 0x41500000    # 13.0f

    .line 115
    .line 116
    const/high16 v4, 0x41200000    # 10.0f

    .line 117
    .line 118
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v0, 0x41300000    # 11.0f

    .line 122
    .line 123
    const/high16 v2, 0x41200000    # 10.0f

    .line 124
    .line 125
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 129
    .line 130
    const/high16 v18, 0x40400000    # 3.0f

    .line 131
    .line 132
    const v13, -0x402b851f    # -1.66f

    .line 133
    .line 134
    .line 135
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 136
    .line 137
    const v16, 0x3fab851f    # 1.34f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v0, 0x3fab851f    # 1.34f

    .line 144
    .line 145
    .line 146
    const/high16 v2, 0x40400000    # 3.0f

    .line 147
    .line 148
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v0, -0x40547ae1    # -1.34f

    .line 152
    .line 153
    .line 154
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 155
    .line 156
    const/high16 v4, 0x40400000    # 3.0f

    .line 157
    .line 158
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v0, 0x413a8f5c    # 11.66f

    .line 162
    .line 163
    .line 164
    const/high16 v2, 0x41300000    # 11.0f

    .line 165
    .line 166
    const/high16 v4, 0x41200000    # 10.0f

    .line 167
    .line 168
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v0, 0x41300000    # 11.0f

    .line 172
    .line 173
    const/high16 v2, 0x41200000    # 10.0f

    .line 174
    .line 175
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v0, 0x41100000    # 9.0f

    .line 182
    .line 183
    const/high16 v2, 0x41940000    # 18.5f

    .line 184
    .line 185
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v0, 0x3f8b851f    # 1.09f

    .line 189
    .line 190
    .line 191
    const v2, -0x3fe5c28f    # -2.41f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v0, 0x40b00000    # 5.5f

    .line 198
    .line 199
    const/high16 v2, 0x41b00000    # 22.0f

    .line 200
    .line 201
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, -0x40747ae1    # -1.09f

    .line 205
    .line 206
    .line 207
    const v2, -0x3fe5c28f    # -2.41f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v0, 0x40000000    # 2.0f

    .line 214
    .line 215
    const/high16 v2, 0x41940000    # 18.5f

    .line 216
    .line 217
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, 0x401a3d71    # 2.41f

    .line 221
    .line 222
    .line 223
    const v2, -0x40747ae1    # -1.09f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v0, 0x41700000    # 15.0f

    .line 230
    .line 231
    const/high16 v2, 0x40b00000    # 5.5f

    .line 232
    .line 233
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v0, 0x401a3d71    # 2.41f

    .line 237
    .line 238
    .line 239
    const v2, 0x3f8b851f    # 1.09f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v0, 0x41100000    # 9.0f

    .line 246
    .line 247
    const/high16 v2, 0x41940000    # 18.5f

    .line 248
    .line 249
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v0, 0x414b851f    # 12.72f

    .line 256
    .line 257
    .line 258
    const v2, 0x41aa3d71    # 21.28f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x41a40000    # 20.5f

    .line 265
    .line 266
    const/high16 v2, 0x41300000    # 11.0f

    .line 267
    .line 268
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v0, -0x40b851ec    # -0.78f

    .line 272
    .line 273
    .line 274
    const v2, 0x3fdc28f6    # 1.72f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v0, 0x41900000    # 18.0f

    .line 281
    .line 282
    const/high16 v2, 0x41580000    # 13.5f

    .line 283
    .line 284
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, 0x3fdc28f6    # 1.72f

    .line 288
    .line 289
    .line 290
    const v2, 0x3f47ae14    # 0.78f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v0, 0x41800000    # 16.0f

    .line 297
    .line 298
    const/high16 v2, 0x41a40000    # 20.5f

    .line 299
    .line 300
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v0, 0x3f47ae14    # 0.78f

    .line 304
    .line 305
    .line 306
    const v2, -0x4023d70a    # -1.72f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v0, 0x41b80000    # 23.0f

    .line 313
    .line 314
    const/high16 v2, 0x41580000    # 13.5f

    .line 315
    .line 316
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, 0x414b851f    # 12.72f

    .line 320
    .line 321
    .line 322
    const v2, 0x41aa3d71    # 21.28f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x41820000    # 16.25f

    .line 332
    .line 333
    const/high16 v2, 0x41600000    # 14.0f

    .line 334
    .line 335
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, -0x43dc28f6    # -0.01f

    .line 339
    .line 340
    .line 341
    const v18, -0x41428f5c    # -0.37f

    .line 342
    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    const v14, -0x420a3d71    # -0.12f

    .line 346
    .line 347
    .line 348
    const/4 v15, 0x0

    .line 349
    const/high16 v16, -0x41800000    # -0.25f

    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v0, 0x3ff851ec    # 1.94f

    .line 355
    .line 356
    .line 357
    const v2, -0x4043d70a    # -1.47f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 364
    .line 365
    const v2, -0x3f7570a4    # -4.33f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v0, -0x3ff0a3d7    # -2.24f

    .line 372
    .line 373
    .line 374
    const v2, 0x3f70a3d7    # 0.94f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v17, -0x40dc28f6    # -0.64f

    .line 381
    .line 382
    .line 383
    const v13, -0x41b33333    # -0.2f

    .line 384
    .line 385
    .line 386
    const v14, -0x41fae148    # -0.13f

    .line 387
    .line 388
    .line 389
    const v15, -0x4128f5c3    # -0.42f

    .line 390
    .line 391
    .line 392
    const v16, -0x417ae148    # -0.26f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v0, 0x41480000    # 12.5f

    .line 399
    .line 400
    const/high16 v2, 0x40c00000    # 6.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v0, -0x3f600000    # -5.0f

    .line 406
    .line 407
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, 0x40e66666    # 7.2f

    .line 411
    .line 412
    .line 413
    const v2, 0x41068f5c    # 8.41f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v17, 0x40d1eb85    # 6.56f

    .line 420
    .line 421
    .line 422
    const v18, 0x410c7ae1    # 8.78f

    .line 423
    .line 424
    .line 425
    const v13, 0x40df5c29    # 6.98f

    .line 426
    .line 427
    .line 428
    const v14, 0x410851ec    # 8.52f

    .line 429
    .line 430
    .line 431
    const v15, 0x40d8a3d7    # 6.77f

    .line 432
    .line 433
    .line 434
    const v16, 0x410a6666    # 8.65f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, 0x408a3d71    # 4.32f

    .line 441
    .line 442
    .line 443
    const v2, 0x40fa8f5c    # 7.83f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 450
    .line 451
    const v2, 0x408a8f5c    # 4.33f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v0, 0x3ff851ec    # 1.94f

    .line 458
    .line 459
    .line 460
    const v2, 0x3fbc28f6    # 1.47f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v17, 0x40700000    # 3.75f

    .line 467
    .line 468
    const/high16 v18, 0x41600000    # 14.0f

    .line 469
    .line 470
    const/high16 v13, 0x40700000    # 3.75f

    .line 471
    .line 472
    const/high16 v14, 0x415c0000    # 13.75f

    .line 473
    .line 474
    const/high16 v15, 0x40700000    # 3.75f

    .line 475
    .line 476
    const v16, 0x415e147b    # 13.88f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, 0x3c23d70a    # 0.01f

    .line 483
    .line 484
    .line 485
    const v2, 0x3ebd70a4    # 0.37f

    .line 486
    .line 487
    .line 488
    const/4 v4, 0x0

    .line 489
    const/high16 v6, 0x3e800000    # 0.25f

    .line 490
    .line 491
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v0, -0x4007ae14    # -1.94f

    .line 495
    .line 496
    .line 497
    const v2, 0x3fbc28f6    # 1.47f

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v0, 0x40200000    # 2.5f

    .line 504
    .line 505
    const v2, 0x408a8f5c    # 4.33f

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v0, 0x400f5c29    # 2.24f

    .line 512
    .line 513
    .line 514
    const v2, -0x408f5c29    # -0.94f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v17, 0x3f23d70a    # 0.64f

    .line 521
    .line 522
    .line 523
    const v18, 0x3ebd70a4    # 0.37f

    .line 524
    .line 525
    .line 526
    const v13, 0x3e4ccccd    # 0.2f

    .line 527
    .line 528
    .line 529
    const v14, 0x3e051eb8    # 0.13f

    .line 530
    .line 531
    .line 532
    const v15, 0x3ed70a3d    # 0.42f

    .line 533
    .line 534
    .line 535
    const v16, 0x3e851eb8    # 0.26f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v0, 0x40f00000    # 7.5f

    .line 542
    .line 543
    const/high16 v2, 0x41b00000    # 22.0f

    .line 544
    .line 545
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v0, 0x40a00000    # 5.0f

    .line 549
    .line 550
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, 0x3e99999a    # 0.3f

    .line 554
    .line 555
    .line 556
    const v2, -0x3fe5c28f    # -2.41f

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v18, -0x41428f5c    # -0.37f

    .line 563
    .line 564
    .line 565
    const v13, 0x3e6147ae    # 0.22f

    .line 566
    .line 567
    .line 568
    const v14, -0x421eb852    # -0.11f

    .line 569
    .line 570
    .line 571
    const v15, 0x3edc28f6    # 0.43f

    .line 572
    .line 573
    .line 574
    const v16, -0x41947ae1    # -0.23f

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v0, 0x400f5c29    # 2.24f

    .line 581
    .line 582
    .line 583
    const v2, 0x3f70a3d7    # 0.94f

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v0, 0x40200000    # 2.5f

    .line 590
    .line 591
    const v2, -0x3f7570a4    # -4.33f

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v0, -0x4007ae14    # -1.94f

    .line 598
    .line 599
    .line 600
    const v2, -0x4043d70a    # -1.47f

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v17, 0x41820000    # 16.25f

    .line 607
    .line 608
    const/high16 v18, 0x41600000    # 14.0f

    .line 609
    .line 610
    const/high16 v13, 0x41820000    # 16.25f

    .line 611
    .line 612
    const/high16 v14, 0x41640000    # 14.25f

    .line 613
    .line 614
    const/high16 v15, 0x41820000    # 16.25f

    .line 615
    .line 616
    const v16, 0x4161eb85    # 14.12f

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v0, 0x416d47ae    # 14.83f

    .line 626
    .line 627
    .line 628
    const v2, 0x418d1eb8    # 17.64f

    .line 629
    .line 630
    .line 631
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v0, -0x40228f5c    # -1.73f

    .line 635
    .line 636
    .line 637
    const v2, -0x40c51eb8    # -0.73f

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v17, -0x3ff7ae14    # -2.13f

    .line 644
    .line 645
    .line 646
    const v18, 0x3f9d70a4    # 1.23f

    .line 647
    .line 648
    .line 649
    const v13, -0x40f0a3d7    # -0.56f

    .line 650
    .line 651
    .line 652
    const v14, 0x3f19999a    # 0.6f

    .line 653
    .line 654
    .line 655
    const v15, -0x4059999a    # -1.3f

    .line 656
    .line 657
    .line 658
    const v16, 0x3f851eb8    # 1.04f

    .line 659
    .line 660
    .line 661
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v0, 0x412bae14    # 10.73f

    .line 665
    .line 666
    .line 667
    const/high16 v2, 0x41a00000    # 20.0f

    .line 668
    .line 669
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v0, 0x411451ec    # 9.27f

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v0, -0x41947ae1    # -0.23f

    .line 679
    .line 680
    .line 681
    const v2, -0x4011eb85    # -1.86f

    .line 682
    .line 683
    .line 684
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v18, -0x40628f5c    # -1.23f

    .line 688
    .line 689
    .line 690
    const v13, -0x40ab851f    # -0.83f

    .line 691
    .line 692
    .line 693
    const v14, -0x41bd70a4    # -0.19f

    .line 694
    .line 695
    .line 696
    const v15, -0x40370a3d    # -1.57f

    .line 697
    .line 698
    .line 699
    const v16, -0x40deb852    # -0.63f

    .line 700
    .line 701
    .line 702
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v0, -0x40228f5c    # -1.73f

    .line 706
    .line 707
    .line 708
    const v2, 0x3f3ae148    # 0.73f

    .line 709
    .line 710
    .line 711
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v0, -0x405d70a4    # -1.27f

    .line 715
    .line 716
    .line 717
    const v2, -0x40c51eb8    # -0.73f

    .line 718
    .line 719
    .line 720
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v0, 0x3fbeb852    # 1.49f

    .line 724
    .line 725
    .line 726
    const v2, -0x406f5c29    # -1.13f

    .line 727
    .line 728
    .line 729
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const v17, -0x41c7ae14    # -0.18f

    .line 733
    .line 734
    .line 735
    const v13, -0x420a3d71    # -0.12f

    .line 736
    .line 737
    .line 738
    const v14, -0x413851ec    # -0.39f

    .line 739
    .line 740
    .line 741
    const v15, -0x41c7ae14    # -0.18f

    .line 742
    .line 743
    .line 744
    const v16, -0x40b33333    # -0.8f

    .line 745
    .line 746
    .line 747
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v17, 0x3e3851ec    # 0.18f

    .line 751
    .line 752
    .line 753
    const/4 v13, 0x0

    .line 754
    const v14, -0x4123d70a    # -0.43f

    .line 755
    .line 756
    .line 757
    const v15, 0x3d75c28f    # 0.06f

    .line 758
    .line 759
    .line 760
    const v16, -0x40a8f5c3    # -0.84f

    .line 761
    .line 762
    .line 763
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const v0, -0x404147ae    # -1.49f

    .line 767
    .line 768
    .line 769
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const v0, -0x405d70a4    # -1.27f

    .line 773
    .line 774
    .line 775
    const v2, 0x3f3ae148    # 0.73f

    .line 776
    .line 777
    .line 778
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const v0, 0x3fdd70a4    # 1.73f

    .line 782
    .line 783
    .line 784
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const v17, 0x400851ec    # 2.13f

    .line 788
    .line 789
    .line 790
    const v13, 0x3f0f5c29    # 0.56f

    .line 791
    .line 792
    .line 793
    const v14, -0x40e66666    # -0.6f

    .line 794
    .line 795
    .line 796
    const v15, 0x3fa66666    # 1.3f

    .line 797
    .line 798
    .line 799
    const v16, -0x407ae148    # -1.04f

    .line 800
    .line 801
    .line 802
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const v0, 0x411451ec    # 9.27f

    .line 806
    .line 807
    .line 808
    const/high16 v2, 0x41000000    # 8.0f

    .line 809
    .line 810
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const v0, 0x3fbc28f6    # 1.47f

    .line 814
    .line 815
    .line 816
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const v0, 0x3e6b851f    # 0.23f

    .line 820
    .line 821
    .line 822
    const v2, 0x3fee147b    # 1.86f

    .line 823
    .line 824
    .line 825
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const v18, 0x3f9d70a4    # 1.23f

    .line 829
    .line 830
    .line 831
    const v13, 0x3f547ae1    # 0.83f

    .line 832
    .line 833
    .line 834
    const v14, 0x3e428f5c    # 0.19f

    .line 835
    .line 836
    .line 837
    const v15, 0x3fc8f5c3    # 1.57f

    .line 838
    .line 839
    .line 840
    const v16, 0x3f2147ae    # 0.63f

    .line 841
    .line 842
    .line 843
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const v0, 0x3fdd70a4    # 1.73f

    .line 847
    .line 848
    .line 849
    const v2, -0x40c51eb8    # -0.73f

    .line 850
    .line 851
    .line 852
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const v0, 0x3fa28f5c    # 1.27f

    .line 856
    .line 857
    .line 858
    const v2, 0x3f3ae148    # 0.73f

    .line 859
    .line 860
    .line 861
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    const v0, -0x404147ae    # -1.49f

    .line 865
    .line 866
    .line 867
    const v2, 0x3f90a3d7    # 1.13f

    .line 868
    .line 869
    .line 870
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const v17, 0x3e3851ec    # 0.18f

    .line 874
    .line 875
    .line 876
    const v13, 0x3df5c28f    # 0.12f

    .line 877
    .line 878
    .line 879
    const v14, 0x3ec7ae14    # 0.39f

    .line 880
    .line 881
    .line 882
    const v15, 0x3e3851ec    # 0.18f

    .line 883
    .line 884
    .line 885
    const v16, 0x3f4ccccd    # 0.8f

    .line 886
    .line 887
    .line 888
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const v17, -0x41c7ae14    # -0.18f

    .line 892
    .line 893
    .line 894
    const/4 v13, 0x0

    .line 895
    const v14, 0x3edc28f6    # 0.43f

    .line 896
    .line 897
    .line 898
    const v15, -0x428a3d71    # -0.06f

    .line 899
    .line 900
    .line 901
    const v16, 0x3f570a3d    # 0.84f

    .line 902
    .line 903
    .line 904
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 905
    .line 906
    .line 907
    const v0, 0x3fbeb852    # 1.49f

    .line 908
    .line 909
    .line 910
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 911
    .line 912
    .line 913
    const v0, 0x416d47ae    # 14.83f

    .line 914
    .line 915
    .line 916
    const v2, 0x418d1eb8    # 17.64f

    .line 917
    .line 918
    .line 919
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 920
    .line 921
    .line 922
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 926
    .line 927
    .line 928
    move-result-object v2

    .line 929
    const/16 v16, 0x3800

    .line 930
    .line 931
    const/16 v17, 0x0

    .line 932
    .line 933
    const/high16 v6, 0x3f800000    # 1.0f

    .line 934
    .line 935
    const/high16 v8, 0x3f800000    # 1.0f

    .line 936
    .line 937
    const/4 v7, 0x0

    .line 938
    const/high16 v9, 0x3f800000    # 1.0f

    .line 939
    .line 940
    const/high16 v12, 0x3f800000    # 1.0f

    .line 941
    .line 942
    const/4 v14, 0x0

    .line 943
    const/4 v15, 0x0

    .line 944
    const-string v4, ""

    .line 945
    .line 946
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    sput-object v0, Landroidx/compose/material/icons/outlined/SettingsSuggestKt;->_settingsSuggest:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 955
    .line 956
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 957
    .line 958
    .line 959
    return-object v0
.end method
