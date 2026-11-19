.class public final Landroidx/compose/material/icons/rounded/TaskKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _task:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTask(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TaskKt;->_task:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Task"

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
    const v0, 0x419b47ae    # 19.41f

    .line 71
    .line 72
    .line 73
    const v2, 0x40ed1eb8    # 7.41f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3f6570a4    # -4.83f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v17, 0x4152b852    # 13.17f

    .line 86
    .line 87
    .line 88
    const/high16 v18, 0x40000000    # 2.0f

    .line 89
    .line 90
    const v13, 0x41635c29    # 14.21f

    .line 91
    .line 92
    .line 93
    const v14, 0x400d70a4    # 2.21f

    .line 94
    .line 95
    .line 96
    const v15, 0x415b3333    # 13.7f

    .line 97
    .line 98
    .line 99
    const/high16 v16, 0x40000000    # 2.0f

    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, 0x40c00000    # 6.0f

    .line 105
    .line 106
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v17, 0x408051ec    # 4.01f

    .line 110
    .line 111
    .line 112
    const/high16 v18, 0x40800000    # 4.0f

    .line 113
    .line 114
    const v13, 0x409ccccd    # 4.9f

    .line 115
    .line 116
    .line 117
    const/high16 v14, 0x40000000    # 2.0f

    .line 118
    .line 119
    const v15, 0x408051ec    # 4.01f

    .line 120
    .line 121
    .line 122
    const v16, 0x4039999a    # 2.9f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v0, 0x40800000    # 4.0f

    .line 129
    .line 130
    const/high16 v2, 0x41a00000    # 20.0f

    .line 131
    .line 132
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, 0x3ffeb852    # 1.99f

    .line 136
    .line 137
    .line 138
    const/high16 v18, 0x40000000    # 2.0f

    .line 139
    .line 140
    const/4 v13, 0x0

    .line 141
    const v14, 0x3f8ccccd    # 1.1f

    .line 142
    .line 143
    .line 144
    const v15, 0x3f63d70a    # 0.89f

    .line 145
    .line 146
    .line 147
    const/high16 v16, 0x40000000    # 2.0f

    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v0, 0x41900000    # 18.0f

    .line 153
    .line 154
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v17, 0x40000000    # 2.0f

    .line 158
    .line 159
    const/high16 v18, -0x40000000    # -2.0f

    .line 160
    .line 161
    const v13, 0x3f8ccccd    # 1.1f

    .line 162
    .line 163
    .line 164
    const/4 v14, 0x0

    .line 165
    const/high16 v15, 0x40000000    # 2.0f

    .line 166
    .line 167
    const v16, -0x4099999a    # -0.9f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x410d47ae    # 8.83f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v17, 0x419b47ae    # 19.41f

    .line 180
    .line 181
    .line 182
    const v18, 0x40ed1eb8    # 7.41f

    .line 183
    .line 184
    .line 185
    const/high16 v13, 0x41a00000    # 20.0f

    .line 186
    .line 187
    const v14, 0x4104cccd    # 8.3f

    .line 188
    .line 189
    .line 190
    const v15, 0x419e51ec    # 19.79f

    .line 191
    .line 192
    .line 193
    const v16, 0x40f947ae    # 7.79f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, 0x4123ae14    # 10.23f

    .line 203
    .line 204
    .line 205
    const v2, 0x418a51ec    # 17.29f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v0, -0x3ff851ec    # -2.12f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/16 v17, 0x0

    .line 218
    .line 219
    const v18, -0x404b851f    # -1.41f

    .line 220
    .line 221
    .line 222
    const v13, -0x413851ec    # -0.39f

    .line 223
    .line 224
    .line 225
    const v14, -0x413851ec    # -0.39f

    .line 226
    .line 227
    .line 228
    const v15, -0x413851ec    # -0.39f

    .line 229
    .line 230
    .line 231
    const v16, -0x407d70a4    # -1.02f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/4 v0, 0x0

    .line 238
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v17, 0x3fb47ae1    # 1.41f

    .line 242
    .line 243
    .line 244
    const/16 v18, 0x0

    .line 245
    .line 246
    const v13, 0x3ec7ae14    # 0.39f

    .line 247
    .line 248
    .line 249
    const v15, 0x3f828f5c    # 1.02f

    .line 250
    .line 251
    .line 252
    const v16, -0x413851ec    # -0.39f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v0, 0x3fb47ae1    # 1.41f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x40628f5c    # 3.54f

    .line 265
    .line 266
    .line 267
    const v2, -0x3f9d70a4    # -3.54f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/4 v0, 0x0

    .line 277
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/16 v17, 0x0

    .line 281
    .line 282
    const v18, 0x3fb47ae1    # 1.41f

    .line 283
    .line 284
    .line 285
    const v14, 0x3ec7ae14    # 0.39f

    .line 286
    .line 287
    .line 288
    const v15, 0x3ec7ae14    # 0.39f

    .line 289
    .line 290
    .line 291
    const v16, 0x3f828f5c    # 1.02f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, -0x3f7851ec    # -4.24f

    .line 298
    .line 299
    .line 300
    const v2, 0x4087ae14    # 4.24f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v17, 0x4123ae14    # 10.23f

    .line 307
    .line 308
    .line 309
    const v18, 0x418a51ec    # 17.29f

    .line 310
    .line 311
    .line 312
    const v13, 0x413428f6    # 11.26f

    .line 313
    .line 314
    .line 315
    const v14, 0x418d70a4    # 17.68f

    .line 316
    .line 317
    .line 318
    const v15, 0x4129eb85    # 10.62f

    .line 319
    .line 320
    .line 321
    const v16, 0x418d70a4    # 17.68f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v0, 0x41100000    # 9.0f

    .line 331
    .line 332
    const/high16 v2, 0x41600000    # 14.0f

    .line 333
    .line 334
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v17, -0x40800000    # -1.0f

    .line 338
    .line 339
    const/high16 v18, -0x40800000    # -1.0f

    .line 340
    .line 341
    const v13, -0x40f33333    # -0.55f

    .line 342
    .line 343
    .line 344
    const/4 v14, 0x0

    .line 345
    const/high16 v15, -0x40800000    # -1.0f

    .line 346
    .line 347
    const v16, -0x4119999a    # -0.45f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v0, 0x40600000    # 3.5f

    .line 354
    .line 355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v0, 0x41940000    # 18.5f

    .line 359
    .line 360
    const/high16 v2, 0x41100000    # 9.0f

    .line 361
    .line 362
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x41600000    # 14.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    const/16 v16, 0x3800

    .line 378
    .line 379
    const/16 v17, 0x0

    .line 380
    .line 381
    const/high16 v6, 0x3f800000    # 1.0f

    .line 382
    .line 383
    const/high16 v8, 0x3f800000    # 1.0f

    .line 384
    .line 385
    const/4 v7, 0x0

    .line 386
    const/high16 v9, 0x3f800000    # 1.0f

    .line 387
    .line 388
    const/high16 v12, 0x3f800000    # 1.0f

    .line 389
    .line 390
    const/4 v13, 0x0

    .line 391
    const/4 v15, 0x0

    .line 392
    const-string v4, ""

    .line 393
    .line 394
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    sput-object v0, Landroidx/compose/material/icons/rounded/TaskKt;->_task:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 403
    .line 404
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    return-object v0
.end method
