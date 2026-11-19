.class public final Landroidx/compose/material/icons/twotone/FoodBankKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _foodBank:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFoodBank(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FoodBankKt;->_foodBank:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.FoodBank"

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
    const/high16 v4, 0x40b00000    # 5.5f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40900000    # 4.5f

    .line 78
    .line 79
    const/high16 v6, 0x40c00000    # 6.0f

    .line 80
    .line 81
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v4, 0x41100000    # 9.0f

    .line 85
    .line 86
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v4, 0x40c00000    # 6.0f

    .line 90
    .line 91
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, -0x3ef00000    # -9.0f

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v4, 0x40b00000    # 5.5f

    .line 100
    .line 101
    const/high16 v6, 0x41400000    # 12.0f

    .line 102
    .line 103
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x41180000    # 9.5f

    .line 107
    .line 108
    const/high16 v6, 0x41380000    # 11.5f

    .line 109
    .line 110
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v4, 0x40400000    # 3.0f

    .line 114
    .line 115
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v4, 0x41300000    # 11.0f

    .line 119
    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 124
    .line 125
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v4, -0x40800000    # -1.0f

    .line 129
    .line 130
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v4, 0x40400000    # 3.0f

    .line 134
    .line 135
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, 0x41180000    # 9.5f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 144
    .line 145
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v4, -0x40800000    # -1.0f

    .line 149
    .line 150
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v4, 0x40400000    # 3.0f

    .line 154
    .line 155
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 159
    .line 160
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 161
    .line 162
    const/16 v21, 0x0

    .line 163
    .line 164
    const v22, 0x3f547ae1    # 0.83f

    .line 165
    .line 166
    .line 167
    const v23, 0x3f2b851f    # 0.67f

    .line 168
    .line 169
    .line 170
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 171
    .line 172
    move-object/from16 v20, v2

    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v4, 0x40800000    # 4.0f

    .line 178
    .line 179
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v4, 0x3f800000    # 1.0f

    .line 183
    .line 184
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v4, -0x3f800000    # -4.0f

    .line 188
    .line 189
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v26, -0x40400000    # -1.5f

    .line 193
    .line 194
    const v21, 0x3f547ae1    # 0.83f

    .line 195
    .line 196
    .line 197
    const/16 v22, 0x0

    .line 198
    .line 199
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 200
    .line 201
    const v24, -0x40d47ae1    # -0.67f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 208
    .line 209
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v4, 0x41380000    # 11.5f

    .line 213
    .line 214
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v4, 0x41500000    # 13.0f

    .line 221
    .line 222
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v4, 0x40400000    # 3.0f

    .line 226
    .line 227
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v4, 0x3f800000    # 1.0f

    .line 231
    .line 232
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v4, 0x41900000    # 18.0f

    .line 236
    .line 237
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v4, 0x3f800000    # 1.0f

    .line 241
    .line 242
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v4, 0x41180000    # 9.5f

    .line 246
    .line 247
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v25, 0x41500000    # 13.0f

    .line 251
    .line 252
    const/high16 v26, 0x41380000    # 11.5f

    .line 253
    .line 254
    const v21, 0x415e6666    # 13.9f

    .line 255
    .line 256
    .line 257
    const/high16 v22, 0x41180000    # 9.5f

    .line 258
    .line 259
    const/high16 v23, 0x41500000    # 13.0f

    .line 260
    .line 261
    const v24, 0x41266666    # 10.4f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    const/16 v16, 0x3800

    .line 275
    .line 276
    const/16 v17, 0x0

    .line 277
    .line 278
    const v6, 0x3e99999a    # 0.3f

    .line 279
    .line 280
    .line 281
    const v8, 0x3e99999a    # 0.3f

    .line 282
    .line 283
    .line 284
    const/4 v7, 0x0

    .line 285
    const/high16 v9, 0x3f800000    # 1.0f

    .line 286
    .line 287
    const/high16 v12, 0x3f800000    # 1.0f

    .line 288
    .line 289
    const/4 v13, 0x0

    .line 290
    const/4 v14, 0x0

    .line 291
    const/4 v15, 0x0

    .line 292
    const-string v4, ""

    .line 293
    .line 294
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 295
    .line 296
    .line 297
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 302
    .line 303
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 304
    .line 305
    .line 306
    move-result-wide v6

    .line 307
    const/4 v0, 0x0

    .line 308
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 312
    .line 313
    .line 314
    move-result v10

    .line 315
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 316
    .line 317
    .line 318
    move-result v11

    .line 319
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 322
    .line 323
    .line 324
    const/high16 v0, 0x40b00000    # 5.5f

    .line 325
    .line 326
    const/high16 v2, 0x41400000    # 12.0f

    .line 327
    .line 328
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x40900000    # 4.5f

    .line 332
    .line 333
    const/high16 v2, 0x40c00000    # 6.0f

    .line 334
    .line 335
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v0, 0x41100000    # 9.0f

    .line 339
    .line 340
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v0, 0x40c00000    # 6.0f

    .line 344
    .line 345
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 349
    .line 350
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v0, 0x40b00000    # 5.5f

    .line 354
    .line 355
    const/high16 v2, 0x41400000    # 12.0f

    .line 356
    .line 357
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v0, 0x41400000    # 12.0f

    .line 361
    .line 362
    const/high16 v2, 0x40400000    # 3.0f

    .line 363
    .line 364
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v0, 0x40800000    # 4.0f

    .line 368
    .line 369
    const/high16 v2, 0x41100000    # 9.0f

    .line 370
    .line 371
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v0, 0x41400000    # 12.0f

    .line 375
    .line 376
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x41800000    # 16.0f

    .line 380
    .line 381
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v0, 0x41100000    # 9.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v0, 0x41400000    # 12.0f

    .line 390
    .line 391
    const/high16 v2, 0x40400000    # 3.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x41180000    # 9.5f

    .line 403
    .line 404
    const/high16 v2, 0x41380000    # 11.5f

    .line 405
    .line 406
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v0, 0x40400000    # 3.0f

    .line 410
    .line 411
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v0, 0x41300000    # 11.0f

    .line 415
    .line 416
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 420
    .line 421
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v0, -0x40800000    # -1.0f

    .line 425
    .line 426
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v0, 0x40400000    # 3.0f

    .line 430
    .line 431
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v0, 0x41180000    # 9.5f

    .line 435
    .line 436
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 440
    .line 441
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v0, -0x40800000    # -1.0f

    .line 445
    .line 446
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v0, 0x40400000    # 3.0f

    .line 450
    .line 451
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 455
    .line 456
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 457
    .line 458
    const v14, 0x3f547ae1    # 0.83f

    .line 459
    .line 460
    .line 461
    const v15, 0x3f2b851f    # 0.67f

    .line 462
    .line 463
    .line 464
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v0, 0x40800000    # 4.0f

    .line 470
    .line 471
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v0, 0x3f800000    # 1.0f

    .line 475
    .line 476
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, -0x3f800000    # -4.0f

    .line 480
    .line 481
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v18, -0x40400000    # -1.5f

    .line 485
    .line 486
    const v13, 0x3f547ae1    # 0.83f

    .line 487
    .line 488
    .line 489
    const/4 v14, 0x0

    .line 490
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 491
    .line 492
    const v16, -0x40d47ae1    # -0.67f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 499
    .line 500
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v0, 0x41380000    # 11.5f

    .line 504
    .line 505
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v0, 0x41500000    # 13.0f

    .line 512
    .line 513
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v0, 0x40400000    # 3.0f

    .line 517
    .line 518
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v0, 0x3f800000    # 1.0f

    .line 522
    .line 523
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v0, 0x41900000    # 18.0f

    .line 527
    .line 528
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v0, 0x3f800000    # 1.0f

    .line 532
    .line 533
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v0, 0x41180000    # 9.5f

    .line 537
    .line 538
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v17, 0x41500000    # 13.0f

    .line 542
    .line 543
    const/high16 v18, 0x41380000    # 11.5f

    .line 544
    .line 545
    const v13, 0x415e6666    # 13.9f

    .line 546
    .line 547
    .line 548
    const/high16 v14, 0x41180000    # 9.5f

    .line 549
    .line 550
    const/high16 v15, 0x41500000    # 13.0f

    .line 551
    .line 552
    const v16, 0x41266666    # 10.4f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    const/16 v16, 0x3800

    .line 566
    .line 567
    const/16 v17, 0x0

    .line 568
    .line 569
    const/high16 v6, 0x3f800000    # 1.0f

    .line 570
    .line 571
    const/high16 v8, 0x3f800000    # 1.0f

    .line 572
    .line 573
    const/4 v7, 0x0

    .line 574
    const/high16 v12, 0x3f800000    # 1.0f

    .line 575
    .line 576
    const/4 v13, 0x0

    .line 577
    const/4 v14, 0x0

    .line 578
    const/4 v15, 0x0

    .line 579
    const-string v4, ""

    .line 580
    .line 581
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    sput-object v0, Landroidx/compose/material/icons/twotone/FoodBankKt;->_foodBank:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 590
    .line 591
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 592
    .line 593
    .line 594
    return-object v0
.end method
