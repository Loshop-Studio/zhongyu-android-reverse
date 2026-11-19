.class public final Landroidx/compose/material/icons/rounded/AspectRatioKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _aspectRatio:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAspectRatio(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AspectRatioKt;->_aspectRatio:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AspectRatio"

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
    const/high16 v2, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v18, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const v13, -0x40f33333    # -0.55f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x40800000    # -1.0f

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
    const/high16 v0, 0x40000000    # 2.0f

    .line 94
    .line 95
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, -0x40000000    # -2.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v0, 0x3ee66666    # 0.45f

    .line 107
    .line 108
    .line 109
    const/high16 v2, 0x3f800000    # 1.0f

    .line 110
    .line 111
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v0, 0x40400000    # 3.0f

    .line 115
    .line 116
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v17, 0x3f800000    # 1.0f

    .line 120
    .line 121
    const/high16 v18, -0x40800000    # -1.0f

    .line 122
    .line 123
    const v13, 0x3f0ccccd    # 0.55f

    .line 124
    .line 125
    .line 126
    const/high16 v15, 0x3f800000    # 1.0f

    .line 127
    .line 128
    const v16, -0x4119999a    # -0.45f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 135
    .line 136
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v17, -0x40800000    # -1.0f

    .line 140
    .line 141
    const/4 v13, 0x0

    .line 142
    const v14, -0x40f33333    # -0.55f

    .line 143
    .line 144
    .line 145
    const v15, -0x4119999a    # -0.45f

    .line 146
    .line 147
    .line 148
    const/high16 v16, -0x40800000    # -1.0f

    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v0, 0x41100000    # 9.0f

    .line 157
    .line 158
    const/high16 v2, 0x40e00000    # 7.0f

    .line 159
    .line 160
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v0, 0x40000000    # 2.0f

    .line 164
    .line 165
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v17, 0x3f800000    # 1.0f

    .line 169
    .line 170
    const v13, 0x3f0ccccd    # 0.55f

    .line 171
    .line 172
    .line 173
    const/4 v14, 0x0

    .line 174
    const/high16 v15, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const v16, -0x4119999a    # -0.45f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, -0x4119999a    # -0.45f

    .line 183
    .line 184
    .line 185
    const/high16 v2, -0x40800000    # -1.0f

    .line 186
    .line 187
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v0, 0x40c00000    # 6.0f

    .line 191
    .line 192
    const/high16 v2, 0x40e00000    # 7.0f

    .line 193
    .line 194
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v17, -0x40800000    # -1.0f

    .line 198
    .line 199
    const/high16 v18, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const v13, -0x40f33333    # -0.55f

    .line 202
    .line 203
    .line 204
    const/high16 v15, -0x40800000    # -1.0f

    .line 205
    .line 206
    const v16, 0x3ee66666    # 0.45f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v0, 0x40400000    # 3.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, 0x3f800000    # 1.0f

    .line 218
    .line 219
    const/4 v13, 0x0

    .line 220
    const v14, 0x3f0ccccd    # 0.55f

    .line 221
    .line 222
    .line 223
    const v15, 0x3ee66666    # 0.45f

    .line 224
    .line 225
    .line 226
    const/high16 v16, 0x3f800000    # 1.0f

    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v0, -0x4119999a    # -0.45f

    .line 232
    .line 233
    .line 234
    const/high16 v2, -0x40800000    # -1.0f

    .line 235
    .line 236
    const/high16 v4, 0x3f800000    # 1.0f

    .line 237
    .line 238
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v0, 0x41100000    # 9.0f

    .line 242
    .line 243
    const/high16 v2, 0x40e00000    # 7.0f

    .line 244
    .line 245
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v0, 0x41a80000    # 21.0f

    .line 252
    .line 253
    const/high16 v2, 0x40400000    # 3.0f

    .line 254
    .line 255
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v0, 0x40400000    # 3.0f

    .line 259
    .line 260
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v17, -0x40000000    # -2.0f

    .line 264
    .line 265
    const/high16 v18, 0x40000000    # 2.0f

    .line 266
    .line 267
    const v13, -0x40733333    # -1.1f

    .line 268
    .line 269
    .line 270
    const/4 v14, 0x0

    .line 271
    const/high16 v15, -0x40000000    # -2.0f

    .line 272
    .line 273
    const v16, 0x3f666666    # 0.9f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v0, 0x41600000    # 14.0f

    .line 280
    .line 281
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v17, 0x40000000    # 2.0f

    .line 285
    .line 286
    const/4 v13, 0x0

    .line 287
    const v14, 0x3f8ccccd    # 1.1f

    .line 288
    .line 289
    .line 290
    const v15, 0x3f666666    # 0.9f

    .line 291
    .line 292
    .line 293
    const/high16 v16, 0x40000000    # 2.0f

    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v0, 0x41900000    # 18.0f

    .line 299
    .line 300
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v18, -0x40000000    # -2.0f

    .line 304
    .line 305
    const v13, 0x3f8ccccd    # 1.1f

    .line 306
    .line 307
    .line 308
    const/4 v14, 0x0

    .line 309
    const/high16 v15, 0x40000000    # 2.0f

    .line 310
    .line 311
    const v16, -0x4099999a    # -0.9f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v0, 0x41b80000    # 23.0f

    .line 318
    .line 319
    const/high16 v2, 0x40a00000    # 5.0f

    .line 320
    .line 321
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v17, -0x40000000    # -2.0f

    .line 325
    .line 326
    const/4 v13, 0x0

    .line 327
    const v14, -0x40733333    # -1.1f

    .line 328
    .line 329
    .line 330
    const v15, -0x4099999a    # -0.9f

    .line 331
    .line 332
    .line 333
    const/high16 v16, -0x40000000    # -2.0f

    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v0, 0x41a00000    # 20.0f

    .line 342
    .line 343
    const v2, 0x4198147b    # 19.01f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v0, 0x40800000    # 4.0f

    .line 350
    .line 351
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v17, -0x40800000    # -1.0f

    .line 355
    .line 356
    const/high16 v18, -0x40800000    # -1.0f

    .line 357
    .line 358
    const v13, -0x40f33333    # -0.55f

    .line 359
    .line 360
    .line 361
    const/4 v14, 0x0

    .line 362
    const/high16 v15, -0x40800000    # -1.0f

    .line 363
    .line 364
    const v16, -0x4119999a    # -0.45f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x40bfae14    # 5.99f

    .line 371
    .line 372
    .line 373
    const/high16 v2, 0x40400000    # 3.0f

    .line 374
    .line 375
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v17, 0x3f800000    # 1.0f

    .line 379
    .line 380
    const/4 v13, 0x0

    .line 381
    const v14, -0x40f33333    # -0.55f

    .line 382
    .line 383
    .line 384
    const v15, 0x3ee66666    # 0.45f

    .line 385
    .line 386
    .line 387
    const/high16 v16, -0x40800000    # -1.0f

    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v0, 0x41800000    # 16.0f

    .line 393
    .line 394
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v18, 0x3f800000    # 1.0f

    .line 398
    .line 399
    const v13, 0x3f0ccccd    # 0.55f

    .line 400
    .line 401
    .line 402
    const/4 v14, 0x0

    .line 403
    const/high16 v15, 0x3f800000    # 1.0f

    .line 404
    .line 405
    const v16, 0x3ee66666    # 0.45f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v0, 0x414051ec    # 12.02f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v17, -0x40800000    # -1.0f

    .line 418
    .line 419
    const/4 v13, 0x0

    .line 420
    const v14, 0x3f0ccccd    # 0.55f

    .line 421
    .line 422
    .line 423
    const v15, -0x4119999a    # -0.45f

    .line 424
    .line 425
    .line 426
    const/high16 v16, 0x3f800000    # 1.0f

    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    const/16 v16, 0x3800

    .line 439
    .line 440
    const/16 v17, 0x0

    .line 441
    .line 442
    const/high16 v6, 0x3f800000    # 1.0f

    .line 443
    .line 444
    const/high16 v8, 0x3f800000    # 1.0f

    .line 445
    .line 446
    const/4 v7, 0x0

    .line 447
    const/high16 v9, 0x3f800000    # 1.0f

    .line 448
    .line 449
    const/high16 v12, 0x3f800000    # 1.0f

    .line 450
    .line 451
    const/4 v14, 0x0

    .line 452
    const/4 v15, 0x0

    .line 453
    const-string v4, ""

    .line 454
    .line 455
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    sput-object v0, Landroidx/compose/material/icons/rounded/AspectRatioKt;->_aspectRatio:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 464
    .line 465
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    return-object v0
.end method
