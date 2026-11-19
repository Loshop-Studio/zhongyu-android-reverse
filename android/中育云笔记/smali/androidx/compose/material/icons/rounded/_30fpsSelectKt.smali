.class public final Landroidx/compose/material/icons/rounded/_30fpsSelectKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __30fpsSelect:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_30fpsSelect(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/_30fpsSelectKt;->__30fpsSelect:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded._30fpsSelect"

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
    const/high16 v0, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v2, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v17, 0x3f800000    # 1.0f

    .line 81
    .line 82
    const/high16 v18, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const/4 v13, 0x0

    .line 85
    const v14, 0x3f0ccccd    # 0.55f

    .line 86
    .line 87
    .line 88
    const v15, 0x3ee66666    # 0.45f

    .line 89
    .line 90
    .line 91
    const/high16 v16, 0x3f800000    # 1.0f

    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v0, 0x40800000    # 4.0f

    .line 97
    .line 98
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v0, 0x40000000    # 2.0f

    .line 102
    .line 103
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, 0x40c00000    # 6.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v17, 0x40a00000    # 5.0f

    .line 112
    .line 113
    const/high16 v18, 0x41100000    # 9.0f

    .line 114
    .line 115
    const v13, 0x40ae6666    # 5.45f

    .line 116
    .line 117
    .line 118
    const/high16 v14, 0x41000000    # 8.0f

    .line 119
    .line 120
    const/high16 v15, 0x40a00000    # 5.0f

    .line 121
    .line 122
    const v16, 0x41073333    # 8.45f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/4 v0, 0x0

    .line 129
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v17, 0x3f800000    # 1.0f

    .line 133
    .line 134
    const/high16 v18, 0x3f800000    # 1.0f

    .line 135
    .line 136
    const/4 v13, 0x0

    .line 137
    const v14, 0x3f0ccccd    # 0.55f

    .line 138
    .line 139
    .line 140
    const v15, 0x3ee66666    # 0.45f

    .line 141
    .line 142
    .line 143
    const/high16 v16, 0x3f800000    # 1.0f

    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v0, 0x40400000    # 3.0f

    .line 149
    .line 150
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v0, 0x40000000    # 2.0f

    .line 154
    .line 155
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, 0x40a00000    # 5.0f

    .line 159
    .line 160
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v17, -0x40800000    # -1.0f

    .line 164
    .line 165
    const v13, -0x40f33333    # -0.55f

    .line 166
    .line 167
    .line 168
    const/4 v14, 0x0

    .line 169
    const/high16 v15, -0x40800000    # -1.0f

    .line 170
    .line 171
    const v16, 0x3ee66666    # 0.45f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/4 v0, 0x0

    .line 178
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v17, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/4 v13, 0x0

    .line 184
    const v14, 0x3f0ccccd    # 0.55f

    .line 185
    .line 186
    .line 187
    const v15, 0x3ee66666    # 0.45f

    .line 188
    .line 189
    .line 190
    const/high16 v16, 0x3f800000    # 1.0f

    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v0, 0x40800000    # 4.0f

    .line 196
    .line 197
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v17, 0x40000000    # 2.0f

    .line 201
    .line 202
    const/high16 v18, -0x40000000    # -2.0f

    .line 203
    .line 204
    const v13, 0x3f8ccccd    # 1.1f

    .line 205
    .line 206
    .line 207
    const/4 v14, 0x0

    .line 208
    const/high16 v15, 0x40000000    # 2.0f

    .line 209
    .line 210
    const v16, -0x4099999a    # -0.9f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v0, -0x40400000    # -1.5f

    .line 217
    .line 218
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v17, 0x41200000    # 10.0f

    .line 222
    .line 223
    const/high16 v18, 0x41100000    # 9.0f

    .line 224
    .line 225
    const/high16 v13, 0x41300000    # 11.0f

    .line 226
    .line 227
    const v14, 0x411ab852    # 9.67f

    .line 228
    .line 229
    .line 230
    const v15, 0x412d47ae    # 10.83f

    .line 231
    .line 232
    .line 233
    const/high16 v16, 0x41100000    # 9.0f

    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v17, 0x3f800000    # 1.0f

    .line 239
    .line 240
    const/high16 v18, -0x40400000    # -1.5f

    .line 241
    .line 242
    const v13, 0x3f547ae1    # 0.83f

    .line 243
    .line 244
    .line 245
    const/4 v14, 0x0

    .line 246
    const/high16 v15, 0x3f800000    # 1.0f

    .line 247
    .line 248
    const v16, -0x40d47ae1    # -0.67f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v0, 0x40c00000    # 6.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, -0x40000000    # -2.0f

    .line 260
    .line 261
    const/high16 v18, -0x40000000    # -2.0f

    .line 262
    .line 263
    const/4 v13, 0x0

    .line 264
    const v14, -0x40733333    # -1.1f

    .line 265
    .line 266
    .line 267
    const v15, -0x4099999a    # -0.9f

    .line 268
    .line 269
    .line 270
    const/high16 v16, -0x40000000    # -2.0f

    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, 0x40a00000    # 5.0f

    .line 276
    .line 277
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, 0x40800000    # 4.0f

    .line 281
    .line 282
    const/high16 v18, 0x40a00000    # 5.0f

    .line 283
    .line 284
    const v13, 0x408e6666    # 4.45f

    .line 285
    .line 286
    .line 287
    const/high16 v14, 0x40800000    # 4.0f

    .line 288
    .line 289
    const/high16 v15, 0x40800000    # 4.0f

    .line 290
    .line 291
    const v16, 0x408e6666    # 4.45f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x41900000    # 18.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v17, 0x40000000    # 2.0f

    .line 306
    .line 307
    const/high16 v18, 0x40000000    # 2.0f

    .line 308
    .line 309
    const v13, 0x3f8ccccd    # 1.1f

    .line 310
    .line 311
    .line 312
    const/4 v14, 0x0

    .line 313
    const/high16 v15, 0x40000000    # 2.0f

    .line 314
    .line 315
    const v16, 0x3f666666    # 0.9f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v0, 0x40c00000    # 6.0f

    .line 322
    .line 323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v17, -0x40000000    # -2.0f

    .line 327
    .line 328
    const/4 v13, 0x0

    .line 329
    const v14, 0x3f8ccccd    # 1.1f

    .line 330
    .line 331
    .line 332
    const v15, -0x4099999a    # -0.9f

    .line 333
    .line 334
    .line 335
    const/high16 v16, 0x40000000    # 2.0f

    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v18, -0x40000000    # -2.0f

    .line 346
    .line 347
    const v13, -0x40733333    # -1.1f

    .line 348
    .line 349
    .line 350
    const/4 v14, 0x0

    .line 351
    const/high16 v15, -0x40000000    # -2.0f

    .line 352
    .line 353
    const v16, -0x4099999a    # -0.9f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v0, 0x40c00000    # 6.0f

    .line 360
    .line 361
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v17, 0x40000000    # 2.0f

    .line 365
    .line 366
    const/4 v13, 0x0

    .line 367
    const v14, -0x40733333    # -1.1f

    .line 368
    .line 369
    .line 370
    const v15, 0x3f666666    # 0.9f

    .line 371
    .line 372
    .line 373
    const/high16 v16, -0x40000000    # -2.0f

    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v0, 0x41900000    # 18.0f

    .line 379
    .line 380
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v2, 0x40c00000    # 6.0f

    .line 387
    .line 388
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v0, 0x40c00000    # 6.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v0, 0x40400000    # 3.0f

    .line 402
    .line 403
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, 0x40c00000    # 6.0f

    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v0, 0x41b00000    # 22.0f

    .line 415
    .line 416
    const/high16 v2, 0x40800000    # 4.0f

    .line 417
    .line 418
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v17, -0x40800000    # -1.0f

    .line 425
    .line 426
    const/high16 v18, -0x40800000    # -1.0f

    .line 427
    .line 428
    const v13, -0x40f33333    # -0.55f

    .line 429
    .line 430
    .line 431
    const/4 v14, 0x0

    .line 432
    const/high16 v15, -0x40800000    # -1.0f

    .line 433
    .line 434
    const v16, -0x4119999a    # -0.45f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 441
    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v17, 0x3f800000    # 1.0f

    .line 446
    .line 447
    const/4 v13, 0x0

    .line 448
    const v14, -0x40f33333    # -0.55f

    .line 449
    .line 450
    .line 451
    const v15, 0x3ee66666    # 0.45f

    .line 452
    .line 453
    .line 454
    const/high16 v16, -0x40800000    # -1.0f

    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/4 v0, 0x0

    .line 460
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v18, 0x3f800000    # 1.0f

    .line 464
    .line 465
    const v13, 0x3f0ccccd    # 0.55f

    .line 466
    .line 467
    .line 468
    const/4 v14, 0x0

    .line 469
    const/high16 v15, 0x3f800000    # 1.0f

    .line 470
    .line 471
    const v16, 0x3ee66666    # 0.45f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v0, 0x40400000    # 3.0f

    .line 478
    .line 479
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v17, 0x40800000    # 4.0f

    .line 483
    .line 484
    const/high16 v18, 0x41b00000    # 22.0f

    .line 485
    .line 486
    const/high16 v13, 0x40a00000    # 5.0f

    .line 487
    .line 488
    const v14, 0x41ac6666    # 21.55f

    .line 489
    .line 490
    .line 491
    const v15, 0x4091999a    # 4.55f

    .line 492
    .line 493
    .line 494
    const/high16 v16, 0x41b00000    # 22.0f

    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v0, 0x41000000    # 8.0f

    .line 503
    .line 504
    const/high16 v2, 0x41b00000    # 22.0f

    .line 505
    .line 506
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v17, -0x40800000    # -1.0f

    .line 513
    .line 514
    const/high16 v18, -0x40800000    # -1.0f

    .line 515
    .line 516
    const v13, -0x40f33333    # -0.55f

    .line 517
    .line 518
    .line 519
    const/4 v14, 0x0

    .line 520
    const/high16 v15, -0x40800000    # -1.0f

    .line 521
    .line 522
    const v16, -0x4119999a    # -0.45f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 529
    .line 530
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v17, 0x3f800000    # 1.0f

    .line 534
    .line 535
    const/4 v13, 0x0

    .line 536
    const v14, -0x40f33333    # -0.55f

    .line 537
    .line 538
    .line 539
    const v15, 0x3ee66666    # 0.45f

    .line 540
    .line 541
    .line 542
    const/high16 v16, -0x40800000    # -1.0f

    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/4 v0, 0x0

    .line 548
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v18, 0x3f800000    # 1.0f

    .line 552
    .line 553
    const v13, 0x3f0ccccd    # 0.55f

    .line 554
    .line 555
    .line 556
    const/4 v14, 0x0

    .line 557
    const/high16 v15, 0x3f800000    # 1.0f

    .line 558
    .line 559
    const v16, 0x3ee66666    # 0.45f

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v0, 0x40400000    # 3.0f

    .line 566
    .line 567
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v17, 0x41000000    # 8.0f

    .line 571
    .line 572
    const/high16 v18, 0x41b00000    # 22.0f

    .line 573
    .line 574
    const/high16 v13, 0x41100000    # 9.0f

    .line 575
    .line 576
    const v14, 0x41ac6666    # 21.55f

    .line 577
    .line 578
    .line 579
    const v15, 0x4108cccd    # 8.55f

    .line 580
    .line 581
    .line 582
    const/high16 v16, 0x41b00000    # 22.0f

    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v0, 0x41400000    # 12.0f

    .line 591
    .line 592
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v17, -0x40800000    # -1.0f

    .line 599
    .line 600
    const/high16 v18, -0x40800000    # -1.0f

    .line 601
    .line 602
    const v13, -0x40f33333    # -0.55f

    .line 603
    .line 604
    .line 605
    const/4 v14, 0x0

    .line 606
    const/high16 v15, -0x40800000    # -1.0f

    .line 607
    .line 608
    const v16, -0x4119999a    # -0.45f

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 615
    .line 616
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v17, 0x3f800000    # 1.0f

    .line 620
    .line 621
    const/4 v13, 0x0

    .line 622
    const v14, -0x40f33333    # -0.55f

    .line 623
    .line 624
    .line 625
    const v15, 0x3ee66666    # 0.45f

    .line 626
    .line 627
    .line 628
    const/high16 v16, -0x40800000    # -1.0f

    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/4 v0, 0x0

    .line 634
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v18, 0x3f800000    # 1.0f

    .line 638
    .line 639
    const v13, 0x3f0ccccd    # 0.55f

    .line 640
    .line 641
    .line 642
    const/4 v14, 0x0

    .line 643
    const/high16 v15, 0x3f800000    # 1.0f

    .line 644
    .line 645
    const v16, 0x3ee66666    # 0.45f

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v0, 0x40400000    # 3.0f

    .line 652
    .line 653
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v17, 0x41400000    # 12.0f

    .line 657
    .line 658
    const/high16 v18, 0x41b00000    # 22.0f

    .line 659
    .line 660
    const/high16 v13, 0x41500000    # 13.0f

    .line 661
    .line 662
    const v14, 0x41ac6666    # 21.55f

    .line 663
    .line 664
    .line 665
    const v15, 0x4148cccd    # 12.55f

    .line 666
    .line 667
    .line 668
    const/high16 v16, 0x41b00000    # 22.0f

    .line 669
    .line 670
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v0, 0x41a00000    # 20.0f

    .line 677
    .line 678
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/high16 v0, -0x3f800000    # -4.0f

    .line 682
    .line 683
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const/high16 v17, -0x40800000    # -1.0f

    .line 687
    .line 688
    const/high16 v18, -0x40800000    # -1.0f

    .line 689
    .line 690
    const v13, -0x40f33333    # -0.55f

    .line 691
    .line 692
    .line 693
    const/4 v14, 0x0

    .line 694
    const/high16 v15, -0x40800000    # -1.0f

    .line 695
    .line 696
    const v16, -0x4119999a    # -0.45f

    .line 697
    .line 698
    .line 699
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 703
    .line 704
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const/high16 v17, 0x3f800000    # 1.0f

    .line 708
    .line 709
    const/4 v13, 0x0

    .line 710
    const v14, -0x40f33333    # -0.55f

    .line 711
    .line 712
    .line 713
    const v15, 0x3ee66666    # 0.45f

    .line 714
    .line 715
    .line 716
    const/high16 v16, -0x40800000    # -1.0f

    .line 717
    .line 718
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v0, 0x40800000    # 4.0f

    .line 722
    .line 723
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v18, 0x3f800000    # 1.0f

    .line 727
    .line 728
    const v13, 0x3f0ccccd    # 0.55f

    .line 729
    .line 730
    .line 731
    const/4 v14, 0x0

    .line 732
    const/high16 v15, 0x3f800000    # 1.0f

    .line 733
    .line 734
    const v16, 0x3ee66666    # 0.45f

    .line 735
    .line 736
    .line 737
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v0, 0x40400000    # 3.0f

    .line 741
    .line 742
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v17, 0x41a00000    # 20.0f

    .line 746
    .line 747
    const/high16 v18, 0x41b00000    # 22.0f

    .line 748
    .line 749
    const/high16 v13, 0x41a80000    # 21.0f

    .line 750
    .line 751
    const v14, 0x41ac6666    # 21.55f

    .line 752
    .line 753
    .line 754
    const v15, 0x41a46666    # 20.55f

    .line 755
    .line 756
    .line 757
    const/high16 v16, 0x41b00000    # 22.0f

    .line 758
    .line 759
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    const/16 v16, 0x3800

    .line 770
    .line 771
    const/16 v17, 0x0

    .line 772
    .line 773
    const/high16 v6, 0x3f800000    # 1.0f

    .line 774
    .line 775
    const/high16 v8, 0x3f800000    # 1.0f

    .line 776
    .line 777
    const/4 v7, 0x0

    .line 778
    const/high16 v9, 0x3f800000    # 1.0f

    .line 779
    .line 780
    const/high16 v12, 0x3f800000    # 1.0f

    .line 781
    .line 782
    const/4 v13, 0x0

    .line 783
    const/4 v14, 0x0

    .line 784
    const/4 v15, 0x0

    .line 785
    const-string v4, ""

    .line 786
    .line 787
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    sput-object v0, Landroidx/compose/material/icons/rounded/_30fpsSelectKt;->__30fpsSelect:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 796
    .line 797
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 798
    .line 799
    .line 800
    return-object v0
.end method
