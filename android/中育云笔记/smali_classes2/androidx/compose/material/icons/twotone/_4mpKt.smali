.class public final Landroidx/compose/material/icons/twotone/_4mpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __4mp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_4mp(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/_4mpKt;->__4mp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone._4mp"

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
    const v6, 0x3e99999a    # 0.3f

    .line 102
    .line 103
    .line 104
    const v8, 0x3e99999a    # 0.3f

    .line 105
    .line 106
    .line 107
    const/4 v7, 0x0

    .line 108
    const/high16 v9, 0x3f800000    # 1.0f

    .line 109
    .line 110
    const/high16 v12, 0x3f800000    # 1.0f

    .line 111
    .line 112
    const/4 v13, 0x0

    .line 113
    const/4 v14, 0x0

    .line 114
    const/4 v15, 0x0

    .line 115
    const-string v4, ""

    .line 116
    .line 117
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 118
    .line 119
    .line 120
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 125
    .line 126
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 127
    .line 128
    .line 129
    move-result-wide v6

    .line 130
    const/4 v2, 0x0

    .line 131
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    const/high16 v4, 0x41980000    # 19.0f

    .line 148
    .line 149
    const/high16 v6, 0x40a00000    # 5.0f

    .line 150
    .line 151
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, 0x41600000    # 14.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x40a00000    # 5.0f

    .line 160
    .line 161
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, 0x41980000    # 19.0f

    .line 168
    .line 169
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v4, 0x41900000    # 18.0f

    .line 176
    .line 177
    const/high16 v6, 0x41580000    # 13.5f

    .line 178
    .line 179
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v4, 0x41800000    # 16.0f

    .line 183
    .line 184
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v25, -0x40800000    # -1.0f

    .line 188
    .line 189
    const/high16 v26, 0x3f800000    # 1.0f

    .line 190
    .line 191
    const/16 v21, 0x0

    .line 192
    .line 193
    const v22, 0x3f0ccccd    # 0.55f

    .line 194
    .line 195
    .line 196
    const v23, -0x4119999a    # -0.45f

    .line 197
    .line 198
    .line 199
    const/high16 v24, 0x3f800000    # 1.0f

    .line 200
    .line 201
    move-object/from16 v20, v2

    .line 202
    .line 203
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v4, -0x40000000    # -2.0f

    .line 207
    .line 208
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 212
    .line 213
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v4, -0x40400000    # -1.5f

    .line 217
    .line 218
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v4, -0x3f400000    # -6.0f

    .line 222
    .line 223
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v4, 0x41880000    # 17.0f

    .line 227
    .line 228
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v25, 0x41900000    # 18.0f

    .line 232
    .line 233
    const/high16 v26, 0x41580000    # 13.5f

    .line 234
    .line 235
    const v21, 0x418c6666    # 17.55f

    .line 236
    .line 237
    .line 238
    const/high16 v22, 0x41480000    # 12.5f

    .line 239
    .line 240
    const/high16 v23, 0x41900000    # 18.0f

    .line 241
    .line 242
    const v24, 0x414f3333    # 12.95f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v4, 0x41180000    # 9.5f

    .line 252
    .line 253
    const/high16 v6, 0x40b00000    # 5.5f

    .line 254
    .line 255
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v4, 0x41300000    # 11.0f

    .line 259
    .line 260
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v4, 0x40400000    # 3.0f

    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 269
    .line 270
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 274
    .line 275
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v4, 0x41600000    # 14.0f

    .line 279
    .line 280
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v4, 0x40400000    # 3.0f

    .line 284
    .line 285
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v4, 0x3f800000    # 1.0f

    .line 289
    .line 290
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v4, 0x41200000    # 10.0f

    .line 294
    .line 295
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v4, -0x40800000    # -1.0f

    .line 299
    .line 300
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 304
    .line 305
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v4, -0x40400000    # -1.5f

    .line 309
    .line 310
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v4, 0x41200000    # 10.0f

    .line 314
    .line 315
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 319
    .line 320
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v4, 0x40b00000    # 5.5f

    .line 324
    .line 325
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v4, 0x40c00000    # 6.0f

    .line 332
    .line 333
    const/high16 v6, 0x41580000    # 13.5f

    .line 334
    .line 335
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v25, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const/high16 v26, -0x40800000    # -1.0f

    .line 341
    .line 342
    const/16 v21, 0x0

    .line 343
    .line 344
    const v22, -0x40f33333    # -0.55f

    .line 345
    .line 346
    .line 347
    const v23, 0x3ee66666    # 0.45f

    .line 348
    .line 349
    .line 350
    const/high16 v24, -0x40800000    # -1.0f

    .line 351
    .line 352
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v4, 0x40900000    # 4.5f

    .line 356
    .line 357
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v26, 0x3f800000    # 1.0f

    .line 361
    .line 362
    const v21, 0x3f0ccccd    # 0.55f

    .line 363
    .line 364
    .line 365
    const/16 v22, 0x0

    .line 366
    .line 367
    const/high16 v23, 0x3f800000    # 1.0f

    .line 368
    .line 369
    const v24, 0x3ee66666    # 0.45f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v4, 0x40a00000    # 5.0f

    .line 376
    .line 377
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v4, 0x41300000    # 11.0f

    .line 381
    .line 382
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v4, 0x41600000    # 14.0f

    .line 386
    .line 387
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v4, -0x40800000    # -1.0f

    .line 391
    .line 392
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v4, 0x40400000    # 3.0f

    .line 396
    .line 397
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v4, 0x41080000    # 8.5f

    .line 401
    .line 402
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 406
    .line 407
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v4, -0x40800000    # -1.0f

    .line 411
    .line 412
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v4, 0x40900000    # 4.5f

    .line 416
    .line 417
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v4, 0x40c00000    # 6.0f

    .line 421
    .line 422
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v4, 0x41580000    # 13.5f

    .line 426
    .line 427
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    const v6, 0x3e99999a    # 0.3f

    .line 438
    .line 439
    .line 440
    const/4 v7, 0x0

    .line 441
    const-string v4, ""

    .line 442
    .line 443
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 444
    .line 445
    .line 446
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 447
    .line 448
    .line 449
    move-result v3

    .line 450
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 451
    .line 452
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 453
    .line 454
    .line 455
    move-result-wide v6

    .line 456
    const/4 v2, 0x0

    .line 457
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 461
    .line 462
    .line 463
    move-result v10

    .line 464
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 465
    .line 466
    .line 467
    move-result v11

    .line 468
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 471
    .line 472
    .line 473
    const/high16 v4, 0x40f00000    # 7.5f

    .line 474
    .line 475
    const/high16 v6, 0x41600000    # 14.0f

    .line 476
    .line 477
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v4, 0x3f800000    # 1.0f

    .line 481
    .line 482
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v4, 0x40400000    # 3.0f

    .line 486
    .line 487
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v4, 0x41200000    # 10.0f

    .line 491
    .line 492
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 496
    .line 497
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v4, 0x3f800000    # 1.0f

    .line 501
    .line 502
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v4, 0x40900000    # 4.5f

    .line 506
    .line 507
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 511
    .line 512
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v4, -0x3f600000    # -5.0f

    .line 516
    .line 517
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v25, -0x40800000    # -1.0f

    .line 521
    .line 522
    const/high16 v26, -0x40800000    # -1.0f

    .line 523
    .line 524
    const/16 v21, 0x0

    .line 525
    .line 526
    const v22, -0x40f33333    # -0.55f

    .line 527
    .line 528
    .line 529
    const v23, -0x4119999a    # -0.45f

    .line 530
    .line 531
    .line 532
    const/high16 v24, -0x40800000    # -1.0f

    .line 533
    .line 534
    move-object/from16 v20, v2

    .line 535
    .line 536
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v4, 0x40e00000    # 7.0f

    .line 540
    .line 541
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v26, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const v21, -0x40f33333    # -0.55f

    .line 547
    .line 548
    .line 549
    const/16 v22, 0x0

    .line 550
    .line 551
    const/high16 v23, -0x40800000    # -1.0f

    .line 552
    .line 553
    const v24, 0x3ee66666    # 0.45f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v4, 0x40a00000    # 5.0f

    .line 560
    .line 561
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 565
    .line 566
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v4, 0x41600000    # 14.0f

    .line 570
    .line 571
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    const/high16 v6, 0x3f800000    # 1.0f

    .line 582
    .line 583
    const/high16 v8, 0x3f800000    # 1.0f

    .line 584
    .line 585
    const/4 v7, 0x0

    .line 586
    const-string v4, ""

    .line 587
    .line 588
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 589
    .line 590
    .line 591
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 592
    .line 593
    .line 594
    move-result v3

    .line 595
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 596
    .line 597
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 598
    .line 599
    .line 600
    move-result-wide v6

    .line 601
    const/4 v2, 0x0

    .line 602
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 606
    .line 607
    .line 608
    move-result v10

    .line 609
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 610
    .line 611
    .line 612
    move-result v11

    .line 613
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 616
    .line 617
    .line 618
    const/high16 v4, 0x41940000    # 18.5f

    .line 619
    .line 620
    const/high16 v6, 0x41580000    # 13.5f

    .line 621
    .line 622
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v4, 0x41700000    # 15.0f

    .line 626
    .line 627
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v4, 0x41880000    # 17.0f

    .line 631
    .line 632
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const/high16 v4, 0x40000000    # 2.0f

    .line 636
    .line 637
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const/high16 v25, 0x3f800000    # 1.0f

    .line 641
    .line 642
    const/high16 v26, -0x40800000    # -1.0f

    .line 643
    .line 644
    const v21, 0x3f0ccccd    # 0.55f

    .line 645
    .line 646
    .line 647
    const/high16 v23, 0x3f800000    # 1.0f

    .line 648
    .line 649
    const v24, -0x4119999a    # -0.45f

    .line 650
    .line 651
    .line 652
    move-object/from16 v20, v2

    .line 653
    .line 654
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 658
    .line 659
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v25, -0x40800000    # -1.0f

    .line 663
    .line 664
    const/16 v21, 0x0

    .line 665
    .line 666
    const v22, -0x40f33333    # -0.55f

    .line 667
    .line 668
    .line 669
    const v23, -0x4119999a    # -0.45f

    .line 670
    .line 671
    .line 672
    const/high16 v24, -0x40800000    # -1.0f

    .line 673
    .line 674
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const/high16 v4, -0x3fa00000    # -3.5f

    .line 678
    .line 679
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const/high16 v4, 0x41940000    # 18.5f

    .line 683
    .line 684
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v4, 0x41700000    # 15.0f

    .line 691
    .line 692
    const/high16 v6, 0x41600000    # 14.0f

    .line 693
    .line 694
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 698
    .line 699
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const/high16 v4, 0x41700000    # 15.0f

    .line 706
    .line 707
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const/high16 v4, 0x41600000    # 14.0f

    .line 711
    .line 712
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 719
    .line 720
    .line 721
    move-result-object v2

    .line 722
    const/high16 v6, 0x3f800000    # 1.0f

    .line 723
    .line 724
    const/4 v7, 0x0

    .line 725
    const-string v4, ""

    .line 726
    .line 727
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 728
    .line 729
    .line 730
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 731
    .line 732
    .line 733
    move-result v3

    .line 734
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 735
    .line 736
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 737
    .line 738
    .line 739
    move-result-wide v6

    .line 740
    const/4 v2, 0x0

    .line 741
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 742
    .line 743
    .line 744
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 745
    .line 746
    .line 747
    move-result v10

    .line 748
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 749
    .line 750
    .line 751
    move-result v11

    .line 752
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 755
    .line 756
    .line 757
    const/high16 v4, 0x41980000    # 19.0f

    .line 758
    .line 759
    const/high16 v6, 0x40400000    # 3.0f

    .line 760
    .line 761
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const/high16 v4, 0x40a00000    # 5.0f

    .line 765
    .line 766
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const/high16 v25, 0x40400000    # 3.0f

    .line 770
    .line 771
    const/high16 v26, 0x40a00000    # 5.0f

    .line 772
    .line 773
    const v21, 0x4079999a    # 3.9f

    .line 774
    .line 775
    .line 776
    const/high16 v22, 0x40400000    # 3.0f

    .line 777
    .line 778
    const/high16 v23, 0x40400000    # 3.0f

    .line 779
    .line 780
    const v24, 0x4079999a    # 3.9f

    .line 781
    .line 782
    .line 783
    move-object/from16 v20, v2

    .line 784
    .line 785
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const/high16 v4, 0x41600000    # 14.0f

    .line 789
    .line 790
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    .line 793
    const/high16 v25, 0x40000000    # 2.0f

    .line 794
    .line 795
    const/high16 v26, 0x40000000    # 2.0f

    .line 796
    .line 797
    const/16 v21, 0x0

    .line 798
    .line 799
    const v22, 0x3f8ccccd    # 1.1f

    .line 800
    .line 801
    .line 802
    const v23, 0x3f666666    # 0.9f

    .line 803
    .line 804
    .line 805
    const/high16 v24, 0x40000000    # 2.0f

    .line 806
    .line 807
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const/high16 v26, -0x40000000    # -2.0f

    .line 814
    .line 815
    const v21, 0x3f8ccccd    # 1.1f

    .line 816
    .line 817
    .line 818
    const/16 v22, 0x0

    .line 819
    .line 820
    const/high16 v23, 0x40000000    # 2.0f

    .line 821
    .line 822
    const v24, -0x4099999a    # -0.9f

    .line 823
    .line 824
    .line 825
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const/high16 v4, 0x40a00000    # 5.0f

    .line 829
    .line 830
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const/high16 v25, 0x41980000    # 19.0f

    .line 834
    .line 835
    const/high16 v26, 0x40400000    # 3.0f

    .line 836
    .line 837
    const/high16 v21, 0x41a80000    # 21.0f

    .line 838
    .line 839
    const v22, 0x4079999a    # 3.9f

    .line 840
    .line 841
    .line 842
    const v23, 0x41a0cccd    # 20.1f

    .line 843
    .line 844
    .line 845
    const/high16 v24, 0x40400000    # 3.0f

    .line 846
    .line 847
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const/high16 v4, 0x41980000    # 19.0f

    .line 854
    .line 855
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    const/high16 v4, 0x40a00000    # 5.0f

    .line 859
    .line 860
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const/high16 v4, 0x41600000    # 14.0f

    .line 867
    .line 868
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 869
    .line 870
    .line 871
    const/high16 v4, 0x41980000    # 19.0f

    .line 872
    .line 873
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 880
    .line 881
    .line 882
    move-result-object v2

    .line 883
    const/high16 v6, 0x3f800000    # 1.0f

    .line 884
    .line 885
    const/4 v7, 0x0

    .line 886
    const-string v4, ""

    .line 887
    .line 888
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 889
    .line 890
    .line 891
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 892
    .line 893
    .line 894
    move-result v3

    .line 895
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 896
    .line 897
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 898
    .line 899
    .line 900
    move-result-wide v6

    .line 901
    const/4 v0, 0x0

    .line 902
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 903
    .line 904
    .line 905
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 906
    .line 907
    .line 908
    move-result v10

    .line 909
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 910
    .line 911
    .line 912
    move-result v11

    .line 913
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 914
    .line 915
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 916
    .line 917
    .line 918
    const/high16 v2, 0x41480000    # 12.5f

    .line 919
    .line 920
    const/high16 v4, 0x41380000    # 11.5f

    .line 921
    .line 922
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 926
    .line 927
    const/4 v4, 0x0

    .line 928
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 929
    .line 930
    .line 931
    const/high16 v2, -0x40400000    # -1.5f

    .line 932
    .line 933
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const/high16 v2, 0x3f800000    # 1.0f

    .line 937
    .line 938
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const/high16 v2, -0x40400000    # -1.5f

    .line 942
    .line 943
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 944
    .line 945
    .line 946
    const/high16 v2, -0x40800000    # -1.0f

    .line 947
    .line 948
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 952
    .line 953
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 954
    .line 955
    .line 956
    const/high16 v2, -0x40400000    # -1.5f

    .line 957
    .line 958
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 959
    .line 960
    .line 961
    const/high16 v2, 0x40400000    # 3.0f

    .line 962
    .line 963
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 964
    .line 965
    .line 966
    const/high16 v2, -0x40400000    # -1.5f

    .line 967
    .line 968
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 972
    .line 973
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 974
    .line 975
    .line 976
    const/high16 v2, -0x40400000    # -1.5f

    .line 977
    .line 978
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 979
    .line 980
    .line 981
    const/high16 v2, 0x40900000    # 4.5f

    .line 982
    .line 983
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 984
    .line 985
    .line 986
    const/high16 v2, 0x40400000    # 3.0f

    .line 987
    .line 988
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 989
    .line 990
    .line 991
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 992
    .line 993
    .line 994
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 995
    .line 996
    .line 997
    move-result-object v2

    .line 998
    const/high16 v6, 0x3f800000    # 1.0f

    .line 999
    .line 1000
    const/4 v7, 0x0

    .line 1001
    const-string v4, ""

    .line 1002
    .line 1003
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v0

    .line 1007
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v0

    .line 1011
    sput-object v0, Landroidx/compose/material/icons/twotone/_4mpKt;->__4mp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1012
    .line 1013
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1014
    .line 1015
    .line 1016
    return-object v0
.end method
