.class public final Landroidx/compose/material/icons/twotone/RotateRightKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _rotateRight:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRotateRight(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/RotateRightKt;->_rotateRight:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.RotateRight"

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
    const v0, 0x419f70a4    # 19.93f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41300000    # 11.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x4030a3d7    # -1.62f

    .line 79
    .line 80
    .line 81
    const v18, -0x3f870a3d    # -3.89f

    .line 82
    .line 83
    .line 84
    const v13, -0x41d1eb85    # -0.17f

    .line 85
    .line 86
    .line 87
    const v14, -0x404e147b    # -1.39f

    .line 88
    .line 89
    .line 90
    const v15, -0x40c7ae14    # -0.72f

    .line 91
    .line 92
    .line 93
    const v16, -0x3fd147ae    # -2.73f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, -0x404a3d71    # -1.42f

    .line 100
    .line 101
    .line 102
    const v2, 0x3fb5c28f    # 1.42f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v17, 0x3f828f5c    # 1.02f

    .line 109
    .line 110
    .line 111
    const v18, 0x401e147b    # 2.47f

    .line 112
    .line 113
    .line 114
    const v13, 0x3f0a3d71    # 0.54f

    .line 115
    .line 116
    .line 117
    const/high16 v14, 0x3f400000    # 0.75f

    .line 118
    .line 119
    const v15, 0x3f6147ae    # 0.88f

    .line 120
    .line 121
    .line 122
    const v16, 0x3fcccccd    # 1.6f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v0, 0x400147ae    # 2.02f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x3f800000    # 1.0f

    .line 138
    .line 139
    const/high16 v2, 0x41300000    # 11.0f

    .line 140
    .line 141
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v0, 0x40447ae1    # 3.07f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v17, 0x40800000    # 4.0f

    .line 151
    .line 152
    const/high16 v18, 0x41400000    # 12.0f

    .line 153
    .line 154
    const v13, 0x40e1eb85    # 7.06f

    .line 155
    .line 156
    .line 157
    const v14, 0x4091eb85    # 4.56f

    .line 158
    .line 159
    .line 160
    const/high16 v15, 0x40800000    # 4.0f

    .line 161
    .line 162
    const v16, 0x40fd70a4    # 7.92f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, 0x40e00000    # 7.0f

    .line 169
    .line 170
    const v2, 0x40fdc28f    # 7.93f

    .line 171
    .line 172
    .line 173
    const v4, 0x40433333    # 3.05f

    .line 174
    .line 175
    .line 176
    const v6, 0x40ee147b    # 7.44f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, -0x3ffeb852    # -2.02f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v17, -0x3f600000    # -5.0f

    .line 189
    .line 190
    const v18, -0x3f42e148    # -5.91f

    .line 191
    .line 192
    .line 193
    const v13, -0x3fca3d71    # -2.84f

    .line 194
    .line 195
    .line 196
    const v14, -0x410a3d71    # -0.48f

    .line 197
    .line 198
    .line 199
    const/high16 v15, -0x3f600000    # -5.0f

    .line 200
    .line 201
    const v16, -0x3fc3d70a    # -2.94f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, 0x40a00000    # 5.0f

    .line 208
    .line 209
    const v2, -0x3f42e148    # -5.91f

    .line 210
    .line 211
    .line 212
    const v4, 0x400a3d71    # 2.16f

    .line 213
    .line 214
    .line 215
    const v6, -0x3f523d71    # -5.43f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v0, 0x41200000    # 10.0f

    .line 222
    .line 223
    const/high16 v2, 0x41300000    # 11.0f

    .line 224
    .line 225
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, 0x4091999a    # 4.55f

    .line 229
    .line 230
    .line 231
    const v2, -0x3f71999a    # -4.45f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v0, 0x3f800000    # 1.0f

    .line 238
    .line 239
    const/high16 v2, 0x41300000    # 11.0f

    .line 240
    .line 241
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v0, 0x41775c29    # 15.46f

    .line 248
    .line 249
    .line 250
    const v2, 0x4186f5c3    # 16.87f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, -0x3fe28f5c    # -2.46f

    .line 257
    .line 258
    .line 259
    const v18, 0x3f83d70a    # 1.03f

    .line 260
    .line 261
    .line 262
    const/high16 v13, -0x40c00000    # -0.75f

    .line 263
    .line 264
    const v14, 0x3f0a3d71    # 0.54f

    .line 265
    .line 266
    .line 267
    const v15, -0x40347ae1    # -1.59f

    .line 268
    .line 269
    .line 270
    const v16, 0x3f63d70a    # 0.89f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, 0x400147ae    # 2.02f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, 0x4079999a    # 3.9f

    .line 283
    .line 284
    .line 285
    const v18, -0x4031eb85    # -1.61f

    .line 286
    .line 287
    .line 288
    const v13, 0x3fb1eb85    # 1.39f

    .line 289
    .line 290
    .line 291
    const v14, -0x41d1eb85    # -0.17f

    .line 292
    .line 293
    .line 294
    const v15, 0x402f5c29    # 2.74f

    .line 295
    .line 296
    .line 297
    const v16, -0x40ca3d71    # -0.71f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v0, -0x4047ae14    # -1.44f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, 0x41927ae1    # 18.31f

    .line 313
    .line 314
    .line 315
    const v2, 0x41871eb8    # 16.89f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v17, 0x3fcf5c29    # 1.62f

    .line 322
    .line 323
    .line 324
    const v18, -0x3f870a3d    # -3.89f

    .line 325
    .line 326
    .line 327
    const v13, 0x3f666666    # 0.9f

    .line 328
    .line 329
    .line 330
    const v14, -0x406b851f    # -1.16f

    .line 331
    .line 332
    .line 333
    const v15, 0x3fb9999a    # 1.45f

    .line 334
    .line 335
    .line 336
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, -0x3ffeb852    # -2.02f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v17, -0x407d70a4    # -1.02f

    .line 348
    .line 349
    .line 350
    const v18, 0x401eb852    # 2.48f

    .line 351
    .line 352
    .line 353
    const v13, -0x41f0a3d7    # -0.14f

    .line 354
    .line 355
    .line 356
    const v14, 0x3f5eb852    # 0.87f

    .line 357
    .line 358
    .line 359
    const v15, -0x410a3d71    # -0.48f

    .line 360
    .line 361
    .line 362
    const v16, 0x3fdc28f6    # 1.72f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v0, 0x3fb47ae1    # 1.41f

    .line 369
    .line 370
    .line 371
    const v2, 0x3fb5c28f    # 1.42f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    const/16 v16, 0x3800

    .line 385
    .line 386
    const/16 v17, 0x0

    .line 387
    .line 388
    const/high16 v6, 0x3f800000    # 1.0f

    .line 389
    .line 390
    const/high16 v8, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const/4 v7, 0x0

    .line 393
    const/high16 v9, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const/high16 v12, 0x3f800000    # 1.0f

    .line 396
    .line 397
    const/4 v13, 0x0

    .line 398
    const/4 v14, 0x0

    .line 399
    const/4 v15, 0x0

    .line 400
    const-string v4, ""

    .line 401
    .line 402
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    sput-object v0, Landroidx/compose/material/icons/twotone/RotateRightKt;->_rotateRight:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 411
    .line 412
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    return-object v0
.end method

.method public static synthetic getRotateRight$annotations(Landroidx/compose/material/icons/Icons$TwoTone;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
