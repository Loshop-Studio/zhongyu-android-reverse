.class public final Landroidx/compose/material/icons/twotone/_12mpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __12mp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_12mp(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/_12mpKt;->__12mp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone._12mp"

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
    const/high16 v4, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41600000    # 14.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40a00000    # 5.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v4, 0x41980000    # 19.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v4, 0x41900000    # 18.0f

    .line 99
    .line 100
    const/high16 v6, 0x41580000    # 13.5f

    .line 101
    .line 102
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v4, 0x41800000    # 16.0f

    .line 106
    .line 107
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v25, -0x40800000    # -1.0f

    .line 111
    .line 112
    const/high16 v26, 0x3f800000    # 1.0f

    .line 113
    .line 114
    const/16 v21, 0x0

    .line 115
    .line 116
    const v22, 0x3f0ccccd    # 0.55f

    .line 117
    .line 118
    .line 119
    const v23, -0x4119999a    # -0.45f

    .line 120
    .line 121
    .line 122
    const/high16 v24, 0x3f800000    # 1.0f

    .line 123
    .line 124
    move-object/from16 v20, v2

    .line 125
    .line 126
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v4, -0x40000000    # -2.0f

    .line 130
    .line 131
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 135
    .line 136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, -0x40400000    # -1.5f

    .line 140
    .line 141
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v4, -0x3f400000    # -6.0f

    .line 145
    .line 146
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v4, 0x41880000    # 17.0f

    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v25, 0x41900000    # 18.0f

    .line 155
    .line 156
    const/high16 v26, 0x41580000    # 13.5f

    .line 157
    .line 158
    const v21, 0x418c6666    # 17.55f

    .line 159
    .line 160
    .line 161
    const/high16 v22, 0x41480000    # 12.5f

    .line 162
    .line 163
    const/high16 v23, 0x41900000    # 18.0f

    .line 164
    .line 165
    const v24, 0x414f3333    # 12.95f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v4, 0x41100000    # 9.0f

    .line 175
    .line 176
    const/high16 v6, 0x41400000    # 12.0f

    .line 177
    .line 178
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v25, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/high16 v26, -0x40800000    # -1.0f

    .line 184
    .line 185
    const/16 v21, 0x0

    .line 186
    .line 187
    const v22, -0x40f33333    # -0.55f

    .line 188
    .line 189
    .line 190
    const v23, 0x3ee66666    # 0.45f

    .line 191
    .line 192
    .line 193
    const/high16 v24, -0x40800000    # -1.0f

    .line 194
    .line 195
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v4, 0x40000000    # 2.0f

    .line 199
    .line 200
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v4, 0x40e00000    # 7.0f

    .line 204
    .line 205
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 209
    .line 210
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v4, 0x40b00000    # 5.5f

    .line 214
    .line 215
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v4, 0x40600000    # 3.5f

    .line 219
    .line 220
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v26, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const v21, 0x3f0ccccd    # 0.55f

    .line 226
    .line 227
    .line 228
    const/16 v22, 0x0

    .line 229
    .line 230
    const/high16 v23, 0x3f800000    # 1.0f

    .line 231
    .line 232
    const v24, 0x3ee66666    # 0.45f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v4, 0x41000000    # 8.0f

    .line 239
    .line 240
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v25, -0x40800000    # -1.0f

    .line 244
    .line 245
    const/16 v21, 0x0

    .line 246
    .line 247
    const v22, 0x3f0ccccd    # 0.55f

    .line 248
    .line 249
    .line 250
    const v23, -0x4119999a    # -0.45f

    .line 251
    .line 252
    .line 253
    const/high16 v24, 0x3f800000    # 1.0f

    .line 254
    .line 255
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v4, -0x40000000    # -2.0f

    .line 259
    .line 260
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v4, 0x3f800000    # 1.0f

    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v4, 0x40400000    # 3.0f

    .line 269
    .line 270
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 274
    .line 275
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v4, 0x41400000    # 12.0f

    .line 279
    .line 280
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v4, 0x41100000    # 9.0f

    .line 284
    .line 285
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v4, 0x40b00000    # 5.5f

    .line 292
    .line 293
    const/high16 v6, 0x40e00000    # 7.0f

    .line 294
    .line 295
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v4, 0x40400000    # 3.0f

    .line 299
    .line 300
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v4, 0x40c00000    # 6.0f

    .line 304
    .line 305
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v4, 0x41080000    # 8.5f

    .line 309
    .line 310
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v4, 0x40e00000    # 7.0f

    .line 314
    .line 315
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v4, 0x40b00000    # 5.5f

    .line 322
    .line 323
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v4, 0x40c00000    # 6.0f

    .line 330
    .line 331
    const/high16 v6, 0x41580000    # 13.5f

    .line 332
    .line 333
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v25, 0x3f800000    # 1.0f

    .line 337
    .line 338
    const/high16 v26, -0x40800000    # -1.0f

    .line 339
    .line 340
    const v22, -0x40f33333    # -0.55f

    .line 341
    .line 342
    .line 343
    const v23, 0x3ee66666    # 0.45f

    .line 344
    .line 345
    .line 346
    const/high16 v24, -0x40800000    # -1.0f

    .line 347
    .line 348
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v4, 0x40900000    # 4.5f

    .line 352
    .line 353
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v26, 0x3f800000    # 1.0f

    .line 357
    .line 358
    const v21, 0x3f0ccccd    # 0.55f

    .line 359
    .line 360
    .line 361
    const/16 v22, 0x0

    .line 362
    .line 363
    const/high16 v23, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const v24, 0x3ee66666    # 0.45f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v4, 0x40a00000    # 5.0f

    .line 372
    .line 373
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v4, 0x41300000    # 11.0f

    .line 377
    .line 378
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v4, 0x41600000    # 14.0f

    .line 382
    .line 383
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v4, -0x40800000    # -1.0f

    .line 387
    .line 388
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v4, 0x40400000    # 3.0f

    .line 392
    .line 393
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v4, 0x41080000    # 8.5f

    .line 397
    .line 398
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 402
    .line 403
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v4, -0x40800000    # -1.0f

    .line 407
    .line 408
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v4, 0x40900000    # 4.5f

    .line 412
    .line 413
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v4, 0x40c00000    # 6.0f

    .line 417
    .line 418
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v4, 0x41580000    # 13.5f

    .line 422
    .line 423
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    const/16 v16, 0x3800

    .line 434
    .line 435
    const/16 v17, 0x0

    .line 436
    .line 437
    const v6, 0x3e99999a    # 0.3f

    .line 438
    .line 439
    .line 440
    const v8, 0x3e99999a    # 0.3f

    .line 441
    .line 442
    .line 443
    const/4 v7, 0x0

    .line 444
    const/high16 v9, 0x3f800000    # 1.0f

    .line 445
    .line 446
    const/high16 v12, 0x3f800000    # 1.0f

    .line 447
    .line 448
    const/4 v13, 0x0

    .line 449
    const/4 v14, 0x0

    .line 450
    const/4 v15, 0x0

    .line 451
    const-string v4, ""

    .line 452
    .line 453
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 454
    .line 455
    .line 456
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 457
    .line 458
    .line 459
    move-result v3

    .line 460
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 461
    .line 462
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 463
    .line 464
    .line 465
    move-result-wide v6

    .line 466
    const/4 v2, 0x0

    .line 467
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 471
    .line 472
    .line 473
    move-result v10

    .line 474
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 475
    .line 476
    .line 477
    move-result v11

    .line 478
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 481
    .line 482
    .line 483
    const/high16 v4, 0x41700000    # 15.0f

    .line 484
    .line 485
    const/high16 v6, 0x41600000    # 14.0f

    .line 486
    .line 487
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 491
    .line 492
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v4, -0x40400000    # -1.5f

    .line 499
    .line 500
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    const v6, 0x3e99999a    # 0.3f

    .line 511
    .line 512
    .line 513
    const/4 v7, 0x0

    .line 514
    const-string v4, ""

    .line 515
    .line 516
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 517
    .line 518
    .line 519
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 520
    .line 521
    .line 522
    move-result v3

    .line 523
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 524
    .line 525
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 526
    .line 527
    .line 528
    move-result-wide v6

    .line 529
    const/4 v2, 0x0

    .line 530
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 534
    .line 535
    .line 536
    move-result v10

    .line 537
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 538
    .line 539
    .line 540
    move-result v11

    .line 541
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 544
    .line 545
    .line 546
    const/high16 v4, 0x40f00000    # 7.5f

    .line 547
    .line 548
    const/high16 v6, 0x41600000    # 14.0f

    .line 549
    .line 550
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v4, 0x3f800000    # 1.0f

    .line 554
    .line 555
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v4, 0x40400000    # 3.0f

    .line 559
    .line 560
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v4, 0x41200000    # 10.0f

    .line 564
    .line 565
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 569
    .line 570
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v4, 0x3f800000    # 1.0f

    .line 574
    .line 575
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v4, 0x40900000    # 4.5f

    .line 579
    .line 580
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 584
    .line 585
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v4, -0x3f600000    # -5.0f

    .line 589
    .line 590
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v25, -0x40800000    # -1.0f

    .line 594
    .line 595
    const/high16 v26, -0x40800000    # -1.0f

    .line 596
    .line 597
    const/16 v21, 0x0

    .line 598
    .line 599
    const v22, -0x40f33333    # -0.55f

    .line 600
    .line 601
    .line 602
    const v23, -0x4119999a    # -0.45f

    .line 603
    .line 604
    .line 605
    const/high16 v24, -0x40800000    # -1.0f

    .line 606
    .line 607
    move-object/from16 v20, v2

    .line 608
    .line 609
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const/high16 v4, 0x40e00000    # 7.0f

    .line 613
    .line 614
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v26, 0x3f800000    # 1.0f

    .line 618
    .line 619
    const v21, -0x40f33333    # -0.55f

    .line 620
    .line 621
    .line 622
    const/16 v22, 0x0

    .line 623
    .line 624
    const/high16 v23, -0x40800000    # -1.0f

    .line 625
    .line 626
    const v24, 0x3ee66666    # 0.45f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/high16 v4, 0x40a00000    # 5.0f

    .line 633
    .line 634
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 638
    .line 639
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v4, 0x41600000    # 14.0f

    .line 643
    .line 644
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 651
    .line 652
    .line 653
    move-result-object v2

    .line 654
    const/high16 v6, 0x3f800000    # 1.0f

    .line 655
    .line 656
    const/high16 v8, 0x3f800000    # 1.0f

    .line 657
    .line 658
    const/4 v7, 0x0

    .line 659
    const-string v4, ""

    .line 660
    .line 661
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 662
    .line 663
    .line 664
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 665
    .line 666
    .line 667
    move-result v3

    .line 668
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 669
    .line 670
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 671
    .line 672
    .line 673
    move-result-wide v6

    .line 674
    const/4 v2, 0x0

    .line 675
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 679
    .line 680
    .line 681
    move-result v10

    .line 682
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 683
    .line 684
    .line 685
    move-result v11

    .line 686
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 689
    .line 690
    .line 691
    const/high16 v4, 0x41940000    # 18.5f

    .line 692
    .line 693
    const/high16 v6, 0x41580000    # 13.5f

    .line 694
    .line 695
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const/high16 v4, 0x41700000    # 15.0f

    .line 699
    .line 700
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const/high16 v4, 0x41880000    # 17.0f

    .line 704
    .line 705
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const/high16 v4, 0x40000000    # 2.0f

    .line 709
    .line 710
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const/high16 v25, 0x3f800000    # 1.0f

    .line 714
    .line 715
    const/high16 v26, -0x40800000    # -1.0f

    .line 716
    .line 717
    const v21, 0x3f0ccccd    # 0.55f

    .line 718
    .line 719
    .line 720
    const/high16 v23, 0x3f800000    # 1.0f

    .line 721
    .line 722
    const v24, -0x4119999a    # -0.45f

    .line 723
    .line 724
    .line 725
    move-object/from16 v20, v2

    .line 726
    .line 727
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 731
    .line 732
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const/high16 v25, -0x40800000    # -1.0f

    .line 736
    .line 737
    const/16 v21, 0x0

    .line 738
    .line 739
    const v22, -0x40f33333    # -0.55f

    .line 740
    .line 741
    .line 742
    const v23, -0x4119999a    # -0.45f

    .line 743
    .line 744
    .line 745
    const/high16 v24, -0x40800000    # -1.0f

    .line 746
    .line 747
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const/high16 v4, -0x3fa00000    # -3.5f

    .line 751
    .line 752
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const/high16 v4, 0x41940000    # 18.5f

    .line 756
    .line 757
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v4, 0x41700000    # 15.0f

    .line 764
    .line 765
    const/high16 v6, 0x41600000    # 14.0f

    .line 766
    .line 767
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 771
    .line 772
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const/high16 v4, 0x41700000    # 15.0f

    .line 779
    .line 780
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const/high16 v4, 0x41600000    # 14.0f

    .line 784
    .line 785
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 792
    .line 793
    .line 794
    move-result-object v2

    .line 795
    const/high16 v6, 0x3f800000    # 1.0f

    .line 796
    .line 797
    const/4 v7, 0x0

    .line 798
    const-string v4, ""

    .line 799
    .line 800
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 801
    .line 802
    .line 803
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 804
    .line 805
    .line 806
    move-result v3

    .line 807
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 808
    .line 809
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 810
    .line 811
    .line 812
    move-result-wide v6

    .line 813
    const/4 v2, 0x0

    .line 814
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 815
    .line 816
    .line 817
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 818
    .line 819
    .line 820
    move-result v10

    .line 821
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 822
    .line 823
    .line 824
    move-result v11

    .line 825
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 828
    .line 829
    .line 830
    const/high16 v4, 0x40400000    # 3.0f

    .line 831
    .line 832
    const/high16 v6, 0x41980000    # 19.0f

    .line 833
    .line 834
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    .line 837
    const/high16 v4, 0x40a00000    # 5.0f

    .line 838
    .line 839
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const/high16 v25, 0x40400000    # 3.0f

    .line 843
    .line 844
    const/high16 v26, 0x40a00000    # 5.0f

    .line 845
    .line 846
    const v21, 0x4079999a    # 3.9f

    .line 847
    .line 848
    .line 849
    const/high16 v22, 0x40400000    # 3.0f

    .line 850
    .line 851
    const/high16 v23, 0x40400000    # 3.0f

    .line 852
    .line 853
    const v24, 0x4079999a    # 3.9f

    .line 854
    .line 855
    .line 856
    move-object/from16 v20, v2

    .line 857
    .line 858
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    const/high16 v4, 0x41600000    # 14.0f

    .line 862
    .line 863
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const/high16 v25, 0x40000000    # 2.0f

    .line 867
    .line 868
    const/high16 v26, 0x40000000    # 2.0f

    .line 869
    .line 870
    const/16 v21, 0x0

    .line 871
    .line 872
    const v22, 0x3f8ccccd    # 1.1f

    .line 873
    .line 874
    .line 875
    const v23, 0x3f666666    # 0.9f

    .line 876
    .line 877
    .line 878
    const/high16 v24, 0x40000000    # 2.0f

    .line 879
    .line 880
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    const/high16 v26, -0x40000000    # -2.0f

    .line 887
    .line 888
    const v21, 0x3f8ccccd    # 1.1f

    .line 889
    .line 890
    .line 891
    const/16 v22, 0x0

    .line 892
    .line 893
    const/high16 v23, 0x40000000    # 2.0f

    .line 894
    .line 895
    const v24, -0x4099999a    # -0.9f

    .line 896
    .line 897
    .line 898
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 899
    .line 900
    .line 901
    const/high16 v4, 0x40a00000    # 5.0f

    .line 902
    .line 903
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const/high16 v25, 0x41980000    # 19.0f

    .line 907
    .line 908
    const/high16 v26, 0x40400000    # 3.0f

    .line 909
    .line 910
    const/high16 v21, 0x41a80000    # 21.0f

    .line 911
    .line 912
    const v22, 0x4079999a    # 3.9f

    .line 913
    .line 914
    .line 915
    const v23, 0x41a0cccd    # 20.1f

    .line 916
    .line 917
    .line 918
    const/high16 v24, 0x40400000    # 3.0f

    .line 919
    .line 920
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    .line 923
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 924
    .line 925
    .line 926
    const/high16 v4, 0x41980000    # 19.0f

    .line 927
    .line 928
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 929
    .line 930
    .line 931
    const/high16 v4, 0x40a00000    # 5.0f

    .line 932
    .line 933
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 937
    .line 938
    .line 939
    const/high16 v4, 0x41600000    # 14.0f

    .line 940
    .line 941
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const/high16 v4, 0x41980000    # 19.0f

    .line 945
    .line 946
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 947
    .line 948
    .line 949
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 950
    .line 951
    .line 952
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 953
    .line 954
    .line 955
    move-result-object v2

    .line 956
    const/high16 v6, 0x3f800000    # 1.0f

    .line 957
    .line 958
    const/4 v7, 0x0

    .line 959
    const-string v4, ""

    .line 960
    .line 961
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 962
    .line 963
    .line 964
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 965
    .line 966
    .line 967
    move-result v3

    .line 968
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 969
    .line 970
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 971
    .line 972
    .line 973
    move-result-wide v6

    .line 974
    const/4 v2, 0x0

    .line 975
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 976
    .line 977
    .line 978
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 979
    .line 980
    .line 981
    move-result v10

    .line 982
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 983
    .line 984
    .line 985
    move-result v11

    .line 986
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 987
    .line 988
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 989
    .line 990
    .line 991
    const/high16 v4, 0x41380000    # 11.5f

    .line 992
    .line 993
    const/high16 v6, 0x41080000    # 8.5f

    .line 994
    .line 995
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    const/4 v4, 0x0

    .line 999
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 1000
    .line 1001
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1002
    .line 1003
    .line 1004
    const/high16 v4, -0x3f400000    # -6.0f

    .line 1005
    .line 1006
    const/4 v6, 0x0

    .line 1007
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1008
    .line 1009
    .line 1010
    const/4 v4, 0x0

    .line 1011
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 1012
    .line 1013
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1014
    .line 1015
    .line 1016
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 1017
    .line 1018
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v2

    .line 1031
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1032
    .line 1033
    const/4 v7, 0x0

    .line 1034
    const-string v4, ""

    .line 1035
    .line 1036
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1037
    .line 1038
    .line 1039
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1040
    .line 1041
    .line 1042
    move-result v3

    .line 1043
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1044
    .line 1045
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1046
    .line 1047
    .line 1048
    move-result-wide v6

    .line 1049
    const/4 v0, 0x0

    .line 1050
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1054
    .line 1055
    .line 1056
    move-result v10

    .line 1057
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1058
    .line 1059
    .line 1060
    move-result v11

    .line 1061
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1062
    .line 1063
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1064
    .line 1065
    .line 1066
    const/high16 v0, 0x41840000    # 16.5f

    .line 1067
    .line 1068
    const/high16 v2, 0x41200000    # 10.0f

    .line 1069
    .line 1070
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1071
    .line 1072
    .line 1073
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 1074
    .line 1075
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1076
    .line 1077
    .line 1078
    const/high16 v0, 0x41100000    # 9.0f

    .line 1079
    .line 1080
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1081
    .line 1082
    .line 1083
    const/high16 v0, 0x40000000    # 2.0f

    .line 1084
    .line 1085
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1086
    .line 1087
    .line 1088
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1089
    .line 1090
    const/high16 v18, -0x40800000    # -1.0f

    .line 1091
    .line 1092
    const v13, 0x3f0ccccd    # 0.55f

    .line 1093
    .line 1094
    .line 1095
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1096
    .line 1097
    const v16, -0x4119999a    # -0.45f

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1101
    .line 1102
    .line 1103
    const/high16 v0, 0x40d00000    # 6.5f

    .line 1104
    .line 1105
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1106
    .line 1107
    .line 1108
    const/high16 v17, -0x40800000    # -1.0f

    .line 1109
    .line 1110
    const/4 v13, 0x0

    .line 1111
    const v14, -0x40f33333    # -0.55f

    .line 1112
    .line 1113
    .line 1114
    const v15, -0x4119999a    # -0.45f

    .line 1115
    .line 1116
    .line 1117
    const/high16 v16, -0x40800000    # -1.0f

    .line 1118
    .line 1119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1120
    .line 1121
    .line 1122
    const/high16 v0, 0x41400000    # 12.0f

    .line 1123
    .line 1124
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1125
    .line 1126
    .line 1127
    const/high16 v0, 0x40e00000    # 7.0f

    .line 1128
    .line 1129
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1130
    .line 1131
    .line 1132
    const/high16 v0, 0x40400000    # 3.0f

    .line 1133
    .line 1134
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1135
    .line 1136
    .line 1137
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1138
    .line 1139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1140
    .line 1141
    .line 1142
    const/high16 v0, -0x40000000    # -2.0f

    .line 1143
    .line 1144
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1145
    .line 1146
    .line 1147
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1148
    .line 1149
    const v13, -0x40f33333    # -0.55f

    .line 1150
    .line 1151
    .line 1152
    const/4 v14, 0x0

    .line 1153
    const/high16 v15, -0x40800000    # -1.0f

    .line 1154
    .line 1155
    const v16, 0x3ee66666    # 0.45f

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1159
    .line 1160
    .line 1161
    const/high16 v0, 0x40200000    # 2.5f

    .line 1162
    .line 1163
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1164
    .line 1165
    .line 1166
    const/high16 v0, 0x40900000    # 4.5f

    .line 1167
    .line 1168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1169
    .line 1170
    .line 1171
    const/high16 v0, 0x41200000    # 10.0f

    .line 1172
    .line 1173
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1174
    .line 1175
    .line 1176
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v2

    .line 1183
    const/16 v16, 0x3800

    .line 1184
    .line 1185
    const/16 v17, 0x0

    .line 1186
    .line 1187
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1188
    .line 1189
    const/4 v7, 0x0

    .line 1190
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1191
    .line 1192
    const/4 v13, 0x0

    .line 1193
    const/4 v15, 0x0

    .line 1194
    const-string v4, ""

    .line 1195
    .line 1196
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v0

    .line 1200
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v0

    .line 1204
    sput-object v0, Landroidx/compose/material/icons/twotone/_12mpKt;->__12mp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1205
    .line 1206
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1207
    .line 1208
    .line 1209
    return-object v0
.end method
