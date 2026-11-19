.class public final Landroidx/compose/material/icons/twotone/BedtimeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bedtime:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBedtime(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BedtimeKt;->_bedtime:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Bedtime"

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
    const v4, 0x411451ec    # 9.27f

    .line 71
    .line 72
    .line 73
    const v6, 0x408fae14    # 4.49f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x40800000    # 4.0f

    .line 80
    .line 81
    const/high16 v26, 0x41400000    # 12.0f

    .line 82
    .line 83
    const v21, 0x40c66666    # 6.2f

    .line 84
    .line 85
    .line 86
    const v22, 0x40b33333    # 5.6f

    .line 87
    .line 88
    .line 89
    const/high16 v23, 0x40800000    # 4.0f

    .line 90
    .line 91
    const v24, 0x4108cccd    # 8.55f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v25, 0x41000000    # 8.0f

    .line 100
    .line 101
    const/high16 v26, 0x41000000    # 8.0f

    .line 102
    .line 103
    const/16 v21, 0x0

    .line 104
    .line 105
    const v22, 0x408d1eb8    # 4.41f

    .line 106
    .line 107
    .line 108
    const v23, 0x4065c28f    # 3.59f

    .line 109
    .line 110
    .line 111
    const/high16 v24, 0x41000000    # 8.0f

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v25, 0x409dc28f    # 4.93f

    .line 117
    .line 118
    .line 119
    const v26, -0x40251eb8    # -1.71f

    .line 120
    .line 121
    .line 122
    const v21, 0x3fe7ae14    # 1.81f

    .line 123
    .line 124
    .line 125
    const/16 v22, 0x0

    .line 126
    .line 127
    const v23, 0x40628f5c    # 3.54f

    .line 128
    .line 129
    .line 130
    const v24, -0x40e147ae    # -0.62f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v25, 0x411451ec    # 9.27f

    .line 137
    .line 138
    .line 139
    const v26, 0x408fae14    # 4.49f

    .line 140
    .line 141
    .line 142
    const v21, 0x415051ec    # 13.02f

    .line 143
    .line 144
    .line 145
    const v22, 0x41873333    # 16.9f

    .line 146
    .line 147
    .line 148
    const v23, 0x40f47ae1    # 7.64f

    .line 149
    .line 150
    .line 151
    const v24, 0x41407ae1    # 12.03f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    const/16 v16, 0x3800

    .line 165
    .line 166
    const/16 v17, 0x0

    .line 167
    .line 168
    const v6, 0x3e99999a    # 0.3f

    .line 169
    .line 170
    .line 171
    const v8, 0x3e99999a    # 0.3f

    .line 172
    .line 173
    .line 174
    const/4 v7, 0x0

    .line 175
    const/high16 v9, 0x3f800000    # 1.0f

    .line 176
    .line 177
    const/high16 v12, 0x3f800000    # 1.0f

    .line 178
    .line 179
    const/4 v13, 0x0

    .line 180
    const/4 v14, 0x0

    .line 181
    const/4 v15, 0x0

    .line 182
    const-string v4, ""

    .line 183
    .line 184
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 185
    .line 186
    .line 187
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 192
    .line 193
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 194
    .line 195
    .line 196
    move-result-wide v6

    .line 197
    const/4 v0, 0x0

    .line 198
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 206
    .line 207
    .line 208
    move-result v11

    .line 209
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 212
    .line 213
    .line 214
    const v0, 0x414570a4    # 12.34f

    .line 215
    .line 216
    .line 217
    const v2, 0x400147ae    # 2.02f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v17, -0x414ccccd    # -0.35f

    .line 224
    .line 225
    .line 226
    const v18, -0x43dc28f6    # -0.01f

    .line 227
    .line 228
    .line 229
    const v13, -0x420a3d71    # -0.12f

    .line 230
    .line 231
    .line 232
    const v15, -0x41947ae1    # -0.23f

    .line 233
    .line 234
    .line 235
    const v16, -0x43dc28f6    # -0.01f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v17, 0x40000000    # 2.0f

    .line 242
    .line 243
    const/high16 v18, 0x41400000    # 12.0f

    .line 244
    .line 245
    const v13, 0x40cccccd    # 6.4f

    .line 246
    .line 247
    .line 248
    const v14, 0x4000a3d7    # 2.01f

    .line 249
    .line 250
    .line 251
    const/high16 v15, 0x40000000    # 2.0f

    .line 252
    .line 253
    const v16, 0x40d147ae    # 6.54f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, 0x41200000    # 10.0f

    .line 260
    .line 261
    const/high16 v18, 0x41200000    # 10.0f

    .line 262
    .line 263
    const/4 v13, 0x0

    .line 264
    const v14, 0x40b0a3d7    # 5.52f

    .line 265
    .line 266
    .line 267
    const v15, 0x408f5c29    # 4.48f

    .line 268
    .line 269
    .line 270
    const/high16 v16, 0x41200000    # 10.0f

    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, 0x410a8f5c    # 8.66f

    .line 276
    .line 277
    .line 278
    const v18, -0x3f5f5c29    # -5.02f

    .line 279
    .line 280
    .line 281
    const v13, 0x406d70a4    # 3.71f

    .line 282
    .line 283
    .line 284
    const/4 v14, 0x0

    .line 285
    const v15, 0x40ddc28f    # 6.93f

    .line 286
    .line 287
    .line 288
    const v16, -0x3ffeb852    # -2.02f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, 0x414570a4    # 12.34f

    .line 295
    .line 296
    .line 297
    const v18, 0x400147ae    # 2.02f

    .line 298
    .line 299
    .line 300
    const v13, 0x41526666    # 13.15f

    .line 301
    .line 302
    .line 303
    const v14, 0x4185d70a    # 16.73f

    .line 304
    .line 305
    .line 306
    const v15, 0x41091eb8    # 8.57f

    .line 307
    .line 308
    .line 309
    const v16, 0x4108cccd    # 8.55f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v0, 0x41400000    # 12.0f

    .line 319
    .line 320
    const/high16 v2, 0x41a00000    # 20.0f

    .line 321
    .line 322
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v17, -0x3f000000    # -8.0f

    .line 326
    .line 327
    const/high16 v18, -0x3f000000    # -8.0f

    .line 328
    .line 329
    const v13, -0x3f72e148    # -4.41f

    .line 330
    .line 331
    .line 332
    const/4 v14, 0x0

    .line 333
    const/high16 v15, -0x3f000000    # -8.0f

    .line 334
    .line 335
    const v16, -0x3f9a3d71    # -3.59f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, 0x40a8a3d7    # 5.27f

    .line 342
    .line 343
    .line 344
    const v18, -0x3f0fae14    # -7.51f

    .line 345
    .line 346
    .line 347
    const/4 v13, 0x0

    .line 348
    const v14, -0x3fa33333    # -3.45f

    .line 349
    .line 350
    .line 351
    const v15, 0x400ccccd    # 2.2f

    .line 352
    .line 353
    .line 354
    const v16, -0x3f333333    # -6.4f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, 0x40f51eb8    # 7.66f

    .line 361
    .line 362
    .line 363
    const v18, 0x415ccccd    # 13.8f

    .line 364
    .line 365
    .line 366
    const v13, -0x402f5c29    # -1.63f

    .line 367
    .line 368
    .line 369
    const v14, 0x40f147ae    # 7.54f

    .line 370
    .line 371
    .line 372
    const/high16 v15, 0x40700000    # 3.75f

    .line 373
    .line 374
    const v16, 0x41468f5c    # 12.41f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v17, 0x41400000    # 12.0f

    .line 381
    .line 382
    const/high16 v18, 0x41a00000    # 20.0f

    .line 383
    .line 384
    const v13, 0x4178a3d7    # 15.54f

    .line 385
    .line 386
    .line 387
    const v14, 0x419b0a3d    # 19.38f

    .line 388
    .line 389
    .line 390
    const v15, 0x415cf5c3    # 13.81f

    .line 391
    .line 392
    .line 393
    const/high16 v16, 0x41a00000    # 20.0f

    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    const/16 v16, 0x3800

    .line 406
    .line 407
    const/16 v17, 0x0

    .line 408
    .line 409
    const/high16 v6, 0x3f800000    # 1.0f

    .line 410
    .line 411
    const/high16 v8, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const/4 v7, 0x0

    .line 414
    const/high16 v12, 0x3f800000    # 1.0f

    .line 415
    .line 416
    const/4 v13, 0x0

    .line 417
    const/4 v14, 0x0

    .line 418
    const/4 v15, 0x0

    .line 419
    const-string v4, ""

    .line 420
    .line 421
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    sput-object v0, Landroidx/compose/material/icons/twotone/BedtimeKt;->_bedtime:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 430
    .line 431
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    return-object v0
.end method
