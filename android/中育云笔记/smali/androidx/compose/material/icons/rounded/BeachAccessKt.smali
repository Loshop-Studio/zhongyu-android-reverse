.class public final Landroidx/compose/material/icons/rounded/BeachAccessKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _beachAccess:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBeachAccess(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BeachAccessKt;->_beachAccess:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.BeachAccess"

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
    const v0, 0x4152147b    # 13.13f

    .line 71
    .line 72
    .line 73
    const v2, 0x4168f5c3    # 14.56f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x3fb70a3d    # 1.43f

    .line 80
    .line 81
    .line 82
    const v2, -0x4048f5c3    # -1.43f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v0, 0x40b75c29    # 5.73f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/16 v17, 0x0

    .line 95
    .line 96
    const v18, 0x3fb70a3d    # 1.43f

    .line 97
    .line 98
    .line 99
    const v13, 0x3ec7ae14    # 0.39f

    .line 100
    .line 101
    .line 102
    const v14, 0x3ec7ae14    # 0.39f

    .line 103
    .line 104
    .line 105
    const v15, 0x3ec7ae14    # 0.39f

    .line 106
    .line 107
    .line 108
    const v16, 0x3f83d70a    # 1.03f

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v17, -0x4048f5c3    # -1.43f

    .line 115
    .line 116
    .line 117
    const/16 v18, 0x0

    .line 118
    .line 119
    const v13, -0x413851ec    # -0.39f

    .line 120
    .line 121
    .line 122
    const v15, -0x407c28f6    # -1.03f

    .line 123
    .line 124
    .line 125
    const v16, 0x3ec7ae14    # 0.39f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, -0x3f48a3d7    # -5.73f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, 0x418b5c29    # 17.42f

    .line 141
    .line 142
    .line 143
    const v2, 0x410d47ae    # 8.83f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, -0x405d70a4    # -1.27f

    .line 150
    .line 151
    .line 152
    const v2, 0x3fa28f5c    # 1.27f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v17, -0x416147ae    # -0.31f

    .line 159
    .line 160
    .line 161
    const v18, -0x3fbae148    # -3.08f

    .line 162
    .line 163
    .line 164
    const v13, 0x3f63d70a    # 0.89f

    .line 165
    .line 166
    .line 167
    const v14, -0x409c28f6    # -0.89f

    .line 168
    .line 169
    .line 170
    const v15, 0x3f451eb8    # 0.77f

    .line 171
    .line 172
    .line 173
    const v16, -0x3fe47ae1    # -2.43f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v17, -0x3eb9999a    # -12.4f

    .line 180
    .line 181
    .line 182
    const v18, 0x3fbc28f6    # 1.47f

    .line 183
    .line 184
    .line 185
    const v13, -0x3f870a3d    # -3.89f

    .line 186
    .line 187
    .line 188
    const v14, -0x3fe7ae14    # -2.38f

    .line 189
    .line 190
    .line 191
    const v15, -0x3eef851f    # -9.03f

    .line 192
    .line 193
    .line 194
    const v16, -0x400e147b    # -1.89f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v17, 0x41370a3d    # 11.44f

    .line 201
    .line 202
    .line 203
    const v18, 0x403851ec    # 2.88f

    .line 204
    .line 205
    .line 206
    const v13, 0x407b851f    # 3.93f

    .line 207
    .line 208
    .line 209
    const v14, -0x4059999a    # -1.3f

    .line 210
    .line 211
    .line 212
    const v15, 0x4104f5c3    # 8.31f

    .line 213
    .line 214
    .line 215
    const/high16 v16, -0x41800000    # -0.25f

    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v0, 0x40be6666    # 5.95f

    .line 224
    .line 225
    .line 226
    const v2, 0x40bf5c29    # 5.98f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v17, -0x40428f5c    # -1.48f

    .line 233
    .line 234
    .line 235
    const v18, 0x41466666    # 12.4f

    .line 236
    .line 237
    .line 238
    const v13, -0x3fa8f5c3    # -3.36f

    .line 239
    .line 240
    .line 241
    const v14, 0x4057ae14    # 3.37f

    .line 242
    .line 243
    .line 244
    const v15, -0x3f89999a    # -3.85f

    .line 245
    .line 246
    .line 247
    const v16, 0x410828f6    # 8.51f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v17, 0x40451eb8    # 3.08f

    .line 254
    .line 255
    .line 256
    const v18, 0x3e9eb852    # 0.31f

    .line 257
    .line 258
    .line 259
    const v13, 0x3f28f5c3    # 0.66f

    .line 260
    .line 261
    .line 262
    const v14, 0x3f8a3d71    # 1.08f

    .line 263
    .line 264
    .line 265
    const v15, 0x400c28f6    # 2.19f

    .line 266
    .line 267
    .line 268
    const v16, 0x3f9ae148    # 1.21f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, -0x405d70a4    # -1.27f

    .line 275
    .line 276
    .line 277
    const v2, 0x3fa28f5c    # 1.27f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v17, 0x40be6666    # 5.95f

    .line 284
    .line 285
    .line 286
    const v18, 0x40bf5c29    # 5.98f

    .line 287
    .line 288
    .line 289
    const v13, 0x40b66666    # 5.7f

    .line 290
    .line 291
    .line 292
    const v14, 0x4164a3d7    # 14.29f

    .line 293
    .line 294
    .line 295
    const v15, 0x4094cccd    # 4.65f

    .line 296
    .line 297
    .line 298
    const v16, 0x411e8f5c    # 9.91f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v0, 0x40bf0a3d    # 5.97f

    .line 308
    .line 309
    .line 310
    const v2, 0x40beb852    # 5.96f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, -0x43dc28f6    # -0.01f

    .line 317
    .line 318
    .line 319
    const v2, 0x3c23d70a    # 0.01f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v17, 0x4089999a    # 4.3f

    .line 326
    .line 327
    .line 328
    const v18, 0x412051ec    # 10.02f

    .line 329
    .line 330
    .line 331
    const v13, -0x413d70a4    # -0.38f

    .line 332
    .line 333
    .line 334
    const v14, 0x4040a3d7    # 3.01f

    .line 335
    .line 336
    .line 337
    const v15, 0x3f95c28f    # 1.17f

    .line 338
    .line 339
    .line 340
    const v16, 0x40dc28f6    # 6.88f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v0, -0x3f48a3d7    # -5.73f

    .line 347
    .line 348
    .line 349
    const v2, 0x40b75c29    # 5.73f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v17, -0x3edfae14    # -10.02f

    .line 356
    .line 357
    .line 358
    const v18, -0x3f766666    # -4.3f

    .line 359
    .line 360
    .line 361
    const v13, -0x3fb7ae14    # -3.13f

    .line 362
    .line 363
    .line 364
    const v14, -0x3fb7ae14    # -3.13f

    .line 365
    .line 366
    .line 367
    const v15, -0x3f1fae14    # -7.01f

    .line 368
    .line 369
    .line 370
    const v16, -0x3f6a3d71    # -4.68f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    const/16 v16, 0x3800

    .line 384
    .line 385
    const/16 v17, 0x0

    .line 386
    .line 387
    const/high16 v6, 0x3f800000    # 1.0f

    .line 388
    .line 389
    const/high16 v8, 0x3f800000    # 1.0f

    .line 390
    .line 391
    const/4 v7, 0x0

    .line 392
    const/high16 v9, 0x3f800000    # 1.0f

    .line 393
    .line 394
    const/high16 v12, 0x3f800000    # 1.0f

    .line 395
    .line 396
    const/4 v13, 0x0

    .line 397
    const/4 v14, 0x0

    .line 398
    const/4 v15, 0x0

    .line 399
    const-string v4, ""

    .line 400
    .line 401
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    sput-object v0, Landroidx/compose/material/icons/rounded/BeachAccessKt;->_beachAccess:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 410
    .line 411
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    return-object v0
.end method
