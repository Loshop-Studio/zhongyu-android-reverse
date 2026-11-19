.class public final Landroidx/compose/material/icons/rounded/SettingsVoiceKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _settingsVoice:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsVoice(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SettingsVoiceKt;->_settingsVoice:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SettingsVoice"

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
    const/high16 v0, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v2, 0x41c00000    # 24.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v17, 0x3f800000    # 1.0f

    .line 81
    .line 82
    const/high16 v18, -0x40800000    # -1.0f

    .line 83
    .line 84
    const v13, 0x3f0ccccd    # 0.55f

    .line 85
    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    const/high16 v15, 0x3f800000    # 1.0f

    .line 89
    .line 90
    const v16, -0x4119999a    # -0.45f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, -0x40800000    # -1.0f

    .line 101
    .line 102
    const/4 v13, 0x0

    .line 103
    const v14, -0x40f33333    # -0.55f

    .line 104
    .line 105
    .line 106
    const v15, -0x4119999a    # -0.45f

    .line 107
    .line 108
    .line 109
    const/high16 v16, -0x40800000    # -1.0f

    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v18, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const v13, -0x40f33333    # -0.55f

    .line 120
    .line 121
    .line 122
    const/4 v14, 0x0

    .line 123
    const/high16 v15, -0x40800000    # -1.0f

    .line 124
    .line 125
    const v16, 0x3ee66666    # 0.45f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v17, 0x41000000    # 8.0f

    .line 135
    .line 136
    const/high16 v18, 0x41c00000    # 24.0f

    .line 137
    .line 138
    const/high16 v13, 0x40e00000    # 7.0f

    .line 139
    .line 140
    const v14, 0x41bc6666    # 23.55f

    .line 141
    .line 142
    .line 143
    const v15, 0x40ee6666    # 7.45f

    .line 144
    .line 145
    .line 146
    const/high16 v16, 0x41c00000    # 24.0f

    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v0, 0x41400000    # 12.0f

    .line 155
    .line 156
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v17, 0x3f800000    # 1.0f

    .line 163
    .line 164
    const/high16 v18, -0x40800000    # -1.0f

    .line 165
    .line 166
    const v13, 0x3f0ccccd    # 0.55f

    .line 167
    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    const/high16 v15, 0x3f800000    # 1.0f

    .line 171
    .line 172
    const v16, -0x4119999a    # -0.45f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/4 v0, 0x0

    .line 179
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v17, -0x40800000    # -1.0f

    .line 183
    .line 184
    const/4 v13, 0x0

    .line 185
    const v14, -0x40f33333    # -0.55f

    .line 186
    .line 187
    .line 188
    const v15, -0x4119999a    # -0.45f

    .line 189
    .line 190
    .line 191
    const/high16 v16, -0x40800000    # -1.0f

    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v18, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const v13, -0x40f33333    # -0.55f

    .line 202
    .line 203
    .line 204
    const/4 v14, 0x0

    .line 205
    const/high16 v15, -0x40800000    # -1.0f

    .line 206
    .line 207
    const v16, 0x3ee66666    # 0.45f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v17, 0x41400000    # 12.0f

    .line 217
    .line 218
    const/high16 v18, 0x41c00000    # 24.0f

    .line 219
    .line 220
    const/high16 v13, 0x41300000    # 11.0f

    .line 221
    .line 222
    const v14, 0x41bc6666    # 23.55f

    .line 223
    .line 224
    .line 225
    const v15, 0x41373333    # 11.45f

    .line 226
    .line 227
    .line 228
    const/high16 v16, 0x41c00000    # 24.0f

    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v0, 0x41800000    # 16.0f

    .line 237
    .line 238
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, 0x3f800000    # 1.0f

    .line 245
    .line 246
    const/high16 v18, -0x40800000    # -1.0f

    .line 247
    .line 248
    const v13, 0x3f0ccccd    # 0.55f

    .line 249
    .line 250
    .line 251
    const/4 v14, 0x0

    .line 252
    const/high16 v15, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const v16, -0x4119999a    # -0.45f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/4 v0, 0x0

    .line 261
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v17, -0x40800000    # -1.0f

    .line 265
    .line 266
    const/4 v13, 0x0

    .line 267
    const v14, -0x40f33333    # -0.55f

    .line 268
    .line 269
    .line 270
    const v15, -0x4119999a    # -0.45f

    .line 271
    .line 272
    .line 273
    const/high16 v16, -0x40800000    # -1.0f

    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v18, 0x3f800000    # 1.0f

    .line 282
    .line 283
    const v13, -0x40f33333    # -0.55f

    .line 284
    .line 285
    .line 286
    const/4 v14, 0x0

    .line 287
    const/high16 v15, -0x40800000    # -1.0f

    .line 288
    .line 289
    const v16, 0x3ee66666    # 0.45f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v17, 0x41800000    # 16.0f

    .line 299
    .line 300
    const/high16 v18, 0x41c00000    # 24.0f

    .line 301
    .line 302
    const/high16 v13, 0x41700000    # 15.0f

    .line 303
    .line 304
    const v14, 0x41bc6666    # 23.55f

    .line 305
    .line 306
    .line 307
    const v15, 0x41773333    # 15.45f

    .line 308
    .line 309
    .line 310
    const/high16 v16, 0x41c00000    # 24.0f

    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v0, 0x41100000    # 9.0f

    .line 319
    .line 320
    const/high16 v2, 0x41200000    # 10.0f

    .line 321
    .line 322
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v0, 0x40800000    # 4.0f

    .line 326
    .line 327
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v17, 0x40400000    # 3.0f

    .line 331
    .line 332
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 333
    .line 334
    const/4 v13, 0x0

    .line 335
    const v14, -0x402b851f    # -1.66f

    .line 336
    .line 337
    .line 338
    const v15, 0x3fab851f    # 1.34f

    .line 339
    .line 340
    .line 341
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v0, 0x3fab851f    # 1.34f

    .line 347
    .line 348
    .line 349
    const/high16 v2, 0x40400000    # 3.0f

    .line 350
    .line 351
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v0, 0x40c00000    # 6.0f

    .line 355
    .line 356
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 360
    .line 361
    const/high16 v18, 0x40400000    # 3.0f

    .line 362
    .line 363
    const v14, 0x3fd47ae1    # 1.66f

    .line 364
    .line 365
    .line 366
    const v15, -0x40547ae1    # -1.34f

    .line 367
    .line 368
    .line 369
    const/high16 v16, 0x40400000    # 3.0f

    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x413a8f5c    # 11.66f

    .line 375
    .line 376
    .line 377
    const/high16 v2, 0x41100000    # 9.0f

    .line 378
    .line 379
    const/high16 v4, 0x41200000    # 10.0f

    .line 380
    .line 381
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, 0x418f47ae    # 17.91f

    .line 388
    .line 389
    .line 390
    const/high16 v2, 0x41200000    # 10.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v17, 0x3f800000    # 1.0f

    .line 396
    .line 397
    const v18, 0x3f91eb85    # 1.14f

    .line 398
    .line 399
    .line 400
    const v13, 0x3f1c28f6    # 0.61f

    .line 401
    .line 402
    .line 403
    const/4 v14, 0x0

    .line 404
    const v15, 0x3f8b851f    # 1.09f

    .line 405
    .line 406
    .line 407
    const v16, 0x3f0a3d71    # 0.54f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, -0x3f42e148    # -5.91f

    .line 414
    .line 415
    .line 416
    const v18, 0x40b8f5c3    # 5.78f

    .line 417
    .line 418
    .line 419
    const v13, -0x41051eb8    # -0.49f

    .line 420
    .line 421
    .line 422
    const/high16 v14, 0x40400000    # 3.0f

    .line 423
    .line 424
    const v15, -0x3fc70a3d    # -2.89f

    .line 425
    .line 426
    .line 427
    const v16, 0x40aae148    # 5.34f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v0, 0x41980000    # 19.0f

    .line 434
    .line 435
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v17, -0x40800000    # -1.0f

    .line 439
    .line 440
    const/high16 v18, 0x3f800000    # 1.0f

    .line 441
    .line 442
    const/4 v13, 0x0

    .line 443
    const v14, 0x3f0ccccd    # 0.55f

    .line 444
    .line 445
    .line 446
    const v15, -0x4119999a    # -0.45f

    .line 447
    .line 448
    .line 449
    const/high16 v16, 0x3f800000    # 1.0f

    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/4 v0, 0x0

    .line 455
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v18, -0x40800000    # -1.0f

    .line 459
    .line 460
    const v13, -0x40f33333    # -0.55f

    .line 461
    .line 462
    .line 463
    const/4 v14, 0x0

    .line 464
    const/high16 v15, -0x40800000    # -1.0f

    .line 465
    .line 466
    const v16, -0x4119999a    # -0.45f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, -0x3ffae148    # -2.08f

    .line 473
    .line 474
    .line 475
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v17, -0x3f42e148    # -5.91f

    .line 479
    .line 480
    .line 481
    const v18, -0x3f470a3d    # -5.78f

    .line 482
    .line 483
    .line 484
    const v13, -0x3fbeb852    # -3.02f

    .line 485
    .line 486
    .line 487
    const v14, -0x411eb852    # -0.44f

    .line 488
    .line 489
    .line 490
    const v15, -0x3f528f5c    # -5.42f

    .line 491
    .line 492
    .line 493
    const v16, -0x3fce147b    # -2.78f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v17, 0x3f800000    # 1.0f

    .line 500
    .line 501
    const v18, -0x406e147b    # -1.14f

    .line 502
    .line 503
    .line 504
    const v13, -0x42333333    # -0.1f

    .line 505
    .line 506
    .line 507
    const v14, -0x40e66666    # -0.6f

    .line 508
    .line 509
    .line 510
    const v15, 0x3ec7ae14    # 0.39f

    .line 511
    .line 512
    .line 513
    const v16, -0x406e147b    # -1.14f

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/4 v0, 0x0

    .line 520
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v17, 0x3f7ae148    # 0.98f

    .line 524
    .line 525
    .line 526
    const v18, 0x3f59999a    # 0.85f

    .line 527
    .line 528
    .line 529
    const v13, 0x3efae148    # 0.49f

    .line 530
    .line 531
    .line 532
    const/4 v14, 0x0

    .line 533
    const v15, 0x3f666666    # 0.9f

    .line 534
    .line 535
    .line 536
    const v16, 0x3eb851ec    # 0.36f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v17, 0x41400000    # 12.0f

    .line 543
    .line 544
    const/high16 v18, 0x41700000    # 15.0f

    .line 545
    .line 546
    const v13, 0x40ef5c29    # 7.48f

    .line 547
    .line 548
    .line 549
    const v14, 0x41535c29    # 13.21f

    .line 550
    .line 551
    .line 552
    const v15, 0x41187ae1    # 9.53f

    .line 553
    .line 554
    .line 555
    const/high16 v16, 0x41700000    # 15.0f

    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v0, 0x409dc28f    # 4.93f

    .line 561
    .line 562
    .line 563
    const v2, -0x3f7b3333    # -4.15f

    .line 564
    .line 565
    .line 566
    const v4, 0x4090a3d7    # 4.52f

    .line 567
    .line 568
    .line 569
    const v6, -0x401ae148    # -1.79f

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v17, 0x418f47ae    # 17.91f

    .line 576
    .line 577
    .line 578
    const/high16 v18, 0x41200000    # 10.0f

    .line 579
    .line 580
    const v13, 0x4188147b    # 17.01f

    .line 581
    .line 582
    .line 583
    const v14, 0x4125c28f    # 10.36f

    .line 584
    .line 585
    .line 586
    const v15, 0x418b5c29    # 17.42f

    .line 587
    .line 588
    .line 589
    const/high16 v16, 0x41200000    # 10.0f

    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, 0x418f47ae    # 17.91f

    .line 595
    .line 596
    .line 597
    const/high16 v2, 0x41200000    # 10.0f

    .line 598
    .line 599
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    const/16 v16, 0x3800

    .line 610
    .line 611
    const/16 v17, 0x0

    .line 612
    .line 613
    const/high16 v6, 0x3f800000    # 1.0f

    .line 614
    .line 615
    const/high16 v8, 0x3f800000    # 1.0f

    .line 616
    .line 617
    const/4 v7, 0x0

    .line 618
    const/high16 v9, 0x3f800000    # 1.0f

    .line 619
    .line 620
    const/high16 v12, 0x3f800000    # 1.0f

    .line 621
    .line 622
    const/4 v13, 0x0

    .line 623
    const/4 v14, 0x0

    .line 624
    const/4 v15, 0x0

    .line 625
    const-string v4, ""

    .line 626
    .line 627
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    sput-object v0, Landroidx/compose/material/icons/rounded/SettingsVoiceKt;->_settingsVoice:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 636
    .line 637
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 638
    .line 639
    .line 640
    return-object v0
.end method
