.class public final Landroidx/compose/material/icons/rounded/BedroomParentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bedroomParent:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBedroomParent(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BedroomParentKt;->_bedroomParent:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.BedroomParent"

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
    const/high16 v4, 0x41840000    # 16.5f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x3ef00000    # -9.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, -0x40800000    # -1.0f

    .line 83
    .line 84
    const/high16 v26, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const v21, -0x40f33333    # -0.55f

    .line 87
    .line 88
    .line 89
    const/16 v22, 0x0

    .line 90
    .line 91
    const/high16 v23, -0x40800000    # -1.0f

    .line 92
    .line 93
    const v24, 0x3ee66666    # 0.45f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x3f800000    # 1.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x41300000    # 11.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v4, -0x40800000    # -1.0f

    .line 112
    .line 113
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v25, 0x41840000    # 16.5f

    .line 117
    .line 118
    const/high16 v26, 0x41400000    # 12.0f

    .line 119
    .line 120
    const/high16 v21, 0x418c0000    # 17.5f

    .line 121
    .line 122
    const v22, 0x41473333    # 12.45f

    .line 123
    .line 124
    .line 125
    const v23, 0x41886666    # 17.05f

    .line 126
    .line 127
    .line 128
    const/high16 v24, 0x41400000    # 12.0f

    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    const/16 v16, 0x3800

    .line 141
    .line 142
    const/16 v17, 0x0

    .line 143
    .line 144
    const/high16 v6, 0x3f800000    # 1.0f

    .line 145
    .line 146
    const/high16 v8, 0x3f800000    # 1.0f

    .line 147
    .line 148
    const/4 v7, 0x0

    .line 149
    const/high16 v9, 0x3f800000    # 1.0f

    .line 150
    .line 151
    const/high16 v12, 0x3f800000    # 1.0f

    .line 152
    .line 153
    const/4 v13, 0x0

    .line 154
    const/4 v14, 0x0

    .line 155
    const/4 v15, 0x0

    .line 156
    const-string v4, ""

    .line 157
    .line 158
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 159
    .line 160
    .line 161
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 166
    .line 167
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 168
    .line 169
    .line 170
    move-result-wide v6

    .line 171
    const/4 v2, 0x0

    .line 172
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 176
    .line 177
    .line 178
    move-result v10

    .line 179
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 180
    .line 181
    .line 182
    move-result v11

    .line 183
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 186
    .line 187
    .line 188
    const/high16 v4, 0x40e80000    # 7.25f

    .line 189
    .line 190
    const/high16 v6, 0x41080000    # 8.5f

    .line 191
    .line 192
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v4, 0x40800000    # 4.0f

    .line 196
    .line 197
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v4, 0x40000000    # 2.0f

    .line 201
    .line 202
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v4, -0x3f800000    # -4.0f

    .line 206
    .line 207
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    const/high16 v6, 0x3f800000    # 1.0f

    .line 218
    .line 219
    const/4 v7, 0x0

    .line 220
    const-string v4, ""

    .line 221
    .line 222
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 223
    .line 224
    .line 225
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 230
    .line 231
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 232
    .line 233
    .line 234
    move-result-wide v6

    .line 235
    const/4 v2, 0x0

    .line 236
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 240
    .line 241
    .line 242
    move-result v10

    .line 243
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 244
    .line 245
    .line 246
    move-result v11

    .line 247
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 250
    .line 251
    .line 252
    const/high16 v4, 0x414c0000    # 12.75f

    .line 253
    .line 254
    const/high16 v6, 0x41080000    # 8.5f

    .line 255
    .line 256
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v4, 0x40800000    # 4.0f

    .line 260
    .line 261
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v4, 0x40000000    # 2.0f

    .line 265
    .line 266
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v4, -0x3f800000    # -4.0f

    .line 270
    .line 271
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    const/high16 v6, 0x3f800000    # 1.0f

    .line 282
    .line 283
    const/4 v7, 0x0

    .line 284
    const-string v4, ""

    .line 285
    .line 286
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 287
    .line 288
    .line 289
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 294
    .line 295
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 296
    .line 297
    .line 298
    move-result-wide v6

    .line 299
    const/4 v0, 0x0

    .line 300
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 304
    .line 305
    .line 306
    move-result v10

    .line 307
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 308
    .line 309
    .line 310
    move-result v11

    .line 311
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x41a00000    # 20.0f

    .line 317
    .line 318
    const/high16 v2, 0x40000000    # 2.0f

    .line 319
    .line 320
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v0, 0x40800000    # 4.0f

    .line 324
    .line 325
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v17, 0x40000000    # 2.0f

    .line 329
    .line 330
    const/high16 v18, 0x40800000    # 4.0f

    .line 331
    .line 332
    const v13, 0x4039999a    # 2.9f

    .line 333
    .line 334
    .line 335
    const/high16 v14, 0x40000000    # 2.0f

    .line 336
    .line 337
    const/high16 v15, 0x40000000    # 2.0f

    .line 338
    .line 339
    const v16, 0x4039999a    # 2.9f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v0, 0x41800000    # 16.0f

    .line 346
    .line 347
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v18, 0x40000000    # 2.0f

    .line 351
    .line 352
    const/4 v13, 0x0

    .line 353
    const v14, 0x3f8ccccd    # 1.1f

    .line 354
    .line 355
    .line 356
    const v15, 0x3f666666    # 0.9f

    .line 357
    .line 358
    .line 359
    const/high16 v16, 0x40000000    # 2.0f

    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v18, -0x40000000    # -2.0f

    .line 368
    .line 369
    const v13, 0x3f8ccccd    # 1.1f

    .line 370
    .line 371
    .line 372
    const/4 v14, 0x0

    .line 373
    const/high16 v15, 0x40000000    # 2.0f

    .line 374
    .line 375
    const v16, -0x4099999a    # -0.9f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v0, 0x40800000    # 4.0f

    .line 382
    .line 383
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v17, 0x41a00000    # 20.0f

    .line 387
    .line 388
    const/high16 v18, 0x40000000    # 2.0f

    .line 389
    .line 390
    const/high16 v13, 0x41b00000    # 22.0f

    .line 391
    .line 392
    const v14, 0x4039999a    # 2.9f

    .line 393
    .line 394
    .line 395
    const v15, 0x41a8cccd    # 21.1f

    .line 396
    .line 397
    .line 398
    const/high16 v16, 0x40000000    # 2.0f

    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, 0x41880000    # 17.0f

    .line 407
    .line 408
    const/high16 v2, 0x41920000    # 18.25f

    .line 409
    .line 410
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v17, -0x40c00000    # -0.75f

    .line 417
    .line 418
    const/high16 v18, -0x40c00000    # -0.75f

    .line 419
    .line 420
    const v13, -0x412e147b    # -0.41f

    .line 421
    .line 422
    .line 423
    const/4 v14, 0x0

    .line 424
    const/high16 v15, -0x40c00000    # -0.75f

    .line 425
    .line 426
    const v16, -0x4151eb85    # -0.34f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x41780000    # 15.5f

    .line 433
    .line 434
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, -0x3ed00000    # -11.0f

    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, 0x3f400000    # 0.75f

    .line 443
    .line 444
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v17, 0x40b80000    # 5.75f

    .line 448
    .line 449
    const/high16 v18, 0x41880000    # 17.0f

    .line 450
    .line 451
    const/high16 v13, 0x40d00000    # 6.5f

    .line 452
    .line 453
    const v14, 0x418547ae    # 16.66f

    .line 454
    .line 455
    .line 456
    const v15, 0x40c51eb8    # 6.16f

    .line 457
    .line 458
    .line 459
    const/high16 v16, 0x41880000    # 17.0f

    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/4 v0, 0x0

    .line 465
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v17, 0x40a00000    # 5.0f

    .line 469
    .line 470
    const/high16 v18, 0x41820000    # 16.25f

    .line 471
    .line 472
    const v13, 0x40aae148    # 5.34f

    .line 473
    .line 474
    .line 475
    const/high16 v14, 0x41880000    # 17.0f

    .line 476
    .line 477
    const/high16 v15, 0x40a00000    # 5.0f

    .line 478
    .line 479
    const v16, 0x418547ae    # 16.66f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, -0x3fbae148    # -3.08f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v17, 0x3f266666    # 0.65f

    .line 492
    .line 493
    .line 494
    const v18, -0x4023d70a    # -1.72f

    .line 495
    .line 496
    .line 497
    const/4 v13, 0x0

    .line 498
    const v14, -0x40d70a3d    # -0.66f

    .line 499
    .line 500
    .line 501
    const/high16 v15, 0x3e800000    # 0.25f

    .line 502
    .line 503
    const v16, -0x405eb852    # -1.26f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v0, 0x41100000    # 9.0f

    .line 510
    .line 511
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v17, 0x40000000    # 2.0f

    .line 515
    .line 516
    const/high16 v18, -0x40000000    # -2.0f

    .line 517
    .line 518
    const v14, -0x40733333    # -1.1f

    .line 519
    .line 520
    .line 521
    const v15, 0x3f666666    # 0.9f

    .line 522
    .line 523
    .line 524
    const/high16 v16, -0x40000000    # -2.0f

    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v0, 0x41300000    # 11.0f

    .line 530
    .line 531
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v17, 0x3f800000    # 1.0f

    .line 535
    .line 536
    const v18, 0x3ea3d70a    # 0.32f

    .line 537
    .line 538
    .line 539
    const v13, 0x3ebd70a4    # 0.37f

    .line 540
    .line 541
    .line 542
    const/4 v14, 0x0

    .line 543
    const v15, 0x3f3851ec    # 0.72f

    .line 544
    .line 545
    .line 546
    const v16, 0x3df5c28f    # 0.12f

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v17, 0x41500000    # 13.0f

    .line 553
    .line 554
    const/high16 v18, 0x40e00000    # 7.0f

    .line 555
    .line 556
    const v13, 0x41447ae1    # 12.28f

    .line 557
    .line 558
    .line 559
    const v14, 0x40e3d70a    # 7.12f

    .line 560
    .line 561
    .line 562
    const v15, 0x414a147b    # 12.63f

    .line 563
    .line 564
    .line 565
    const/high16 v16, 0x40e00000    # 7.0f

    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v0, 0x40566666    # 3.35f

    .line 571
    .line 572
    .line 573
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v17, 0x40000000    # 2.0f

    .line 577
    .line 578
    const/high16 v18, 0x40000000    # 2.0f

    .line 579
    .line 580
    const v13, 0x3f8ccccd    # 1.1f

    .line 581
    .line 582
    .line 583
    const/4 v14, 0x0

    .line 584
    const/high16 v15, 0x40000000    # 2.0f

    .line 585
    .line 586
    const v16, 0x3f666666    # 0.9f

    .line 587
    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v0, 0x401ccccd    # 2.45f

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v17, 0x3f266666    # 0.65f

    .line 599
    .line 600
    .line 601
    const v18, 0x3fdc28f6    # 1.72f

    .line 602
    .line 603
    .line 604
    const v13, 0x3ecccccd    # 0.4f

    .line 605
    .line 606
    .line 607
    const v14, 0x3eeb851f    # 0.46f

    .line 608
    .line 609
    .line 610
    const v15, 0x3f266666    # 0.65f

    .line 611
    .line 612
    .line 613
    const v16, 0x3f87ae14    # 1.06f

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v0, 0x40451eb8    # 3.08f

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v17, 0x41920000    # 18.25f

    .line 626
    .line 627
    const/high16 v18, 0x41880000    # 17.0f

    .line 628
    .line 629
    const/high16 v13, 0x41980000    # 19.0f

    .line 630
    .line 631
    const v14, 0x418547ae    # 16.66f

    .line 632
    .line 633
    .line 634
    const v15, 0x419547ae    # 18.66f

    .line 635
    .line 636
    .line 637
    const/high16 v16, 0x41880000    # 17.0f

    .line 638
    .line 639
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    const/16 v16, 0x3800

    .line 650
    .line 651
    const/16 v17, 0x0

    .line 652
    .line 653
    const/high16 v6, 0x3f800000    # 1.0f

    .line 654
    .line 655
    const/4 v7, 0x0

    .line 656
    const/high16 v12, 0x3f800000    # 1.0f

    .line 657
    .line 658
    const/4 v13, 0x0

    .line 659
    const/4 v14, 0x0

    .line 660
    const/4 v15, 0x0

    .line 661
    const-string v4, ""

    .line 662
    .line 663
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    sput-object v0, Landroidx/compose/material/icons/rounded/BedroomParentKt;->_bedroomParent:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 672
    .line 673
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    return-object v0
.end method
