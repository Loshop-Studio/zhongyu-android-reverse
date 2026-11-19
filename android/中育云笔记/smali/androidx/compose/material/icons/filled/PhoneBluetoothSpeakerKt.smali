.class public final Landroidx/compose/material/icons/filled/PhoneBluetoothSpeakerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _phoneBluetoothSpeaker:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneBluetoothSpeaker(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PhoneBluetoothSpeakerKt;->_phoneBluetoothSpeaker:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.PhoneBluetoothSpeaker"

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
    const/high16 v0, 0x41180000    # 9.5f

    .line 71
    .line 72
    const v2, 0x416b5c29    # 14.71f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x40e6b852    # 7.21f

    .line 79
    .line 80
    .line 81
    const/high16 v2, 0x41880000    # 17.0f

    .line 82
    .line 83
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v0, 0x41300000    # 11.0f

    .line 87
    .line 88
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v0, 0x3f000000    # 0.5f

    .line 92
    .line 93
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v0, 0x40366666    # 2.85f

    .line 97
    .line 98
    .line 99
    const v2, -0x3fc9999a    # -2.85f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, 0x4191ae14    # 18.21f

    .line 106
    .line 107
    .line 108
    const/high16 v2, 0x40c00000    # 6.0f

    .line 109
    .line 110
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v0, 0x4009999a    # 2.15f

    .line 114
    .line 115
    .line 116
    const v2, -0x3ff66666    # -2.15f

    .line 117
    .line 118
    .line 119
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v0, 0x418c0000    # 17.5f

    .line 123
    .line 124
    const/high16 v2, 0x3f800000    # 1.0f

    .line 125
    .line 126
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v0, 0x3f800000    # 1.0f

    .line 130
    .line 131
    const/high16 v2, 0x41880000    # 17.0f

    .line 132
    .line 133
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, 0x40728f5c    # 3.79f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v0, 0x40200000    # 2.5f

    .line 143
    .line 144
    const v2, 0x416b5c29    # 14.71f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, -0x40ca3d71    # -0.71f

    .line 151
    .line 152
    .line 153
    const v2, 0x3f35c28f    # 0.71f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, 0x418651ec    # 16.79f

    .line 160
    .line 161
    .line 162
    const/high16 v2, 0x40c00000    # 6.0f

    .line 163
    .line 164
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, 0x41600000    # 14.0f

    .line 168
    .line 169
    const v2, 0x410ca3d7    # 8.79f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x3f35c28f    # 0.71f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v0, 0x403a3d71    # 2.91f

    .line 185
    .line 186
    .line 187
    const/high16 v2, 0x41900000    # 18.0f

    .line 188
    .line 189
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x3f70a3d7    # 0.94f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, -0x408f5c29    # -0.94f

    .line 199
    .line 200
    .line 201
    const v2, 0x3f70a3d7    # 0.94f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x403a3d71    # 2.91f

    .line 208
    .line 209
    .line 210
    const/high16 v2, 0x41900000    # 18.0f

    .line 211
    .line 212
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v0, 0x40e6b852    # 7.21f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x3f70a3d7    # 0.94f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, -0x408f5c29    # -0.94f

    .line 231
    .line 232
    .line 233
    const v2, 0x3f70a3d7    # 0.94f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v0, 0x40e6b852    # 7.21f

    .line 240
    .line 241
    .line 242
    const/high16 v2, 0x41900000    # 18.0f

    .line 243
    .line 244
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v0, 0x41a00000    # 20.0f

    .line 251
    .line 252
    const/high16 v2, 0x41780000    # 15.5f

    .line 253
    .line 254
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v17, -0x3f9b851f    # -3.57f

    .line 258
    .line 259
    .line 260
    const v18, -0x40ee147b    # -0.57f

    .line 261
    .line 262
    .line 263
    const/high16 v13, -0x40600000    # -1.25f

    .line 264
    .line 265
    const/4 v14, 0x0

    .line 266
    const v15, -0x3fe33333    # -2.45f

    .line 267
    .line 268
    .line 269
    const v16, -0x41b33333    # -0.2f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, -0x407d70a4    # -1.02f

    .line 276
    .line 277
    .line 278
    const v18, 0x3e75c28f    # 0.24f

    .line 279
    .line 280
    .line 281
    const v13, -0x414ccccd    # -0.35f

    .line 282
    .line 283
    .line 284
    const v14, -0x421eb852    # -0.11f

    .line 285
    .line 286
    .line 287
    const v15, -0x40c28f5c    # -0.74f

    .line 288
    .line 289
    .line 290
    const v16, -0x430a3d71    # -0.03f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, -0x3ff33333    # -2.2f

    .line 297
    .line 298
    .line 299
    const v2, 0x400ccccd    # 2.2f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, -0x3f2d1eb8    # -6.59f

    .line 306
    .line 307
    .line 308
    const v18, -0x3f2d1eb8    # -6.59f

    .line 309
    .line 310
    .line 311
    const v13, -0x3fcae148    # -2.83f

    .line 312
    .line 313
    .line 314
    const v14, -0x4047ae14    # -1.44f

    .line 315
    .line 316
    .line 317
    const v15, -0x3f5b3333    # -5.15f

    .line 318
    .line 319
    .line 320
    const/high16 v16, -0x3f900000    # -3.75f

    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v0, -0x3ff28f5c    # -2.21f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v17, 0x3e800000    # 0.25f

    .line 332
    .line 333
    const/high16 v18, -0x40800000    # -1.0f

    .line 334
    .line 335
    const v13, 0x3e8f5c29    # 0.28f

    .line 336
    .line 337
    .line 338
    const v14, -0x417ae148    # -0.26f

    .line 339
    .line 340
    .line 341
    const v15, 0x3eb851ec    # 0.36f

    .line 342
    .line 343
    .line 344
    const v16, -0x40d9999a    # -0.65f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v17, 0x41080000    # 8.5f

    .line 351
    .line 352
    const/high16 v18, 0x40800000    # 4.0f

    .line 353
    .line 354
    const v13, 0x410b3333    # 8.7f

    .line 355
    .line 356
    .line 357
    const v14, 0x40ce6666    # 6.45f

    .line 358
    .line 359
    .line 360
    const/high16 v15, 0x41080000    # 8.5f

    .line 361
    .line 362
    const/high16 v16, 0x40a80000    # 5.25f

    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v17, -0x40800000    # -1.0f

    .line 368
    .line 369
    const/high16 v18, -0x40800000    # -1.0f

    .line 370
    .line 371
    const/4 v13, 0x0

    .line 372
    const v14, -0x40f33333    # -0.55f

    .line 373
    .line 374
    .line 375
    const v15, -0x4119999a    # -0.45f

    .line 376
    .line 377
    .line 378
    const/high16 v16, -0x40800000    # -1.0f

    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v0, 0x40800000    # 4.0f

    .line 384
    .line 385
    const/high16 v2, 0x40400000    # 3.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v18, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const v13, -0x40f33333    # -0.55f

    .line 393
    .line 394
    .line 395
    const/4 v14, 0x0

    .line 396
    const/high16 v15, -0x40800000    # -1.0f

    .line 397
    .line 398
    const v16, 0x3ee66666    # 0.45f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v17, 0x41880000    # 17.0f

    .line 405
    .line 406
    const/high16 v18, 0x41880000    # 17.0f

    .line 407
    .line 408
    const/4 v13, 0x0

    .line 409
    const v14, 0x41163d71    # 9.39f

    .line 410
    .line 411
    .line 412
    const v15, 0x40f3851f    # 7.61f

    .line 413
    .line 414
    .line 415
    const/high16 v16, 0x41880000    # 17.0f

    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v17, 0x3f800000    # 1.0f

    .line 421
    .line 422
    const/high16 v18, -0x40800000    # -1.0f

    .line 423
    .line 424
    const v13, 0x3f0ccccd    # 0.55f

    .line 425
    .line 426
    .line 427
    const/4 v14, 0x0

    .line 428
    const/high16 v15, 0x3f800000    # 1.0f

    .line 429
    .line 430
    const v16, -0x4119999a    # -0.45f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 437
    .line 438
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v17, -0x40800000    # -1.0f

    .line 442
    .line 443
    const/4 v13, 0x0

    .line 444
    const v14, -0x40f33333    # -0.55f

    .line 445
    .line 446
    .line 447
    const v15, -0x4119999a    # -0.45f

    .line 448
    .line 449
    .line 450
    const/high16 v16, -0x40800000    # -1.0f

    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    const/16 v16, 0x3800

    .line 463
    .line 464
    const/16 v17, 0x0

    .line 465
    .line 466
    const/high16 v6, 0x3f800000    # 1.0f

    .line 467
    .line 468
    const/high16 v8, 0x3f800000    # 1.0f

    .line 469
    .line 470
    const/4 v7, 0x0

    .line 471
    const/high16 v9, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/high16 v12, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/4 v14, 0x0

    .line 476
    const/4 v15, 0x0

    .line 477
    const-string v4, ""

    .line 478
    .line 479
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    sput-object v0, Landroidx/compose/material/icons/filled/PhoneBluetoothSpeakerKt;->_phoneBluetoothSpeaker:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 488
    .line 489
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    return-object v0
.end method
