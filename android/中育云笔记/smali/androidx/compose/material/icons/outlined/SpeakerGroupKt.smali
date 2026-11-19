.class public final Landroidx/compose/material/icons/outlined/SpeakerGroupKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _speakerGroup:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSpeakerGroup(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SpeakerGroupKt;->_speakerGroup:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SpeakerGroup"

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
    const v0, 0x4191999a    # 18.2f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x3f800000    # 1.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x411ccccd    # 9.8f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v17, 0x41000000    # 8.0f

    .line 85
    .line 86
    const v18, 0x40333333    # 2.8f

    .line 87
    .line 88
    .line 89
    const v13, 0x410cf5c3    # 8.81f

    .line 90
    .line 91
    .line 92
    const/high16 v14, 0x3f800000    # 1.0f

    .line 93
    .line 94
    const/high16 v15, 0x41000000    # 8.0f

    .line 95
    .line 96
    const v16, 0x3fe7ae14    # 1.81f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, 0x41666666    # 14.4f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v17, 0x3fe66666    # 1.8f

    .line 109
    .line 110
    .line 111
    const v18, 0x3fe51eb8    # 1.79f

    .line 112
    .line 113
    .line 114
    const/4 v13, 0x0

    .line 115
    const v14, 0x3f7d70a4    # 0.99f

    .line 116
    .line 117
    .line 118
    const v15, 0x3f4f5c29    # 0.81f

    .line 119
    .line 120
    .line 121
    const v16, 0x3fe51eb8    # 1.79f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v0, 0x41066666    # 8.4f

    .line 128
    .line 129
    .line 130
    const v2, 0x3c23d70a    # 0.01f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v18, -0x4019999a    # -1.8f

    .line 137
    .line 138
    .line 139
    const v13, 0x3f7d70a4    # 0.99f

    .line 140
    .line 141
    .line 142
    const/4 v14, 0x0

    .line 143
    const v15, 0x3fe66666    # 1.8f

    .line 144
    .line 145
    .line 146
    const v16, -0x40b0a3d7    # -0.81f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v0, 0x41a00000    # 20.0f

    .line 153
    .line 154
    const v2, 0x40333333    # 2.8f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, -0x4019999a    # -1.8f

    .line 161
    .line 162
    .line 163
    const/4 v13, 0x0

    .line 164
    const v14, -0x40828f5c    # -0.99f

    .line 165
    .line 166
    .line 167
    const v15, -0x40b0a3d7    # -0.81f

    .line 168
    .line 169
    .line 170
    const v16, -0x4019999a    # -1.8f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v0, 0x41900000    # 18.0f

    .line 180
    .line 181
    const/high16 v2, 0x41880000    # 17.0f

    .line 182
    .line 183
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v0, -0x3f000000    # -8.0f

    .line 187
    .line 188
    const v2, -0x43dc28f6    # -0.01f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, 0x40400000    # 3.0f

    .line 195
    .line 196
    const/high16 v2, 0x41200000    # 10.0f

    .line 197
    .line 198
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v0, 0x41000000    # 8.0f

    .line 202
    .line 203
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v0, 0x41600000    # 14.0f

    .line 207
    .line 208
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v0, 0x41000000    # 8.0f

    .line 215
    .line 216
    const/high16 v2, 0x41600000    # 14.0f

    .line 217
    .line 218
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v17, 0x40000000    # 2.0f

    .line 222
    .line 223
    const/high16 v18, -0x40000000    # -2.0f

    .line 224
    .line 225
    const v13, 0x3f8ccccd    # 1.1f

    .line 226
    .line 227
    .line 228
    const/4 v14, 0x0

    .line 229
    const/high16 v15, 0x40000000    # 2.0f

    .line 230
    .line 231
    const v16, -0x409c28f6    # -0.89f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, -0x4099999a    # -0.9f

    .line 238
    .line 239
    .line 240
    const/high16 v2, -0x40000000    # -2.0f

    .line 241
    .line 242
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v0, 0x3f63d70a    # 0.89f

    .line 246
    .line 247
    .line 248
    const/high16 v2, 0x40000000    # 2.0f

    .line 249
    .line 250
    const/high16 v4, -0x40000000    # -2.0f

    .line 251
    .line 252
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v0, 0x3f666666    # 0.9f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x41800000    # 16.0f

    .line 265
    .line 266
    const/high16 v2, 0x41600000    # 14.0f

    .line 267
    .line 268
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v17, 0x40600000    # 3.5f

    .line 272
    .line 273
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 274
    .line 275
    const v13, 0x3ff70a3d    # 1.93f

    .line 276
    .line 277
    .line 278
    const/high16 v15, 0x40600000    # 3.5f

    .line 279
    .line 280
    const v16, -0x40370a3d    # -1.57f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, 0x417ee148    # 15.93f

    .line 287
    .line 288
    .line 289
    const/high16 v2, 0x41100000    # 9.0f

    .line 290
    .line 291
    const/high16 v4, 0x41600000    # 14.0f

    .line 292
    .line 293
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x3fc8f5c3    # 1.57f

    .line 297
    .line 298
    .line 299
    const/high16 v2, 0x40600000    # 3.5f

    .line 300
    .line 301
    const/high16 v4, -0x3fa00000    # -3.5f

    .line 302
    .line 303
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v0, 0x41411eb8    # 12.07f

    .line 307
    .line 308
    .line 309
    const/high16 v2, 0x41800000    # 16.0f

    .line 310
    .line 311
    const/high16 v4, 0x41600000    # 14.0f

    .line 312
    .line 313
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, 0x41300000    # 11.0f

    .line 320
    .line 321
    const/high16 v2, 0x41600000    # 14.0f

    .line 322
    .line 323
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 327
    .line 328
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 329
    .line 330
    const v13, 0x3f547ae1    # 0.83f

    .line 331
    .line 332
    .line 333
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 334
    .line 335
    const v16, 0x3f2b851f    # 0.67f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, 0x416d47ae    # 14.83f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, -0x40d47ae1    # -0.67f

    .line 348
    .line 349
    .line 350
    const/high16 v2, -0x40400000    # -1.5f

    .line 351
    .line 352
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x3f2b851f    # 0.67f

    .line 356
    .line 357
    .line 358
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 359
    .line 360
    const/high16 v4, -0x40400000    # -1.5f

    .line 361
    .line 362
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v0, 0x40a00000    # 5.0f

    .line 369
    .line 370
    const/high16 v2, 0x40c00000    # 6.0f

    .line 371
    .line 372
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x40800000    # 4.0f

    .line 376
    .line 377
    const/high16 v2, 0x40a00000    # 5.0f

    .line 378
    .line 379
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v0, 0x41800000    # 16.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v17, 0x40000000    # 2.0f

    .line 388
    .line 389
    const/high16 v18, 0x40000000    # 2.0f

    .line 390
    .line 391
    const/4 v13, 0x0

    .line 392
    const v14, 0x3f8ccccd    # 1.1f

    .line 393
    .line 394
    .line 395
    const v15, 0x3f63d70a    # 0.89f

    .line 396
    .line 397
    .line 398
    const/high16 v16, 0x40000000    # 2.0f

    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v0, 0x41200000    # 10.0f

    .line 404
    .line 405
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, -0x40000000    # -2.0f

    .line 409
    .line 410
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v0, 0x41a80000    # 21.0f

    .line 414
    .line 415
    const/high16 v2, 0x40c00000    # 6.0f

    .line 416
    .line 417
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x40a00000    # 5.0f

    .line 421
    .line 422
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    const/16 v16, 0x3800

    .line 433
    .line 434
    const/16 v17, 0x0

    .line 435
    .line 436
    const/high16 v6, 0x3f800000    # 1.0f

    .line 437
    .line 438
    const/high16 v8, 0x3f800000    # 1.0f

    .line 439
    .line 440
    const/4 v7, 0x0

    .line 441
    const/high16 v9, 0x3f800000    # 1.0f

    .line 442
    .line 443
    const/high16 v12, 0x3f800000    # 1.0f

    .line 444
    .line 445
    const/4 v14, 0x0

    .line 446
    const/4 v15, 0x0

    .line 447
    const-string v4, ""

    .line 448
    .line 449
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    sput-object v0, Landroidx/compose/material/icons/outlined/SpeakerGroupKt;->_speakerGroup:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 458
    .line 459
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    return-object v0
.end method
