.class public final Landroidx/compose/material/icons/filled/BlurOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _blurOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBlurOff(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/BlurOffKt;->_blurOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.BlurOff"

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
    const/high16 v0, 0x40e00000    # 7.0f

    .line 71
    .line 72
    const/high16 v2, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x3f800000    # 1.0f

    .line 78
    .line 79
    const/high16 v18, -0x40800000    # -1.0f

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
    const v16, -0x4119999a    # -0.45f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, -0x4119999a    # -0.45f

    .line 94
    .line 95
    .line 96
    const/high16 v2, -0x40800000    # -1.0f

    .line 97
    .line 98
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x3ee66666    # 0.45f

    .line 102
    .line 103
    .line 104
    const/high16 v4, 0x3f800000    # 1.0f

    .line 105
    .line 106
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v0, 0x415ccccd    # 13.8f

    .line 118
    .line 119
    .line 120
    const v2, 0x4137ae14    # 11.48f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x3ca3d70a    # 0.02f

    .line 127
    .line 128
    .line 129
    const v2, 0x3e4ccccd    # 0.2f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 136
    .line 137
    const/high16 v18, -0x40400000    # -1.5f

    .line 138
    .line 139
    const v13, 0x3f547ae1    # 0.83f

    .line 140
    .line 141
    .line 142
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 143
    .line 144
    const v16, -0x40d47ae1    # -0.67f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, -0x40d47ae1    # -0.67f

    .line 151
    .line 152
    .line 153
    const/high16 v2, -0x40400000    # -1.5f

    .line 154
    .line 155
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, 0x3f2b851f    # 0.67f

    .line 159
    .line 160
    .line 161
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 162
    .line 163
    const/high16 v4, -0x40400000    # -1.5f

    .line 164
    .line 165
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v0, 0x3ca3d70a    # 0.02f

    .line 169
    .line 170
    .line 171
    const v2, 0x3e4ccccd    # 0.2f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x3fa3d70a    # 1.28f

    .line 178
    .line 179
    .line 180
    const v18, 0x3fa3d70a    # 1.28f

    .line 181
    .line 182
    .line 183
    const v13, 0x3db851ec    # 0.09f

    .line 184
    .line 185
    .line 186
    const v14, 0x3f2b851f    # 0.67f

    .line 187
    .line 188
    .line 189
    const v15, 0x3f1c28f6    # 0.61f

    .line 190
    .line 191
    .line 192
    const v16, 0x3f9851ec    # 1.19f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v0, 0x40600000    # 3.5f

    .line 202
    .line 203
    const/high16 v2, 0x41600000    # 14.0f

    .line 204
    .line 205
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v17, 0x3f000000    # 0.5f

    .line 209
    .line 210
    const/high16 v18, -0x41000000    # -0.5f

    .line 211
    .line 212
    const v13, 0x3e8f5c29    # 0.28f

    .line 213
    .line 214
    .line 215
    const/4 v14, 0x0

    .line 216
    const/high16 v15, 0x3f000000    # 0.5f

    .line 217
    .line 218
    const v16, -0x419eb852    # -0.22f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, -0x419eb852    # -0.22f

    .line 225
    .line 226
    .line 227
    const/high16 v2, -0x41000000    # -0.5f

    .line 228
    .line 229
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v0, 0x3e6147ae    # 0.22f

    .line 233
    .line 234
    .line 235
    const/high16 v4, 0x3f000000    # 0.5f

    .line 236
    .line 237
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v2, 0x3f000000    # 0.5f

    .line 241
    .line 242
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v0, 0x40600000    # 3.5f

    .line 249
    .line 250
    const/high16 v2, 0x41200000    # 10.0f

    .line 251
    .line 252
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v0, -0x419eb852    # -0.22f

    .line 259
    .line 260
    .line 261
    const/high16 v2, -0x41000000    # -0.5f

    .line 262
    .line 263
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, 0x3e6147ae    # 0.22f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v2, 0x3f000000    # 0.5f

    .line 273
    .line 274
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v0, 0x41280000    # 10.5f

    .line 281
    .line 282
    const/high16 v2, 0x41a80000    # 21.0f

    .line 283
    .line 284
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, -0x419eb852    # -0.22f

    .line 291
    .line 292
    .line 293
    const/high16 v2, -0x41000000    # -0.5f

    .line 294
    .line 295
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x3e6147ae    # 0.22f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v2, 0x3f000000    # 0.5f

    .line 305
    .line 306
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v0, 0x40e00000    # 7.0f

    .line 313
    .line 314
    const/high16 v2, 0x41200000    # 10.0f

    .line 315
    .line 316
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v17, 0x3f800000    # 1.0f

    .line 320
    .line 321
    const/high16 v18, -0x40800000    # -1.0f

    .line 322
    .line 323
    const v13, 0x3f0ccccd    # 0.55f

    .line 324
    .line 325
    .line 326
    const/high16 v15, 0x3f800000    # 1.0f

    .line 327
    .line 328
    const v16, -0x4119999a    # -0.45f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v0, -0x4119999a    # -0.45f

    .line 335
    .line 336
    .line 337
    const/high16 v2, -0x40800000    # -1.0f

    .line 338
    .line 339
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, 0x3ee66666    # 0.45f

    .line 343
    .line 344
    .line 345
    const/high16 v4, 0x3f800000    # 1.0f

    .line 346
    .line 347
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v2, 0x3f800000    # 1.0f

    .line 351
    .line 352
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v0, 0x41700000    # 15.0f

    .line 359
    .line 360
    const/high16 v2, 0x41900000    # 18.0f

    .line 361
    .line 362
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v0, -0x4119999a    # -0.45f

    .line 369
    .line 370
    .line 371
    const/high16 v2, -0x40800000    # -1.0f

    .line 372
    .line 373
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, 0x3ee66666    # 0.45f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v2, 0x3f800000    # 1.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x41300000    # 11.0f

    .line 391
    .line 392
    const/high16 v2, 0x41900000    # 18.0f

    .line 393
    .line 394
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, -0x4119999a    # -0.45f

    .line 401
    .line 402
    .line 403
    const/high16 v2, -0x40800000    # -1.0f

    .line 404
    .line 405
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, 0x3ee66666    # 0.45f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v2, 0x3f800000    # 1.0f

    .line 415
    .line 416
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v0, 0x41900000    # 18.0f

    .line 423
    .line 424
    const/high16 v2, 0x40e00000    # 7.0f

    .line 425
    .line 426
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, -0x4119999a    # -0.45f

    .line 433
    .line 434
    .line 435
    const/high16 v2, -0x40800000    # -1.0f

    .line 436
    .line 437
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, 0x3ee66666    # 0.45f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v2, 0x3f800000    # 1.0f

    .line 447
    .line 448
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v0, 0x41a40000    # 20.5f

    .line 455
    .line 456
    const/high16 v2, 0x41600000    # 14.0f

    .line 457
    .line 458
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v17, -0x41000000    # -0.5f

    .line 462
    .line 463
    const/high16 v18, 0x3f000000    # 0.5f

    .line 464
    .line 465
    const v13, -0x4170a3d7    # -0.28f

    .line 466
    .line 467
    .line 468
    const/high16 v15, -0x41000000    # -0.5f

    .line 469
    .line 470
    const v16, 0x3e6147ae    # 0.22f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x3e6147ae    # 0.22f

    .line 477
    .line 478
    .line 479
    const/high16 v2, 0x3f000000    # 0.5f

    .line 480
    .line 481
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, -0x419eb852    # -0.22f

    .line 485
    .line 486
    .line 487
    const/high16 v2, -0x41000000    # -0.5f

    .line 488
    .line 489
    const/high16 v4, 0x3f000000    # 0.5f

    .line 490
    .line 491
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v0, 0x40200000    # 2.5f

    .line 501
    .line 502
    const v2, 0x40a8a3d7    # 5.27f

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, 0x4071eb85    # 3.78f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x41100000    # 9.0f

    .line 515
    .line 516
    const/high16 v2, 0x40c00000    # 6.0f

    .line 517
    .line 518
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v17, -0x40800000    # -1.0f

    .line 522
    .line 523
    const/high16 v18, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const v13, -0x40f33333    # -0.55f

    .line 526
    .line 527
    .line 528
    const/high16 v15, -0x40800000    # -1.0f

    .line 529
    .line 530
    const v16, 0x3ee66666    # 0.45f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v0, 0x3ee66666    # 0.45f

    .line 537
    .line 538
    .line 539
    const/high16 v2, 0x3f800000    # 1.0f

    .line 540
    .line 541
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v0, -0x4119999a    # -0.45f

    .line 545
    .line 546
    .line 547
    const/high16 v2, -0x40800000    # -1.0f

    .line 548
    .line 549
    const/high16 v4, 0x3f800000    # 1.0f

    .line 550
    .line 551
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v17, -0x428a3d71    # -0.06f

    .line 555
    .line 556
    .line 557
    const v18, -0x4170a3d7    # -0.28f

    .line 558
    .line 559
    .line 560
    const/4 v13, 0x0

    .line 561
    const v14, -0x42333333    # -0.1f

    .line 562
    .line 563
    .line 564
    const v15, -0x430a3d71    # -0.03f

    .line 565
    .line 566
    .line 567
    const v16, -0x41bd70a4    # -0.19f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, 0x4033d70a    # 2.81f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v17, -0x40600000    # -1.25f

    .line 580
    .line 581
    const v18, 0x3fbc28f6    # 1.47f

    .line 582
    .line 583
    .line 584
    const v13, -0x40ca3d71    # -0.71f

    .line 585
    .line 586
    .line 587
    const v14, 0x3de147ae    # 0.11f

    .line 588
    .line 589
    .line 590
    const/high16 v15, -0x40600000    # -1.25f

    .line 591
    .line 592
    const v16, 0x3f3ae148    # 0.73f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 599
    .line 600
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 601
    .line 602
    const/4 v13, 0x0

    .line 603
    const v14, 0x3f547ae1    # 0.83f

    .line 604
    .line 605
    .line 606
    const v15, 0x3f2b851f    # 0.67f

    .line 607
    .line 608
    .line 609
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v17, 0x3fbc28f6    # 1.47f

    .line 615
    .line 616
    .line 617
    const/high16 v18, -0x40600000    # -1.25f

    .line 618
    .line 619
    const v13, 0x3f3d70a4    # 0.74f

    .line 620
    .line 621
    .line 622
    const/4 v14, 0x0

    .line 623
    const v15, 0x3fae147b    # 1.36f

    .line 624
    .line 625
    .line 626
    const v16, -0x40f5c28f    # -0.54f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v17, -0x4170a3d7    # -0.28f

    .line 636
    .line 637
    .line 638
    const v18, -0x428a3d71    # -0.06f

    .line 639
    .line 640
    .line 641
    const v13, -0x4247ae14    # -0.09f

    .line 642
    .line 643
    .line 644
    const v14, -0x430a3d71    # -0.03f

    .line 645
    .line 646
    .line 647
    const v15, -0x41c7ae14    # -0.18f

    .line 648
    .line 649
    .line 650
    const v16, -0x428a3d71    # -0.06f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v17, -0x40800000    # -1.0f

    .line 657
    .line 658
    const/high16 v18, 0x3f800000    # 1.0f

    .line 659
    .line 660
    const v13, -0x40f33333    # -0.55f

    .line 661
    .line 662
    .line 663
    const/4 v14, 0x0

    .line 664
    const/high16 v15, -0x40800000    # -1.0f

    .line 665
    .line 666
    const v16, 0x3ee66666    # 0.45f

    .line 667
    .line 668
    .line 669
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v0, 0x3ee66666    # 0.45f

    .line 673
    .line 674
    .line 675
    const/high16 v2, 0x3f800000    # 1.0f

    .line 676
    .line 677
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const v0, -0x4119999a    # -0.45f

    .line 681
    .line 682
    .line 683
    const/high16 v2, -0x40800000    # -1.0f

    .line 684
    .line 685
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const v17, -0x428a3d71    # -0.06f

    .line 689
    .line 690
    .line 691
    const v18, -0x4170a3d7    # -0.28f

    .line 692
    .line 693
    .line 694
    const/4 v13, 0x0

    .line 695
    const v14, -0x42333333    # -0.1f

    .line 696
    .line 697
    .line 698
    const v15, -0x430a3d71    # -0.03f

    .line 699
    .line 700
    .line 701
    const v16, -0x41bd70a4    # -0.19f

    .line 702
    .line 703
    .line 704
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const v0, 0x4071eb85    # 3.78f

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const/high16 v0, 0x41a00000    # 20.0f

    .line 714
    .line 715
    const v2, 0x41a1d70a    # 20.23f

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v0, 0x407147ae    # 3.77f

    .line 722
    .line 723
    .line 724
    const/high16 v2, 0x40800000    # 4.0f

    .line 725
    .line 726
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const/high16 v0, 0x40200000    # 2.5f

    .line 730
    .line 731
    const v2, 0x40a8a3d7    # 5.27f

    .line 732
    .line 733
    .line 734
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v0, 0x41880000    # 17.0f

    .line 741
    .line 742
    const/high16 v2, 0x41200000    # 10.0f

    .line 743
    .line 744
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const/high16 v17, -0x40800000    # -1.0f

    .line 748
    .line 749
    const/high16 v18, 0x3f800000    # 1.0f

    .line 750
    .line 751
    const v13, -0x40f33333    # -0.55f

    .line 752
    .line 753
    .line 754
    const/4 v14, 0x0

    .line 755
    const/high16 v15, -0x40800000    # -1.0f

    .line 756
    .line 757
    const v16, 0x3ee66666    # 0.45f

    .line 758
    .line 759
    .line 760
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const v0, 0x3ee66666    # 0.45f

    .line 764
    .line 765
    .line 766
    const/high16 v2, 0x3f800000    # 1.0f

    .line 767
    .line 768
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const v0, -0x4119999a    # -0.45f

    .line 772
    .line 773
    .line 774
    const/high16 v2, -0x40800000    # -1.0f

    .line 775
    .line 776
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const/high16 v0, 0x41580000    # 13.5f

    .line 786
    .line 787
    const/high16 v2, 0x41a80000    # 21.0f

    .line 788
    .line 789
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    const/high16 v17, -0x41000000    # -0.5f

    .line 793
    .line 794
    const/high16 v18, 0x3f000000    # 0.5f

    .line 795
    .line 796
    const v13, -0x4170a3d7    # -0.28f

    .line 797
    .line 798
    .line 799
    const/high16 v15, -0x41000000    # -0.5f

    .line 800
    .line 801
    const v16, 0x3e6147ae    # 0.22f

    .line 802
    .line 803
    .line 804
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const v0, 0x3e6147ae    # 0.22f

    .line 808
    .line 809
    .line 810
    const/high16 v2, 0x3f000000    # 0.5f

    .line 811
    .line 812
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const v0, -0x419eb852    # -0.22f

    .line 816
    .line 817
    .line 818
    const/high16 v2, -0x41000000    # -0.5f

    .line 819
    .line 820
    const/high16 v4, 0x3f000000    # 0.5f

    .line 821
    .line 822
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const/high16 v0, 0x41500000    # 13.0f

    .line 832
    .line 833
    const/high16 v2, 0x40c00000    # 6.0f

    .line 834
    .line 835
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const/high16 v17, -0x40800000    # -1.0f

    .line 839
    .line 840
    const/high16 v18, 0x3f800000    # 1.0f

    .line 841
    .line 842
    const v13, -0x40f33333    # -0.55f

    .line 843
    .line 844
    .line 845
    const/high16 v15, -0x40800000    # -1.0f

    .line 846
    .line 847
    const v16, 0x3ee66666    # 0.45f

    .line 848
    .line 849
    .line 850
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const v0, 0x3ee66666    # 0.45f

    .line 854
    .line 855
    .line 856
    const/high16 v2, 0x3f800000    # 1.0f

    .line 857
    .line 858
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    const v0, -0x4119999a    # -0.45f

    .line 862
    .line 863
    .line 864
    const/high16 v2, -0x40800000    # -1.0f

    .line 865
    .line 866
    const/high16 v4, 0x3f800000    # 1.0f

    .line 867
    .line 868
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 869
    .line 870
    .line 871
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 872
    .line 873
    .line 874
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 875
    .line 876
    .line 877
    const/high16 v0, 0x40400000    # 3.0f

    .line 878
    .line 879
    const/high16 v2, 0x41180000    # 9.5f

    .line 880
    .line 881
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    const/high16 v17, -0x41000000    # -0.5f

    .line 885
    .line 886
    const/high16 v18, 0x3f000000    # 0.5f

    .line 887
    .line 888
    const v13, -0x4170a3d7    # -0.28f

    .line 889
    .line 890
    .line 891
    const/high16 v15, -0x41000000    # -0.5f

    .line 892
    .line 893
    const v16, 0x3e6147ae    # 0.22f

    .line 894
    .line 895
    .line 896
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 897
    .line 898
    .line 899
    const v0, 0x3e6147ae    # 0.22f

    .line 900
    .line 901
    .line 902
    const/high16 v2, 0x3f000000    # 0.5f

    .line 903
    .line 904
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 905
    .line 906
    .line 907
    const v0, -0x419eb852    # -0.22f

    .line 908
    .line 909
    .line 910
    const/high16 v2, -0x41000000    # -0.5f

    .line 911
    .line 912
    const/high16 v4, 0x3f000000    # 0.5f

    .line 913
    .line 914
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 915
    .line 916
    .line 917
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 918
    .line 919
    .line 920
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    .line 923
    const/high16 v0, 0x41a40000    # 20.5f

    .line 924
    .line 925
    const/high16 v2, 0x41200000    # 10.0f

    .line 926
    .line 927
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 931
    .line 932
    .line 933
    const v0, 0x3e6147ae    # 0.22f

    .line 934
    .line 935
    .line 936
    const/high16 v2, 0x3f000000    # 0.5f

    .line 937
    .line 938
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const v0, -0x419eb852    # -0.22f

    .line 942
    .line 943
    .line 944
    const/high16 v2, -0x41000000    # -0.5f

    .line 945
    .line 946
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 947
    .line 948
    .line 949
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 950
    .line 951
    .line 952
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 953
    .line 954
    .line 955
    const/high16 v0, 0x41880000    # 17.0f

    .line 956
    .line 957
    const/high16 v2, 0x40c00000    # 6.0f

    .line 958
    .line 959
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    const/high16 v17, -0x40800000    # -1.0f

    .line 963
    .line 964
    const/high16 v18, 0x3f800000    # 1.0f

    .line 965
    .line 966
    const v13, -0x40f33333    # -0.55f

    .line 967
    .line 968
    .line 969
    const/high16 v15, -0x40800000    # -1.0f

    .line 970
    .line 971
    const v16, 0x3ee66666    # 0.45f

    .line 972
    .line 973
    .line 974
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 975
    .line 976
    .line 977
    const v0, 0x3ee66666    # 0.45f

    .line 978
    .line 979
    .line 980
    const/high16 v2, 0x3f800000    # 1.0f

    .line 981
    .line 982
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 983
    .line 984
    .line 985
    const v0, -0x4119999a    # -0.45f

    .line 986
    .line 987
    .line 988
    const/high16 v2, -0x40800000    # -1.0f

    .line 989
    .line 990
    const/high16 v4, 0x3f800000    # 1.0f

    .line 991
    .line 992
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 993
    .line 994
    .line 995
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 999
    .line 1000
    .line 1001
    const/high16 v0, 0x40400000    # 3.0f

    .line 1002
    .line 1003
    const/high16 v2, 0x41580000    # 13.5f

    .line 1004
    .line 1005
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1006
    .line 1007
    .line 1008
    const/high16 v17, -0x41000000    # -0.5f

    .line 1009
    .line 1010
    const/high16 v18, 0x3f000000    # 0.5f

    .line 1011
    .line 1012
    const v13, -0x4170a3d7    # -0.28f

    .line 1013
    .line 1014
    .line 1015
    const/high16 v15, -0x41000000    # -0.5f

    .line 1016
    .line 1017
    const v16, 0x3e6147ae    # 0.22f

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1021
    .line 1022
    .line 1023
    const v0, 0x3e6147ae    # 0.22f

    .line 1024
    .line 1025
    .line 1026
    const/high16 v2, 0x3f000000    # 0.5f

    .line 1027
    .line 1028
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    const v0, -0x419eb852    # -0.22f

    .line 1032
    .line 1033
    .line 1034
    const/high16 v2, -0x41000000    # -0.5f

    .line 1035
    .line 1036
    const/high16 v4, 0x3f000000    # 0.5f

    .line 1037
    .line 1038
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v2

    .line 1051
    const/16 v16, 0x3800

    .line 1052
    .line 1053
    const/16 v17, 0x0

    .line 1054
    .line 1055
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1056
    .line 1057
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1058
    .line 1059
    const/4 v7, 0x0

    .line 1060
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1061
    .line 1062
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1063
    .line 1064
    const/4 v13, 0x0

    .line 1065
    const/4 v15, 0x0

    .line 1066
    const-string v4, ""

    .line 1067
    .line 1068
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v0

    .line 1072
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v0

    .line 1076
    sput-object v0, Landroidx/compose/material/icons/filled/BlurOffKt;->_blurOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1077
    .line 1078
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1079
    .line 1080
    .line 1081
    return-object v0
.end method
