.class public final Landroidx/compose/material/icons/twotone/TransferWithinAStationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _transferWithinAStation:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTransferWithinAStation(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/TransferWithinAStationKt;->_transferWithinAStation:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.TransferWithinAStation"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

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
    const/high16 v0, 0x415c0000    # 13.75f

    .line 71
    .line 72
    const v2, 0x4183eb85    # 16.49f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x41820000    # 16.25f

    .line 79
    .line 80
    const/high16 v4, 0x41600000    # 14.0f

    .line 81
    .line 82
    invoke-virtual {v12, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v0, 0x401f5c29    # 2.49f

    .line 86
    .line 87
    .line 88
    const/high16 v6, 0x40200000    # 2.5f

    .line 89
    .line 90
    invoke-virtual {v12, v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, 0x41880000    # 17.0f

    .line 94
    .line 95
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v2, 0x41b00000    # 22.0f

    .line 99
    .line 100
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v6, -0x40400000    # -1.5f

    .line 104
    .line 105
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v6, -0x3f4fae14    # -5.51f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v6, 0x419c147b    # 19.51f

    .line 118
    .line 119
    .line 120
    const/high16 v7, 0x419e0000    # 19.75f

    .line 121
    .line 122
    invoke-virtual {v12, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 129
    .line 130
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v4, 0x40b051ec    # 5.51f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, 0x41b80000    # 23.0f

    .line 140
    .line 141
    invoke-virtual {v12, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v7, 0x41a40000    # 20.5f

    .line 145
    .line 146
    invoke-virtual {v12, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v2, 0x41900000    # 18.0f

    .line 150
    .line 151
    invoke-virtual {v12, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v2, 0x40f00000    # 7.5f

    .line 158
    .line 159
    const/high16 v6, 0x40600000    # 3.5f

    .line 160
    .line 161
    invoke-virtual {v12, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v17, 0x40000000    # 2.0f

    .line 165
    .line 166
    const/high16 v18, 0x40000000    # 2.0f

    .line 167
    .line 168
    const/4 v13, 0x0

    .line 169
    const v14, 0x3f8ccccd    # 1.1f

    .line 170
    .line 171
    .line 172
    const v15, 0x3f666666    # 0.9f

    .line 173
    .line 174
    .line 175
    const/high16 v16, 0x40000000    # 2.0f

    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v2, 0x40000000    # 2.0f

    .line 181
    .line 182
    const v6, -0x4099999a    # -0.9f

    .line 183
    .line 184
    .line 185
    const/high16 v7, -0x40000000    # -2.0f

    .line 186
    .line 187
    invoke-virtual {v12, v2, v6, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12, v6, v7, v7, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v6, 0x3f666666    # 0.9f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v7, v6, v7, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v6, 0x4118cccd    # 9.55f

    .line 203
    .line 204
    .line 205
    const v8, 0x41266666    # 10.4f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v17, 0x41700000    # 15.0f

    .line 212
    .line 213
    const/high16 v18, 0x41500000    # 13.0f

    .line 214
    .line 215
    const v13, 0x412d999a    # 10.85f

    .line 216
    .line 217
    .line 218
    const/high16 v14, 0x41400000    # 12.0f

    .line 219
    .line 220
    const v15, 0x414ccccd    # 12.8f

    .line 221
    .line 222
    .line 223
    const/high16 v16, 0x41500000    # 13.0f

    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v17, -0x3f74cccd    # -4.35f

    .line 232
    .line 233
    .line 234
    const v18, -0x3fe33333    # -2.45f

    .line 235
    .line 236
    .line 237
    const v13, -0x40133333    # -1.85f

    .line 238
    .line 239
    .line 240
    const/4 v14, 0x0

    .line 241
    const v15, -0x3fa33333    # -3.45f

    .line 242
    .line 243
    .line 244
    const/high16 v16, -0x40800000    # -1.0f

    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v6, -0x408ccccd    # -0.95f

    .line 250
    .line 251
    .line 252
    const v7, -0x40333333    # -1.6f

    .line 253
    .line 254
    .line 255
    invoke-virtual {v12, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v17, 0x41000000    # 8.0f

    .line 259
    .line 260
    const/high16 v18, 0x40c00000    # 6.0f

    .line 261
    .line 262
    const v13, 0x4115999a    # 9.35f

    .line 263
    .line 264
    .line 265
    const v14, 0x40cb3333    # 6.35f

    .line 266
    .line 267
    .line 268
    const v15, 0x410b3333    # 8.7f

    .line 269
    .line 270
    .line 271
    const/high16 v16, 0x40c00000    # 6.0f

    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v17, -0x40c00000    # -0.75f

    .line 277
    .line 278
    const v18, 0x3e19999a    # 0.15f

    .line 279
    .line 280
    .line 281
    const/high16 v13, -0x41800000    # -0.25f

    .line 282
    .line 283
    const/4 v14, 0x0

    .line 284
    const/high16 v15, -0x41000000    # -0.5f

    .line 285
    .line 286
    const v16, 0x3d4ccccd    # 0.05f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v6, 0x4104cccd    # 8.3f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v6, 0x41500000    # 13.0f

    .line 299
    .line 300
    invoke-virtual {v12, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v6, 0x40800000    # 4.0f

    .line 307
    .line 308
    const v7, 0x411a6666    # 9.65f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v6, -0x40c00000    # -0.75f

    .line 315
    .line 316
    const/high16 v7, 0x3fe00000    # 1.75f

    .line 317
    .line 318
    invoke-virtual {v12, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v6, 0x40400000    # 3.0f

    .line 322
    .line 323
    invoke-virtual {v12, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v4, 0x40066666    # 2.1f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v4, -0x3f000000    # -8.0f

    .line 333
    .line 334
    invoke-virtual {v12, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v4, 0x41100000    # 9.0f

    .line 338
    .line 339
    invoke-virtual {v12, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v0, 0x40c00000    # 6.0f

    .line 343
    .line 344
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, -0x3f0e6666    # -7.55f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, 0x410f3333    # 8.95f

    .line 357
    .line 358
    .line 359
    const v2, 0x41566666    # 13.4f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, 0x3f19999a    # 0.6f

    .line 366
    .line 367
    .line 368
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 369
    .line 370
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    const/16 v16, 0x3800

    .line 381
    .line 382
    const/16 v17, 0x0

    .line 383
    .line 384
    const-string v4, ""

    .line 385
    .line 386
    const/high16 v6, 0x3f800000    # 1.0f

    .line 387
    .line 388
    const/4 v7, 0x0

    .line 389
    const/high16 v8, 0x3f800000    # 1.0f

    .line 390
    .line 391
    const/high16 v9, 0x3f800000    # 1.0f

    .line 392
    .line 393
    const/high16 v12, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const/4 v13, 0x0

    .line 396
    const/4 v15, 0x0

    .line 397
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    sput-object v0, Landroidx/compose/material/icons/twotone/TransferWithinAStationKt;->_transferWithinAStation:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 406
    .line 407
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    return-object v0
.end method
