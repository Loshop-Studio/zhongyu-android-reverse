.class public final Landroidx/compose/material/icons/sharp/HealingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _healing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHealing(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/HealingKt;->_healing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Healing"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

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
    const v0, 0x418deb85    # 17.74f

    .line 71
    .line 72
    .line 73
    const v2, 0x414028f6    # 12.01f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x4095c28f    # 4.68f

    .line 80
    .line 81
    .line 82
    const v2, -0x3f6a3d71    # -4.68f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v4, -0x3f480000    # -5.75f

    .line 89
    .line 90
    invoke-virtual {v12, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x40e9999a    # 7.3f

    .line 97
    .line 98
    .line 99
    const v6, 0x3fca3d71    # 1.58f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v4, 0x3fc66666    # 1.55f

    .line 106
    .line 107
    .line 108
    const v6, 0x40eae148    # 7.34f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x4096147b    # 4.69f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v7, 0x40b80000    # 5.75f

    .line 124
    .line 125
    invoke-virtual {v12, v7, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, 0x40b851ec    # 5.76f

    .line 135
    .line 136
    .line 137
    const v2, -0x3f47ae14    # -5.76f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v0, -0x3f69eb85    # -4.69f

    .line 144
    .line 145
    .line 146
    const v2, -0x3f69999a    # -4.7f

    .line 147
    .line 148
    .line 149
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v0, 0x41100000    # 9.0f

    .line 156
    .line 157
    const/high16 v2, 0x41400000    # 12.0f

    .line 158
    .line 159
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v17, 0x3f800000    # 1.0f

    .line 163
    .line 164
    const/high16 v18, 0x3f800000    # 1.0f

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
    const v16, 0x3ee66666    # 0.45f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v0, -0x4119999a    # -0.45f

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/high16 v7, -0x40800000    # -1.0f

    .line 184
    .line 185
    invoke-virtual {v12, v0, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v7, v0, v7, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v8, 0x3ee66666    # 0.45f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12, v8, v7, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v9, 0x40e947ae    # 7.29f

    .line 201
    .line 202
    .line 203
    const v13, 0x412f5c29    # 10.96f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12, v9, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v9, 0x406a3d71    # 3.66f

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12, v9, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v6, 0x406851ec    # 3.63f

    .line 216
    .line 217
    .line 218
    const v9, -0x3f97ae14    # -3.63f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v6, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v13, 0x4067ae14    # 3.62f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v13, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v14, -0x3f9851ec    # -3.62f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v14, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v15, 0x41200000    # 10.0f

    .line 240
    .line 241
    const/high16 v13, 0x41500000    # 13.0f

    .line 242
    .line 243
    invoke-virtual {v12, v15, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v17, -0x40800000    # -1.0f

    .line 247
    .line 248
    const/high16 v18, -0x40800000    # -1.0f

    .line 249
    .line 250
    const v13, -0x40f33333    # -0.55f

    .line 251
    .line 252
    .line 253
    move v15, v14

    .line 254
    const/4 v14, 0x0

    .line 255
    move/from16 v16, v15

    .line 256
    .line 257
    const/high16 v15, -0x40800000    # -1.0f

    .line 258
    .line 259
    move/from16 v19, v16

    .line 260
    .line 261
    const v16, -0x4119999a    # -0.45f

    .line 262
    .line 263
    .line 264
    move/from16 v6, v19

    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v8, v7, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v4, v8, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v0, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v13, 0x41700000    # 15.0f

    .line 282
    .line 283
    invoke-virtual {v12, v2, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v13, -0x40f33333    # -0.55f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v8, v7, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v4, v8, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12, v0, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v2, 0x41600000    # 14.0f

    .line 305
    .line 306
    const/high16 v13, 0x41300000    # 11.0f

    .line 307
    .line 308
    invoke-virtual {v12, v2, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v17, 0x3f800000    # 1.0f

    .line 312
    .line 313
    const/high16 v18, 0x3f800000    # 1.0f

    .line 314
    .line 315
    const v13, 0x3f0ccccd    # 0.55f

    .line 316
    .line 317
    .line 318
    const/high16 v15, 0x3f800000    # 1.0f

    .line 319
    .line 320
    const v16, 0x3ee66666    # 0.45f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v0, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v7, v0, v7, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v8, v7, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, 0x418547ae    # 16.66f

    .line 339
    .line 340
    .line 341
    const v2, 0x41a2b852    # 20.34f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v9, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x406851ec    # 3.63f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v0, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v2, 0x4067ae14    # 3.62f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    const/16 v16, 0x3800

    .line 373
    .line 374
    const/16 v17, 0x0

    .line 375
    .line 376
    const-string v4, ""

    .line 377
    .line 378
    const/high16 v6, 0x3f800000    # 1.0f

    .line 379
    .line 380
    const/4 v7, 0x0

    .line 381
    const/high16 v8, 0x3f800000    # 1.0f

    .line 382
    .line 383
    const/high16 v9, 0x3f800000    # 1.0f

    .line 384
    .line 385
    const/high16 v12, 0x3f800000    # 1.0f

    .line 386
    .line 387
    const/4 v13, 0x0

    .line 388
    const/4 v15, 0x0

    .line 389
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    sput-object v0, Landroidx/compose/material/icons/sharp/HealingKt;->_healing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 398
    .line 399
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    return-object v0
.end method
