.class public final Landroidx/compose/material/icons/rounded/MilitaryTechKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _militaryTech:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMilitaryTech(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MilitaryTechKt;->_militaryTech:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MilitaryTech"

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
    const/high16 v0, 0x41880000    # 17.0f

    .line 71
    .line 72
    const v2, 0x4126e148    # 10.43f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x40400000    # 3.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v17, -0x40800000    # -1.0f

    .line 84
    .line 85
    const/high16 v18, -0x40800000    # -1.0f

    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    const v14, -0x40f33333    # -0.55f

    .line 89
    .line 90
    .line 91
    const v15, -0x4119999a    # -0.45f

    .line 92
    .line 93
    .line 94
    const/high16 v16, -0x40800000    # -1.0f

    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x41000000    # 8.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v17, 0x40e00000    # 7.0f

    .line 105
    .line 106
    const/high16 v18, 0x40400000    # 3.0f

    .line 107
    .line 108
    const v13, 0x40ee6666    # 7.45f

    .line 109
    .line 110
    .line 111
    const/high16 v14, 0x40000000    # 2.0f

    .line 112
    .line 113
    const/high16 v15, 0x40e00000    # 7.0f

    .line 114
    .line 115
    const v16, 0x401ccccd    # 2.45f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v0, 0x40edc28f    # 7.43f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v17, 0x3efae148    # 0.49f

    .line 128
    .line 129
    .line 130
    const v18, 0x3f5c28f6    # 0.86f

    .line 131
    .line 132
    .line 133
    const/4 v13, 0x0

    .line 134
    const v14, 0x3eb33333    # 0.35f

    .line 135
    .line 136
    .line 137
    const v15, 0x3e3851ec    # 0.18f

    .line 138
    .line 139
    .line 140
    const v16, 0x3f2e147b    # 0.68f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, 0x4020a3d7    # 2.51f

    .line 147
    .line 148
    .line 149
    const v2, 0x4085c28f    # 4.18f

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v0, 0x4015c28f    # 2.34f

    .line 156
    .line 157
    .line 158
    const v2, -0x40828f5c    # -0.99f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v0, 0x3e428f5c    # 0.19f

    .line 165
    .line 166
    .line 167
    const v2, -0x3ff1eb85    # -2.22f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v17, 0x41028f5c    # 8.16f

    .line 174
    .line 175
    .line 176
    const v18, 0x4189ae14    # 17.21f

    .line 177
    .line 178
    .line 179
    const/high16 v13, 0x41000000    # 8.0f

    .line 180
    .line 181
    const v14, 0x4182f5c3    # 16.37f

    .line 182
    .line 183
    .line 184
    const v15, 0x40fa3d71    # 7.82f

    .line 185
    .line 186
    .line 187
    const v16, 0x41875c29    # 16.92f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, 0x3fbae148    # 1.46f

    .line 194
    .line 195
    .line 196
    const v2, 0x3fd851ec    # 1.69f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, 0x400b851f    # 2.18f

    .line 203
    .line 204
    .line 205
    const v2, -0x40fd70a4    # -0.51f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v17, 0x3f400000    # 0.75f

    .line 212
    .line 213
    const v18, 0x3f0a3d71    # 0.54f

    .line 214
    .line 215
    .line 216
    const v13, -0x42333333    # -0.1f

    .line 217
    .line 218
    .line 219
    const v14, 0x3edc28f6    # 0.43f

    .line 220
    .line 221
    .line 222
    const v15, 0x3ebd70a4    # 0.37f

    .line 223
    .line 224
    .line 225
    const v16, 0x3f451eb8    # 0.77f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v0, 0x41400000    # 12.0f

    .line 232
    .line 233
    const v2, 0x41a1d70a    # 20.23f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v0, 0x3ff47ae1    # 1.91f

    .line 240
    .line 241
    .line 242
    const v2, 0x3f933333    # 1.15f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v18, -0x40f5c28f    # -0.54f

    .line 249
    .line 250
    .line 251
    const v13, 0x3ec28f5c    # 0.38f

    .line 252
    .line 253
    .line 254
    const v14, 0x3e6b851f    # 0.23f

    .line 255
    .line 256
    .line 257
    const v15, 0x3f59999a    # 0.85f

    .line 258
    .line 259
    .line 260
    const v16, -0x421eb852    # -0.11f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, -0x3ff47ae1    # -2.18f

    .line 267
    .line 268
    .line 269
    const v2, -0x40fd70a4    # -0.51f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, -0x40451eb8    # -1.46f

    .line 276
    .line 277
    .line 278
    const v2, 0x3fd851ec    # 1.69f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, -0x416b851f    # -0.29f

    .line 285
    .line 286
    .line 287
    const v18, -0x409eb852    # -0.88f

    .line 288
    .line 289
    .line 290
    const v13, 0x3ea8f5c3    # 0.33f

    .line 291
    .line 292
    .line 293
    const v14, -0x416b851f    # -0.29f

    .line 294
    .line 295
    .line 296
    const v15, 0x3e23d70a    # 0.16f

    .line 297
    .line 298
    .line 299
    const v16, -0x40a8f5c3    # -0.84f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, -0x41bd70a4    # -0.19f

    .line 306
    .line 307
    .line 308
    const v2, -0x3ff1eb85    # -2.22f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, -0x3fea3d71    # -2.34f

    .line 315
    .line 316
    .line 317
    const v2, -0x40828f5c    # -0.99f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, -0x3fdf5c29    # -2.51f

    .line 324
    .line 325
    .line 326
    const v2, 0x4085c28f    # 4.18f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v17, 0x41880000    # 17.0f

    .line 333
    .line 334
    const v18, 0x4126e148    # 10.43f

    .line 335
    .line 336
    .line 337
    const v13, 0x41868f5c    # 16.82f

    .line 338
    .line 339
    .line 340
    const v14, 0x4131c28f    # 11.11f

    .line 341
    .line 342
    .line 343
    const/high16 v15, 0x41880000    # 17.0f

    .line 344
    .line 345
    const v16, 0x412ca3d7    # 10.79f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v0, 0x41500000    # 13.0f

    .line 355
    .line 356
    const v2, 0x4143ae14    # 12.23f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, 0x3f19999a    # 0.6f

    .line 363
    .line 364
    .line 365
    const/high16 v2, -0x40800000    # -1.0f

    .line 366
    .line 367
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, -0x40e66666    # -0.6f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x40400000    # 3.0f

    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v0, 0x40000000    # 2.0f

    .line 382
    .line 383
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, 0x4143ae14    # 12.23f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    const/16 v16, 0x3800

    .line 400
    .line 401
    const/16 v17, 0x0

    .line 402
    .line 403
    const/high16 v6, 0x3f800000    # 1.0f

    .line 404
    .line 405
    const/high16 v8, 0x3f800000    # 1.0f

    .line 406
    .line 407
    const/4 v7, 0x0

    .line 408
    const/high16 v9, 0x3f800000    # 1.0f

    .line 409
    .line 410
    const/high16 v12, 0x3f800000    # 1.0f

    .line 411
    .line 412
    const/4 v13, 0x0

    .line 413
    const/4 v14, 0x0

    .line 414
    const/4 v15, 0x0

    .line 415
    const-string v4, ""

    .line 416
    .line 417
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    sput-object v0, Landroidx/compose/material/icons/rounded/MilitaryTechKt;->_militaryTech:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 426
    .line 427
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    return-object v0
.end method
