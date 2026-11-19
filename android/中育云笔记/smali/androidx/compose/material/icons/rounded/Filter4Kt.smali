.class public final Landroidx/compose/material/icons/rounded/Filter4Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _filter4:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFilter4(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/Filter4Kt;->_filter4:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Filter4"

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
    const/high16 v0, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v2, 0x40a00000    # 5.0f

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
    const/high16 v0, 0x41700000    # 15.0f

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
    const/high16 v0, 0x41a80000    # 21.0f

    .line 142
    .line 143
    const/high16 v2, 0x40800000    # 4.0f

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
    const/high16 v0, 0x40c00000    # 6.0f

    .line 159
    .line 160
    const/high16 v2, 0x40400000    # 3.0f

    .line 161
    .line 162
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/4 v13, 0x0

    .line 166
    const v14, -0x40f33333    # -0.55f

    .line 167
    .line 168
    .line 169
    const v15, -0x4119999a    # -0.45f

    .line 170
    .line 171
    .line 172
    const/high16 v16, -0x40800000    # -1.0f

    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v0, 0x41800000    # 16.0f

    .line 181
    .line 182
    const/high16 v2, 0x41700000    # 15.0f

    .line 183
    .line 184
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, 0x3f800000    # 1.0f

    .line 188
    .line 189
    const v13, 0x3f0ccccd    # 0.55f

    .line 190
    .line 191
    .line 192
    const/4 v14, 0x0

    .line 193
    const/high16 v15, 0x3f800000    # 1.0f

    .line 194
    .line 195
    const v16, -0x4119999a    # -0.45f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v0, 0x41880000    # 17.0f

    .line 202
    .line 203
    const/high16 v2, 0x40c00000    # 6.0f

    .line 204
    .line 205
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v17, -0x40800000    # -1.0f

    .line 209
    .line 210
    const/4 v13, 0x0

    .line 211
    const v14, -0x40f33333    # -0.55f

    .line 212
    .line 213
    .line 214
    const v15, -0x4119999a    # -0.45f

    .line 215
    .line 216
    .line 217
    const/high16 v16, -0x40800000    # -1.0f

    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, 0x3ee66666    # 0.45f

    .line 223
    .line 224
    .line 225
    const/high16 v2, 0x3f800000    # 1.0f

    .line 226
    .line 227
    const/high16 v4, -0x40800000    # -1.0f

    .line 228
    .line 229
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v0, 0x40400000    # 3.0f

    .line 233
    .line 234
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v0, -0x40000000    # -2.0f

    .line 238
    .line 239
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v0, 0x41500000    # 13.0f

    .line 243
    .line 244
    const/high16 v2, 0x40c00000    # 6.0f

    .line 245
    .line 246
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v0, 0x3ee66666    # 0.45f

    .line 253
    .line 254
    .line 255
    const/high16 v2, 0x3f800000    # 1.0f

    .line 256
    .line 257
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x40800000    # 4.0f

    .line 261
    .line 262
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v17, 0x3f800000    # 1.0f

    .line 266
    .line 267
    const/high16 v18, 0x3f800000    # 1.0f

    .line 268
    .line 269
    const v14, 0x3f0ccccd    # 0.55f

    .line 270
    .line 271
    .line 272
    const v15, 0x3ee66666    # 0.45f

    .line 273
    .line 274
    .line 275
    const/high16 v16, 0x3f800000    # 1.0f

    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v0, 0x40400000    # 3.0f

    .line 281
    .line 282
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x41a80000    # 21.0f

    .line 295
    .line 296
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v0, 0x40e00000    # 7.0f

    .line 300
    .line 301
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v17, -0x40000000    # -2.0f

    .line 305
    .line 306
    const/high16 v18, 0x40000000    # 2.0f

    .line 307
    .line 308
    const v13, -0x40733333    # -1.1f

    .line 309
    .line 310
    .line 311
    const/4 v14, 0x0

    .line 312
    const/high16 v15, -0x40000000    # -2.0f

    .line 313
    .line 314
    const v16, 0x3f666666    # 0.9f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v0, 0x41600000    # 14.0f

    .line 321
    .line 322
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v17, 0x40000000    # 2.0f

    .line 326
    .line 327
    const/4 v13, 0x0

    .line 328
    const v14, 0x3f8ccccd    # 1.1f

    .line 329
    .line 330
    .line 331
    const v15, 0x3f666666    # 0.9f

    .line 332
    .line 333
    .line 334
    const/high16 v16, 0x40000000    # 2.0f

    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v18, -0x40000000    # -2.0f

    .line 343
    .line 344
    const v13, 0x3f8ccccd    # 1.1f

    .line 345
    .line 346
    .line 347
    const/4 v14, 0x0

    .line 348
    const/high16 v15, 0x40000000    # 2.0f

    .line 349
    .line 350
    const v16, -0x4099999a    # -0.9f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v0, 0x41b80000    # 23.0f

    .line 357
    .line 358
    const/high16 v2, 0x40400000    # 3.0f

    .line 359
    .line 360
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v17, -0x40000000    # -2.0f

    .line 364
    .line 365
    const/4 v13, 0x0

    .line 366
    const v14, -0x40733333    # -1.1f

    .line 367
    .line 368
    .line 369
    const v15, -0x4099999a    # -0.9f

    .line 370
    .line 371
    .line 372
    const/high16 v16, -0x40000000    # -2.0f

    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x41a00000    # 20.0f

    .line 381
    .line 382
    const/high16 v2, 0x41880000    # 17.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v0, 0x41000000    # 8.0f

    .line 388
    .line 389
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v17, -0x40800000    # -1.0f

    .line 393
    .line 394
    const/high16 v18, -0x40800000    # -1.0f

    .line 395
    .line 396
    const v13, -0x40f33333    # -0.55f

    .line 397
    .line 398
    .line 399
    const/4 v14, 0x0

    .line 400
    const/high16 v15, -0x40800000    # -1.0f

    .line 401
    .line 402
    const v16, -0x4119999a    # -0.45f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x40e00000    # 7.0f

    .line 409
    .line 410
    const/high16 v2, 0x40800000    # 4.0f

    .line 411
    .line 412
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v17, 0x3f800000    # 1.0f

    .line 416
    .line 417
    const/4 v13, 0x0

    .line 418
    const v14, -0x40f33333    # -0.55f

    .line 419
    .line 420
    .line 421
    const v15, 0x3ee66666    # 0.45f

    .line 422
    .line 423
    .line 424
    const/high16 v16, -0x40800000    # -1.0f

    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v0, 0x41400000    # 12.0f

    .line 430
    .line 431
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v18, 0x3f800000    # 1.0f

    .line 435
    .line 436
    const v13, 0x3f0ccccd    # 0.55f

    .line 437
    .line 438
    .line 439
    const/4 v14, 0x0

    .line 440
    const/high16 v15, 0x3f800000    # 1.0f

    .line 441
    .line 442
    const v16, 0x3ee66666    # 0.45f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v17, -0x40800000    # -1.0f

    .line 452
    .line 453
    const/4 v13, 0x0

    .line 454
    const v14, 0x3f0ccccd    # 0.55f

    .line 455
    .line 456
    .line 457
    const v15, -0x4119999a    # -0.45f

    .line 458
    .line 459
    .line 460
    const/high16 v16, 0x3f800000    # 1.0f

    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    const/16 v16, 0x3800

    .line 473
    .line 474
    const/16 v17, 0x0

    .line 475
    .line 476
    const/high16 v6, 0x3f800000    # 1.0f

    .line 477
    .line 478
    const/high16 v8, 0x3f800000    # 1.0f

    .line 479
    .line 480
    const/4 v7, 0x0

    .line 481
    const/high16 v9, 0x3f800000    # 1.0f

    .line 482
    .line 483
    const/high16 v12, 0x3f800000    # 1.0f

    .line 484
    .line 485
    const/4 v14, 0x0

    .line 486
    const/4 v15, 0x0

    .line 487
    const-string v4, ""

    .line 488
    .line 489
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    sput-object v0, Landroidx/compose/material/icons/rounded/Filter4Kt;->_filter4:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 498
    .line 499
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 500
    .line 501
    .line 502
    return-object v0
.end method
