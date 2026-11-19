.class public final Landroidx/compose/material/icons/outlined/VpnKeyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _vpnKey:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVpnKey(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/VpnKeyKt;->_vpnKey:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.VpnKey"

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
    const/high16 v0, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const/high16 v2, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, -0x3f400000    # -6.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, -0x3f800000    # -4.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v0, -0x3fd47ae1    # -2.68f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v17, -0x3f35c28f    # -6.32f

    .line 94
    .line 95
    .line 96
    const/high16 v18, 0x40800000    # 4.0f

    .line 97
    .line 98
    const v13, -0x406e147b    # -1.14f

    .line 99
    .line 100
    .line 101
    const v14, 0x401ae148    # 2.42f

    .line 102
    .line 103
    .line 104
    const v15, -0x3f99999a    # -3.6f

    .line 105
    .line 106
    .line 107
    const/high16 v16, 0x40800000    # 4.0f

    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v17, -0x3f200000    # -7.0f

    .line 113
    .line 114
    const/high16 v18, -0x3f200000    # -7.0f

    .line 115
    .line 116
    const v13, -0x3f88f5c3    # -3.86f

    .line 117
    .line 118
    .line 119
    const/4 v14, 0x0

    .line 120
    const/high16 v15, -0x3f200000    # -7.0f

    .line 121
    .line 122
    const v16, -0x3fb70a3d    # -3.14f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v0, 0x4048f5c3    # 3.14f

    .line 129
    .line 130
    .line 131
    const/high16 v2, -0x3f200000    # -7.0f

    .line 132
    .line 133
    const/high16 v4, 0x40e00000    # 7.0f

    .line 134
    .line 135
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, 0x40ca3d71    # 6.32f

    .line 139
    .line 140
    .line 141
    const/high16 v18, 0x40800000    # 4.0f

    .line 142
    .line 143
    const v13, 0x402e147b    # 2.72f

    .line 144
    .line 145
    .line 146
    const v15, 0x40a570a4    # 5.17f

    .line 147
    .line 148
    .line 149
    const v16, 0x3fca3d71    # 1.58f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v0, 0x41100000    # 9.0f

    .line 156
    .line 157
    const/high16 v2, 0x41c00000    # 24.0f

    .line 158
    .line 159
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v0, 0x40c00000    # 6.0f

    .line 163
    .line 164
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, -0x40000000    # -2.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v0, 0x40800000    # 4.0f

    .line 173
    .line 174
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v0, 0x41880000    # 17.0f

    .line 181
    .line 182
    const/high16 v2, 0x41900000    # 18.0f

    .line 183
    .line 184
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v0, 0x40000000    # 2.0f

    .line 188
    .line 189
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v0, -0x3f800000    # -4.0f

    .line 193
    .line 194
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v0, 0x40000000    # 2.0f

    .line 198
    .line 199
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v0, -0x40000000    # -2.0f

    .line 203
    .line 204
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x413f0a3d    # 11.94f

    .line 208
    .line 209
    .line 210
    const/high16 v2, 0x41300000    # 11.0f

    .line 211
    .line 212
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, -0x41947ae1    # -0.23f

    .line 216
    .line 217
    .line 218
    const v2, -0x40d47ae1    # -0.67f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v17, 0x40e00000    # 7.0f

    .line 225
    .line 226
    const/high16 v18, 0x40e00000    # 7.0f

    .line 227
    .line 228
    const v13, 0x413028f6    # 11.01f

    .line 229
    .line 230
    .line 231
    const v14, 0x410570a4    # 8.34f

    .line 232
    .line 233
    .line 234
    const v15, 0x4111c28f    # 9.11f

    .line 235
    .line 236
    .line 237
    const/high16 v16, 0x40e00000    # 7.0f

    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v17, -0x3f600000    # -5.0f

    .line 243
    .line 244
    const/high16 v18, 0x40a00000    # 5.0f

    .line 245
    .line 246
    const v13, -0x3fcf5c29    # -2.76f

    .line 247
    .line 248
    .line 249
    const/4 v14, 0x0

    .line 250
    const/high16 v15, -0x3f600000    # -5.0f

    .line 251
    .line 252
    const v16, 0x400f5c29    # 2.24f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v0, 0x400f5c29    # 2.24f

    .line 259
    .line 260
    .line 261
    const/high16 v2, 0x40a00000    # 5.0f

    .line 262
    .line 263
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v17, 0x4096b852    # 4.71f

    .line 267
    .line 268
    .line 269
    const v18, -0x3faae148    # -3.33f

    .line 270
    .line 271
    .line 272
    const v13, 0x40070a3d    # 2.11f

    .line 273
    .line 274
    .line 275
    const v15, 0x408051ec    # 4.01f

    .line 276
    .line 277
    .line 278
    const v16, -0x40547ae1    # -1.34f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, 0x3e6b851f    # 0.23f

    .line 285
    .line 286
    .line 287
    const v2, -0x40d47ae1    # -0.67f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, 0x41500000    # 13.0f

    .line 294
    .line 295
    const/high16 v2, 0x41900000    # 18.0f

    .line 296
    .line 297
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x40800000    # 4.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v0, 0x41700000    # 15.0f

    .line 309
    .line 310
    const/high16 v2, 0x40e00000    # 7.0f

    .line 311
    .line 312
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 316
    .line 317
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 318
    .line 319
    const v13, -0x402ccccd    # -1.65f

    .line 320
    .line 321
    .line 322
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 323
    .line 324
    const v16, -0x40533333    # -1.35f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v0, 0x3faccccd    # 1.35f

    .line 331
    .line 332
    .line 333
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 334
    .line 335
    const/high16 v4, 0x40400000    # 3.0f

    .line 336
    .line 337
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v2, 0x40400000    # 3.0f

    .line 341
    .line 342
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, -0x40533333    # -1.35f

    .line 346
    .line 347
    .line 348
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 349
    .line 350
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v0, 0x41300000    # 11.0f

    .line 357
    .line 358
    const/high16 v2, 0x40e00000    # 7.0f

    .line 359
    .line 360
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v17, -0x40800000    # -1.0f

    .line 364
    .line 365
    const/high16 v18, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const v13, -0x40f33333    # -0.55f

    .line 368
    .line 369
    .line 370
    const/high16 v15, -0x40800000    # -1.0f

    .line 371
    .line 372
    const v16, 0x3ee66666    # 0.45f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v0, 0x3ee66666    # 0.45f

    .line 379
    .line 380
    .line 381
    const/high16 v2, 0x3f800000    # 1.0f

    .line 382
    .line 383
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, -0x4119999a    # -0.45f

    .line 387
    .line 388
    .line 389
    const/high16 v2, -0x40800000    # -1.0f

    .line 390
    .line 391
    const/high16 v4, 0x3f800000    # 1.0f

    .line 392
    .line 393
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    const/16 v16, 0x3800

    .line 407
    .line 408
    const/16 v17, 0x0

    .line 409
    .line 410
    const/high16 v6, 0x3f800000    # 1.0f

    .line 411
    .line 412
    const/high16 v8, 0x3f800000    # 1.0f

    .line 413
    .line 414
    const/4 v7, 0x0

    .line 415
    const/high16 v9, 0x3f800000    # 1.0f

    .line 416
    .line 417
    const/high16 v12, 0x3f800000    # 1.0f

    .line 418
    .line 419
    const/4 v13, 0x0

    .line 420
    const/4 v15, 0x0

    .line 421
    const-string v4, ""

    .line 422
    .line 423
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    sput-object v0, Landroidx/compose/material/icons/outlined/VpnKeyKt;->_vpnKey:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 432
    .line 433
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    return-object v0
.end method
