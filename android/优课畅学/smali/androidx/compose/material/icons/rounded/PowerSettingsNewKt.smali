.class public final Landroidx/compose/material/icons/rounded/PowerSettingsNewKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _powerSettingsNew:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPowerSettingsNew(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PowerSettingsNewKt;->_powerSettingsNew:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PowerSettingsNew"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v18, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const v13, -0x40f33333    # -0.55f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x40800000    # -1.0f

    .line 86
    .line 87
    const v16, 0x3ee66666    # 0.45f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, 0x41000000    # 8.0f

    .line 94
    .line 95
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v17, 0x3f800000    # 1.0f

    .line 99
    .line 100
    const/4 v13, 0x0

    .line 101
    const v14, 0x3f0ccccd    # 0.55f

    .line 102
    .line 103
    .line 104
    const v15, 0x3ee66666    # 0.45f

    .line 105
    .line 106
    .line 107
    const/high16 v16, 0x3f800000    # 1.0f

    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, -0x4119999a    # -0.45f

    .line 113
    .line 114
    .line 115
    const/high16 v2, -0x40800000    # -1.0f

    .line 116
    .line 117
    const/high16 v4, 0x3f800000    # 1.0f

    .line 118
    .line 119
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v0, 0x41500000    # 13.0f

    .line 123
    .line 124
    const/high16 v2, 0x40800000    # 4.0f

    .line 125
    .line 126
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v17, -0x40800000    # -1.0f

    .line 130
    .line 131
    const/high16 v18, -0x40800000    # -1.0f

    .line 132
    .line 133
    const v14, -0x40f33333    # -0.55f

    .line 134
    .line 135
    .line 136
    const v15, -0x4119999a    # -0.45f

    .line 137
    .line 138
    .line 139
    const/high16 v16, -0x40800000    # -1.0f

    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, 0x41891eb8    # 17.14f

    .line 148
    .line 149
    .line 150
    const v2, 0x40bb851f    # 5.86f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v17, -0x43dc28f6    # -0.01f

    .line 157
    .line 158
    .line 159
    const v18, 0x3fb1eb85    # 1.39f

    .line 160
    .line 161
    .line 162
    const v13, -0x413851ec    # -0.39f

    .line 163
    .line 164
    .line 165
    const v14, 0x3ec7ae14    # 0.39f

    .line 166
    .line 167
    .line 168
    const v15, -0x413d70a4    # -0.38f

    .line 169
    .line 170
    .line 171
    const/high16 v16, 0x3f800000    # 1.0f

    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v17, 0x3fef5c29    # 1.87f

    .line 177
    .line 178
    .line 179
    const v18, 0x40923d71    # 4.57f

    .line 180
    .line 181
    .line 182
    const v13, 0x3f90a3d7    # 1.13f

    .line 183
    .line 184
    .line 185
    const v14, 0x3f99999a    # 1.2f

    .line 186
    .line 187
    .line 188
    const v15, 0x3fea3d71    # 1.83f

    .line 189
    .line 190
    .line 191
    const v16, 0x40333333    # 2.8f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, -0x3f22e148    # -6.91f

    .line 198
    .line 199
    .line 200
    const v18, 0x40e570a4    # 7.17f

    .line 201
    .line 202
    .line 203
    const v13, 0x3db851ec    # 0.09f

    .line 204
    .line 205
    .line 206
    const v14, 0x40751eb8    # 3.83f

    .line 207
    .line 208
    .line 209
    const v15, -0x3fbae148    # -3.08f

    .line 210
    .line 211
    .line 212
    const v16, 0x40e428f6    # 7.13f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v17, 0x40a00000    # 5.0f

    .line 219
    .line 220
    const/high16 v18, 0x41400000    # 12.0f

    .line 221
    .line 222
    const v13, 0x4102e148    # 8.18f

    .line 223
    .line 224
    .line 225
    const v14, 0x41986666    # 19.05f

    .line 226
    .line 227
    .line 228
    const/high16 v15, 0x40a00000    # 5.0f

    .line 229
    .line 230
    const v16, 0x417e6666    # 15.9f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, 0x3fef5c29    # 1.87f

    .line 237
    .line 238
    .line 239
    const v18, -0x3f67ae14    # -4.76f

    .line 240
    .line 241
    .line 242
    const/4 v13, 0x0

    .line 243
    const v14, -0x40147ae1    # -1.84f

    .line 244
    .line 245
    .line 246
    const v15, 0x3f35c28f    # 0.71f

    .line 247
    .line 248
    .line 249
    const v16, -0x3f9f5c29    # -3.51f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v17, -0x43dc28f6    # -0.01f

    .line 256
    .line 257
    .line 258
    const v18, -0x404f5c29    # -1.38f

    .line 259
    .line 260
    .line 261
    const v13, 0x3ebd70a4    # 0.37f

    .line 262
    .line 263
    .line 264
    const v14, -0x413851ec    # -0.39f

    .line 265
    .line 266
    .line 267
    const v15, 0x3ebd70a4    # 0.37f

    .line 268
    .line 269
    .line 270
    const/high16 v16, -0x40800000    # -1.0f

    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, -0x4048f5c3    # -1.43f

    .line 276
    .line 277
    .line 278
    const v18, 0x3ca3d70a    # 0.02f

    .line 279
    .line 280
    .line 281
    const v13, -0x41333333    # -0.4f

    .line 282
    .line 283
    .line 284
    const v14, -0x41333333    # -0.4f

    .line 285
    .line 286
    .line 287
    const v15, -0x4079999a    # -1.05f

    .line 288
    .line 289
    .line 290
    const v16, -0x413851ec    # -0.39f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v17, 0x40400000    # 3.0f

    .line 297
    .line 298
    const v18, 0x413bd70a    # 11.74f

    .line 299
    .line 300
    .line 301
    const v13, 0x407eb852    # 3.98f

    .line 302
    .line 303
    .line 304
    const v14, 0x40ed70a4    # 7.42f

    .line 305
    .line 306
    .line 307
    const v15, 0x40447ae1    # 3.07f

    .line 308
    .line 309
    .line 310
    const v16, 0x4117851f    # 9.47f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v17, 0x410b5c29    # 8.71f

    .line 317
    .line 318
    .line 319
    const/high16 v18, 0x41140000    # 9.25f

    .line 320
    .line 321
    const v13, -0x41f0a3d7    # -0.14f

    .line 322
    .line 323
    .line 324
    const v14, 0x409c28f6    # 4.88f

    .line 325
    .line 326
    .line 327
    const v15, 0x40751eb8    # 3.83f

    .line 328
    .line 329
    .line 330
    const v16, 0x4111999a    # 9.1f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v17, 0x4114a3d7    # 9.29f

    .line 337
    .line 338
    .line 339
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 340
    .line 341
    const v13, 0x40a33333    # 5.1f

    .line 342
    .line 343
    .line 344
    const v14, 0x3e23d70a    # 0.16f

    .line 345
    .line 346
    .line 347
    const v15, 0x4114a3d7    # 9.29f

    .line 348
    .line 349
    .line 350
    const v16, -0x3f847ae1    # -3.93f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v17, -0x3fe51eb8    # -2.42f

    .line 357
    .line 358
    .line 359
    const v18, -0x3f3c7ae1    # -6.11f

    .line 360
    .line 361
    .line 362
    const/4 v13, 0x0

    .line 363
    const v14, -0x3fe851ec    # -2.37f

    .line 364
    .line 365
    .line 366
    const v15, -0x40947ae1    # -0.92f

    .line 367
    .line 368
    .line 369
    const v16, -0x3f6fae14    # -4.51f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, -0x4047ae14    # -1.44f

    .line 376
    .line 377
    .line 378
    const v18, -0x435c28f6    # -0.02f

    .line 379
    .line 380
    .line 381
    const v13, -0x413d70a4    # -0.38f

    .line 382
    .line 383
    .line 384
    const v14, -0x412e147b    # -0.41f

    .line 385
    .line 386
    .line 387
    const v15, -0x407ae148    # -1.04f

    .line 388
    .line 389
    .line 390
    const v16, -0x4128f5c3    # -0.42f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    const/16 v16, 0x3800

    .line 404
    .line 405
    const/16 v17, 0x0

    .line 406
    .line 407
    const/high16 v6, 0x3f800000    # 1.0f

    .line 408
    .line 409
    const/high16 v8, 0x3f800000    # 1.0f

    .line 410
    .line 411
    const/4 v7, 0x0

    .line 412
    const/high16 v9, 0x3f800000    # 1.0f

    .line 413
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
    sput-object v0, Landroidx/compose/material/icons/rounded/PowerSettingsNewKt;->_powerSettingsNew:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 430
    .line 431
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    return-object v0
.end method
