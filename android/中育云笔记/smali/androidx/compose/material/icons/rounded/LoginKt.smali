.class public final Landroidx/compose/material/icons/rounded/LoginKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _login:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLogin(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LoginKt;->_login:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Login"

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
    const v0, 0x4124cccd    # 10.3f

    .line 71
    .line 72
    .line 73
    const v2, 0x40f66666    # 7.7f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/16 v17, 0x0

    .line 83
    .line 84
    const v18, 0x3fb33333    # 1.4f

    .line 85
    .line 86
    .line 87
    const v13, -0x413851ec    # -0.39f

    .line 88
    .line 89
    .line 90
    const v14, 0x3ec7ae14    # 0.39f

    .line 91
    .line 92
    .line 93
    const v15, -0x413851ec    # -0.39f

    .line 94
    .line 95
    .line 96
    const v16, 0x3f8147ae    # 1.01f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, 0x3ff33333    # 1.9f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v0, 0x40400000    # 3.0f

    .line 109
    .line 110
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v17, -0x40800000    # -1.0f

    .line 114
    .line 115
    const/high16 v18, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const v13, -0x40f33333    # -0.55f

    .line 118
    .line 119
    .line 120
    const/4 v14, 0x0

    .line 121
    const/high16 v15, -0x40800000    # -1.0f

    .line 122
    .line 123
    const v16, 0x3ee66666    # 0.45f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/4 v0, 0x0

    .line 130
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, 0x3f800000    # 1.0f

    .line 134
    .line 135
    const/4 v13, 0x0

    .line 136
    const v14, 0x3f0ccccd    # 0.55f

    .line 137
    .line 138
    .line 139
    const v15, 0x3ee66666    # 0.45f

    .line 140
    .line 141
    .line 142
    const/high16 v16, 0x3f800000    # 1.0f

    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, 0x41133333    # 9.2f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, -0x400ccccd    # -1.9f

    .line 154
    .line 155
    .line 156
    const v2, 0x3ff33333    # 1.9f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/16 v17, 0x0

    .line 163
    .line 164
    const v18, 0x3fb33333    # 1.4f

    .line 165
    .line 166
    .line 167
    const v13, -0x413851ec    # -0.39f

    .line 168
    .line 169
    .line 170
    const v14, 0x3ec7ae14    # 0.39f

    .line 171
    .line 172
    .line 173
    const v15, -0x413851ec    # -0.39f

    .line 174
    .line 175
    .line 176
    const v16, 0x3f8147ae    # 1.01f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/4 v0, 0x0

    .line 183
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, 0x3fb33333    # 1.4f

    .line 187
    .line 188
    .line 189
    const/16 v18, 0x0

    .line 190
    .line 191
    const v13, 0x3ec7ae14    # 0.39f

    .line 192
    .line 193
    .line 194
    const v15, 0x3f8147ae    # 1.01f

    .line 195
    .line 196
    .line 197
    const v16, 0x3ec7ae14    # 0.39f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v0, 0x4065c28f    # 3.59f

    .line 204
    .line 205
    .line 206
    const v2, -0x3f9a3d71    # -3.59f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/16 v17, 0x0

    .line 213
    .line 214
    const v18, -0x404b851f    # -1.41f

    .line 215
    .line 216
    .line 217
    const v14, -0x413851ec    # -0.39f

    .line 218
    .line 219
    .line 220
    const v15, 0x3ec7ae14    # 0.39f

    .line 221
    .line 222
    .line 223
    const v16, -0x407d70a4    # -1.02f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, 0x413b3333    # 11.7f

    .line 230
    .line 231
    .line 232
    const v2, 0x40f66666    # 7.7f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v17, 0x4124cccd    # 10.3f

    .line 239
    .line 240
    .line 241
    const v18, 0x40f66666    # 7.7f

    .line 242
    .line 243
    .line 244
    const v13, 0x4134f5c3    # 11.31f

    .line 245
    .line 246
    .line 247
    const v14, 0x40e9eb85    # 7.31f

    .line 248
    .line 249
    .line 250
    const v15, 0x412b0a3d    # 10.69f

    .line 251
    .line 252
    .line 253
    const v16, 0x40e9eb85    # 7.31f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v0, 0x41a00000    # 20.0f

    .line 263
    .line 264
    const/high16 v2, 0x41980000    # 19.0f

    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v0, -0x3f200000    # -7.0f

    .line 270
    .line 271
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, -0x40800000    # -1.0f

    .line 275
    .line 276
    const/high16 v18, 0x3f800000    # 1.0f

    .line 277
    .line 278
    const v13, -0x40f33333    # -0.55f

    .line 279
    .line 280
    .line 281
    const/4 v14, 0x0

    .line 282
    const/high16 v15, -0x40800000    # -1.0f

    .line 283
    .line 284
    const v16, 0x3ee66666    # 0.45f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/4 v0, 0x0

    .line 291
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v17, 0x3f800000    # 1.0f

    .line 295
    .line 296
    const/4 v13, 0x0

    .line 297
    const v14, 0x3f0ccccd    # 0.55f

    .line 298
    .line 299
    .line 300
    const v15, 0x3ee66666    # 0.45f

    .line 301
    .line 302
    .line 303
    const/high16 v16, 0x3f800000    # 1.0f

    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v0, 0x40e00000    # 7.0f

    .line 309
    .line 310
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v17, 0x40000000    # 2.0f

    .line 314
    .line 315
    const/high16 v18, -0x40000000    # -2.0f

    .line 316
    .line 317
    const v13, 0x3f8ccccd    # 1.1f

    .line 318
    .line 319
    .line 320
    const/4 v14, 0x0

    .line 321
    const/high16 v15, 0x40000000    # 2.0f

    .line 322
    .line 323
    const v16, -0x4099999a    # -0.9f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v0, 0x40a00000    # 5.0f

    .line 330
    .line 331
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v17, -0x40000000    # -2.0f

    .line 335
    .line 336
    const/4 v13, 0x0

    .line 337
    const v14, -0x40733333    # -1.1f

    .line 338
    .line 339
    .line 340
    const v15, -0x4099999a    # -0.9f

    .line 341
    .line 342
    .line 343
    const/high16 v16, -0x40000000    # -2.0f

    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, -0x3f200000    # -7.0f

    .line 349
    .line 350
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v17, -0x40800000    # -1.0f

    .line 354
    .line 355
    const/high16 v18, 0x3f800000    # 1.0f

    .line 356
    .line 357
    const v13, -0x40f33333    # -0.55f

    .line 358
    .line 359
    .line 360
    const/4 v14, 0x0

    .line 361
    const/high16 v15, -0x40800000    # -1.0f

    .line 362
    .line 363
    const v16, 0x3ee66666    # 0.45f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/4 v0, 0x0

    .line 370
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v17, 0x3f800000    # 1.0f

    .line 374
    .line 375
    const/4 v13, 0x0

    .line 376
    const v14, 0x3f0ccccd    # 0.55f

    .line 377
    .line 378
    .line 379
    const v15, 0x3ee66666    # 0.45f

    .line 380
    .line 381
    .line 382
    const/high16 v16, 0x3f800000    # 1.0f

    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v0, 0x40e00000    # 7.0f

    .line 388
    .line 389
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v0, 0x41980000    # 19.0f

    .line 393
    .line 394
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    const/16 v16, 0x3800

    .line 405
    .line 406
    const/16 v17, 0x0

    .line 407
    .line 408
    const/high16 v6, 0x3f800000    # 1.0f

    .line 409
    .line 410
    const/high16 v8, 0x3f800000    # 1.0f

    .line 411
    .line 412
    const/4 v7, 0x0

    .line 413
    const/high16 v9, 0x3f800000    # 1.0f

    .line 414
    .line 415
    const/high16 v12, 0x3f800000    # 1.0f

    .line 416
    .line 417
    const/4 v14, 0x0

    .line 418
    const/4 v15, 0x0

    .line 419
    const-string v4, ""

    .line 420
    .line 421
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    sput-object v0, Landroidx/compose/material/icons/rounded/LoginKt;->_login:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 430
    .line 431
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    return-object v0
.end method

.method public static synthetic getLogin$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
