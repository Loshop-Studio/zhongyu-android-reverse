.class public final Landroidx/compose/material/icons/sharp/LensBlurKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _lensBlur:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLensBlur(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/LensBlurKt;->_lensBlur:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.LensBlur"

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
    const/high16 v2, 0x40c00000    # 6.0f

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
    const v0, 0x3ee66666    # 0.45f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x3f800000    # 1.0f

    .line 97
    .line 98
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, -0x4119999a    # -0.45f

    .line 102
    .line 103
    .line 104
    const/high16 v2, -0x40800000    # -1.0f

    .line 105
    .line 106
    const/high16 v4, 0x3f800000    # 1.0f

    .line 107
    .line 108
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x40d1999a    # 6.55f

    .line 112
    .line 113
    .line 114
    const/high16 v2, 0x41500000    # 13.0f

    .line 115
    .line 116
    const/high16 v4, 0x40c00000    # 6.0f

    .line 117
    .line 118
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x40c00000    # 6.0f

    .line 125
    .line 126
    const/high16 v2, 0x41880000    # 17.0f

    .line 127
    .line 128
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, 0x3ee66666    # 0.45f

    .line 135
    .line 136
    .line 137
    const/high16 v2, 0x3f800000    # 1.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, -0x4119999a    # -0.45f

    .line 143
    .line 144
    .line 145
    const/high16 v2, -0x40800000    # -1.0f

    .line 146
    .line 147
    const/high16 v4, 0x3f800000    # 1.0f

    .line 148
    .line 149
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v0, 0x40d1999a    # 6.55f

    .line 153
    .line 154
    .line 155
    const/high16 v2, 0x40c00000    # 6.0f

    .line 156
    .line 157
    const/high16 v4, 0x41880000    # 17.0f

    .line 158
    .line 159
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v0, 0x41100000    # 9.0f

    .line 166
    .line 167
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x3ee66666    # 0.45f

    .line 174
    .line 175
    .line 176
    const/high16 v2, 0x3f800000    # 1.0f

    .line 177
    .line 178
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, -0x4119999a    # -0.45f

    .line 182
    .line 183
    .line 184
    const/high16 v2, -0x40800000    # -1.0f

    .line 185
    .line 186
    const/high16 v4, 0x3f800000    # 1.0f

    .line 187
    .line 188
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, 0x40d1999a    # 6.55f

    .line 192
    .line 193
    .line 194
    const/high16 v2, 0x41100000    # 9.0f

    .line 195
    .line 196
    const/high16 v4, 0x40c00000    # 6.0f

    .line 197
    .line 198
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x40400000    # 3.0f

    .line 205
    .line 206
    const/high16 v2, 0x41180000    # 9.5f

    .line 207
    .line 208
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v17, -0x41000000    # -0.5f

    .line 212
    .line 213
    const/high16 v18, 0x3f000000    # 0.5f

    .line 214
    .line 215
    const v13, -0x4170a3d7    # -0.28f

    .line 216
    .line 217
    .line 218
    const/high16 v15, -0x41000000    # -0.5f

    .line 219
    .line 220
    const v16, 0x3e6147ae    # 0.22f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, 0x3e6147ae    # 0.22f

    .line 227
    .line 228
    .line 229
    const/high16 v2, 0x3f000000    # 0.5f

    .line 230
    .line 231
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, -0x419eb852    # -0.22f

    .line 235
    .line 236
    .line 237
    const/high16 v2, -0x41000000    # -0.5f

    .line 238
    .line 239
    const/high16 v4, 0x3f000000    # 0.5f

    .line 240
    .line 241
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, 0x4051eb85    # 3.28f

    .line 245
    .line 246
    .line 247
    const/high16 v2, 0x40400000    # 3.0f

    .line 248
    .line 249
    const/high16 v4, 0x41180000    # 9.5f

    .line 250
    .line 251
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x40a00000    # 5.0f

    .line 258
    .line 259
    const/high16 v2, 0x40c00000    # 6.0f

    .line 260
    .line 261
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v17, 0x40a00000    # 5.0f

    .line 265
    .line 266
    const/high16 v18, 0x40c00000    # 6.0f

    .line 267
    .line 268
    const v13, 0x40ae6666    # 5.45f

    .line 269
    .line 270
    .line 271
    const/high16 v14, 0x40a00000    # 5.0f

    .line 272
    .line 273
    const/high16 v15, 0x40a00000    # 5.0f

    .line 274
    .line 275
    const v16, 0x40ae6666    # 5.45f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, 0x3ee66666    # 0.45f

    .line 282
    .line 283
    .line 284
    const/high16 v2, 0x3f800000    # 1.0f

    .line 285
    .line 286
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, -0x4119999a    # -0.45f

    .line 290
    .line 291
    .line 292
    const/high16 v2, -0x40800000    # -1.0f

    .line 293
    .line 294
    const/high16 v4, 0x3f800000    # 1.0f

    .line 295
    .line 296
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x40d1999a    # 6.55f

    .line 300
    .line 301
    .line 302
    const/high16 v2, 0x40a00000    # 5.0f

    .line 303
    .line 304
    const/high16 v4, 0x40c00000    # 6.0f

    .line 305
    .line 306
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v0, 0x41a80000    # 21.0f

    .line 313
    .line 314
    const/high16 v2, 0x41280000    # 10.5f

    .line 315
    .line 316
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v17, 0x3f000000    # 0.5f

    .line 320
    .line 321
    const/high16 v18, -0x41000000    # -0.5f

    .line 322
    .line 323
    const v13, 0x3e8f5c29    # 0.28f

    .line 324
    .line 325
    .line 326
    const/4 v14, 0x0

    .line 327
    const/high16 v15, 0x3f000000    # 0.5f

    .line 328
    .line 329
    const v16, -0x419eb852    # -0.22f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, 0x41aa3d71    # 21.28f

    .line 336
    .line 337
    .line 338
    const/high16 v2, 0x41a80000    # 21.0f

    .line 339
    .line 340
    const/high16 v4, 0x41180000    # 9.5f

    .line 341
    .line 342
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, 0x3e6147ae    # 0.22f

    .line 346
    .line 347
    .line 348
    const/high16 v2, -0x41000000    # -0.5f

    .line 349
    .line 350
    const/high16 v4, 0x3f000000    # 0.5f

    .line 351
    .line 352
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v0, 0x41a80000    # 21.0f

    .line 356
    .line 357
    const/high16 v2, 0x41280000    # 10.5f

    .line 358
    .line 359
    const v4, 0x41a5c28f    # 20.72f

    .line 360
    .line 361
    .line 362
    const/high16 v6, 0x41280000    # 10.5f

    .line 363
    .line 364
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x40e00000    # 7.0f

    .line 371
    .line 372
    const/high16 v2, 0x41600000    # 14.0f

    .line 373
    .line 374
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v17, 0x3f800000    # 1.0f

    .line 378
    .line 379
    const/high16 v18, -0x40800000    # -1.0f

    .line 380
    .line 381
    const v13, 0x3f0ccccd    # 0.55f

    .line 382
    .line 383
    .line 384
    const/high16 v15, 0x3f800000    # 1.0f

    .line 385
    .line 386
    const v16, -0x4119999a    # -0.45f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, -0x4119999a    # -0.45f

    .line 393
    .line 394
    .line 395
    const/high16 v2, -0x40800000    # -1.0f

    .line 396
    .line 397
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, 0x3ee66666    # 0.45f

    .line 401
    .line 402
    .line 403
    const/high16 v4, 0x3f800000    # 1.0f

    .line 404
    .line 405
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, 0x41573333    # 13.45f

    .line 409
    .line 410
    .line 411
    const/high16 v2, 0x40e00000    # 7.0f

    .line 412
    .line 413
    const/high16 v4, 0x41600000    # 14.0f

    .line 414
    .line 415
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v0, 0x40600000    # 3.5f

    .line 422
    .line 423
    const/high16 v2, 0x41600000    # 14.0f

    .line 424
    .line 425
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v17, 0x3f000000    # 0.5f

    .line 429
    .line 430
    const/high16 v18, -0x41000000    # -0.5f

    .line 431
    .line 432
    const v13, 0x3e8f5c29    # 0.28f

    .line 433
    .line 434
    .line 435
    const/high16 v15, 0x3f000000    # 0.5f

    .line 436
    .line 437
    const v16, -0x419eb852    # -0.22f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v0, 0x40200000    # 2.5f

    .line 444
    .line 445
    const/high16 v2, 0x40200000    # 2.5f

    .line 446
    .line 447
    const v6, 0x41647ae1    # 14.28f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, 0x402e147b    # 2.72f

    .line 454
    .line 455
    .line 456
    const/high16 v2, 0x40400000    # 3.0f

    .line 457
    .line 458
    const/high16 v4, 0x41580000    # 13.5f

    .line 459
    .line 460
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v0, 0x415b851f    # 13.72f

    .line 464
    .line 465
    .line 466
    const/high16 v2, 0x40600000    # 3.5f

    .line 467
    .line 468
    const/high16 v4, 0x41600000    # 14.0f

    .line 469
    .line 470
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v0, 0x40400000    # 3.0f

    .line 477
    .line 478
    const/high16 v2, 0x41580000    # 13.5f

    .line 479
    .line 480
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v17, -0x41000000    # -0.5f

    .line 484
    .line 485
    const/high16 v18, 0x3f000000    # 0.5f

    .line 486
    .line 487
    const v13, -0x4170a3d7    # -0.28f

    .line 488
    .line 489
    .line 490
    const/high16 v15, -0x41000000    # -0.5f

    .line 491
    .line 492
    const v16, 0x3e6147ae    # 0.22f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v0, 0x3e6147ae    # 0.22f

    .line 499
    .line 500
    .line 501
    const/high16 v2, 0x3f000000    # 0.5f

    .line 502
    .line 503
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, -0x419eb852    # -0.22f

    .line 507
    .line 508
    .line 509
    const/high16 v2, -0x41000000    # -0.5f

    .line 510
    .line 511
    const/high16 v4, 0x3f000000    # 0.5f

    .line 512
    .line 513
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v0, 0x4051eb85    # 3.28f

    .line 517
    .line 518
    .line 519
    const/high16 v2, 0x40400000    # 3.0f

    .line 520
    .line 521
    const/high16 v4, 0x41580000    # 13.5f

    .line 522
    .line 523
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v0, 0x41a40000    # 20.5f

    .line 530
    .line 531
    const/high16 v2, 0x41200000    # 10.0f

    .line 532
    .line 533
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, 0x3e6147ae    # 0.22f

    .line 540
    .line 541
    .line 542
    const/high16 v2, 0x3f000000    # 0.5f

    .line 543
    .line 544
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v0, -0x419eb852    # -0.22f

    .line 548
    .line 549
    .line 550
    const/high16 v2, -0x41000000    # -0.5f

    .line 551
    .line 552
    const/high16 v4, 0x3f000000    # 0.5f

    .line 553
    .line 554
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v0, 0x41247ae1    # 10.28f

    .line 558
    .line 559
    .line 560
    const/high16 v2, 0x41a40000    # 20.5f

    .line 561
    .line 562
    const/high16 v4, 0x41200000    # 10.0f

    .line 563
    .line 564
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v0, 0x40600000    # 3.5f

    .line 571
    .line 572
    const/high16 v2, 0x41200000    # 10.0f

    .line 573
    .line 574
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/high16 v17, 0x3f000000    # 0.5f

    .line 578
    .line 579
    const/high16 v18, -0x41000000    # -0.5f

    .line 580
    .line 581
    const v13, 0x3e8f5c29    # 0.28f

    .line 582
    .line 583
    .line 584
    const/high16 v15, 0x3f000000    # 0.5f

    .line 585
    .line 586
    const v16, -0x419eb852    # -0.22f

    .line 587
    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v0, 0x40200000    # 2.5f

    .line 593
    .line 594
    const/high16 v2, 0x40200000    # 2.5f

    .line 595
    .line 596
    const v6, 0x41247ae1    # 10.28f

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, 0x402e147b    # 2.72f

    .line 603
    .line 604
    .line 605
    const/high16 v2, 0x40400000    # 3.0f

    .line 606
    .line 607
    const/high16 v4, 0x41180000    # 9.5f

    .line 608
    .line 609
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v0, 0x411b851f    # 9.72f

    .line 613
    .line 614
    .line 615
    const/high16 v2, 0x40600000    # 3.5f

    .line 616
    .line 617
    const/high16 v4, 0x41200000    # 10.0f

    .line 618
    .line 619
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v0, 0x40e00000    # 7.0f

    .line 626
    .line 627
    const/high16 v2, 0x41200000    # 10.0f

    .line 628
    .line 629
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/high16 v17, 0x3f800000    # 1.0f

    .line 633
    .line 634
    const/high16 v18, -0x40800000    # -1.0f

    .line 635
    .line 636
    const v13, 0x3f0ccccd    # 0.55f

    .line 637
    .line 638
    .line 639
    const/high16 v15, 0x3f800000    # 1.0f

    .line 640
    .line 641
    const v16, -0x4119999a    # -0.45f

    .line 642
    .line 643
    .line 644
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v0, -0x4119999a    # -0.45f

    .line 648
    .line 649
    .line 650
    const/high16 v2, -0x40800000    # -1.0f

    .line 651
    .line 652
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v0, 0x40ae6666    # 5.45f

    .line 656
    .line 657
    .line 658
    const/high16 v2, 0x41100000    # 9.0f

    .line 659
    .line 660
    const/high16 v4, 0x40c00000    # 6.0f

    .line 661
    .line 662
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v0, 0x41173333    # 9.45f

    .line 666
    .line 667
    .line 668
    const/high16 v2, 0x40e00000    # 7.0f

    .line 669
    .line 670
    const/high16 v4, 0x41200000    # 10.0f

    .line 671
    .line 672
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v0, 0x41480000    # 12.5f

    .line 679
    .line 680
    const/high16 v2, 0x41200000    # 10.0f

    .line 681
    .line 682
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const/high16 v17, -0x40400000    # -1.5f

    .line 686
    .line 687
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 688
    .line 689
    const v13, -0x40ab851f    # -0.83f

    .line 690
    .line 691
    .line 692
    const/high16 v15, -0x40400000    # -1.5f

    .line 693
    .line 694
    const v16, 0x3f2b851f    # 0.67f

    .line 695
    .line 696
    .line 697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v0, 0x3f2b851f    # 0.67f

    .line 701
    .line 702
    .line 703
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 704
    .line 705
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v0, -0x40d47ae1    # -0.67f

    .line 709
    .line 710
    .line 711
    const/high16 v2, -0x40400000    # -1.5f

    .line 712
    .line 713
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 714
    .line 715
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const/high16 v0, 0x41480000    # 12.5f

    .line 719
    .line 720
    const/high16 v2, 0x41480000    # 12.5f

    .line 721
    .line 722
    const/high16 v4, 0x41200000    # 10.0f

    .line 723
    .line 724
    const v6, 0x412d47ae    # 10.83f

    .line 725
    .line 726
    .line 727
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const/high16 v0, 0x41500000    # 13.0f

    .line 734
    .line 735
    const/high16 v2, 0x41900000    # 18.0f

    .line 736
    .line 737
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v17, -0x40800000    # -1.0f

    .line 741
    .line 742
    const/high16 v18, 0x3f800000    # 1.0f

    .line 743
    .line 744
    const v13, -0x40f33333    # -0.55f

    .line 745
    .line 746
    .line 747
    const/high16 v15, -0x40800000    # -1.0f

    .line 748
    .line 749
    const v16, 0x3ee66666    # 0.45f

    .line 750
    .line 751
    .line 752
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const v0, 0x3ee66666    # 0.45f

    .line 756
    .line 757
    .line 758
    const/high16 v2, 0x3f800000    # 1.0f

    .line 759
    .line 760
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const v0, -0x4119999a    # -0.45f

    .line 764
    .line 765
    .line 766
    const/high16 v2, -0x40800000    # -1.0f

    .line 767
    .line 768
    const/high16 v4, 0x3f800000    # 1.0f

    .line 769
    .line 770
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    const v0, 0x41946666    # 18.55f

    .line 774
    .line 775
    .line 776
    const/high16 v2, 0x41500000    # 13.0f

    .line 777
    .line 778
    const/high16 v4, 0x41900000    # 18.0f

    .line 779
    .line 780
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const/high16 v0, 0x41900000    # 18.0f

    .line 787
    .line 788
    const/high16 v2, 0x41880000    # 17.0f

    .line 789
    .line 790
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    .line 793
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const v0, 0x3ee66666    # 0.45f

    .line 797
    .line 798
    .line 799
    const/high16 v2, 0x3f800000    # 1.0f

    .line 800
    .line 801
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const v0, -0x4119999a    # -0.45f

    .line 805
    .line 806
    .line 807
    const/high16 v2, -0x40800000    # -1.0f

    .line 808
    .line 809
    const/high16 v4, 0x3f800000    # 1.0f

    .line 810
    .line 811
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const v0, 0x41946666    # 18.55f

    .line 815
    .line 816
    .line 817
    const/high16 v2, 0x41900000    # 18.0f

    .line 818
    .line 819
    const/high16 v4, 0x41880000    # 17.0f

    .line 820
    .line 821
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const/high16 v0, 0x41900000    # 18.0f

    .line 828
    .line 829
    const/high16 v2, 0x41100000    # 9.0f

    .line 830
    .line 831
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    .line 837
    const v0, 0x3ee66666    # 0.45f

    .line 838
    .line 839
    .line 840
    const/high16 v2, 0x3f800000    # 1.0f

    .line 841
    .line 842
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const v0, -0x4119999a    # -0.45f

    .line 846
    .line 847
    .line 848
    const/high16 v2, -0x40800000    # -1.0f

    .line 849
    .line 850
    const/high16 v4, 0x3f800000    # 1.0f

    .line 851
    .line 852
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const v0, 0x41946666    # 18.55f

    .line 856
    .line 857
    .line 858
    const/high16 v2, 0x41900000    # 18.0f

    .line 859
    .line 860
    const/high16 v4, 0x41100000    # 9.0f

    .line 861
    .line 862
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 866
    .line 867
    .line 868
    const/high16 v0, 0x40a00000    # 5.0f

    .line 869
    .line 870
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    const v0, 0x3ee66666    # 0.45f

    .line 877
    .line 878
    .line 879
    const/high16 v2, 0x3f800000    # 1.0f

    .line 880
    .line 881
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    const v0, -0x4119999a    # -0.45f

    .line 885
    .line 886
    .line 887
    const/high16 v2, -0x40800000    # -1.0f

    .line 888
    .line 889
    const/high16 v4, 0x3f800000    # 1.0f

    .line 890
    .line 891
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 892
    .line 893
    .line 894
    const v0, 0x41946666    # 18.55f

    .line 895
    .line 896
    .line 897
    const/high16 v2, 0x40a00000    # 5.0f

    .line 898
    .line 899
    const/high16 v4, 0x41900000    # 18.0f

    .line 900
    .line 901
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 902
    .line 903
    .line 904
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 905
    .line 906
    .line 907
    const/high16 v0, 0x41a80000    # 21.0f

    .line 908
    .line 909
    const/high16 v2, 0x41580000    # 13.5f

    .line 910
    .line 911
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    const/high16 v17, -0x41000000    # -0.5f

    .line 915
    .line 916
    const/high16 v18, 0x3f000000    # 0.5f

    .line 917
    .line 918
    const v13, -0x4170a3d7    # -0.28f

    .line 919
    .line 920
    .line 921
    const/high16 v15, -0x41000000    # -0.5f

    .line 922
    .line 923
    const v16, 0x3e6147ae    # 0.22f

    .line 924
    .line 925
    .line 926
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    const v0, 0x3e6147ae    # 0.22f

    .line 930
    .line 931
    .line 932
    const/high16 v2, 0x3f000000    # 0.5f

    .line 933
    .line 934
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    const v0, -0x419eb852    # -0.22f

    .line 938
    .line 939
    .line 940
    const/high16 v2, -0x41000000    # -0.5f

    .line 941
    .line 942
    const/high16 v4, 0x3f000000    # 0.5f

    .line 943
    .line 944
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 945
    .line 946
    .line 947
    const v0, 0x41aa3d71    # 21.28f

    .line 948
    .line 949
    .line 950
    const/high16 v2, 0x41a80000    # 21.0f

    .line 951
    .line 952
    const/high16 v4, 0x41580000    # 13.5f

    .line 953
    .line 954
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 955
    .line 956
    .line 957
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 958
    .line 959
    .line 960
    const/high16 v0, 0x41880000    # 17.0f

    .line 961
    .line 962
    const/high16 v2, 0x41600000    # 14.0f

    .line 963
    .line 964
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 965
    .line 966
    .line 967
    const/high16 v17, -0x40800000    # -1.0f

    .line 968
    .line 969
    const/high16 v18, 0x3f800000    # 1.0f

    .line 970
    .line 971
    const v13, -0x40f33333    # -0.55f

    .line 972
    .line 973
    .line 974
    const/high16 v15, -0x40800000    # -1.0f

    .line 975
    .line 976
    const v16, 0x3ee66666    # 0.45f

    .line 977
    .line 978
    .line 979
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 980
    .line 981
    .line 982
    const v0, 0x3ee66666    # 0.45f

    .line 983
    .line 984
    .line 985
    const/high16 v2, 0x3f800000    # 1.0f

    .line 986
    .line 987
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 988
    .line 989
    .line 990
    const v0, -0x4119999a    # -0.45f

    .line 991
    .line 992
    .line 993
    const/high16 v2, -0x40800000    # -1.0f

    .line 994
    .line 995
    const/high16 v4, 0x3f800000    # 1.0f

    .line 996
    .line 997
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 998
    .line 999
    .line 1000
    const v0, 0x4168cccd    # 14.55f

    .line 1001
    .line 1002
    .line 1003
    const/high16 v2, 0x41880000    # 17.0f

    .line 1004
    .line 1005
    const/high16 v4, 0x41600000    # 14.0f

    .line 1006
    .line 1007
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1011
    .line 1012
    .line 1013
    const/high16 v0, 0x41a40000    # 20.5f

    .line 1014
    .line 1015
    const/high16 v2, 0x41600000    # 14.0f

    .line 1016
    .line 1017
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1018
    .line 1019
    .line 1020
    const/high16 v17, -0x41000000    # -0.5f

    .line 1021
    .line 1022
    const/high16 v18, 0x3f000000    # 0.5f

    .line 1023
    .line 1024
    const v13, -0x4170a3d7    # -0.28f

    .line 1025
    .line 1026
    .line 1027
    const/high16 v15, -0x41000000    # -0.5f

    .line 1028
    .line 1029
    const v16, 0x3e6147ae    # 0.22f

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1033
    .line 1034
    .line 1035
    const v0, 0x3e6147ae    # 0.22f

    .line 1036
    .line 1037
    .line 1038
    const/high16 v2, 0x3f000000    # 0.5f

    .line 1039
    .line 1040
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1041
    .line 1042
    .line 1043
    const v0, -0x419eb852    # -0.22f

    .line 1044
    .line 1045
    .line 1046
    const/high16 v2, -0x41000000    # -0.5f

    .line 1047
    .line 1048
    const/high16 v4, 0x3f000000    # 0.5f

    .line 1049
    .line 1050
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1051
    .line 1052
    .line 1053
    const v0, 0x41647ae1    # 14.28f

    .line 1054
    .line 1055
    .line 1056
    const/high16 v2, 0x41a40000    # 20.5f

    .line 1057
    .line 1058
    const/high16 v4, 0x41600000    # 14.0f

    .line 1059
    .line 1060
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1064
    .line 1065
    .line 1066
    const/high16 v0, 0x41080000    # 8.5f

    .line 1067
    .line 1068
    const/high16 v2, 0x41200000    # 10.0f

    .line 1069
    .line 1070
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1071
    .line 1072
    .line 1073
    const/high16 v17, -0x40400000    # -1.5f

    .line 1074
    .line 1075
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 1076
    .line 1077
    const v13, -0x40ab851f    # -0.83f

    .line 1078
    .line 1079
    .line 1080
    const/high16 v15, -0x40400000    # -1.5f

    .line 1081
    .line 1082
    const v16, 0x3f2b851f    # 0.67f

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1086
    .line 1087
    .line 1088
    const v0, 0x3f2b851f    # 0.67f

    .line 1089
    .line 1090
    .line 1091
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 1092
    .line 1093
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1094
    .line 1095
    .line 1096
    const v0, -0x40d47ae1    # -0.67f

    .line 1097
    .line 1098
    .line 1099
    const/high16 v2, -0x40400000    # -1.5f

    .line 1100
    .line 1101
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 1102
    .line 1103
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1104
    .line 1105
    .line 1106
    const/high16 v0, 0x41080000    # 8.5f

    .line 1107
    .line 1108
    const/high16 v2, 0x41080000    # 8.5f

    .line 1109
    .line 1110
    const/high16 v4, 0x41200000    # 10.0f

    .line 1111
    .line 1112
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1116
    .line 1117
    .line 1118
    const/high16 v0, 0x41880000    # 17.0f

    .line 1119
    .line 1120
    const/high16 v2, 0x41200000    # 10.0f

    .line 1121
    .line 1122
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1123
    .line 1124
    .line 1125
    const/high16 v17, -0x40800000    # -1.0f

    .line 1126
    .line 1127
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1128
    .line 1129
    const v13, -0x40f33333    # -0.55f

    .line 1130
    .line 1131
    .line 1132
    const/high16 v15, -0x40800000    # -1.0f

    .line 1133
    .line 1134
    const v16, 0x3ee66666    # 0.45f

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1138
    .line 1139
    .line 1140
    const v0, 0x3ee66666    # 0.45f

    .line 1141
    .line 1142
    .line 1143
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1144
    .line 1145
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1146
    .line 1147
    .line 1148
    const v0, -0x4119999a    # -0.45f

    .line 1149
    .line 1150
    .line 1151
    const/high16 v2, -0x40800000    # -1.0f

    .line 1152
    .line 1153
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1154
    .line 1155
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1156
    .line 1157
    .line 1158
    const v0, 0x4128cccd    # 10.55f

    .line 1159
    .line 1160
    .line 1161
    const/high16 v2, 0x41880000    # 17.0f

    .line 1162
    .line 1163
    const/high16 v4, 0x41200000    # 10.0f

    .line 1164
    .line 1165
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1169
    .line 1170
    .line 1171
    const/high16 v0, 0x41480000    # 12.5f

    .line 1172
    .line 1173
    const/high16 v2, 0x41600000    # 14.0f

    .line 1174
    .line 1175
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1176
    .line 1177
    .line 1178
    const/high16 v17, -0x40400000    # -1.5f

    .line 1179
    .line 1180
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 1181
    .line 1182
    const v13, -0x40ab851f    # -0.83f

    .line 1183
    .line 1184
    .line 1185
    const/high16 v15, -0x40400000    # -1.5f

    .line 1186
    .line 1187
    const v16, 0x3f2b851f    # 0.67f

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1191
    .line 1192
    .line 1193
    const v0, 0x3f2b851f    # 0.67f

    .line 1194
    .line 1195
    .line 1196
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 1197
    .line 1198
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1199
    .line 1200
    .line 1201
    const v0, -0x40d47ae1    # -0.67f

    .line 1202
    .line 1203
    .line 1204
    const/high16 v2, -0x40400000    # -1.5f

    .line 1205
    .line 1206
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 1207
    .line 1208
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1209
    .line 1210
    .line 1211
    const/high16 v0, 0x41480000    # 12.5f

    .line 1212
    .line 1213
    const/high16 v2, 0x41480000    # 12.5f

    .line 1214
    .line 1215
    const/high16 v4, 0x41600000    # 14.0f

    .line 1216
    .line 1217
    const v6, 0x416d47ae    # 14.83f

    .line 1218
    .line 1219
    .line 1220
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1224
    .line 1225
    .line 1226
    const/high16 v0, 0x41080000    # 8.5f

    .line 1227
    .line 1228
    const/high16 v2, 0x41600000    # 14.0f

    .line 1229
    .line 1230
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1234
    .line 1235
    .line 1236
    const v0, 0x3f2b851f    # 0.67f

    .line 1237
    .line 1238
    .line 1239
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 1240
    .line 1241
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1242
    .line 1243
    .line 1244
    const v0, -0x40d47ae1    # -0.67f

    .line 1245
    .line 1246
    .line 1247
    const/high16 v2, -0x40400000    # -1.5f

    .line 1248
    .line 1249
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 1250
    .line 1251
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1252
    .line 1253
    .line 1254
    const/high16 v0, 0x41080000    # 8.5f

    .line 1255
    .line 1256
    const/high16 v2, 0x41080000    # 8.5f

    .line 1257
    .line 1258
    const/high16 v4, 0x41600000    # 14.0f

    .line 1259
    .line 1260
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1264
    .line 1265
    .line 1266
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v2

    .line 1270
    const/16 v16, 0x3800

    .line 1271
    .line 1272
    const/16 v17, 0x0

    .line 1273
    .line 1274
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1275
    .line 1276
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1277
    .line 1278
    const/4 v7, 0x0

    .line 1279
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1280
    .line 1281
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1282
    .line 1283
    const/4 v13, 0x0

    .line 1284
    const/4 v15, 0x0

    .line 1285
    const-string v4, ""

    .line 1286
    .line 1287
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v0

    .line 1295
    sput-object v0, Landroidx/compose/material/icons/sharp/LensBlurKt;->_lensBlur:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1296
    .line 1297
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1298
    .line 1299
    .line 1300
    return-object v0
.end method
