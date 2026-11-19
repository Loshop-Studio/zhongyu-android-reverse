.class public final Landroidx/compose/material/icons/rounded/_4mpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __4mp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_4mp(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/_4mpKt;->__4mp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded._4mp"

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
    const/high16 v4, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v6, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v4, -0x40400000    # -1.5f

    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    const/16 v16, 0x3800

    .line 98
    .line 99
    const/16 v17, 0x0

    .line 100
    .line 101
    const/high16 v6, 0x3f800000    # 1.0f

    .line 102
    .line 103
    const/high16 v8, 0x3f800000    # 1.0f

    .line 104
    .line 105
    const/4 v7, 0x0

    .line 106
    const/high16 v9, 0x3f800000    # 1.0f

    .line 107
    .line 108
    const/high16 v12, 0x3f800000    # 1.0f

    .line 109
    .line 110
    const/4 v13, 0x0

    .line 111
    const/4 v14, 0x0

    .line 112
    const/4 v15, 0x0

    .line 113
    const-string v4, ""

    .line 114
    .line 115
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 116
    .line 117
    .line 118
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 123
    .line 124
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 125
    .line 126
    .line 127
    move-result-wide v6

    .line 128
    const/4 v0, 0x0

    .line 129
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    const/high16 v0, 0x41980000    # 19.0f

    .line 146
    .line 147
    const/high16 v2, 0x40400000    # 3.0f

    .line 148
    .line 149
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v0, 0x40a00000    # 5.0f

    .line 153
    .line 154
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v17, 0x40400000    # 3.0f

    .line 158
    .line 159
    const/high16 v18, 0x40a00000    # 5.0f

    .line 160
    .line 161
    const v13, 0x4079999a    # 3.9f

    .line 162
    .line 163
    .line 164
    const/high16 v14, 0x40400000    # 3.0f

    .line 165
    .line 166
    const/high16 v15, 0x40400000    # 3.0f

    .line 167
    .line 168
    const v16, 0x4079999a    # 3.9f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v0, 0x41600000    # 14.0f

    .line 175
    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v17, 0x40000000    # 2.0f

    .line 180
    .line 181
    const/high16 v18, 0x40000000    # 2.0f

    .line 182
    .line 183
    const/4 v13, 0x0

    .line 184
    const v14, 0x3f8ccccd    # 1.1f

    .line 185
    .line 186
    .line 187
    const v15, 0x3f666666    # 0.9f

    .line 188
    .line 189
    .line 190
    const/high16 v16, 0x40000000    # 2.0f

    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v18, -0x40000000    # -2.0f

    .line 199
    .line 200
    const v13, 0x3f8ccccd    # 1.1f

    .line 201
    .line 202
    .line 203
    const/4 v14, 0x0

    .line 204
    const/high16 v15, 0x40000000    # 2.0f

    .line 205
    .line 206
    const v16, -0x4099999a    # -0.9f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v0, 0x40a00000    # 5.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, 0x41980000    # 19.0f

    .line 218
    .line 219
    const/high16 v18, 0x40400000    # 3.0f

    .line 220
    .line 221
    const/high16 v13, 0x41a80000    # 21.0f

    .line 222
    .line 223
    const v14, 0x4079999a    # 3.9f

    .line 224
    .line 225
    .line 226
    const v15, 0x41a0cccd    # 20.1f

    .line 227
    .line 228
    .line 229
    const/high16 v16, 0x40400000    # 3.0f

    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v0, 0x418e0000    # 17.75f

    .line 238
    .line 239
    const/high16 v2, 0x41480000    # 12.5f

    .line 240
    .line 241
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, -0x40c00000    # -0.75f

    .line 245
    .line 246
    const/high16 v18, 0x3f400000    # 0.75f

    .line 247
    .line 248
    const/4 v13, 0x0

    .line 249
    const v14, 0x3ed1eb85    # 0.41f

    .line 250
    .line 251
    .line 252
    const v15, -0x4151eb85    # -0.34f

    .line 253
    .line 254
    .line 255
    const/high16 v16, 0x3f400000    # 0.75f

    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, 0x419147ae    # 18.16f

    .line 261
    .line 262
    .line 263
    const/high16 v2, 0x41300000    # 11.0f

    .line 264
    .line 265
    const/high16 v4, 0x418e0000    # 17.75f

    .line 266
    .line 267
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, 0x41600000    # 14.0f

    .line 271
    .line 272
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, -0x40800000    # -1.0f

    .line 276
    .line 277
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v0, 0x40100000    # 2.25f

    .line 281
    .line 282
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v17, 0x41140000    # 9.25f

    .line 286
    .line 287
    const/high16 v18, 0x41880000    # 17.0f

    .line 288
    .line 289
    const/high16 v13, 0x41200000    # 10.0f

    .line 290
    .line 291
    const v14, 0x418547ae    # 16.66f

    .line 292
    .line 293
    .line 294
    const v15, 0x411a8f5c    # 9.66f

    .line 295
    .line 296
    .line 297
    const/high16 v16, 0x41880000    # 17.0f

    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x418547ae    # 16.66f

    .line 303
    .line 304
    .line 305
    const/high16 v2, 0x41820000    # 16.25f

    .line 306
    .line 307
    const/high16 v4, 0x41080000    # 8.5f

    .line 308
    .line 309
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v0, 0x41600000    # 14.0f

    .line 313
    .line 314
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v0, -0x40800000    # -1.0f

    .line 318
    .line 319
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v0, 0x40700000    # 3.75f

    .line 323
    .line 324
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v17, -0x40c00000    # -0.75f

    .line 328
    .line 329
    const/high16 v18, 0x3f400000    # 0.75f

    .line 330
    .line 331
    const/4 v13, 0x0

    .line 332
    const v14, 0x3ed1eb85    # 0.41f

    .line 333
    .line 334
    .line 335
    const v15, -0x4151eb85    # -0.34f

    .line 336
    .line 337
    .line 338
    const/high16 v16, 0x3f400000    # 0.75f

    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v0, 0x40c00000    # 6.0f

    .line 344
    .line 345
    const v2, 0x419147ae    # 18.16f

    .line 346
    .line 347
    .line 348
    const/high16 v4, 0x418e0000    # 17.75f

    .line 349
    .line 350
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v0, 0x41580000    # 13.5f

    .line 354
    .line 355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v17, 0x3f800000    # 1.0f

    .line 359
    .line 360
    const/high16 v18, -0x40800000    # -1.0f

    .line 361
    .line 362
    const v14, -0x40f33333    # -0.55f

    .line 363
    .line 364
    .line 365
    const v15, 0x3ee66666    # 0.45f

    .line 366
    .line 367
    .line 368
    const/high16 v16, -0x40800000    # -1.0f

    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v0, 0x40900000    # 4.5f

    .line 374
    .line 375
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v18, 0x3f800000    # 1.0f

    .line 379
    .line 380
    const v13, 0x3f0ccccd    # 0.55f

    .line 381
    .line 382
    .line 383
    const/4 v14, 0x0

    .line 384
    const/high16 v15, 0x3f800000    # 1.0f

    .line 385
    .line 386
    const v16, 0x3ee66666    # 0.45f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v0, 0x418e0000    # 17.75f

    .line 393
    .line 394
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x412c0000    # 10.75f

    .line 401
    .line 402
    const/high16 v2, 0x41480000    # 12.5f

    .line 403
    .line 404
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x41200000    # 10.0f

    .line 408
    .line 409
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v0, -0x40000000    # -2.0f

    .line 413
    .line 414
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v17, -0x40800000    # -1.0f

    .line 418
    .line 419
    const/high16 v18, -0x40800000    # -1.0f

    .line 420
    .line 421
    const v13, -0x40f33333    # -0.55f

    .line 422
    .line 423
    .line 424
    const/high16 v15, -0x40800000    # -1.0f

    .line 425
    .line 426
    const v16, -0x4119999a    # -0.45f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x40c80000    # 6.25f

    .line 433
    .line 434
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v17, 0x3f400000    # 0.75f

    .line 438
    .line 439
    const/high16 v18, -0x40c00000    # -0.75f

    .line 440
    .line 441
    const/4 v13, 0x0

    .line 442
    const v14, -0x412e147b    # -0.41f

    .line 443
    .line 444
    .line 445
    const v15, 0x3eae147b    # 0.34f

    .line 446
    .line 447
    .line 448
    const/high16 v16, -0x40c00000    # -0.75f

    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, 0x40bae148    # 5.84f

    .line 454
    .line 455
    .line 456
    const/high16 v2, 0x40c80000    # 6.25f

    .line 457
    .line 458
    const/high16 v4, 0x41300000    # 11.0f

    .line 459
    .line 460
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v0, 0x41080000    # 8.5f

    .line 464
    .line 465
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v0, 0x40c80000    # 6.25f

    .line 474
    .line 475
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v0, 0x40bae148    # 5.84f

    .line 482
    .line 483
    .line 484
    const/high16 v4, 0x41600000    # 14.0f

    .line 485
    .line 486
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, 0x41080000    # 8.5f

    .line 490
    .line 491
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v0, 0x3e800000    # 0.25f

    .line 495
    .line 496
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v17, 0x41700000    # 15.0f

    .line 500
    .line 501
    const/high16 v18, 0x41140000    # 9.25f

    .line 502
    .line 503
    const v13, 0x416a8f5c    # 14.66f

    .line 504
    .line 505
    .line 506
    const/high16 v14, 0x41080000    # 8.5f

    .line 507
    .line 508
    const/high16 v15, 0x41700000    # 15.0f

    .line 509
    .line 510
    const v16, 0x410d70a4    # 8.84f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v0, 0x416a8f5c    # 14.66f

    .line 517
    .line 518
    .line 519
    const/high16 v2, 0x41640000    # 14.25f

    .line 520
    .line 521
    const/high16 v4, 0x41200000    # 10.0f

    .line 522
    .line 523
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v0, 0x41600000    # 14.0f

    .line 527
    .line 528
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v0, 0x3f400000    # 0.75f

    .line 532
    .line 533
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v17, -0x40c00000    # -0.75f

    .line 537
    .line 538
    const/high16 v18, 0x3f400000    # 0.75f

    .line 539
    .line 540
    const/4 v13, 0x0

    .line 541
    const v14, 0x3ed1eb85    # 0.41f

    .line 542
    .line 543
    .line 544
    const v15, -0x4151eb85    # -0.34f

    .line 545
    .line 546
    .line 547
    const/high16 v16, 0x3f400000    # 0.75f

    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v0, 0x41328f5c    # 11.16f

    .line 553
    .line 554
    .line 555
    const/high16 v2, 0x412c0000    # 10.75f

    .line 556
    .line 557
    const/high16 v4, 0x41480000    # 12.5f

    .line 558
    .line 559
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v0, 0x41900000    # 18.0f

    .line 566
    .line 567
    const/high16 v2, 0x41800000    # 16.0f

    .line 568
    .line 569
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v17, -0x40800000    # -1.0f

    .line 573
    .line 574
    const/high16 v18, 0x3f800000    # 1.0f

    .line 575
    .line 576
    const v14, 0x3f0ccccd    # 0.55f

    .line 577
    .line 578
    .line 579
    const v15, -0x4119999a    # -0.45f

    .line 580
    .line 581
    .line 582
    const/high16 v16, 0x3f800000    # 1.0f

    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v0, -0x40000000    # -2.0f

    .line 588
    .line 589
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v0, 0x3f400000    # 0.75f

    .line 593
    .line 594
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v17, -0x40c00000    # -0.75f

    .line 598
    .line 599
    const/high16 v18, 0x3f400000    # 0.75f

    .line 600
    .line 601
    const v14, 0x3ed1eb85    # 0.41f

    .line 602
    .line 603
    .line 604
    const v15, -0x4151eb85    # -0.34f

    .line 605
    .line 606
    .line 607
    const/high16 v16, 0x3f400000    # 0.75f

    .line 608
    .line 609
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v0, -0x4151eb85    # -0.34f

    .line 613
    .line 614
    .line 615
    const/high16 v2, -0x40c00000    # -0.75f

    .line 616
    .line 617
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v0, 0x41580000    # 13.5f

    .line 621
    .line 622
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v17, 0x3f800000    # 1.0f

    .line 626
    .line 627
    const/high16 v18, -0x40800000    # -1.0f

    .line 628
    .line 629
    const v14, -0x40f33333    # -0.55f

    .line 630
    .line 631
    .line 632
    const v15, 0x3ee66666    # 0.45f

    .line 633
    .line 634
    .line 635
    const/high16 v16, -0x40800000    # -1.0f

    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const/high16 v0, 0x41880000    # 17.0f

    .line 641
    .line 642
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v18, 0x3f800000    # 1.0f

    .line 646
    .line 647
    const v13, 0x3f0ccccd    # 0.55f

    .line 648
    .line 649
    .line 650
    const/4 v14, 0x0

    .line 651
    const/high16 v15, 0x3f800000    # 1.0f

    .line 652
    .line 653
    const v16, 0x3ee66666    # 0.45f

    .line 654
    .line 655
    .line 656
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const/high16 v0, 0x41800000    # 16.0f

    .line 660
    .line 661
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 668
    .line 669
    .line 670
    move-result-object v2

    .line 671
    const/16 v16, 0x3800

    .line 672
    .line 673
    const/16 v17, 0x0

    .line 674
    .line 675
    const/high16 v6, 0x3f800000    # 1.0f

    .line 676
    .line 677
    const/4 v7, 0x0

    .line 678
    const/high16 v12, 0x3f800000    # 1.0f

    .line 679
    .line 680
    const/4 v13, 0x0

    .line 681
    const/4 v15, 0x0

    .line 682
    const-string v4, ""

    .line 683
    .line 684
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    sput-object v0, Landroidx/compose/material/icons/rounded/_4mpKt;->__4mp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 693
    .line 694
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 695
    .line 696
    .line 697
    return-object v0
.end method
