.class public final Landroidx/compose/material/icons/twotone/_5mpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __5mp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_5mp(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/_5mpKt;->__5mp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone._5mp"

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
    const/high16 v4, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v6, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v4, -0x40400000    # -1.5f

    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    const/16 v16, 0x3800

    .line 98
    .line 99
    const/16 v17, 0x0

    .line 100
    .line 101
    const v6, 0x3e99999a    # 0.3f

    .line 102
    .line 103
    .line 104
    const v8, 0x3e99999a    # 0.3f

    .line 105
    .line 106
    .line 107
    const/4 v7, 0x0

    .line 108
    const/high16 v9, 0x3f800000    # 1.0f

    .line 109
    .line 110
    const/high16 v12, 0x3f800000    # 1.0f

    .line 111
    .line 112
    const/4 v13, 0x0

    .line 113
    const/4 v14, 0x0

    .line 114
    const/4 v15, 0x0

    .line 115
    const-string v4, ""

    .line 116
    .line 117
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 118
    .line 119
    .line 120
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 125
    .line 126
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 127
    .line 128
    .line 129
    move-result-wide v6

    .line 130
    const/4 v2, 0x0

    .line 131
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    const/high16 v4, 0x41980000    # 19.0f

    .line 148
    .line 149
    const/high16 v6, 0x40a00000    # 5.0f

    .line 150
    .line 151
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, 0x41600000    # 14.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x40a00000    # 5.0f

    .line 160
    .line 161
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, 0x41980000    # 19.0f

    .line 168
    .line 169
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v4, 0x41900000    # 18.0f

    .line 176
    .line 177
    const/high16 v6, 0x41580000    # 13.5f

    .line 178
    .line 179
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v4, 0x41800000    # 16.0f

    .line 183
    .line 184
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v25, -0x40800000    # -1.0f

    .line 188
    .line 189
    const/high16 v26, 0x3f800000    # 1.0f

    .line 190
    .line 191
    const/16 v21, 0x0

    .line 192
    .line 193
    const v22, 0x3f0ccccd    # 0.55f

    .line 194
    .line 195
    .line 196
    const v23, -0x4119999a    # -0.45f

    .line 197
    .line 198
    .line 199
    const/high16 v24, 0x3f800000    # 1.0f

    .line 200
    .line 201
    move-object/from16 v20, v2

    .line 202
    .line 203
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v4, -0x40000000    # -2.0f

    .line 207
    .line 208
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 212
    .line 213
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v4, -0x40400000    # -1.5f

    .line 217
    .line 218
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v4, -0x3f400000    # -6.0f

    .line 222
    .line 223
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v4, 0x41880000    # 17.0f

    .line 227
    .line 228
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v25, 0x41900000    # 18.0f

    .line 232
    .line 233
    const/high16 v26, 0x41580000    # 13.5f

    .line 234
    .line 235
    const v21, 0x418c6666    # 17.55f

    .line 236
    .line 237
    .line 238
    const/high16 v22, 0x41480000    # 12.5f

    .line 239
    .line 240
    const/high16 v23, 0x41900000    # 18.0f

    .line 241
    .line 242
    const v24, 0x414f3333    # 12.95f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v4, 0x41200000    # 10.0f

    .line 252
    .line 253
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v4, 0x40400000    # 3.0f

    .line 257
    .line 258
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v4, 0x41100000    # 9.0f

    .line 262
    .line 263
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 267
    .line 268
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v4, 0x40b00000    # 5.5f

    .line 272
    .line 273
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v4, 0x40900000    # 4.5f

    .line 277
    .line 278
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v4, 0x40e00000    # 7.0f

    .line 282
    .line 283
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 287
    .line 288
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v4, 0x3f800000    # 1.0f

    .line 292
    .line 293
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v4, 0x40000000    # 2.0f

    .line 297
    .line 298
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v25, 0x3f800000    # 1.0f

    .line 302
    .line 303
    const/high16 v26, 0x3f800000    # 1.0f

    .line 304
    .line 305
    const v21, 0x3f0ccccd    # 0.55f

    .line 306
    .line 307
    .line 308
    const/16 v22, 0x0

    .line 309
    .line 310
    const/high16 v23, 0x3f800000    # 1.0f

    .line 311
    .line 312
    const v24, 0x3ee66666    # 0.45f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 319
    .line 320
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v25, -0x40800000    # -1.0f

    .line 324
    .line 325
    const/16 v21, 0x0

    .line 326
    .line 327
    const v22, 0x3f0ccccd    # 0.55f

    .line 328
    .line 329
    .line 330
    const v23, -0x4119999a    # -0.45f

    .line 331
    .line 332
    .line 333
    const/high16 v24, 0x3f800000    # 1.0f

    .line 334
    .line 335
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v4, 0x41200000    # 10.0f

    .line 339
    .line 340
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v4, 0x40c00000    # 6.0f

    .line 350
    .line 351
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v25, 0x3f800000    # 1.0f

    .line 355
    .line 356
    const/high16 v26, -0x40800000    # -1.0f

    .line 357
    .line 358
    const v22, -0x40f33333    # -0.55f

    .line 359
    .line 360
    .line 361
    const v23, 0x3ee66666    # 0.45f

    .line 362
    .line 363
    .line 364
    const/high16 v24, -0x40800000    # -1.0f

    .line 365
    .line 366
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v4, 0x40900000    # 4.5f

    .line 370
    .line 371
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v26, 0x3f800000    # 1.0f

    .line 375
    .line 376
    const v21, 0x3f0ccccd    # 0.55f

    .line 377
    .line 378
    .line 379
    const/16 v22, 0x0

    .line 380
    .line 381
    const/high16 v23, 0x3f800000    # 1.0f

    .line 382
    .line 383
    const v24, 0x3ee66666    # 0.45f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v4, 0x40a00000    # 5.0f

    .line 390
    .line 391
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v4, 0x41300000    # 11.0f

    .line 395
    .line 396
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v4, 0x41600000    # 14.0f

    .line 400
    .line 401
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v4, -0x40800000    # -1.0f

    .line 405
    .line 406
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v4, 0x40400000    # 3.0f

    .line 410
    .line 411
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v4, 0x41080000    # 8.5f

    .line 415
    .line 416
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 420
    .line 421
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v4, -0x40800000    # -1.0f

    .line 425
    .line 426
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v4, 0x40900000    # 4.5f

    .line 430
    .line 431
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v4, 0x40c00000    # 6.0f

    .line 435
    .line 436
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v4, 0x41580000    # 13.5f

    .line 440
    .line 441
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    const v6, 0x3e99999a    # 0.3f

    .line 452
    .line 453
    .line 454
    const/4 v7, 0x0

    .line 455
    const-string v4, ""

    .line 456
    .line 457
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 458
    .line 459
    .line 460
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 461
    .line 462
    .line 463
    move-result v3

    .line 464
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 465
    .line 466
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 467
    .line 468
    .line 469
    move-result-wide v6

    .line 470
    const/4 v2, 0x0

    .line 471
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 475
    .line 476
    .line 477
    move-result v10

    .line 478
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 479
    .line 480
    .line 481
    move-result v11

    .line 482
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 485
    .line 486
    .line 487
    const/high16 v4, 0x40f00000    # 7.5f

    .line 488
    .line 489
    const/high16 v6, 0x41600000    # 14.0f

    .line 490
    .line 491
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v4, 0x3f800000    # 1.0f

    .line 495
    .line 496
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v4, 0x40400000    # 3.0f

    .line 500
    .line 501
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v4, 0x41200000    # 10.0f

    .line 505
    .line 506
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 510
    .line 511
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v4, 0x3f800000    # 1.0f

    .line 515
    .line 516
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v4, 0x40900000    # 4.5f

    .line 520
    .line 521
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 525
    .line 526
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v4, -0x3f600000    # -5.0f

    .line 530
    .line 531
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v25, -0x40800000    # -1.0f

    .line 535
    .line 536
    const/high16 v26, -0x40800000    # -1.0f

    .line 537
    .line 538
    const/16 v21, 0x0

    .line 539
    .line 540
    const v22, -0x40f33333    # -0.55f

    .line 541
    .line 542
    .line 543
    const v23, -0x4119999a    # -0.45f

    .line 544
    .line 545
    .line 546
    const/high16 v24, -0x40800000    # -1.0f

    .line 547
    .line 548
    move-object/from16 v20, v2

    .line 549
    .line 550
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v4, 0x40e00000    # 7.0f

    .line 554
    .line 555
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v26, 0x3f800000    # 1.0f

    .line 559
    .line 560
    const v21, -0x40f33333    # -0.55f

    .line 561
    .line 562
    .line 563
    const/16 v22, 0x0

    .line 564
    .line 565
    const/high16 v23, -0x40800000    # -1.0f

    .line 566
    .line 567
    const v24, 0x3ee66666    # 0.45f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v4, 0x40a00000    # 5.0f

    .line 574
    .line 575
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 579
    .line 580
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v4, 0x41600000    # 14.0f

    .line 584
    .line 585
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    const/high16 v6, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/high16 v8, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const/4 v7, 0x0

    .line 600
    const-string v4, ""

    .line 601
    .line 602
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 603
    .line 604
    .line 605
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 606
    .line 607
    .line 608
    move-result v3

    .line 609
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 610
    .line 611
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 612
    .line 613
    .line 614
    move-result-wide v6

    .line 615
    const/4 v2, 0x0

    .line 616
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 620
    .line 621
    .line 622
    move-result v10

    .line 623
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 624
    .line 625
    .line 626
    move-result v11

    .line 627
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 630
    .line 631
    .line 632
    const/high16 v4, 0x41940000    # 18.5f

    .line 633
    .line 634
    const/high16 v6, 0x41580000    # 13.5f

    .line 635
    .line 636
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v4, 0x41700000    # 15.0f

    .line 640
    .line 641
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v4, 0x41880000    # 17.0f

    .line 645
    .line 646
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const/high16 v4, 0x40000000    # 2.0f

    .line 650
    .line 651
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/high16 v25, 0x3f800000    # 1.0f

    .line 655
    .line 656
    const/high16 v26, -0x40800000    # -1.0f

    .line 657
    .line 658
    const v21, 0x3f0ccccd    # 0.55f

    .line 659
    .line 660
    .line 661
    const/high16 v23, 0x3f800000    # 1.0f

    .line 662
    .line 663
    const v24, -0x4119999a    # -0.45f

    .line 664
    .line 665
    .line 666
    move-object/from16 v20, v2

    .line 667
    .line 668
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 672
    .line 673
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v25, -0x40800000    # -1.0f

    .line 677
    .line 678
    const/16 v21, 0x0

    .line 679
    .line 680
    const v22, -0x40f33333    # -0.55f

    .line 681
    .line 682
    .line 683
    const v23, -0x4119999a    # -0.45f

    .line 684
    .line 685
    .line 686
    const/high16 v24, -0x40800000    # -1.0f

    .line 687
    .line 688
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const/high16 v4, -0x3fa00000    # -3.5f

    .line 692
    .line 693
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const/high16 v4, 0x41940000    # 18.5f

    .line 697
    .line 698
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const/high16 v4, 0x41700000    # 15.0f

    .line 705
    .line 706
    const/high16 v6, 0x41600000    # 14.0f

    .line 707
    .line 708
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 712
    .line 713
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const/high16 v4, 0x41700000    # 15.0f

    .line 720
    .line 721
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const/high16 v4, 0x41600000    # 14.0f

    .line 725
    .line 726
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 733
    .line 734
    .line 735
    move-result-object v2

    .line 736
    const/high16 v6, 0x3f800000    # 1.0f

    .line 737
    .line 738
    const/4 v7, 0x0

    .line 739
    const-string v4, ""

    .line 740
    .line 741
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 742
    .line 743
    .line 744
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 745
    .line 746
    .line 747
    move-result v3

    .line 748
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 749
    .line 750
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 751
    .line 752
    .line 753
    move-result-wide v6

    .line 754
    const/4 v2, 0x0

    .line 755
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 756
    .line 757
    .line 758
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 759
    .line 760
    .line 761
    move-result v10

    .line 762
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 763
    .line 764
    .line 765
    move-result v11

    .line 766
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 769
    .line 770
    .line 771
    const/high16 v4, 0x40400000    # 3.0f

    .line 772
    .line 773
    const/high16 v6, 0x41980000    # 19.0f

    .line 774
    .line 775
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const/high16 v4, 0x40a00000    # 5.0f

    .line 779
    .line 780
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const/high16 v25, 0x40400000    # 3.0f

    .line 784
    .line 785
    const/high16 v26, 0x40a00000    # 5.0f

    .line 786
    .line 787
    const v21, 0x4079999a    # 3.9f

    .line 788
    .line 789
    .line 790
    const/high16 v22, 0x40400000    # 3.0f

    .line 791
    .line 792
    const/high16 v23, 0x40400000    # 3.0f

    .line 793
    .line 794
    const v24, 0x4079999a    # 3.9f

    .line 795
    .line 796
    .line 797
    move-object/from16 v20, v2

    .line 798
    .line 799
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const/high16 v4, 0x41600000    # 14.0f

    .line 803
    .line 804
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const/high16 v25, 0x40000000    # 2.0f

    .line 808
    .line 809
    const/high16 v26, 0x40000000    # 2.0f

    .line 810
    .line 811
    const/16 v21, 0x0

    .line 812
    .line 813
    const v22, 0x3f8ccccd    # 1.1f

    .line 814
    .line 815
    .line 816
    const v23, 0x3f666666    # 0.9f

    .line 817
    .line 818
    .line 819
    const/high16 v24, 0x40000000    # 2.0f

    .line 820
    .line 821
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const/high16 v26, -0x40000000    # -2.0f

    .line 828
    .line 829
    const v21, 0x3f8ccccd    # 1.1f

    .line 830
    .line 831
    .line 832
    const/16 v22, 0x0

    .line 833
    .line 834
    const/high16 v23, 0x40000000    # 2.0f

    .line 835
    .line 836
    const v24, -0x4099999a    # -0.9f

    .line 837
    .line 838
    .line 839
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const/high16 v4, 0x40a00000    # 5.0f

    .line 843
    .line 844
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const/high16 v25, 0x41980000    # 19.0f

    .line 848
    .line 849
    const/high16 v26, 0x40400000    # 3.0f

    .line 850
    .line 851
    const/high16 v21, 0x41a80000    # 21.0f

    .line 852
    .line 853
    const v22, 0x4079999a    # 3.9f

    .line 854
    .line 855
    .line 856
    const v23, 0x41a0cccd    # 20.1f

    .line 857
    .line 858
    .line 859
    const/high16 v24, 0x40400000    # 3.0f

    .line 860
    .line 861
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    const/high16 v4, 0x41980000    # 19.0f

    .line 868
    .line 869
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const/high16 v4, 0x40a00000    # 5.0f

    .line 873
    .line 874
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 875
    .line 876
    .line 877
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const/high16 v4, 0x41600000    # 14.0f

    .line 881
    .line 882
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    const/high16 v4, 0x41980000    # 19.0f

    .line 886
    .line 887
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 891
    .line 892
    .line 893
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 894
    .line 895
    .line 896
    move-result-object v2

    .line 897
    const/high16 v6, 0x3f800000    # 1.0f

    .line 898
    .line 899
    const/4 v7, 0x0

    .line 900
    const-string v4, ""

    .line 901
    .line 902
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 903
    .line 904
    .line 905
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 906
    .line 907
    .line 908
    move-result v3

    .line 909
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 910
    .line 911
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 912
    .line 913
    .line 914
    move-result-wide v6

    .line 915
    const/4 v0, 0x0

    .line 916
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 917
    .line 918
    .line 919
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 920
    .line 921
    .line 922
    move-result v10

    .line 923
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 924
    .line 925
    .line 926
    move-result v11

    .line 927
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 930
    .line 931
    .line 932
    const/high16 v0, 0x41680000    # 14.5f

    .line 933
    .line 934
    const/high16 v2, 0x41280000    # 10.5f

    .line 935
    .line 936
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 937
    .line 938
    .line 939
    const/high16 v0, 0x41100000    # 9.0f

    .line 940
    .line 941
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const/high16 v17, -0x40800000    # -1.0f

    .line 945
    .line 946
    const/high16 v18, -0x40800000    # -1.0f

    .line 947
    .line 948
    const v14, -0x40f33333    # -0.55f

    .line 949
    .line 950
    .line 951
    const v15, -0x4119999a    # -0.45f

    .line 952
    .line 953
    .line 954
    const/high16 v16, -0x40800000    # -1.0f

    .line 955
    .line 956
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 957
    .line 958
    .line 959
    const/high16 v0, -0x40000000    # -2.0f

    .line 960
    .line 961
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 962
    .line 963
    .line 964
    const/high16 v0, 0x40e00000    # 7.0f

    .line 965
    .line 966
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 967
    .line 968
    .line 969
    const/high16 v0, 0x40400000    # 3.0f

    .line 970
    .line 971
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 972
    .line 973
    .line 974
    const/high16 v0, 0x40b00000    # 5.5f

    .line 975
    .line 976
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 977
    .line 978
    .line 979
    const/high16 v0, 0x41200000    # 10.0f

    .line 980
    .line 981
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 982
    .line 983
    .line 984
    const/high16 v0, 0x41100000    # 9.0f

    .line 985
    .line 986
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 987
    .line 988
    .line 989
    const/high16 v0, 0x40400000    # 3.0f

    .line 990
    .line 991
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 992
    .line 993
    .line 994
    const/high16 v0, 0x3f800000    # 1.0f

    .line 995
    .line 996
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 997
    .line 998
    .line 999
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 1000
    .line 1001
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1002
    .line 1003
    .line 1004
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 1005
    .line 1006
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1007
    .line 1008
    .line 1009
    const/high16 v0, 0x40600000    # 3.5f

    .line 1010
    .line 1011
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1012
    .line 1013
    .line 1014
    const/high16 v17, 0x41680000    # 14.5f

    .line 1015
    .line 1016
    const/high16 v18, 0x41280000    # 10.5f

    .line 1017
    .line 1018
    const v13, 0x4160cccd    # 14.05f

    .line 1019
    .line 1020
    .line 1021
    const/high16 v14, 0x41380000    # 11.5f

    .line 1022
    .line 1023
    const/high16 v15, 0x41680000    # 14.5f

    .line 1024
    .line 1025
    const v16, 0x4130cccd    # 11.05f

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v2

    .line 1038
    const/16 v16, 0x3800

    .line 1039
    .line 1040
    const/16 v17, 0x0

    .line 1041
    .line 1042
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1043
    .line 1044
    const/4 v7, 0x0

    .line 1045
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1046
    .line 1047
    const/4 v13, 0x0

    .line 1048
    const/4 v14, 0x0

    .line 1049
    const/4 v15, 0x0

    .line 1050
    const-string v4, ""

    .line 1051
    .line 1052
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v0

    .line 1056
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    sput-object v0, Landroidx/compose/material/icons/twotone/_5mpKt;->__5mp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1061
    .line 1062
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1063
    .line 1064
    .line 1065
    return-object v0
.end method
