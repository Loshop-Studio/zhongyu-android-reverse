.class public final Landroidx/compose/material/icons/outlined/_13mpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __13mp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_13mp(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/_13mpKt;->__13mp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined._13mp"

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
    const/high16 v4, 0x41080000    # 8.5f

    .line 71
    .line 72
    const/high16 v6, 0x41380000    # 11.5f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 79
    .line 80
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, -0x3f400000    # -6.0f

    .line 84
    .line 85
    const/4 v6, 0x0

    .line 86
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 90
    .line 91
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/4 v4, 0x0

    .line 95
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 96
    .line 97
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    const/16 v16, 0x3800

    .line 111
    .line 112
    const/16 v17, 0x0

    .line 113
    .line 114
    const/high16 v6, 0x3f800000    # 1.0f

    .line 115
    .line 116
    const/high16 v8, 0x3f800000    # 1.0f

    .line 117
    .line 118
    const/4 v7, 0x0

    .line 119
    const/high16 v9, 0x3f800000    # 1.0f

    .line 120
    .line 121
    const/high16 v12, 0x3f800000    # 1.0f

    .line 122
    .line 123
    const/4 v13, 0x0

    .line 124
    const/4 v14, 0x0

    .line 125
    const/4 v15, 0x0

    .line 126
    const-string v4, ""

    .line 127
    .line 128
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 129
    .line 130
    .line 131
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 136
    .line 137
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 138
    .line 139
    .line 140
    move-result-wide v6

    .line 141
    const/4 v2, 0x0

    .line 142
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 150
    .line 151
    .line 152
    move-result v11

    .line 153
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    const/high16 v4, 0x41840000    # 16.5f

    .line 159
    .line 160
    const/high16 v6, 0x41280000    # 10.5f

    .line 161
    .line 162
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v4, -0x3f800000    # -4.0f

    .line 166
    .line 167
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v25, -0x40800000    # -1.0f

    .line 171
    .line 172
    const/high16 v26, -0x40800000    # -1.0f

    .line 173
    .line 174
    const/16 v21, 0x0

    .line 175
    .line 176
    const v22, -0x40f33333    # -0.55f

    .line 177
    .line 178
    .line 179
    const v23, -0x4119999a    # -0.45f

    .line 180
    .line 181
    .line 182
    const/high16 v24, -0x40800000    # -1.0f

    .line 183
    .line 184
    move-object/from16 v20, v2

    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v4, 0x41400000    # 12.0f

    .line 190
    .line 191
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v4, 0x40e00000    # 7.0f

    .line 195
    .line 196
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v4, 0x40400000    # 3.0f

    .line 200
    .line 201
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v4, 0x3f800000    # 1.0f

    .line 205
    .line 206
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v4, -0x40000000    # -2.0f

    .line 210
    .line 211
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v4, 0x3f800000    # 1.0f

    .line 215
    .line 216
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v4, 0x40000000    # 2.0f

    .line 220
    .line 221
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v4, 0x3f800000    # 1.0f

    .line 225
    .line 226
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 230
    .line 231
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 235
    .line 236
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v4, 0x40600000    # 3.5f

    .line 240
    .line 241
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v25, 0x41840000    # 16.5f

    .line 245
    .line 246
    const/high16 v26, 0x41280000    # 10.5f

    .line 247
    .line 248
    const v21, 0x41806666    # 16.05f

    .line 249
    .line 250
    .line 251
    const/high16 v22, 0x41380000    # 11.5f

    .line 252
    .line 253
    const/high16 v23, 0x41840000    # 16.5f

    .line 254
    .line 255
    const v24, 0x4130cccd    # 11.05f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    const/high16 v6, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const/4 v7, 0x0

    .line 271
    const-string v4, ""

    .line 272
    .line 273
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 274
    .line 275
    .line 276
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 281
    .line 282
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 283
    .line 284
    .line 285
    move-result-wide v6

    .line 286
    const/4 v2, 0x0

    .line 287
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 291
    .line 292
    .line 293
    move-result v10

    .line 294
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 295
    .line 296
    .line 297
    move-result v11

    .line 298
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 301
    .line 302
    .line 303
    const/high16 v4, 0x40f00000    # 7.5f

    .line 304
    .line 305
    const/high16 v6, 0x41600000    # 14.0f

    .line 306
    .line 307
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v4, 0x3f800000    # 1.0f

    .line 311
    .line 312
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v4, 0x40400000    # 3.0f

    .line 316
    .line 317
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v4, 0x41200000    # 10.0f

    .line 321
    .line 322
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 326
    .line 327
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v4, 0x3f800000    # 1.0f

    .line 331
    .line 332
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v4, 0x40900000    # 4.5f

    .line 336
    .line 337
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 341
    .line 342
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v4, -0x3f600000    # -5.0f

    .line 346
    .line 347
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v25, -0x40800000    # -1.0f

    .line 351
    .line 352
    const/high16 v26, -0x40800000    # -1.0f

    .line 353
    .line 354
    const/16 v21, 0x0

    .line 355
    .line 356
    const v22, -0x40f33333    # -0.55f

    .line 357
    .line 358
    .line 359
    const v23, -0x4119999a    # -0.45f

    .line 360
    .line 361
    .line 362
    const/high16 v24, -0x40800000    # -1.0f

    .line 363
    .line 364
    move-object/from16 v20, v2

    .line 365
    .line 366
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v4, 0x40e00000    # 7.0f

    .line 370
    .line 371
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v26, 0x3f800000    # 1.0f

    .line 375
    .line 376
    const v21, -0x40f33333    # -0.55f

    .line 377
    .line 378
    .line 379
    const/16 v22, 0x0

    .line 380
    .line 381
    const/high16 v23, -0x40800000    # -1.0f

    .line 382
    .line 383
    const v24, 0x3ee66666    # 0.45f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v4, 0x40a00000    # 5.0f

    .line 390
    .line 391
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 395
    .line 396
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v4, 0x41600000    # 14.0f

    .line 400
    .line 401
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    const/high16 v6, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const/4 v7, 0x0

    .line 414
    const-string v4, ""

    .line 415
    .line 416
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 417
    .line 418
    .line 419
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 424
    .line 425
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 426
    .line 427
    .line 428
    move-result-wide v6

    .line 429
    const/4 v2, 0x0

    .line 430
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 434
    .line 435
    .line 436
    move-result v10

    .line 437
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 438
    .line 439
    .line 440
    move-result v11

    .line 441
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 444
    .line 445
    .line 446
    const/high16 v4, 0x41580000    # 13.5f

    .line 447
    .line 448
    const/high16 v6, 0x41940000    # 18.5f

    .line 449
    .line 450
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v4, 0x41700000    # 15.0f

    .line 454
    .line 455
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v4, 0x41880000    # 17.0f

    .line 459
    .line 460
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v4, 0x40000000    # 2.0f

    .line 464
    .line 465
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v25, 0x3f800000    # 1.0f

    .line 469
    .line 470
    const/high16 v26, -0x40800000    # -1.0f

    .line 471
    .line 472
    const v21, 0x3f0ccccd    # 0.55f

    .line 473
    .line 474
    .line 475
    const/high16 v23, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const v24, -0x4119999a    # -0.45f

    .line 478
    .line 479
    .line 480
    move-object/from16 v20, v2

    .line 481
    .line 482
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 486
    .line 487
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v25, -0x40800000    # -1.0f

    .line 491
    .line 492
    const/16 v21, 0x0

    .line 493
    .line 494
    const v22, -0x40f33333    # -0.55f

    .line 495
    .line 496
    .line 497
    const v23, -0x4119999a    # -0.45f

    .line 498
    .line 499
    .line 500
    const/high16 v24, -0x40800000    # -1.0f

    .line 501
    .line 502
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v4, -0x3fa00000    # -3.5f

    .line 506
    .line 507
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v4, 0x41940000    # 18.5f

    .line 511
    .line 512
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v4, 0x41700000    # 15.0f

    .line 519
    .line 520
    const/high16 v6, 0x41600000    # 14.0f

    .line 521
    .line 522
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 526
    .line 527
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v4, 0x41700000    # 15.0f

    .line 534
    .line 535
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v4, 0x41600000    # 14.0f

    .line 539
    .line 540
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    const/high16 v6, 0x3f800000    # 1.0f

    .line 551
    .line 552
    const/4 v7, 0x0

    .line 553
    const-string v4, ""

    .line 554
    .line 555
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 556
    .line 557
    .line 558
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 559
    .line 560
    .line 561
    move-result v3

    .line 562
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 563
    .line 564
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 565
    .line 566
    .line 567
    move-result-wide v6

    .line 568
    const/4 v0, 0x0

    .line 569
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 573
    .line 574
    .line 575
    move-result v10

    .line 576
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 577
    .line 578
    .line 579
    move-result v11

    .line 580
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 583
    .line 584
    .line 585
    const/high16 v0, 0x40400000    # 3.0f

    .line 586
    .line 587
    const/high16 v2, 0x41980000    # 19.0f

    .line 588
    .line 589
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v0, 0x40a00000    # 5.0f

    .line 593
    .line 594
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v17, 0x40400000    # 3.0f

    .line 598
    .line 599
    const/high16 v18, 0x40a00000    # 5.0f

    .line 600
    .line 601
    const v13, 0x4079999a    # 3.9f

    .line 602
    .line 603
    .line 604
    const/high16 v14, 0x40400000    # 3.0f

    .line 605
    .line 606
    const/high16 v15, 0x40400000    # 3.0f

    .line 607
    .line 608
    const v16, 0x4079999a    # 3.9f

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/high16 v0, 0x41600000    # 14.0f

    .line 615
    .line 616
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v17, 0x40000000    # 2.0f

    .line 620
    .line 621
    const/high16 v18, 0x40000000    # 2.0f

    .line 622
    .line 623
    const/4 v13, 0x0

    .line 624
    const v14, 0x3f8ccccd    # 1.1f

    .line 625
    .line 626
    .line 627
    const v15, 0x3f666666    # 0.9f

    .line 628
    .line 629
    .line 630
    const/high16 v16, 0x40000000    # 2.0f

    .line 631
    .line 632
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v18, -0x40000000    # -2.0f

    .line 639
    .line 640
    const v13, 0x3f8ccccd    # 1.1f

    .line 641
    .line 642
    .line 643
    const/4 v14, 0x0

    .line 644
    const/high16 v15, 0x40000000    # 2.0f

    .line 645
    .line 646
    const v16, -0x4099999a    # -0.9f

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v0, 0x40a00000    # 5.0f

    .line 653
    .line 654
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v17, 0x41980000    # 19.0f

    .line 658
    .line 659
    const/high16 v18, 0x40400000    # 3.0f

    .line 660
    .line 661
    const/high16 v13, 0x41a80000    # 21.0f

    .line 662
    .line 663
    const v14, 0x4079999a    # 3.9f

    .line 664
    .line 665
    .line 666
    const v15, 0x41a0cccd    # 20.1f

    .line 667
    .line 668
    .line 669
    const/high16 v16, 0x40400000    # 3.0f

    .line 670
    .line 671
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const/high16 v0, 0x41980000    # 19.0f

    .line 678
    .line 679
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const/high16 v0, 0x40a00000    # 5.0f

    .line 683
    .line 684
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v0, 0x41600000    # 14.0f

    .line 691
    .line 692
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const/high16 v0, 0x41980000    # 19.0f

    .line 696
    .line 697
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    const/16 v16, 0x3800

    .line 708
    .line 709
    const/16 v17, 0x0

    .line 710
    .line 711
    const/high16 v6, 0x3f800000    # 1.0f

    .line 712
    .line 713
    const/4 v7, 0x0

    .line 714
    const/high16 v12, 0x3f800000    # 1.0f

    .line 715
    .line 716
    const/4 v13, 0x0

    .line 717
    const/4 v14, 0x0

    .line 718
    const/4 v15, 0x0

    .line 719
    const-string v4, ""

    .line 720
    .line 721
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    sput-object v0, Landroidx/compose/material/icons/outlined/_13mpKt;->__13mp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 730
    .line 731
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 732
    .line 733
    .line 734
    return-object v0
.end method
