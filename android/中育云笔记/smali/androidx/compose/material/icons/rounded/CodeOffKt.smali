.class public final Landroidx/compose/material/icons/rounded/CodeOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _codeOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCodeOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CodeOffKt;->_codeOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.CodeOff"

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
    const v0, 0x41995c29    # 19.17f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41400000    # 12.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, -0x3f87ae14    # -3.88f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/16 v17, 0x0

    .line 85
    .line 86
    const v18, -0x404b851f    # -1.41f

    .line 87
    .line 88
    .line 89
    const v13, -0x413851ec    # -0.39f

    .line 90
    .line 91
    .line 92
    const v14, -0x413851ec    # -0.39f

    .line 93
    .line 94
    .line 95
    const v15, -0x413851ec    # -0.39f

    .line 96
    .line 97
    .line 98
    const v16, -0x407d70a4    # -1.02f

    .line 99
    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/4 v0, 0x0

    .line 105
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v17, 0x3fb47ae1    # 1.41f

    .line 109
    .line 110
    .line 111
    const/16 v18, 0x0

    .line 112
    .line 113
    const v13, 0x3ec7ae14    # 0.39f

    .line 114
    .line 115
    .line 116
    const v15, 0x3f828f5c    # 1.02f

    .line 117
    .line 118
    .line 119
    const v16, -0x413851ec    # -0.39f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v0, 0x4092e148    # 4.59f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/16 v17, 0x0

    .line 132
    .line 133
    const v18, 0x3fb47ae1    # 1.41f

    .line 134
    .line 135
    .line 136
    const v14, 0x3ec7ae14    # 0.39f

    .line 137
    .line 138
    .line 139
    const v15, 0x3ec7ae14    # 0.39f

    .line 140
    .line 141
    .line 142
    const v16, 0x3f828f5c    # 1.02f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v0, 0x403851ec    # 2.88f

    .line 149
    .line 150
    .line 151
    const v2, -0x3fc7ae14    # -2.88f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v0, 0x41880000    # 17.0f

    .line 158
    .line 159
    const v2, 0x4162b852    # 14.17f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v0, 0x41995c29    # 19.17f

    .line 166
    .line 167
    .line 168
    const/high16 v2, 0x41400000    # 12.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v0, 0x40066666    # 2.1f

    .line 177
    .line 178
    .line 179
    const v2, 0x409dc28f    # 4.93f

    .line 180
    .line 181
    .line 182
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, 0x405f5c29    # 3.49f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, 0x403851ec    # 2.88f

    .line 192
    .line 193
    .line 194
    const v2, -0x3fc7ae14    # -2.88f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v13, -0x413851ec    # -0.39f

    .line 201
    .line 202
    .line 203
    const v15, -0x413851ec    # -0.39f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v0, 0x4092e148    # 4.59f

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v17, 0x3fb47ae1    # 1.41f

    .line 216
    .line 217
    .line 218
    const/16 v18, 0x0

    .line 219
    .line 220
    const v13, 0x3ec7ae14    # 0.39f

    .line 221
    .line 222
    .line 223
    const v15, 0x3f828f5c    # 1.02f

    .line 224
    .line 225
    .line 226
    const v16, 0x3ec7ae14    # 0.39f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/4 v0, 0x0

    .line 233
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/16 v17, 0x0

    .line 237
    .line 238
    const v18, -0x404b851f    # -1.41f

    .line 239
    .line 240
    .line 241
    const v14, -0x413851ec    # -0.39f

    .line 242
    .line 243
    .line 244
    const v15, 0x3ec7ae14    # 0.39f

    .line 245
    .line 246
    .line 247
    const v16, -0x407d70a4    # -1.02f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, 0x409a8f5c    # 4.83f

    .line 254
    .line 255
    .line 256
    const/high16 v2, 0x41400000    # 12.0f

    .line 257
    .line 258
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v0, 0x40e00000    # 7.0f

    .line 262
    .line 263
    const v2, 0x411d47ae    # 9.83f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, 0x41988f5c    # 19.07f

    .line 270
    .line 271
    .line 272
    const v2, 0x41af3333    # 21.9f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v17, 0x3fb47ae1    # 1.41f

    .line 279
    .line 280
    .line 281
    const/16 v18, 0x0

    .line 282
    .line 283
    const v14, 0x3ec7ae14    # 0.39f

    .line 284
    .line 285
    .line 286
    const v15, 0x3f828f5c    # 1.02f

    .line 287
    .line 288
    .line 289
    const v16, 0x3ec7ae14    # 0.39f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/4 v0, 0x0

    .line 296
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/16 v17, 0x0

    .line 300
    .line 301
    const v18, -0x404b851f    # -1.41f

    .line 302
    .line 303
    .line 304
    const v14, -0x413851ec    # -0.39f

    .line 305
    .line 306
    .line 307
    const v15, 0x3ec7ae14    # 0.39f

    .line 308
    .line 309
    .line 310
    const v16, -0x407d70a4    # -1.02f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, 0x4060a3d7    # 3.51f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v17, -0x404b851f    # -1.41f

    .line 323
    .line 324
    .line 325
    const/16 v18, 0x0

    .line 326
    .line 327
    const v13, -0x413851ec    # -0.39f

    .line 328
    .line 329
    .line 330
    const v15, -0x407d70a4    # -1.02f

    .line 331
    .line 332
    .line 333
    const v16, -0x413851ec    # -0.39f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/4 v0, 0x0

    .line 340
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, 0x40066666    # 2.1f

    .line 344
    .line 345
    .line 346
    const v18, 0x409dc28f    # 4.93f

    .line 347
    .line 348
    .line 349
    const v13, 0x3fdae148    # 1.71f

    .line 350
    .line 351
    .line 352
    const v14, 0x407a3d71    # 3.91f

    .line 353
    .line 354
    .line 355
    const v15, 0x3fdae148    # 1.71f

    .line 356
    .line 357
    .line 358
    const v16, 0x409147ae    # 4.54f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    const/16 v16, 0x3800

    .line 372
    .line 373
    const/16 v17, 0x0

    .line 374
    .line 375
    const/high16 v6, 0x3f800000    # 1.0f

    .line 376
    .line 377
    const/high16 v8, 0x3f800000    # 1.0f

    .line 378
    .line 379
    const/4 v7, 0x0

    .line 380
    const/high16 v9, 0x3f800000    # 1.0f

    .line 381
    .line 382
    const/high16 v12, 0x3f800000    # 1.0f

    .line 383
    .line 384
    const/4 v13, 0x0

    .line 385
    const/4 v14, 0x0

    .line 386
    const/4 v15, 0x0

    .line 387
    const-string v4, ""

    .line 388
    .line 389
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    sput-object v0, Landroidx/compose/material/icons/rounded/CodeOffKt;->_codeOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 398
    .line 399
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    return-object v0
.end method
