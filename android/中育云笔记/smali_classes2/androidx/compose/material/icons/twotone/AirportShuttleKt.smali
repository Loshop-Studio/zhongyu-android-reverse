.class public final Landroidx/compose/material/icons/twotone/AirportShuttleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _airportShuttle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAirportShuttle(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AirportShuttleKt;->_airportShuttle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AirportShuttle"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x41600000    # 14.0f

    .line 71
    .line 72
    const/high16 v6, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, 0x3f47ae14    # 0.78f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v25, 0x400e147b    # 2.22f

    .line 84
    .line 85
    .line 86
    const/high16 v26, -0x40800000    # -1.0f

    .line 87
    .line 88
    const v21, 0x3f0ccccd    # 0.55f

    .line 89
    .line 90
    .line 91
    const v22, -0x40e3d70a    # -0.61f

    .line 92
    .line 93
    .line 94
    const v23, 0x3fab851f    # 1.34f

    .line 95
    .line 96
    .line 97
    const/high16 v24, -0x40800000    # -1.0f

    .line 98
    .line 99
    move-object/from16 v20, v2

    .line 100
    .line 101
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, 0x400e147b    # 2.22f

    .line 105
    .line 106
    .line 107
    const v6, 0x3fd5c28f    # 1.67f

    .line 108
    .line 109
    .line 110
    const v7, 0x3ec7ae14    # 0.39f

    .line 111
    .line 112
    .line 113
    const/high16 v8, 0x3f800000    # 1.0f

    .line 114
    .line 115
    invoke-virtual {v2, v6, v7, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v4, 0x40f1eb85    # 7.56f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v4, 0x400e147b    # 2.22f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v6, v7, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v4, 0x41a80000    # 21.0f

    .line 134
    .line 135
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, -0x40000000    # -2.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, 0x40400000    # 3.0f

    .line 144
    .line 145
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v4, 0x40000000    # 2.0f

    .line 149
    .line 150
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    const/16 v16, 0x3800

    .line 161
    .line 162
    const/16 v17, 0x0

    .line 163
    .line 164
    const v6, 0x3e99999a    # 0.3f

    .line 165
    .line 166
    .line 167
    const v8, 0x3e99999a    # 0.3f

    .line 168
    .line 169
    .line 170
    const/4 v7, 0x0

    .line 171
    const/high16 v9, 0x3f800000    # 1.0f

    .line 172
    .line 173
    const/high16 v12, 0x3f800000    # 1.0f

    .line 174
    .line 175
    const/4 v13, 0x0

    .line 176
    const/4 v14, 0x0

    .line 177
    const/4 v15, 0x0

    .line 178
    const-string v4, ""

    .line 179
    .line 180
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 181
    .line 182
    .line 183
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 188
    .line 189
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 190
    .line 191
    .line 192
    move-result-wide v6

    .line 193
    const/4 v0, 0x0

    .line 194
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 198
    .line 199
    .line 200
    move-result v10

    .line 201
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 208
    .line 209
    .line 210
    const/high16 v0, 0x41880000    # 17.0f

    .line 211
    .line 212
    const/high16 v2, 0x40a00000    # 5.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v0, 0x40a00000    # 5.0f

    .line 218
    .line 219
    const/high16 v2, 0x40400000    # 3.0f

    .line 220
    .line 221
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v17, -0x40000000    # -2.0f

    .line 225
    .line 226
    const/high16 v18, 0x40000000    # 2.0f

    .line 227
    .line 228
    const v13, -0x40733333    # -1.1f

    .line 229
    .line 230
    .line 231
    const/high16 v15, -0x40000000    # -2.0f

    .line 232
    .line 233
    const v16, 0x3f63d70a    # 0.89f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v0, 0x41100000    # 9.0f

    .line 240
    .line 241
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v0, 0x40000000    # 2.0f

    .line 245
    .line 246
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v17, 0x40400000    # 3.0f

    .line 250
    .line 251
    const/high16 v18, 0x40400000    # 3.0f

    .line 252
    .line 253
    const/4 v13, 0x0

    .line 254
    const v14, 0x3fd47ae1    # 1.66f

    .line 255
    .line 256
    .line 257
    const v15, 0x3fab851f    # 1.34f

    .line 258
    .line 259
    .line 260
    const/high16 v16, 0x40400000    # 3.0f

    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 266
    .line 267
    const v2, -0x40547ae1    # -1.34f

    .line 268
    .line 269
    .line 270
    const/high16 v4, 0x40400000    # 3.0f

    .line 271
    .line 272
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, 0x40c00000    # 6.0f

    .line 276
    .line 277
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 284
    .line 285
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v0, 0x40000000    # 2.0f

    .line 289
    .line 290
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, -0x3f600000    # -5.0f

    .line 294
    .line 295
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v0, -0x3f400000    # -6.0f

    .line 299
    .line 300
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v0, 0x41700000    # 15.0f

    .line 307
    .line 308
    const/high16 v2, 0x40e00000    # 7.0f

    .line 309
    .line 310
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v0, 0x3f800000    # 1.0f

    .line 314
    .line 315
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v0, 0x40400000    # 3.0f

    .line 319
    .line 320
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v0, -0x3f800000    # -4.0f

    .line 324
    .line 325
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v0, 0x41700000    # 15.0f

    .line 329
    .line 330
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v0, 0x41100000    # 9.0f

    .line 337
    .line 338
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v0, 0x40800000    # 4.0f

    .line 342
    .line 343
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v0, 0x40400000    # 3.0f

    .line 347
    .line 348
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v0, 0x41200000    # 10.0f

    .line 352
    .line 353
    const/high16 v2, 0x41100000    # 9.0f

    .line 354
    .line 355
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v0, 0x41100000    # 9.0f

    .line 359
    .line 360
    const/high16 v2, 0x40e00000    # 7.0f

    .line 361
    .line 362
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v0, 0x40e00000    # 7.0f

    .line 369
    .line 370
    const/high16 v2, 0x40400000    # 3.0f

    .line 371
    .line 372
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x40800000    # 4.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x40400000    # 3.0f

    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x41200000    # 10.0f

    .line 386
    .line 387
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x40e00000    # 7.0f

    .line 391
    .line 392
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v0, 0x418a0000    # 17.25f

    .line 399
    .line 400
    const/high16 v2, 0x40c00000    # 6.0f

    .line 401
    .line 402
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v17, -0x40600000    # -1.25f

    .line 406
    .line 407
    const/high16 v18, -0x40600000    # -1.25f

    .line 408
    .line 409
    const v13, -0x40cf5c29    # -0.69f

    .line 410
    .line 411
    .line 412
    const/4 v14, 0x0

    .line 413
    const/high16 v15, -0x40600000    # -1.25f

    .line 414
    .line 415
    const v16, -0x40f0a3d7    # -0.56f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, 0x3f0f5c29    # 0.56f

    .line 422
    .line 423
    .line 424
    const/high16 v2, -0x40600000    # -1.25f

    .line 425
    .line 426
    const/high16 v4, 0x3fa00000    # 1.25f

    .line 427
    .line 428
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v2, 0x3fa00000    # 1.25f

    .line 432
    .line 433
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, -0x40f0a3d7    # -0.56f

    .line 437
    .line 438
    .line 439
    const/high16 v2, -0x40600000    # -1.25f

    .line 440
    .line 441
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v0, 0x41900000    # 18.0f

    .line 448
    .line 449
    const/high16 v2, 0x418a0000    # 17.25f

    .line 450
    .line 451
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v0, 0x3f0f5c29    # 0.56f

    .line 458
    .line 459
    .line 460
    const/high16 v2, -0x40600000    # -1.25f

    .line 461
    .line 462
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v2, 0x3fa00000    # 1.25f

    .line 466
    .line 467
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, -0x40f0a3d7    # -0.56f

    .line 471
    .line 472
    .line 473
    const/high16 v2, -0x40600000    # -1.25f

    .line 474
    .line 475
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v0, 0x41a80000    # 21.0f

    .line 482
    .line 483
    const/high16 v2, 0x41600000    # 14.0f

    .line 484
    .line 485
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, -0x40b851ec    # -0.78f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v17, -0x3ff1eb85    # -2.22f

    .line 495
    .line 496
    .line 497
    const/high16 v18, -0x40800000    # -1.0f

    .line 498
    .line 499
    const v13, -0x40f33333    # -0.55f

    .line 500
    .line 501
    .line 502
    const v14, -0x40e3d70a    # -0.61f

    .line 503
    .line 504
    .line 505
    const v15, -0x40547ae1    # -1.34f

    .line 506
    .line 507
    .line 508
    const/high16 v16, -0x40800000    # -1.0f

    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, -0x402a3d71    # -1.67f

    .line 514
    .line 515
    .line 516
    const v2, -0x3ff1eb85    # -2.22f

    .line 517
    .line 518
    .line 519
    const v4, 0x3ec7ae14    # 0.39f

    .line 520
    .line 521
    .line 522
    const/high16 v6, 0x3f800000    # 1.0f

    .line 523
    .line 524
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v0, 0x4103851f    # 8.22f

    .line 528
    .line 529
    .line 530
    const/high16 v2, 0x41600000    # 14.0f

    .line 531
    .line 532
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v15, -0x4055c28f    # -1.33f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v0, -0x402a3d71    # -1.67f

    .line 542
    .line 543
    .line 544
    const v2, -0x3ff1eb85    # -2.22f

    .line 545
    .line 546
    .line 547
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v0, 0x41600000    # 14.0f

    .line 551
    .line 552
    const/high16 v2, 0x40400000    # 3.0f

    .line 553
    .line 554
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const/high16 v0, -0x40000000    # -2.0f

    .line 558
    .line 559
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v0, 0x41900000    # 18.0f

    .line 563
    .line 564
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v0, 0x40000000    # 2.0f

    .line 568
    .line 569
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 576
    .line 577
    .line 578
    move-result-object v2

    .line 579
    const/16 v16, 0x3800

    .line 580
    .line 581
    const/16 v17, 0x0

    .line 582
    .line 583
    const/high16 v8, 0x3f800000    # 1.0f

    .line 584
    .line 585
    const/4 v7, 0x0

    .line 586
    const/high16 v12, 0x3f800000    # 1.0f

    .line 587
    .line 588
    const/4 v13, 0x0

    .line 589
    const/4 v14, 0x0

    .line 590
    const/4 v15, 0x0

    .line 591
    const-string v4, ""

    .line 592
    .line 593
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    sput-object v0, Landroidx/compose/material/icons/twotone/AirportShuttleKt;->_airportShuttle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 602
    .line 603
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    return-object v0
.end method
