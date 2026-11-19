.class public final Landroidx/compose/material/icons/outlined/ScaleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _scale:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getScale(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ScaleKt;->_scale:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Scale"

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
    const/high16 v0, 0x41600000    # 14.0f

    .line 71
    .line 72
    const/high16 v2, 0x41300000    # 11.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x41000000    # 8.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x41000000    # 8.0f

    .line 83
    .line 84
    const/high16 v18, -0x3f400000    # -6.0f

    .line 85
    .line 86
    const v13, 0x4091eb85    # 4.56f

    .line 87
    .line 88
    .line 89
    const v14, -0x40eb851f    # -0.58f

    .line 90
    .line 91
    .line 92
    const/high16 v15, 0x41000000    # 8.0f

    .line 93
    .line 94
    const v16, -0x3fb9999a    # -3.1f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x40000000    # 2.0f

    .line 101
    .line 102
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v18, 0x40c00000    # 6.0f

    .line 106
    .line 107
    const/4 v13, 0x0

    .line 108
    const v14, 0x4039999a    # 2.9f

    .line 109
    .line 110
    .line 111
    const v15, 0x405c28f6    # 3.44f

    .line 112
    .line 113
    .line 114
    const v16, 0x40ad70a4    # 5.42f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/4 v0, 0x0

    .line 121
    const/high16 v2, 0x40400000    # 3.0f

    .line 122
    .line 123
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v17, -0x3f000000    # -8.0f

    .line 127
    .line 128
    const/high16 v18, 0x41300000    # 11.0f

    .line 129
    .line 130
    const v13, -0x3f947ae1    # -3.68f

    .line 131
    .line 132
    .line 133
    const v14, 0x3f3ae148    # 0.73f

    .line 134
    .line 135
    .line 136
    const/high16 v15, -0x3f000000    # -8.0f

    .line 137
    .line 138
    const v16, 0x40670a3d    # 3.61f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v0, 0x40c00000    # 6.0f

    .line 145
    .line 146
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v0, -0x40000000    # -2.0f

    .line 150
    .line 151
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, 0x408428f6    # 4.13f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, 0x40fbd70a    # 7.87f

    .line 161
    .line 162
    .line 163
    const v18, -0x3f19999a    # -7.2f

    .line 164
    .line 165
    .line 166
    const v13, 0x3f6e147b    # 0.93f

    .line 167
    .line 168
    .line 169
    const v14, -0x3f2570a4    # -6.83f

    .line 170
    .line 171
    .line 172
    const v15, 0x40d4cccd    # 6.65f

    .line 173
    .line 174
    .line 175
    const v16, -0x3f19999a    # -7.2f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, 0x40fbd70a    # 7.87f

    .line 182
    .line 183
    .line 184
    const v2, 0x40e66666    # 7.2f

    .line 185
    .line 186
    .line 187
    const v4, 0x40de147b    # 6.94f

    .line 188
    .line 189
    .line 190
    const v6, 0x3ebd70a4    # 0.37f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v0, 0x41800000    # 16.0f

    .line 197
    .line 198
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v0, 0x40000000    # 2.0f

    .line 202
    .line 203
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v0, 0x40c00000    # 6.0f

    .line 207
    .line 208
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v17, 0x41600000    # 14.0f

    .line 212
    .line 213
    const/high16 v18, 0x41300000    # 11.0f

    .line 214
    .line 215
    const/high16 v13, 0x41b00000    # 22.0f

    .line 216
    .line 217
    const v14, 0x4169c28f    # 14.61f

    .line 218
    .line 219
    .line 220
    const v15, 0x418d70a4    # 17.68f

    .line 221
    .line 222
    .line 223
    const v16, 0x413bae14    # 11.73f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v0, 0x40800000    # 4.0f

    .line 233
    .line 234
    const v2, 0x4196f5c3    # 18.87f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v17, 0x41400000    # 12.0f

    .line 241
    .line 242
    const v18, 0x40c3d70a    # 6.12f

    .line 243
    .line 244
    .line 245
    const/high16 v13, 0x418c0000    # 17.5f

    .line 246
    .line 247
    const v14, 0x40a6147b    # 5.19f

    .line 248
    .line 249
    .line 250
    const/high16 v15, 0x41700000    # 15.0f

    .line 251
    .line 252
    const v16, 0x40c3d70a    # 6.12f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v17, 0x40a428f6    # 5.13f

    .line 259
    .line 260
    .line 261
    const/high16 v18, 0x40800000    # 4.0f

    .line 262
    .line 263
    const/high16 v13, 0x41100000    # 9.0f

    .line 264
    .line 265
    const v14, 0x40c3d70a    # 6.12f

    .line 266
    .line 267
    .line 268
    const/high16 v15, 0x40d00000    # 6.5f

    .line 269
    .line 270
    const v16, 0x40a6147b    # 5.19f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, 0x4196f5c3    # 18.87f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, 0x41400000    # 12.0f

    .line 286
    .line 287
    const/high16 v2, 0x41b00000    # 22.0f

    .line 288
    .line 289
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v17, -0x40000000    # -2.0f

    .line 293
    .line 294
    const/high16 v18, -0x40000000    # -2.0f

    .line 295
    .line 296
    const v13, -0x40733333    # -1.1f

    .line 297
    .line 298
    .line 299
    const/4 v14, 0x0

    .line 300
    const/high16 v15, -0x40000000    # -2.0f

    .line 301
    .line 302
    const v16, -0x4099999a    # -0.9f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, 0x3f170a3d    # 0.59f

    .line 309
    .line 310
    .line 311
    const v18, -0x404b851f    # -1.41f

    .line 312
    .line 313
    .line 314
    const/4 v13, 0x0

    .line 315
    const v14, -0x40f33333    # -0.55f

    .line 316
    .line 317
    .line 318
    const v15, 0x3e6147ae    # 0.22f

    .line 319
    .line 320
    .line 321
    const v16, -0x4079999a    # -1.05f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v17, 0x41800000    # 16.0f

    .line 328
    .line 329
    const/high16 v18, 0x41800000    # 16.0f

    .line 330
    .line 331
    const v13, 0x41363d71    # 11.39f

    .line 332
    .line 333
    .line 334
    const v14, 0x418e51ec    # 17.79f

    .line 335
    .line 336
    .line 337
    const/high16 v15, 0x41800000    # 16.0f

    .line 338
    .line 339
    const/high16 v16, 0x41800000    # 16.0f

    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, -0x3fda3d71    # -2.59f

    .line 345
    .line 346
    .line 347
    const v2, 0x40ad1eb8    # 5.41f

    .line 348
    .line 349
    .line 350
    const v4, -0x401ae148    # -1.79f

    .line 351
    .line 352
    .line 353
    const v6, 0x4093851f    # 4.61f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v17, 0x41400000    # 12.0f

    .line 360
    .line 361
    const/high16 v18, 0x41b00000    # 22.0f

    .line 362
    .line 363
    const v13, 0x4150cccd    # 13.05f

    .line 364
    .line 365
    .line 366
    const v14, 0x41ae3d71    # 21.78f

    .line 367
    .line 368
    .line 369
    const v15, 0x4148cccd    # 12.55f

    .line 370
    .line 371
    .line 372
    const/high16 v16, 0x41b00000    # 22.0f

    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    sput-object v0, Landroidx/compose/material/icons/outlined/ScaleKt;->_scale:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 411
    .line 412
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    return-object v0
.end method
