.class public final Landroidx/compose/material/icons/rounded/PlaylistAddCheckCircleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _playlistAddCheckCircle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPlaylistAddCheckCircle(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PlaylistAddCheckCircleKt;->_playlistAddCheckCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PlaylistAddCheckCircle"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, 0x41400000    # 12.0f

    .line 80
    .line 81
    const v13, 0x40cf5c29    # 6.48f

    .line 82
    .line 83
    .line 84
    const/high16 v14, 0x40000000    # 2.0f

    .line 85
    .line 86
    const/high16 v15, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v16, 0x40cf5c29    # 6.48f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v17, 0x41200000    # 10.0f

    .line 95
    .line 96
    const/high16 v18, 0x41200000    # 10.0f

    .line 97
    .line 98
    const/4 v13, 0x0

    .line 99
    const v14, 0x40b0a3d7    # 5.52f

    .line 100
    .line 101
    .line 102
    const v15, 0x408f5c29    # 4.48f

    .line 103
    .line 104
    .line 105
    const/high16 v16, 0x41200000    # 10.0f

    .line 106
    .line 107
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 111
    .line 112
    const v13, 0x40b0a3d7    # 5.52f

    .line 113
    .line 114
    .line 115
    const/4 v14, 0x0

    .line 116
    const/high16 v15, 0x41200000    # 10.0f

    .line 117
    .line 118
    const v16, -0x3f70a3d7    # -4.48f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v17, 0x41400000    # 12.0f

    .line 125
    .line 126
    const/high16 v18, 0x40000000    # 2.0f

    .line 127
    .line 128
    const/high16 v13, 0x41b00000    # 22.0f

    .line 129
    .line 130
    const v14, 0x40cf5c29    # 6.48f

    .line 131
    .line 132
    .line 133
    const v15, 0x418c28f6    # 17.52f

    .line 134
    .line 135
    .line 136
    const/high16 v16, 0x40000000    # 2.0f

    .line 137
    .line 138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v0, 0x40e00000    # 7.0f

    .line 145
    .line 146
    const/high16 v2, 0x41000000    # 8.0f

    .line 147
    .line 148
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, 0x3f800000    # 1.0f

    .line 152
    .line 153
    const/high16 v18, -0x40800000    # -1.0f

    .line 154
    .line 155
    const/4 v13, 0x0

    .line 156
    const v14, -0x40f33333    # -0.55f

    .line 157
    .line 158
    .line 159
    const v15, 0x3ee66666    # 0.45f

    .line 160
    .line 161
    .line 162
    const/high16 v16, -0x40800000    # -1.0f

    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, 0x40a00000    # 5.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v18, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const v13, 0x3f0ccccd    # 0.55f

    .line 175
    .line 176
    .line 177
    const/4 v14, 0x0

    .line 178
    const/high16 v15, 0x3f800000    # 1.0f

    .line 179
    .line 180
    const v16, 0x3ee66666    # 0.45f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/4 v0, 0x0

    .line 187
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v17, -0x40800000    # -1.0f

    .line 191
    .line 192
    const/4 v13, 0x0

    .line 193
    const v14, 0x3f0ccccd    # 0.55f

    .line 194
    .line 195
    .line 196
    const v15, -0x4119999a    # -0.45f

    .line 197
    .line 198
    .line 199
    const/high16 v16, 0x3f800000    # 1.0f

    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x41000000    # 8.0f

    .line 205
    .line 206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v17, 0x40e00000    # 7.0f

    .line 210
    .line 211
    const/high16 v18, 0x41000000    # 8.0f

    .line 212
    .line 213
    const v13, 0x40ee6666    # 7.45f

    .line 214
    .line 215
    .line 216
    const/high16 v14, 0x41100000    # 9.0f

    .line 217
    .line 218
    const/high16 v15, 0x40e00000    # 7.0f

    .line 219
    .line 220
    const v16, 0x4108cccd    # 8.55f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v0, 0x40e00000    # 7.0f

    .line 227
    .line 228
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v0, 0x41300000    # 11.0f

    .line 235
    .line 236
    const/high16 v2, 0x40e00000    # 7.0f

    .line 237
    .line 238
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v17, 0x3f800000    # 1.0f

    .line 242
    .line 243
    const/high16 v18, -0x40800000    # -1.0f

    .line 244
    .line 245
    const/4 v13, 0x0

    .line 246
    const v14, -0x40f33333    # -0.55f

    .line 247
    .line 248
    .line 249
    const v15, 0x3ee66666    # 0.45f

    .line 250
    .line 251
    .line 252
    const/high16 v16, -0x40800000    # -1.0f

    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x40a00000    # 5.0f

    .line 258
    .line 259
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v18, 0x3f800000    # 1.0f

    .line 263
    .line 264
    const v13, 0x3f0ccccd    # 0.55f

    .line 265
    .line 266
    .line 267
    const/4 v14, 0x0

    .line 268
    const/high16 v15, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const v16, 0x3ee66666    # 0.45f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/4 v0, 0x0

    .line 277
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, -0x40800000    # -1.0f

    .line 281
    .line 282
    const/4 v13, 0x0

    .line 283
    const v14, 0x3f0ccccd    # 0.55f

    .line 284
    .line 285
    .line 286
    const v15, -0x4119999a    # -0.45f

    .line 287
    .line 288
    .line 289
    const/high16 v16, 0x3f800000    # 1.0f

    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x41000000    # 8.0f

    .line 295
    .line 296
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v17, 0x40e00000    # 7.0f

    .line 300
    .line 301
    const/high16 v18, 0x41300000    # 11.0f

    .line 302
    .line 303
    const v13, 0x40ee6666    # 7.45f

    .line 304
    .line 305
    .line 306
    const/high16 v14, 0x41400000    # 12.0f

    .line 307
    .line 308
    const/high16 v15, 0x40e00000    # 7.0f

    .line 309
    .line 310
    const v16, 0x4138cccd    # 11.55f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x41300000    # 11.0f

    .line 317
    .line 318
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v0, 0x41600000    # 14.0f

    .line 325
    .line 326
    const/high16 v2, 0x41200000    # 10.0f

    .line 327
    .line 328
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v17, -0x40800000    # -1.0f

    .line 332
    .line 333
    const/high16 v18, 0x3f800000    # 1.0f

    .line 334
    .line 335
    const/4 v13, 0x0

    .line 336
    const v14, 0x3f0ccccd    # 0.55f

    .line 337
    .line 338
    .line 339
    const v15, -0x4119999a    # -0.45f

    .line 340
    .line 341
    .line 342
    const/high16 v16, 0x3f800000    # 1.0f

    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x41000000    # 8.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v18, -0x40800000    # -1.0f

    .line 353
    .line 354
    const v13, -0x40f33333    # -0.55f

    .line 355
    .line 356
    .line 357
    const/4 v14, 0x0

    .line 358
    const/high16 v15, -0x40800000    # -1.0f

    .line 359
    .line 360
    const v16, -0x4119999a    # -0.45f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/4 v0, 0x0

    .line 367
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v17, 0x3f800000    # 1.0f

    .line 371
    .line 372
    const/4 v13, 0x0

    .line 373
    const v14, -0x40f33333    # -0.55f

    .line 374
    .line 375
    .line 376
    const v15, 0x3ee66666    # 0.45f

    .line 377
    .line 378
    .line 379
    const/high16 v16, -0x40800000    # -1.0f

    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v0, 0x3f800000    # 1.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v17, 0x41200000    # 10.0f

    .line 390
    .line 391
    const/high16 v18, 0x41600000    # 14.0f

    .line 392
    .line 393
    const v13, 0x4118cccd    # 9.55f

    .line 394
    .line 395
    .line 396
    const/high16 v14, 0x41500000    # 13.0f

    .line 397
    .line 398
    const/high16 v15, 0x41200000    # 10.0f

    .line 399
    .line 400
    const v16, 0x41573333    # 13.45f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, 0x41600000    # 14.0f

    .line 407
    .line 408
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, 0x419251ec    # 18.29f

    .line 415
    .line 416
    .line 417
    const v2, 0x4161eb85    # 14.12f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, -0x3f9d70a4    # -3.54f

    .line 424
    .line 425
    .line 426
    const v2, 0x40628f5c    # 3.54f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v17, -0x404b851f    # -1.41f

    .line 433
    .line 434
    .line 435
    const/16 v18, 0x0

    .line 436
    .line 437
    const v13, -0x413851ec    # -0.39f

    .line 438
    .line 439
    .line 440
    const v14, 0x3ec7ae14    # 0.39f

    .line 441
    .line 442
    .line 443
    const v15, -0x407d70a4    # -1.02f

    .line 444
    .line 445
    .line 446
    const v16, 0x3ec7ae14    # 0.39f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v0, -0x404b851f    # -1.41f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/16 v17, 0x0

    .line 459
    .line 460
    const v18, -0x404b851f    # -1.41f

    .line 461
    .line 462
    .line 463
    const v14, -0x413851ec    # -0.39f

    .line 464
    .line 465
    .line 466
    const v15, -0x413851ec    # -0.39f

    .line 467
    .line 468
    .line 469
    const v16, -0x407d70a4    # -1.02f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v17, 0x3fb47ae1    # 1.41f

    .line 476
    .line 477
    .line 478
    const/16 v18, 0x0

    .line 479
    .line 480
    const v13, 0x3ec7ae14    # 0.39f

    .line 481
    .line 482
    .line 483
    const v15, 0x3f828f5c    # 1.02f

    .line 484
    .line 485
    .line 486
    const v16, -0x413851ec    # -0.39f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v0, 0x3f35c28f    # 0.71f

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v0, 0x40351eb8    # 2.83f

    .line 499
    .line 500
    .line 501
    const v2, -0x3fcae148    # -2.83f

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v17, 0x419251ec    # 18.29f

    .line 511
    .line 512
    .line 513
    const v18, 0x4161eb85    # 14.12f

    .line 514
    .line 515
    .line 516
    const v13, 0x419570a4    # 18.68f

    .line 517
    .line 518
    .line 519
    const v14, 0x4151999a    # 13.1f

    .line 520
    .line 521
    .line 522
    const v15, 0x419570a4    # 18.68f

    .line 523
    .line 524
    .line 525
    const v16, 0x415bae14    # 13.73f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    const/16 v16, 0x3800

    .line 539
    .line 540
    const/16 v17, 0x0

    .line 541
    .line 542
    const/high16 v6, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/high16 v8, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const/4 v7, 0x0

    .line 547
    const/high16 v9, 0x3f800000    # 1.0f

    .line 548
    .line 549
    const/high16 v12, 0x3f800000    # 1.0f

    .line 550
    .line 551
    const/4 v13, 0x0

    .line 552
    const/4 v14, 0x0

    .line 553
    const/4 v15, 0x0

    .line 554
    const-string v4, ""

    .line 555
    .line 556
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    sput-object v0, Landroidx/compose/material/icons/rounded/PlaylistAddCheckCircleKt;->_playlistAddCheckCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 565
    .line 566
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    return-object v0
.end method
