.class public final Landroidx/compose/material/icons/twotone/Filter2Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _filter2:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFilter2(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/Filter2Kt;->_filter2:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Filter2"

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
    const/high16 v4, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v6, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41600000    # 14.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41a80000    # 21.0f

    .line 83
    .line 84
    const/high16 v6, 0x40400000    # 3.0f

    .line 85
    .line 86
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v4, 0x40400000    # 3.0f

    .line 90
    .line 91
    const/high16 v6, 0x40e00000    # 7.0f

    .line 92
    .line 93
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, 0x41600000    # 14.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v4, 0x41300000    # 11.0f

    .line 105
    .line 106
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v25, 0x40000000    # 2.0f

    .line 110
    .line 111
    const/high16 v26, -0x40000000    # -2.0f

    .line 112
    .line 113
    const/16 v21, 0x0

    .line 114
    .line 115
    const v22, -0x4071eb85    # -1.11f

    .line 116
    .line 117
    .line 118
    const v23, 0x3f666666    # 0.9f

    .line 119
    .line 120
    .line 121
    const/high16 v24, -0x40000000    # -2.0f

    .line 122
    .line 123
    move-object/from16 v20, v2

    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v4, 0x40000000    # 2.0f

    .line 129
    .line 130
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v4, 0x41700000    # 15.0f

    .line 134
    .line 135
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, -0x3f800000    # -4.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, 0x40a00000    # 5.0f

    .line 144
    .line 145
    const/high16 v6, 0x41300000    # 11.0f

    .line 146
    .line 147
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v4, 0x40800000    # 4.0f

    .line 151
    .line 152
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v26, 0x40000000    # 2.0f

    .line 156
    .line 157
    const v21, 0x3f8ccccd    # 1.1f

    .line 158
    .line 159
    .line 160
    const/16 v22, 0x0

    .line 161
    .line 162
    const/high16 v23, 0x40000000    # 2.0f

    .line 163
    .line 164
    const v24, 0x3f63d70a    # 0.89f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v4, 0x40000000    # 2.0f

    .line 171
    .line 172
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v25, -0x40000000    # -2.0f

    .line 176
    .line 177
    const/16 v21, 0x0

    .line 178
    .line 179
    const v22, 0x3f8e147b    # 1.11f

    .line 180
    .line 181
    .line 182
    const v23, -0x4099999a    # -0.9f

    .line 183
    .line 184
    .line 185
    const/high16 v24, 0x40000000    # 2.0f

    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v4, -0x40000000    # -2.0f

    .line 191
    .line 192
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v4, 0x40000000    # 2.0f

    .line 196
    .line 197
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v4, 0x40800000    # 4.0f

    .line 201
    .line 202
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v4, 0x40000000    # 2.0f

    .line 206
    .line 207
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v4, -0x3f400000    # -6.0f

    .line 211
    .line 212
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v4, -0x3f800000    # -4.0f

    .line 216
    .line 217
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    const/16 v16, 0x3800

    .line 228
    .line 229
    const/16 v17, 0x0

    .line 230
    .line 231
    const v6, 0x3e99999a    # 0.3f

    .line 232
    .line 233
    .line 234
    const v8, 0x3e99999a    # 0.3f

    .line 235
    .line 236
    .line 237
    const/4 v7, 0x0

    .line 238
    const/high16 v9, 0x3f800000    # 1.0f

    .line 239
    .line 240
    const/high16 v12, 0x3f800000    # 1.0f

    .line 241
    .line 242
    const/4 v13, 0x0

    .line 243
    const/4 v14, 0x0

    .line 244
    const/4 v15, 0x0

    .line 245
    const-string v4, ""

    .line 246
    .line 247
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 248
    .line 249
    .line 250
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 255
    .line 256
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 257
    .line 258
    .line 259
    move-result-wide v6

    .line 260
    const/4 v0, 0x0

    .line 261
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 265
    .line 266
    .line 267
    move-result v10

    .line 268
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 269
    .line 270
    .line 271
    move-result v11

    .line 272
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 275
    .line 276
    .line 277
    const/high16 v0, 0x41500000    # 13.0f

    .line 278
    .line 279
    const/high16 v2, 0x41880000    # 17.0f

    .line 280
    .line 281
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v0, -0x3f800000    # -4.0f

    .line 285
    .line 286
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v0, -0x40000000    # -2.0f

    .line 290
    .line 291
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x40000000    # 2.0f

    .line 295
    .line 296
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v17, 0x40000000    # 2.0f

    .line 300
    .line 301
    const/high16 v18, -0x40000000    # -2.0f

    .line 302
    .line 303
    const v13, 0x3f8ccccd    # 1.1f

    .line 304
    .line 305
    .line 306
    const/high16 v15, 0x40000000    # 2.0f

    .line 307
    .line 308
    const v16, -0x409c28f6    # -0.89f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v0, 0x41880000    # 17.0f

    .line 315
    .line 316
    const/high16 v2, 0x40e00000    # 7.0f

    .line 317
    .line 318
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v17, -0x40000000    # -2.0f

    .line 322
    .line 323
    const/4 v13, 0x0

    .line 324
    const v14, -0x4071eb85    # -1.11f

    .line 325
    .line 326
    .line 327
    const v15, -0x4099999a    # -0.9f

    .line 328
    .line 329
    .line 330
    const/high16 v16, -0x40000000    # -2.0f

    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, -0x3f800000    # -4.0f

    .line 336
    .line 337
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x40000000    # 2.0f

    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v0, 0x40800000    # 4.0f

    .line 346
    .line 347
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v0, 0x40000000    # 2.0f

    .line 351
    .line 352
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v0, -0x40000000    # -2.0f

    .line 356
    .line 357
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v18, 0x40000000    # 2.0f

    .line 361
    .line 362
    const v13, -0x40733333    # -1.1f

    .line 363
    .line 364
    .line 365
    const/4 v14, 0x0

    .line 366
    const/high16 v15, -0x40000000    # -2.0f

    .line 367
    .line 368
    const v16, 0x3f63d70a    # 0.89f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v0, 0x40800000    # 4.0f

    .line 375
    .line 376
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x40c00000    # 6.0f

    .line 380
    .line 381
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v0, -0x40000000    # -2.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v0, 0x3f800000    # 1.0f

    .line 393
    .line 394
    const/high16 v2, 0x41a80000    # 21.0f

    .line 395
    .line 396
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v2, 0x40e00000    # 7.0f

    .line 400
    .line 401
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v16, 0x3f666666    # 0.9f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v0, 0x41600000    # 14.0f

    .line 411
    .line 412
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v17, 0x40000000    # 2.0f

    .line 416
    .line 417
    const/4 v13, 0x0

    .line 418
    const v14, 0x3f8ccccd    # 1.1f

    .line 419
    .line 420
    .line 421
    const v15, 0x3f666666    # 0.9f

    .line 422
    .line 423
    .line 424
    const/high16 v16, 0x40000000    # 2.0f

    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v18, -0x40000000    # -2.0f

    .line 433
    .line 434
    const v13, 0x3f8ccccd    # 1.1f

    .line 435
    .line 436
    .line 437
    const/4 v14, 0x0

    .line 438
    const/high16 v15, 0x40000000    # 2.0f

    .line 439
    .line 440
    const v16, -0x4099999a    # -0.9f

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v0, 0x41b80000    # 23.0f

    .line 447
    .line 448
    const/high16 v2, 0x40400000    # 3.0f

    .line 449
    .line 450
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v17, -0x40000000    # -2.0f

    .line 454
    .line 455
    const/4 v13, 0x0

    .line 456
    const v14, -0x40733333    # -1.1f

    .line 457
    .line 458
    .line 459
    const v15, -0x4099999a    # -0.9f

    .line 460
    .line 461
    .line 462
    const/high16 v16, -0x40000000    # -2.0f

    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v0, 0x41a80000    # 21.0f

    .line 471
    .line 472
    const/high16 v2, 0x41880000    # 17.0f

    .line 473
    .line 474
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v0, 0x41880000    # 17.0f

    .line 478
    .line 479
    const/high16 v2, 0x40e00000    # 7.0f

    .line 480
    .line 481
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v0, 0x40400000    # 3.0f

    .line 485
    .line 486
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, 0x41600000    # 14.0f

    .line 490
    .line 491
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v0, 0x3f800000    # 1.0f

    .line 501
    .line 502
    const/high16 v2, 0x41a80000    # 21.0f

    .line 503
    .line 504
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v17, 0x40000000    # 2.0f

    .line 508
    .line 509
    const/high16 v18, 0x40000000    # 2.0f

    .line 510
    .line 511
    const v14, 0x3f8ccccd    # 1.1f

    .line 512
    .line 513
    .line 514
    const v15, 0x3f666666    # 0.9f

    .line 515
    .line 516
    .line 517
    const/high16 v16, 0x40000000    # 2.0f

    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, 0x41800000    # 16.0f

    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, -0x40000000    # -2.0f

    .line 528
    .line 529
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v0, 0x41a80000    # 21.0f

    .line 533
    .line 534
    const/high16 v2, 0x40400000    # 3.0f

    .line 535
    .line 536
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v0, 0x40a00000    # 5.0f

    .line 540
    .line 541
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v2, 0x3f800000    # 1.0f

    .line 545
    .line 546
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v0, 0x41800000    # 16.0f

    .line 550
    .line 551
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    const/16 v16, 0x3800

    .line 562
    .line 563
    const/16 v17, 0x0

    .line 564
    .line 565
    const/high16 v6, 0x3f800000    # 1.0f

    .line 566
    .line 567
    const/high16 v8, 0x3f800000    # 1.0f

    .line 568
    .line 569
    const/4 v7, 0x0

    .line 570
    const/high16 v12, 0x3f800000    # 1.0f

    .line 571
    .line 572
    const/4 v14, 0x0

    .line 573
    const/4 v15, 0x0

    .line 574
    const-string v4, ""

    .line 575
    .line 576
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    sput-object v0, Landroidx/compose/material/icons/twotone/Filter2Kt;->_filter2:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 585
    .line 586
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    return-object v0
.end method
