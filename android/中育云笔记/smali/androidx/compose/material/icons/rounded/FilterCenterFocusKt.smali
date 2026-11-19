.class public final Landroidx/compose/material/icons/rounded/FilterCenterFocusKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _filterCenterFocus:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFilterCenterFocus(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FilterCenterFocusKt;->_filterCenterFocus:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FilterCenterFocus"

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
    const/high16 v0, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v2, 0x41700000    # 15.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v0, 0x40400000    # 3.0f

    .line 94
    .line 95
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v17, 0x40000000    # 2.0f

    .line 99
    .line 100
    const/high16 v18, 0x40000000    # 2.0f

    .line 101
    .line 102
    const/4 v13, 0x0

    .line 103
    const v14, 0x3f8ccccd    # 1.1f

    .line 104
    .line 105
    .line 106
    const v15, 0x3f666666    # 0.9f

    .line 107
    .line 108
    .line 109
    const/high16 v16, 0x40000000    # 2.0f

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
    const/high16 v17, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/high16 v18, -0x40800000    # -1.0f

    .line 120
    .line 121
    const v13, 0x3f0ccccd    # 0.55f

    .line 122
    .line 123
    .line 124
    const/4 v14, 0x0

    .line 125
    const/high16 v15, 0x3f800000    # 1.0f

    .line 126
    .line 127
    const v16, -0x4119999a    # -0.45f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v0, -0x4119999a    # -0.45f

    .line 134
    .line 135
    .line 136
    const/high16 v2, -0x40800000    # -1.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v0, 0x41980000    # 19.0f

    .line 142
    .line 143
    const/high16 v2, 0x40c00000    # 6.0f

    .line 144
    .line 145
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v17, -0x40800000    # -1.0f

    .line 149
    .line 150
    const v13, -0x40f33333    # -0.55f

    .line 151
    .line 152
    .line 153
    const/high16 v15, -0x40800000    # -1.0f

    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, -0x40000000    # -2.0f

    .line 159
    .line 160
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/4 v13, 0x0

    .line 164
    const v14, -0x40f33333    # -0.55f

    .line 165
    .line 166
    .line 167
    const v15, -0x4119999a    # -0.45f

    .line 168
    .line 169
    .line 170
    const/high16 v16, -0x40800000    # -1.0f

    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v0, 0x40c00000    # 6.0f

    .line 179
    .line 180
    const/high16 v2, 0x40a00000    # 5.0f

    .line 181
    .line 182
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v17, 0x3f800000    # 1.0f

    .line 186
    .line 187
    const v15, 0x3ee66666    # 0.45f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, 0x40000000    # 2.0f

    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v13, 0x3f0ccccd    # 0.55f

    .line 199
    .line 200
    .line 201
    const/4 v14, 0x0

    .line 202
    const/high16 v15, 0x3f800000    # 1.0f

    .line 203
    .line 204
    const v16, -0x4119999a    # -0.45f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, -0x4119999a    # -0.45f

    .line 211
    .line 212
    .line 213
    const/high16 v2, -0x40800000    # -1.0f

    .line 214
    .line 215
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v0, 0x40a00000    # 5.0f

    .line 219
    .line 220
    const/high16 v2, 0x40400000    # 3.0f

    .line 221
    .line 222
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v17, -0x40000000    # -2.0f

    .line 226
    .line 227
    const/high16 v18, 0x40000000    # 2.0f

    .line 228
    .line 229
    const v13, -0x40733333    # -1.1f

    .line 230
    .line 231
    .line 232
    const/high16 v15, -0x40000000    # -2.0f

    .line 233
    .line 234
    const v16, 0x3f666666    # 0.9f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v0, 0x40400000    # 3.0f

    .line 241
    .line 242
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v17, 0x3f800000    # 1.0f

    .line 246
    .line 247
    const/high16 v18, 0x3f800000    # 1.0f

    .line 248
    .line 249
    const/4 v13, 0x0

    .line 250
    const v14, 0x3f0ccccd    # 0.55f

    .line 251
    .line 252
    .line 253
    const v15, 0x3ee66666    # 0.45f

    .line 254
    .line 255
    .line 256
    const/high16 v16, 0x3f800000    # 1.0f

    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, -0x4119999a    # -0.45f

    .line 262
    .line 263
    .line 264
    const/high16 v2, -0x40800000    # -1.0f

    .line 265
    .line 266
    const/high16 v4, 0x3f800000    # 1.0f

    .line 267
    .line 268
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v0, 0x40c00000    # 6.0f

    .line 272
    .line 273
    const/high16 v2, 0x40a00000    # 5.0f

    .line 274
    .line 275
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x41980000    # 19.0f

    .line 282
    .line 283
    const/high16 v2, 0x40400000    # 3.0f

    .line 284
    .line 285
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 289
    .line 290
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v17, -0x40800000    # -1.0f

    .line 294
    .line 295
    const v13, -0x40f33333    # -0.55f

    .line 296
    .line 297
    .line 298
    const/4 v14, 0x0

    .line 299
    const/high16 v15, -0x40800000    # -1.0f

    .line 300
    .line 301
    const v16, 0x3ee66666    # 0.45f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v0, 0x3ee66666    # 0.45f

    .line 308
    .line 309
    .line 310
    const/high16 v2, 0x3f800000    # 1.0f

    .line 311
    .line 312
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v0, 0x40000000    # 2.0f

    .line 316
    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v17, 0x3f800000    # 1.0f

    .line 321
    .line 322
    const v13, 0x3f0ccccd    # 0.55f

    .line 323
    .line 324
    .line 325
    const/high16 v15, 0x3f800000    # 1.0f

    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/4 v13, 0x0

    .line 334
    const v14, 0x3f0ccccd    # 0.55f

    .line 335
    .line 336
    .line 337
    const v15, 0x3ee66666    # 0.45f

    .line 338
    .line 339
    .line 340
    const/high16 v16, 0x3f800000    # 1.0f

    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, -0x4119999a    # -0.45f

    .line 346
    .line 347
    .line 348
    const/high16 v2, -0x40800000    # -1.0f

    .line 349
    .line 350
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v0, 0x41a80000    # 21.0f

    .line 354
    .line 355
    const/high16 v2, 0x40a00000    # 5.0f

    .line 356
    .line 357
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v17, -0x40000000    # -2.0f

    .line 361
    .line 362
    const/high16 v18, -0x40000000    # -2.0f

    .line 363
    .line 364
    const v14, -0x40733333    # -1.1f

    .line 365
    .line 366
    .line 367
    const v15, -0x4099999a    # -0.9f

    .line 368
    .line 369
    .line 370
    const/high16 v16, -0x40000000    # -2.0f

    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v0, 0x41900000    # 18.0f

    .line 379
    .line 380
    const/high16 v2, 0x41980000    # 19.0f

    .line 381
    .line 382
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v17, -0x40800000    # -1.0f

    .line 386
    .line 387
    const/high16 v18, 0x3f800000    # 1.0f

    .line 388
    .line 389
    const v14, 0x3f0ccccd    # 0.55f

    .line 390
    .line 391
    .line 392
    const v15, -0x4119999a    # -0.45f

    .line 393
    .line 394
    .line 395
    const/high16 v16, 0x3f800000    # 1.0f

    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, -0x40000000    # -2.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v13, -0x40f33333    # -0.55f

    .line 406
    .line 407
    .line 408
    const/4 v14, 0x0

    .line 409
    const/high16 v15, -0x40800000    # -1.0f

    .line 410
    .line 411
    const v16, 0x3ee66666    # 0.45f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v0, 0x3ee66666    # 0.45f

    .line 418
    .line 419
    .line 420
    const/high16 v2, 0x3f800000    # 1.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x40400000    # 3.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v17, 0x40000000    # 2.0f

    .line 431
    .line 432
    const/high16 v18, -0x40000000    # -2.0f

    .line 433
    .line 434
    const v13, 0x3f8ccccd    # 1.1f

    .line 435
    .line 436
    .line 437
    const/high16 v15, 0x40000000    # 2.0f

    .line 438
    .line 439
    const v16, -0x4099999a    # -0.9f

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 446
    .line 447
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v17, -0x40800000    # -1.0f

    .line 451
    .line 452
    const/high16 v18, -0x40800000    # -1.0f

    .line 453
    .line 454
    const/4 v13, 0x0

    .line 455
    const v14, -0x40f33333    # -0.55f

    .line 456
    .line 457
    .line 458
    const v15, -0x4119999a    # -0.45f

    .line 459
    .line 460
    .line 461
    const/high16 v16, -0x40800000    # -1.0f

    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v0, 0x3ee66666    # 0.45f

    .line 467
    .line 468
    .line 469
    const/high16 v2, -0x40800000    # -1.0f

    .line 470
    .line 471
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v0, 0x40000000    # 2.0f

    .line 475
    .line 476
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v0, 0x41400000    # 12.0f

    .line 483
    .line 484
    const/high16 v2, 0x41100000    # 9.0f

    .line 485
    .line 486
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 490
    .line 491
    const/high16 v18, 0x40400000    # 3.0f

    .line 492
    .line 493
    const v13, -0x402b851f    # -1.66f

    .line 494
    .line 495
    .line 496
    const/4 v14, 0x0

    .line 497
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 498
    .line 499
    const v16, 0x3fab851f    # 1.34f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v0, 0x3fab851f    # 1.34f

    .line 506
    .line 507
    .line 508
    const/high16 v2, 0x40400000    # 3.0f

    .line 509
    .line 510
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, -0x40547ae1    # -1.34f

    .line 514
    .line 515
    .line 516
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 517
    .line 518
    const/high16 v4, 0x40400000    # 3.0f

    .line 519
    .line 520
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    const/16 v16, 0x3800

    .line 534
    .line 535
    const/16 v17, 0x0

    .line 536
    .line 537
    const/high16 v6, 0x3f800000    # 1.0f

    .line 538
    .line 539
    const/high16 v8, 0x3f800000    # 1.0f

    .line 540
    .line 541
    const/4 v7, 0x0

    .line 542
    const/high16 v9, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/high16 v12, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const/4 v13, 0x0

    .line 547
    const/4 v15, 0x0

    .line 548
    const-string v4, ""

    .line 549
    .line 550
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    sput-object v0, Landroidx/compose/material/icons/rounded/FilterCenterFocusKt;->_filterCenterFocus:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 559
    .line 560
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    return-object v0
.end method
