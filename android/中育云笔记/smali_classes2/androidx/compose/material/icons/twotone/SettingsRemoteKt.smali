.class public final Landroidx/compose/material/icons/twotone/SettingsRemoteKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _settingsRemote:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsRemote(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SettingsRemoteKt;->_settingsRemote:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SettingsRemote"

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
    const/high16 v4, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const/high16 v6, 0x41200000    # 10.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41300000    # 11.0f

    .line 83
    .line 84
    const/high16 v6, 0x41600000    # 14.0f

    .line 85
    .line 86
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v4, -0x3f800000    # -4.0f

    .line 90
    .line 91
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, 0x41200000    # 10.0f

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v4, 0x41400000    # 12.0f

    .line 103
    .line 104
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v25, 0x3f800000    # 1.0f

    .line 108
    .line 109
    const/high16 v26, 0x3f800000    # 1.0f

    .line 110
    .line 111
    const v21, 0x3f0ccccd    # 0.55f

    .line 112
    .line 113
    .line 114
    const/16 v22, 0x0

    .line 115
    .line 116
    const/high16 v23, 0x3f800000    # 1.0f

    .line 117
    .line 118
    const v24, 0x3ee66666    # 0.45f

    .line 119
    .line 120
    .line 121
    move-object/from16 v20, v2

    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v4, -0x4119999a    # -0.45f

    .line 127
    .line 128
    .line 129
    const/high16 v6, 0x3f800000    # 1.0f

    .line 130
    .line 131
    const/high16 v7, -0x40800000    # -1.0f

    .line 132
    .line 133
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v6, -0x40800000    # -1.0f

    .line 137
    .line 138
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v4, 0x3ee66666    # 0.45f

    .line 142
    .line 143
    .line 144
    const/high16 v6, 0x3f800000    # 1.0f

    .line 145
    .line 146
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    const/16 v16, 0x3800

    .line 157
    .line 158
    const/16 v17, 0x0

    .line 159
    .line 160
    const v6, 0x3e99999a    # 0.3f

    .line 161
    .line 162
    .line 163
    const v8, 0x3e99999a    # 0.3f

    .line 164
    .line 165
    .line 166
    const/4 v7, 0x0

    .line 167
    const/high16 v9, 0x3f800000    # 1.0f

    .line 168
    .line 169
    const/high16 v12, 0x3f800000    # 1.0f

    .line 170
    .line 171
    const/4 v13, 0x0

    .line 172
    const/4 v14, 0x0

    .line 173
    const/4 v15, 0x0

    .line 174
    const-string v4, ""

    .line 175
    .line 176
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 177
    .line 178
    .line 179
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 184
    .line 185
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 186
    .line 187
    .line 188
    move-result-wide v6

    .line 189
    const/4 v2, 0x0

    .line 190
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 198
    .line 199
    .line 200
    move-result v11

    .line 201
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 204
    .line 205
    .line 206
    const/high16 v4, 0x41700000    # 15.0f

    .line 207
    .line 208
    const/high16 v6, 0x41100000    # 9.0f

    .line 209
    .line 210
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v4, 0x41100000    # 9.0f

    .line 214
    .line 215
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v25, -0x40800000    # -1.0f

    .line 219
    .line 220
    const v21, -0x40f33333    # -0.55f

    .line 221
    .line 222
    .line 223
    const/high16 v23, -0x40800000    # -1.0f

    .line 224
    .line 225
    move-object/from16 v20, v2

    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v4, 0x41400000    # 12.0f

    .line 231
    .line 232
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v25, 0x3f800000    # 1.0f

    .line 236
    .line 237
    const/16 v21, 0x0

    .line 238
    .line 239
    const v22, 0x3f0ccccd    # 0.55f

    .line 240
    .line 241
    .line 242
    const v23, 0x3ee66666    # 0.45f

    .line 243
    .line 244
    .line 245
    const/high16 v24, 0x3f800000    # 1.0f

    .line 246
    .line 247
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v4, 0x40c00000    # 6.0f

    .line 251
    .line 252
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v26, -0x40800000    # -1.0f

    .line 256
    .line 257
    const v21, 0x3f0ccccd    # 0.55f

    .line 258
    .line 259
    .line 260
    const/16 v22, 0x0

    .line 261
    .line 262
    const/high16 v23, 0x3f800000    # 1.0f

    .line 263
    .line 264
    const v24, -0x4119999a    # -0.45f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v4, 0x41800000    # 16.0f

    .line 271
    .line 272
    const/high16 v6, 0x41200000    # 10.0f

    .line 273
    .line 274
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v25, -0x40800000    # -1.0f

    .line 278
    .line 279
    const/16 v21, 0x0

    .line 280
    .line 281
    const v22, -0x40f33333    # -0.55f

    .line 282
    .line 283
    .line 284
    const v23, -0x4119999a    # -0.45f

    .line 285
    .line 286
    .line 287
    const/high16 v24, -0x40800000    # -1.0f

    .line 288
    .line 289
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v4, 0x41600000    # 14.0f

    .line 296
    .line 297
    const/high16 v6, 0x41a80000    # 21.0f

    .line 298
    .line 299
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v4, -0x3f800000    # -4.0f

    .line 303
    .line 304
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v4, 0x41300000    # 11.0f

    .line 308
    .line 309
    const/high16 v6, 0x41200000    # 10.0f

    .line 310
    .line 311
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v4, 0x40800000    # 4.0f

    .line 315
    .line 316
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v4, 0x41200000    # 10.0f

    .line 320
    .line 321
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    const/high16 v6, 0x3f800000    # 1.0f

    .line 332
    .line 333
    const/high16 v8, 0x3f800000    # 1.0f

    .line 334
    .line 335
    const/4 v7, 0x0

    .line 336
    const-string v4, ""

    .line 337
    .line 338
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 339
    .line 340
    .line 341
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 346
    .line 347
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 348
    .line 349
    .line 350
    move-result-wide v6

    .line 351
    const/4 v2, 0x0

    .line 352
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 356
    .line 357
    .line 358
    move-result v10

    .line 359
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 360
    .line 361
    .line 362
    move-result v11

    .line 363
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 366
    .line 367
    .line 368
    const/high16 v4, 0x41500000    # 13.0f

    .line 369
    .line 370
    const/high16 v6, 0x41400000    # 12.0f

    .line 371
    .line 372
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/4 v4, 0x0

    .line 376
    const/high16 v6, -0x40800000    # -1.0f

    .line 377
    .line 378
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v26, 0x40000000    # 2.0f

    .line 382
    .line 383
    const/16 v27, 0x0

    .line 384
    .line 385
    const/high16 v21, 0x3f800000    # 1.0f

    .line 386
    .line 387
    const/high16 v22, 0x3f800000    # 1.0f

    .line 388
    .line 389
    const/16 v23, 0x0

    .line 390
    .line 391
    const/16 v24, 0x1

    .line 392
    .line 393
    const/16 v25, 0x1

    .line 394
    .line 395
    move-object/from16 v20, v2

    .line 396
    .line 397
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v26, -0x40000000    # -2.0f

    .line 401
    .line 402
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    const/high16 v6, 0x3f800000    # 1.0f

    .line 410
    .line 411
    const/4 v7, 0x0

    .line 412
    const-string v4, ""

    .line 413
    .line 414
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 415
    .line 416
    .line 417
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 418
    .line 419
    .line 420
    move-result v3

    .line 421
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 422
    .line 423
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 424
    .line 425
    .line 426
    move-result-wide v6

    .line 427
    const/4 v0, 0x0

    .line 428
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 432
    .line 433
    .line 434
    move-result v10

    .line 435
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 436
    .line 437
    .line 438
    move-result v11

    .line 439
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 442
    .line 443
    .line 444
    const v0, 0x40e1999a    # 7.05f

    .line 445
    .line 446
    .line 447
    const v2, 0x40c1999a    # 6.05f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, 0x3fb47ae1    # 1.41f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v17, 0x41400000    # 12.0f

    .line 460
    .line 461
    const/high16 v18, 0x40c00000    # 6.0f

    .line 462
    .line 463
    const v13, 0x4115eb85    # 9.37f

    .line 464
    .line 465
    .line 466
    const v14, 0x40d1eb85    # 6.56f

    .line 467
    .line 468
    .line 469
    const v15, 0x4129eb85    # 10.62f

    .line 470
    .line 471
    .line 472
    const/high16 v16, 0x40c00000    # 6.0f

    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v0, 0x40628f5c    # 3.54f

    .line 478
    .line 479
    .line 480
    const v2, 0x3fbae148    # 1.46f

    .line 481
    .line 482
    .line 483
    const v4, 0x402851ec    # 2.63f

    .line 484
    .line 485
    .line 486
    const v6, 0x3f0f5c29    # 0.56f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v0, -0x404b851f    # -1.41f

    .line 493
    .line 494
    .line 495
    const v2, 0x3fb47ae1    # 1.41f

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v18, 0x40800000    # 4.0f

    .line 502
    .line 503
    const v13, 0x417ae148    # 15.68f

    .line 504
    .line 505
    .line 506
    const v14, 0x4098f5c3    # 4.78f

    .line 507
    .line 508
    .line 509
    const v15, 0x415ee148    # 13.93f

    .line 510
    .line 511
    .line 512
    const/high16 v16, 0x40800000    # 4.0f

    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, -0x3f61999a    # -4.95f

    .line 518
    .line 519
    .line 520
    const v2, 0x40033333    # 2.05f

    .line 521
    .line 522
    .line 523
    const v4, -0x3f947ae1    # -3.68f

    .line 524
    .line 525
    .line 526
    const v6, 0x3f47ae14    # 0.78f

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/4 v0, 0x0

    .line 536
    const/high16 v2, 0x41400000    # 12.0f

    .line 537
    .line 538
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v17, 0x40870a3d    # 4.22f

    .line 542
    .line 543
    .line 544
    const v18, 0x404e147b    # 3.22f

    .line 545
    .line 546
    .line 547
    const v13, 0x410f5c29    # 8.96f

    .line 548
    .line 549
    .line 550
    const/4 v14, 0x0

    .line 551
    const v15, 0x40c6b852    # 6.21f

    .line 552
    .line 553
    .line 554
    const v16, 0x3f9d70a4    # 1.23f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v0, 0x3fb47ae1    # 1.41f

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v17, 0x41400000    # 12.0f

    .line 567
    .line 568
    const/high16 v18, 0x40000000    # 2.0f

    .line 569
    .line 570
    const v13, 0x40e851ec    # 7.26f

    .line 571
    .line 572
    .line 573
    const v14, 0x4040a3d7    # 3.01f

    .line 574
    .line 575
    .line 576
    const v15, 0x411828f6    # 9.51f

    .line 577
    .line 578
    .line 579
    const/high16 v16, 0x40000000    # 2.0f

    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v0, 0x40cb851f    # 6.36f

    .line 585
    .line 586
    .line 587
    const v2, 0x4028f5c3    # 2.64f

    .line 588
    .line 589
    .line 590
    const v4, 0x4097ae14    # 4.74f

    .line 591
    .line 592
    .line 593
    const v6, 0x3f8147ae    # 1.01f

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, -0x404b851f    # -1.41f

    .line 600
    .line 601
    .line 602
    const v2, 0x3fb47ae1    # 1.41f

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/16 v18, 0x0

    .line 609
    .line 610
    const v13, 0x418e51ec    # 17.79f

    .line 611
    .line 612
    .line 613
    const v14, 0x3f9d70a4    # 1.23f

    .line 614
    .line 615
    .line 616
    const v15, 0x4170a3d7    # 15.04f

    .line 617
    .line 618
    .line 619
    const/16 v16, 0x0

    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    const/16 v16, 0x3800

    .line 632
    .line 633
    const/16 v17, 0x0

    .line 634
    .line 635
    const/high16 v6, 0x3f800000    # 1.0f

    .line 636
    .line 637
    const/4 v7, 0x0

    .line 638
    const/high16 v12, 0x3f800000    # 1.0f

    .line 639
    .line 640
    const/4 v13, 0x0

    .line 641
    const/4 v14, 0x0

    .line 642
    const/4 v15, 0x0

    .line 643
    const-string v4, ""

    .line 644
    .line 645
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    sput-object v0, Landroidx/compose/material/icons/twotone/SettingsRemoteKt;->_settingsRemote:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 654
    .line 655
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 656
    .line 657
    .line 658
    return-object v0
.end method
