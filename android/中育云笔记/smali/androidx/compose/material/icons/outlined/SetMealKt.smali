.class public final Landroidx/compose/material/icons/outlined/SetMealKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _setMeal:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSetMeal(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SetMealKt;->_setMeal:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SetMeal"

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
    const v0, 0x418c7ae1    # 17.56f

    .line 71
    .line 72
    .line 73
    const v2, 0x41a86666    # 21.05f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x40451eb8    # 3.08f

    .line 80
    .line 81
    .line 82
    const/high16 v2, 0x41940000    # 18.5f

    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v0, 0x41880000    # 17.0f

    .line 88
    .line 89
    const/high16 v2, 0x40400000    # 3.0f

    .line 90
    .line 91
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, 0x418fd70a    # 17.98f

    .line 95
    .line 96
    .line 97
    const v2, -0x408f5c29    # -0.94f

    .line 98
    .line 99
    .line 100
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v0, 0x418c7ae1    # 17.56f

    .line 104
    .line 105
    .line 106
    const v2, 0x41a86666    # 21.05f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v0, 0x419bd70a    # 19.48f

    .line 116
    .line 117
    .line 118
    const/high16 v2, 0x41a80000    # 21.0f

    .line 119
    .line 120
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v0, 0x40400000    # 3.0f

    .line 124
    .line 125
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 129
    .line 130
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v0, 0x41900000    # 18.0f

    .line 134
    .line 135
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x419bd70a    # 19.48f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v0, 0x41b80000    # 23.0f

    .line 148
    .line 149
    const/high16 v2, 0x41500000    # 13.0f

    .line 150
    .line 151
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v0, 0x40800000    # 4.0f

    .line 155
    .line 156
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v17, -0x40000000    # -2.0f

    .line 160
    .line 161
    const/high16 v18, -0x40000000    # -2.0f

    .line 162
    .line 163
    const/4 v13, 0x0

    .line 164
    const v14, -0x40733333    # -1.1f

    .line 165
    .line 166
    .line 167
    const v15, -0x4099999a    # -0.9f

    .line 168
    .line 169
    .line 170
    const/high16 v16, -0x40000000    # -2.0f

    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v0, 0x40400000    # 3.0f

    .line 176
    .line 177
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v17, 0x3f800000    # 1.0f

    .line 181
    .line 182
    const/high16 v18, 0x40800000    # 4.0f

    .line 183
    .line 184
    const v13, 0x3ff33333    # 1.9f

    .line 185
    .line 186
    .line 187
    const/high16 v14, 0x40000000    # 2.0f

    .line 188
    .line 189
    const/high16 v15, 0x3f800000    # 1.0f

    .line 190
    .line 191
    const v16, 0x4039999a    # 2.9f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v0, 0x41100000    # 9.0f

    .line 198
    .line 199
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v17, 0x40000000    # 2.0f

    .line 203
    .line 204
    const/high16 v18, 0x40000000    # 2.0f

    .line 205
    .line 206
    const/4 v13, 0x0

    .line 207
    const v14, 0x3f8ccccd    # 1.1f

    .line 208
    .line 209
    .line 210
    const v15, 0x3f666666    # 0.9f

    .line 211
    .line 212
    .line 213
    const/high16 v16, 0x40000000    # 2.0f

    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v0, 0x41900000    # 18.0f

    .line 219
    .line 220
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v17, 0x41b80000    # 23.0f

    .line 224
    .line 225
    const/high16 v18, 0x41500000    # 13.0f

    .line 226
    .line 227
    const v13, 0x41b0cccd    # 22.1f

    .line 228
    .line 229
    .line 230
    const/high16 v14, 0x41700000    # 15.0f

    .line 231
    .line 232
    const/high16 v15, 0x41b80000    # 23.0f

    .line 233
    .line 234
    const v16, 0x4161999a    # 14.1f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v0, 0x41a80000    # 21.0f

    .line 244
    .line 245
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v0, 0x40400000    # 3.0f

    .line 249
    .line 250
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v0, 0x40800000    # 4.0f

    .line 254
    .line 255
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v0, 0x41900000    # 18.0f

    .line 259
    .line 260
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v0, 0x41500000    # 13.0f

    .line 264
    .line 265
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v0, 0x41a00000    # 20.0f

    .line 272
    .line 273
    const/high16 v2, 0x40c00000    # 6.0f

    .line 274
    .line 275
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v17, -0x3fb28f5c    # -3.21f

    .line 279
    .line 280
    .line 281
    const v18, 0x400eb852    # 2.23f

    .line 282
    .line 283
    .line 284
    const v13, -0x4028f5c3    # -1.68f

    .line 285
    .line 286
    .line 287
    const/4 v14, 0x0

    .line 288
    const v15, -0x3fbd70a4    # -3.04f

    .line 289
    .line 290
    .line 291
    const v16, 0x3f7ae148    # 0.98f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v17, 0x41240000    # 10.25f

    .line 298
    .line 299
    const/high16 v18, 0x40b00000    # 5.5f

    .line 300
    .line 301
    const v13, 0x41813333    # 16.15f

    .line 302
    .line 303
    .line 304
    const/high16 v14, 0x40f00000    # 7.5f

    .line 305
    .line 306
    const v15, 0x4160f5c3    # 14.06f

    .line 307
    .line 308
    .line 309
    const/high16 v16, 0x40b00000    # 5.5f

    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v17, -0x3f280000    # -6.75f

    .line 315
    .line 316
    const/high16 v18, 0x40400000    # 3.0f

    .line 317
    .line 318
    const v13, -0x3f6a8f5c    # -4.67f

    .line 319
    .line 320
    .line 321
    const/4 v14, 0x0

    .line 322
    const/high16 v15, -0x3f280000    # -6.75f

    .line 323
    .line 324
    const/high16 v16, 0x40400000    # 3.0f

    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x40051eb8    # 2.08f

    .line 330
    .line 331
    .line 332
    const/high16 v2, 0x40d80000    # 6.75f

    .line 333
    .line 334
    const/high16 v4, 0x40400000    # 3.0f

    .line 335
    .line 336
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, 0x40d147ae    # 6.54f

    .line 340
    .line 341
    .line 342
    const v18, -0x3fd147ae    # -2.73f

    .line 343
    .line 344
    .line 345
    const v13, 0x4073d70a    # 3.81f

    .line 346
    .line 347
    .line 348
    const v15, 0x40bccccd    # 5.9f

    .line 349
    .line 350
    .line 351
    const/high16 v16, -0x40000000    # -2.0f

    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v17, 0x41a00000    # 20.0f

    .line 357
    .line 358
    const/high16 v18, 0x41300000    # 11.0f

    .line 359
    .line 360
    const v13, 0x4187ae14    # 16.96f

    .line 361
    .line 362
    .line 363
    const v14, 0x412051ec    # 10.02f

    .line 364
    .line 365
    .line 366
    const v15, 0x41928f5c    # 18.32f

    .line 367
    .line 368
    .line 369
    const/high16 v16, 0x41300000    # 11.0f

    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v0, 0x40c00000    # 6.0f

    .line 375
    .line 376
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    const/16 v16, 0x3800

    .line 387
    .line 388
    const/16 v17, 0x0

    .line 389
    .line 390
    const/high16 v6, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const/high16 v8, 0x3f800000    # 1.0f

    .line 393
    .line 394
    const/4 v7, 0x0

    .line 395
    const/high16 v9, 0x3f800000    # 1.0f

    .line 396
    .line 397
    const/high16 v12, 0x3f800000    # 1.0f

    .line 398
    .line 399
    const/4 v13, 0x0

    .line 400
    const/4 v14, 0x0

    .line 401
    const/4 v15, 0x0

    .line 402
    const-string v4, ""

    .line 403
    .line 404
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    sput-object v0, Landroidx/compose/material/icons/outlined/SetMealKt;->_setMeal:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 413
    .line 414
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    return-object v0
.end method
