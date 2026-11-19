.class public final Landroidx/compose/material/icons/twotone/_15mpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __15mp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_15mp(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/_15mpKt;->__15mp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone._15mp"

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
    const/high16 v4, 0x41200000    # 10.0f

    .line 175
    .line 176
    const/high16 v6, 0x41400000    # 12.0f

    .line 177
    .line 178
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x40400000    # 3.0f

    .line 182
    .line 183
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v4, 0x41100000    # 9.0f

    .line 187
    .line 188
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 192
    .line 193
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v4, 0x40b00000    # 5.5f

    .line 197
    .line 198
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v4, 0x40900000    # 4.5f

    .line 202
    .line 203
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v4, 0x40e00000    # 7.0f

    .line 207
    .line 208
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 212
    .line 213
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v4, 0x3f800000    # 1.0f

    .line 217
    .line 218
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v4, 0x40000000    # 2.0f

    .line 222
    .line 223
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v25, 0x3f800000    # 1.0f

    .line 227
    .line 228
    const/high16 v26, 0x3f800000    # 1.0f

    .line 229
    .line 230
    const v21, 0x3f0ccccd    # 0.55f

    .line 231
    .line 232
    .line 233
    const/16 v22, 0x0

    .line 234
    .line 235
    const/high16 v23, 0x3f800000    # 1.0f

    .line 236
    .line 237
    const v24, 0x3ee66666    # 0.45f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 244
    .line 245
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v25, -0x40800000    # -1.0f

    .line 249
    .line 250
    const/16 v21, 0x0

    .line 251
    .line 252
    const v22, 0x3f0ccccd    # 0.55f

    .line 253
    .line 254
    .line 255
    const v23, -0x4119999a    # -0.45f

    .line 256
    .line 257
    .line 258
    const/high16 v24, 0x3f800000    # 1.0f

    .line 259
    .line 260
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v4, 0x41400000    # 12.0f

    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v4, 0x41200000    # 10.0f

    .line 269
    .line 270
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v4, 0x40b00000    # 5.5f

    .line 277
    .line 278
    const/high16 v6, 0x40e00000    # 7.0f

    .line 279
    .line 280
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v4, 0x40400000    # 3.0f

    .line 284
    .line 285
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v4, 0x40c00000    # 6.0f

    .line 289
    .line 290
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v4, 0x41080000    # 8.5f

    .line 294
    .line 295
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v4, 0x40e00000    # 7.0f

    .line 299
    .line 300
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v4, 0x40b00000    # 5.5f

    .line 307
    .line 308
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v4, 0x40c00000    # 6.0f

    .line 315
    .line 316
    const/high16 v6, 0x41580000    # 13.5f

    .line 317
    .line 318
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v25, 0x3f800000    # 1.0f

    .line 322
    .line 323
    const/high16 v26, -0x40800000    # -1.0f

    .line 324
    .line 325
    const v22, -0x40f33333    # -0.55f

    .line 326
    .line 327
    .line 328
    const v23, 0x3ee66666    # 0.45f

    .line 329
    .line 330
    .line 331
    const/high16 v24, -0x40800000    # -1.0f

    .line 332
    .line 333
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v4, 0x40900000    # 4.5f

    .line 337
    .line 338
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v26, 0x3f800000    # 1.0f

    .line 342
    .line 343
    const v21, 0x3f0ccccd    # 0.55f

    .line 344
    .line 345
    .line 346
    const/16 v22, 0x0

    .line 347
    .line 348
    const/high16 v23, 0x3f800000    # 1.0f

    .line 349
    .line 350
    const v24, 0x3ee66666    # 0.45f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v4, 0x40a00000    # 5.0f

    .line 357
    .line 358
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v4, 0x41300000    # 11.0f

    .line 362
    .line 363
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v4, 0x41600000    # 14.0f

    .line 367
    .line 368
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v4, -0x40800000    # -1.0f

    .line 372
    .line 373
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v4, 0x40400000    # 3.0f

    .line 377
    .line 378
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v4, 0x41080000    # 8.5f

    .line 382
    .line 383
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 387
    .line 388
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v4, -0x40800000    # -1.0f

    .line 392
    .line 393
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v4, 0x40900000    # 4.5f

    .line 397
    .line 398
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v4, 0x40c00000    # 6.0f

    .line 402
    .line 403
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v4, 0x41580000    # 13.5f

    .line 407
    .line 408
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    const/16 v16, 0x3800

    .line 419
    .line 420
    const/16 v17, 0x0

    .line 421
    .line 422
    const v6, 0x3e99999a    # 0.3f

    .line 423
    .line 424
    .line 425
    const v8, 0x3e99999a    # 0.3f

    .line 426
    .line 427
    .line 428
    const/4 v7, 0x0

    .line 429
    const/high16 v9, 0x3f800000    # 1.0f

    .line 430
    .line 431
    const/high16 v12, 0x3f800000    # 1.0f

    .line 432
    .line 433
    const/4 v13, 0x0

    .line 434
    const/4 v14, 0x0

    .line 435
    const/4 v15, 0x0

    .line 436
    const-string v4, ""

    .line 437
    .line 438
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 439
    .line 440
    .line 441
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 442
    .line 443
    .line 444
    move-result v3

    .line 445
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 446
    .line 447
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 448
    .line 449
    .line 450
    move-result-wide v6

    .line 451
    const/4 v2, 0x0

    .line 452
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 456
    .line 457
    .line 458
    move-result v10

    .line 459
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 460
    .line 461
    .line 462
    move-result v11

    .line 463
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 466
    .line 467
    .line 468
    const/high16 v4, 0x41700000    # 15.0f

    .line 469
    .line 470
    const/high16 v6, 0x41600000    # 14.0f

    .line 471
    .line 472
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 476
    .line 477
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v4, -0x40400000    # -1.5f

    .line 484
    .line 485
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    const v6, 0x3e99999a    # 0.3f

    .line 496
    .line 497
    .line 498
    const/4 v7, 0x0

    .line 499
    const-string v4, ""

    .line 500
    .line 501
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 502
    .line 503
    .line 504
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 505
    .line 506
    .line 507
    move-result v3

    .line 508
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 509
    .line 510
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 511
    .line 512
    .line 513
    move-result-wide v6

    .line 514
    const/4 v2, 0x0

    .line 515
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 519
    .line 520
    .line 521
    move-result v10

    .line 522
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 523
    .line 524
    .line 525
    move-result v11

    .line 526
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 529
    .line 530
    .line 531
    const/high16 v4, 0x40f00000    # 7.5f

    .line 532
    .line 533
    const/high16 v6, 0x41600000    # 14.0f

    .line 534
    .line 535
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v4, 0x3f800000    # 1.0f

    .line 539
    .line 540
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v4, 0x40400000    # 3.0f

    .line 544
    .line 545
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v4, 0x41200000    # 10.0f

    .line 549
    .line 550
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 554
    .line 555
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v4, 0x3f800000    # 1.0f

    .line 559
    .line 560
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v4, 0x40900000    # 4.5f

    .line 564
    .line 565
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 569
    .line 570
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v4, -0x3f600000    # -5.0f

    .line 574
    .line 575
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v25, -0x40800000    # -1.0f

    .line 579
    .line 580
    const/high16 v26, -0x40800000    # -1.0f

    .line 581
    .line 582
    const/16 v21, 0x0

    .line 583
    .line 584
    const v22, -0x40f33333    # -0.55f

    .line 585
    .line 586
    .line 587
    const v23, -0x4119999a    # -0.45f

    .line 588
    .line 589
    .line 590
    const/high16 v24, -0x40800000    # -1.0f

    .line 591
    .line 592
    move-object/from16 v20, v2

    .line 593
    .line 594
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v4, 0x40e00000    # 7.0f

    .line 598
    .line 599
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v26, 0x3f800000    # 1.0f

    .line 603
    .line 604
    const v21, -0x40f33333    # -0.55f

    .line 605
    .line 606
    .line 607
    const/16 v22, 0x0

    .line 608
    .line 609
    const/high16 v23, -0x40800000    # -1.0f

    .line 610
    .line 611
    const v24, 0x3ee66666    # 0.45f

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v4, 0x40a00000    # 5.0f

    .line 618
    .line 619
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 623
    .line 624
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const/high16 v4, 0x41600000    # 14.0f

    .line 628
    .line 629
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 636
    .line 637
    .line 638
    move-result-object v2

    .line 639
    const/high16 v6, 0x3f800000    # 1.0f

    .line 640
    .line 641
    const/high16 v8, 0x3f800000    # 1.0f

    .line 642
    .line 643
    const/4 v7, 0x0

    .line 644
    const-string v4, ""

    .line 645
    .line 646
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 647
    .line 648
    .line 649
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 650
    .line 651
    .line 652
    move-result v3

    .line 653
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 654
    .line 655
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 656
    .line 657
    .line 658
    move-result-wide v6

    .line 659
    const/4 v2, 0x0

    .line 660
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 661
    .line 662
    .line 663
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 664
    .line 665
    .line 666
    move-result v10

    .line 667
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 668
    .line 669
    .line 670
    move-result v11

    .line 671
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 674
    .line 675
    .line 676
    const/high16 v4, 0x41940000    # 18.5f

    .line 677
    .line 678
    const/high16 v6, 0x41580000    # 13.5f

    .line 679
    .line 680
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/high16 v4, 0x41700000    # 15.0f

    .line 684
    .line 685
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/high16 v4, 0x41880000    # 17.0f

    .line 689
    .line 690
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const/high16 v4, 0x40000000    # 2.0f

    .line 694
    .line 695
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const/high16 v25, 0x3f800000    # 1.0f

    .line 699
    .line 700
    const/high16 v26, -0x40800000    # -1.0f

    .line 701
    .line 702
    const v21, 0x3f0ccccd    # 0.55f

    .line 703
    .line 704
    .line 705
    const/high16 v23, 0x3f800000    # 1.0f

    .line 706
    .line 707
    const v24, -0x4119999a    # -0.45f

    .line 708
    .line 709
    .line 710
    move-object/from16 v20, v2

    .line 711
    .line 712
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 716
    .line 717
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const/high16 v25, -0x40800000    # -1.0f

    .line 721
    .line 722
    const/16 v21, 0x0

    .line 723
    .line 724
    const v22, -0x40f33333    # -0.55f

    .line 725
    .line 726
    .line 727
    const v23, -0x4119999a    # -0.45f

    .line 728
    .line 729
    .line 730
    const/high16 v24, -0x40800000    # -1.0f

    .line 731
    .line 732
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const/high16 v4, -0x3fa00000    # -3.5f

    .line 736
    .line 737
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v4, 0x41940000    # 18.5f

    .line 741
    .line 742
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/high16 v4, 0x41700000    # 15.0f

    .line 749
    .line 750
    const/high16 v6, 0x41600000    # 14.0f

    .line 751
    .line 752
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 756
    .line 757
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v4, 0x41700000    # 15.0f

    .line 764
    .line 765
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const/high16 v4, 0x41600000    # 14.0f

    .line 769
    .line 770
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 777
    .line 778
    .line 779
    move-result-object v2

    .line 780
    const/high16 v6, 0x3f800000    # 1.0f

    .line 781
    .line 782
    const/4 v7, 0x0

    .line 783
    const-string v4, ""

    .line 784
    .line 785
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 786
    .line 787
    .line 788
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 789
    .line 790
    .line 791
    move-result v3

    .line 792
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 793
    .line 794
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 795
    .line 796
    .line 797
    move-result-wide v6

    .line 798
    const/4 v2, 0x0

    .line 799
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 800
    .line 801
    .line 802
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 803
    .line 804
    .line 805
    move-result v10

    .line 806
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 807
    .line 808
    .line 809
    move-result v11

    .line 810
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 813
    .line 814
    .line 815
    const/high16 v4, 0x41980000    # 19.0f

    .line 816
    .line 817
    const/high16 v6, 0x40400000    # 3.0f

    .line 818
    .line 819
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const/high16 v4, 0x40a00000    # 5.0f

    .line 823
    .line 824
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const/high16 v25, 0x40400000    # 3.0f

    .line 828
    .line 829
    const/high16 v26, 0x40a00000    # 5.0f

    .line 830
    .line 831
    const v21, 0x4079999a    # 3.9f

    .line 832
    .line 833
    .line 834
    const/high16 v22, 0x40400000    # 3.0f

    .line 835
    .line 836
    const/high16 v23, 0x40400000    # 3.0f

    .line 837
    .line 838
    const v24, 0x4079999a    # 3.9f

    .line 839
    .line 840
    .line 841
    move-object/from16 v20, v2

    .line 842
    .line 843
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const/high16 v4, 0x41600000    # 14.0f

    .line 847
    .line 848
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const/high16 v25, 0x40000000    # 2.0f

    .line 852
    .line 853
    const/high16 v26, 0x40000000    # 2.0f

    .line 854
    .line 855
    const/16 v21, 0x0

    .line 856
    .line 857
    const v22, 0x3f8ccccd    # 1.1f

    .line 858
    .line 859
    .line 860
    const v23, 0x3f666666    # 0.9f

    .line 861
    .line 862
    .line 863
    const/high16 v24, 0x40000000    # 2.0f

    .line 864
    .line 865
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 866
    .line 867
    .line 868
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 869
    .line 870
    .line 871
    const/high16 v26, -0x40000000    # -2.0f

    .line 872
    .line 873
    const v21, 0x3f8ccccd    # 1.1f

    .line 874
    .line 875
    .line 876
    const/16 v22, 0x0

    .line 877
    .line 878
    const/high16 v23, 0x40000000    # 2.0f

    .line 879
    .line 880
    const v24, -0x4099999a    # -0.9f

    .line 881
    .line 882
    .line 883
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    const/high16 v4, 0x40a00000    # 5.0f

    .line 887
    .line 888
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const/high16 v25, 0x41980000    # 19.0f

    .line 892
    .line 893
    const/high16 v26, 0x40400000    # 3.0f

    .line 894
    .line 895
    const/high16 v21, 0x41a80000    # 21.0f

    .line 896
    .line 897
    const v22, 0x4079999a    # 3.9f

    .line 898
    .line 899
    .line 900
    const v23, 0x41a0cccd    # 20.1f

    .line 901
    .line 902
    .line 903
    const/high16 v24, 0x40400000    # 3.0f

    .line 904
    .line 905
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const/high16 v4, 0x41980000    # 19.0f

    .line 912
    .line 913
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 914
    .line 915
    .line 916
    const/high16 v4, 0x40a00000    # 5.0f

    .line 917
    .line 918
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    const/high16 v4, 0x41600000    # 14.0f

    .line 925
    .line 926
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    const/high16 v4, 0x41980000    # 19.0f

    .line 930
    .line 931
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 932
    .line 933
    .line 934
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 938
    .line 939
    .line 940
    move-result-object v2

    .line 941
    const/high16 v6, 0x3f800000    # 1.0f

    .line 942
    .line 943
    const/4 v7, 0x0

    .line 944
    const-string v4, ""

    .line 945
    .line 946
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 947
    .line 948
    .line 949
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 950
    .line 951
    .line 952
    move-result v3

    .line 953
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 954
    .line 955
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 956
    .line 957
    .line 958
    move-result-wide v6

    .line 959
    const/4 v2, 0x0

    .line 960
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 961
    .line 962
    .line 963
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 964
    .line 965
    .line 966
    move-result v10

    .line 967
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 968
    .line 969
    .line 970
    move-result v11

    .line 971
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 972
    .line 973
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 974
    .line 975
    .line 976
    const/high16 v4, 0x41380000    # 11.5f

    .line 977
    .line 978
    const/high16 v6, 0x41080000    # 8.5f

    .line 979
    .line 980
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 981
    .line 982
    .line 983
    const/4 v4, 0x0

    .line 984
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 985
    .line 986
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 987
    .line 988
    .line 989
    const/high16 v4, -0x3f400000    # -6.0f

    .line 990
    .line 991
    const/4 v6, 0x0

    .line 992
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 993
    .line 994
    .line 995
    const/4 v4, 0x0

    .line 996
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 997
    .line 998
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 999
    .line 1000
    .line 1001
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 1002
    .line 1003
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v2

    .line 1016
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1017
    .line 1018
    const/4 v7, 0x0

    .line 1019
    const-string v4, ""

    .line 1020
    .line 1021
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1022
    .line 1023
    .line 1024
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1025
    .line 1026
    .line 1027
    move-result v3

    .line 1028
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1029
    .line 1030
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1031
    .line 1032
    .line 1033
    move-result-wide v6

    .line 1034
    const/4 v0, 0x0

    .line 1035
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1039
    .line 1040
    .line 1041
    move-result v10

    .line 1042
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1043
    .line 1044
    .line 1045
    move-result v11

    .line 1046
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1047
    .line 1048
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1049
    .line 1050
    .line 1051
    const/high16 v0, 0x41840000    # 16.5f

    .line 1052
    .line 1053
    const/high16 v2, 0x41280000    # 10.5f

    .line 1054
    .line 1055
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1056
    .line 1057
    .line 1058
    const/high16 v0, 0x41100000    # 9.0f

    .line 1059
    .line 1060
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1061
    .line 1062
    .line 1063
    const/high16 v17, -0x40800000    # -1.0f

    .line 1064
    .line 1065
    const/high16 v18, -0x40800000    # -1.0f

    .line 1066
    .line 1067
    const v14, -0x40f33333    # -0.55f

    .line 1068
    .line 1069
    .line 1070
    const v15, -0x4119999a    # -0.45f

    .line 1071
    .line 1072
    .line 1073
    const/high16 v16, -0x40800000    # -1.0f

    .line 1074
    .line 1075
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1076
    .line 1077
    .line 1078
    const/high16 v0, -0x40000000    # -2.0f

    .line 1079
    .line 1080
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1081
    .line 1082
    .line 1083
    const/high16 v0, 0x40e00000    # 7.0f

    .line 1084
    .line 1085
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1086
    .line 1087
    .line 1088
    const/high16 v0, 0x40400000    # 3.0f

    .line 1089
    .line 1090
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1091
    .line 1092
    .line 1093
    const/high16 v0, 0x40b00000    # 5.5f

    .line 1094
    .line 1095
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1096
    .line 1097
    .line 1098
    const/high16 v0, 0x41400000    # 12.0f

    .line 1099
    .line 1100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1101
    .line 1102
    .line 1103
    const/high16 v0, 0x41100000    # 9.0f

    .line 1104
    .line 1105
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1106
    .line 1107
    .line 1108
    const/high16 v0, 0x40400000    # 3.0f

    .line 1109
    .line 1110
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1111
    .line 1112
    .line 1113
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1114
    .line 1115
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1116
    .line 1117
    .line 1118
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 1119
    .line 1120
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1121
    .line 1122
    .line 1123
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 1124
    .line 1125
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1126
    .line 1127
    .line 1128
    const/high16 v0, 0x40600000    # 3.5f

    .line 1129
    .line 1130
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1131
    .line 1132
    .line 1133
    const/high16 v17, 0x41840000    # 16.5f

    .line 1134
    .line 1135
    const/high16 v18, 0x41280000    # 10.5f

    .line 1136
    .line 1137
    const v13, 0x41806666    # 16.05f

    .line 1138
    .line 1139
    .line 1140
    const/high16 v14, 0x41380000    # 11.5f

    .line 1141
    .line 1142
    const/high16 v15, 0x41840000    # 16.5f

    .line 1143
    .line 1144
    const v16, 0x4130cccd    # 11.05f

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v2

    .line 1157
    const/16 v16, 0x3800

    .line 1158
    .line 1159
    const/16 v17, 0x0

    .line 1160
    .line 1161
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1162
    .line 1163
    const/4 v7, 0x0

    .line 1164
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1165
    .line 1166
    const/4 v13, 0x0

    .line 1167
    const/4 v14, 0x0

    .line 1168
    const/4 v15, 0x0

    .line 1169
    const-string v4, ""

    .line 1170
    .line 1171
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v0

    .line 1175
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v0

    .line 1179
    sput-object v0, Landroidx/compose/material/icons/twotone/_15mpKt;->__15mp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1180
    .line 1181
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1182
    .line 1183
    .line 1184
    return-object v0
.end method
