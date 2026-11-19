.class public final Landroidx/compose/material/icons/outlined/RotateRightKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _rotateRight:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRotateRight(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/RotateRightKt;->_rotateRight:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.RotateRight"

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
    const v0, 0x4178cccd    # 15.55f

    .line 71
    .line 72
    .line 73
    const v2, 0x40b1999a    # 5.55f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const/high16 v2, 0x41300000    # 11.0f

    .line 82
    .line 83
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v0, 0x40447ae1    # 3.07f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v17, 0x40800000    # 4.0f

    .line 93
    .line 94
    const/high16 v18, 0x41400000    # 12.0f

    .line 95
    .line 96
    const v13, 0x40e1eb85    # 7.06f

    .line 97
    .line 98
    .line 99
    const v14, 0x4091eb85    # 4.56f

    .line 100
    .line 101
    .line 102
    const/high16 v15, 0x40800000    # 4.0f

    .line 103
    .line 104
    const v16, 0x40fd70a4    # 7.92f

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v0, 0x40e00000    # 7.0f

    .line 111
    .line 112
    const v2, 0x40fdc28f    # 7.93f

    .line 113
    .line 114
    .line 115
    const v4, 0x40433333    # 3.05f

    .line 116
    .line 117
    .line 118
    const v6, 0x40ee147b    # 7.44f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, -0x3ffeb852    # -2.02f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v17, -0x3f600000    # -5.0f

    .line 131
    .line 132
    const v18, -0x3f42e148    # -5.91f

    .line 133
    .line 134
    .line 135
    const v13, -0x3fca3d71    # -2.84f

    .line 136
    .line 137
    .line 138
    const v14, -0x410a3d71    # -0.48f

    .line 139
    .line 140
    .line 141
    const/high16 v15, -0x3f600000    # -5.0f

    .line 142
    .line 143
    const v16, -0x3fc3d70a    # -2.94f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v0, 0x40a00000    # 5.0f

    .line 150
    .line 151
    const v2, -0x3f42e148    # -5.91f

    .line 152
    .line 153
    .line 154
    const v4, 0x400a3d71    # 2.16f

    .line 155
    .line 156
    .line 157
    const v6, -0x3f523d71    # -5.43f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v0, 0x41200000    # 10.0f

    .line 164
    .line 165
    const/high16 v2, 0x41300000    # 11.0f

    .line 166
    .line 167
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v0, 0x4091999a    # 4.55f

    .line 171
    .line 172
    .line 173
    const v2, -0x3f71999a    # -4.45f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, 0x419f70a4    # 19.93f

    .line 183
    .line 184
    .line 185
    const/high16 v2, 0x41300000    # 11.0f

    .line 186
    .line 187
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v17, -0x4030a3d7    # -1.62f

    .line 191
    .line 192
    .line 193
    const v18, -0x3f870a3d    # -3.89f

    .line 194
    .line 195
    .line 196
    const v13, -0x41d1eb85    # -0.17f

    .line 197
    .line 198
    .line 199
    const v14, -0x404e147b    # -1.39f

    .line 200
    .line 201
    .line 202
    const v15, -0x40c7ae14    # -0.72f

    .line 203
    .line 204
    .line 205
    const v16, -0x3fd147ae    # -2.73f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v0, -0x404a3d71    # -1.42f

    .line 212
    .line 213
    .line 214
    const v2, 0x3fb5c28f    # 1.42f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v17, 0x3f828f5c    # 1.02f

    .line 221
    .line 222
    .line 223
    const v18, 0x401e147b    # 2.47f

    .line 224
    .line 225
    .line 226
    const v13, 0x3f0a3d71    # 0.54f

    .line 227
    .line 228
    .line 229
    const/high16 v14, 0x3f400000    # 0.75f

    .line 230
    .line 231
    const v15, 0x3f6147ae    # 0.88f

    .line 232
    .line 233
    .line 234
    const v16, 0x3fcccccd    # 1.6f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, 0x400147ae    # 2.02f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, 0x41500000    # 13.0f

    .line 250
    .line 251
    const v2, 0x418f3333    # 17.9f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, 0x400147ae    # 2.02f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v17, 0x4079999a    # 3.9f

    .line 264
    .line 265
    .line 266
    const v18, -0x4031eb85    # -1.61f

    .line 267
    .line 268
    .line 269
    const v13, 0x3fb1eb85    # 1.39f

    .line 270
    .line 271
    .line 272
    const v14, -0x41d1eb85    # -0.17f

    .line 273
    .line 274
    .line 275
    const v15, 0x402f5c29    # 2.74f

    .line 276
    .line 277
    .line 278
    const v16, -0x40ca3d71    # -0.71f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, -0x4047ae14    # -1.44f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, -0x3fe28f5c    # -2.46f

    .line 291
    .line 292
    .line 293
    const v18, 0x3f83d70a    # 1.03f

    .line 294
    .line 295
    .line 296
    const/high16 v13, -0x40c00000    # -0.75f

    .line 297
    .line 298
    const v14, 0x3f0a3d71    # 0.54f

    .line 299
    .line 300
    .line 301
    const v15, -0x40347ae1    # -1.59f

    .line 302
    .line 303
    .line 304
    const v16, 0x3f63d70a    # 0.89f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, 0x41871eb8    # 16.89f

    .line 314
    .line 315
    .line 316
    const v2, 0x4177ae14    # 15.48f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v0, 0x3fb47ae1    # 1.41f

    .line 323
    .line 324
    .line 325
    const v2, 0x3fb5c28f    # 1.42f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v17, 0x3fcf5c29    # 1.62f

    .line 332
    .line 333
    .line 334
    const v18, -0x3f870a3d    # -3.89f

    .line 335
    .line 336
    .line 337
    const v13, 0x3f666666    # 0.9f

    .line 338
    .line 339
    .line 340
    const v14, -0x406b851f    # -1.16f

    .line 341
    .line 342
    .line 343
    const v15, 0x3fb9999a    # 1.45f

    .line 344
    .line 345
    .line 346
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, -0x3ffeb852    # -2.02f

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v17, -0x407d70a4    # -1.02f

    .line 358
    .line 359
    .line 360
    const v18, 0x401eb852    # 2.48f

    .line 361
    .line 362
    .line 363
    const v13, -0x41f0a3d7    # -0.14f

    .line 364
    .line 365
    .line 366
    const v14, 0x3f5eb852    # 0.87f

    .line 367
    .line 368
    .line 369
    const v15, -0x410a3d71    # -0.48f

    .line 370
    .line 371
    .line 372
    const v16, 0x3fdc28f6    # 1.72f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    const/16 v16, 0x3800

    .line 386
    .line 387
    const/16 v17, 0x0

    .line 388
    .line 389
    const/high16 v6, 0x3f800000    # 1.0f

    .line 390
    .line 391
    const/high16 v8, 0x3f800000    # 1.0f

    .line 392
    .line 393
    const/4 v7, 0x0

    .line 394
    const/high16 v9, 0x3f800000    # 1.0f

    .line 395
    .line 396
    const/high16 v12, 0x3f800000    # 1.0f

    .line 397
    .line 398
    const/4 v13, 0x0

    .line 399
    const/4 v14, 0x0

    .line 400
    const/4 v15, 0x0

    .line 401
    const-string v4, ""

    .line 402
    .line 403
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    sput-object v0, Landroidx/compose/material/icons/outlined/RotateRightKt;->_rotateRight:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 412
    .line 413
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    return-object v0
.end method

.method public static synthetic getRotateRight$annotations(Landroidx/compose/material/icons/Icons$Outlined;)V
    .locals 0
    .annotation runtime Lh7/a;
    .end annotation

    return-void
.end method
