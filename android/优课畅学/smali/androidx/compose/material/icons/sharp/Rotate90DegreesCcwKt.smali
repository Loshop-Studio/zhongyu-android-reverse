.class public final Landroidx/compose/material/icons/sharp/Rotate90DegreesCcwKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _rotate90DegreesCcw:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRotate90DegreesCcw(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/Rotate90DegreesCcwKt;->_rotate90DegreesCcw:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Rotate90DegreesCcw"

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
    const v0, 0x40eae148    # 7.34f

    .line 71
    .line 72
    .line 73
    const v2, 0x40cd1eb8    # 6.41f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x3f5c28f6    # 0.86f

    .line 80
    .line 81
    .line 82
    const v2, 0x414e6666    # 12.9f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v0, 0x40cf5c29    # 6.48f

    .line 89
    .line 90
    .line 91
    const v2, 0x40cfae14    # 6.49f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v0, -0x3f30a3d7    # -6.48f

    .line 98
    .line 99
    .line 100
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v0, -0x3f300000    # -6.5f

    .line 104
    .line 105
    const v2, -0x3f3051ec    # -6.49f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v0, 0x406c28f6    # 3.69f

    .line 115
    .line 116
    .line 117
    const v2, 0x414e6666    # 12.9f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, 0x406a3d71    # 3.66f

    .line 124
    .line 125
    .line 126
    const v2, -0x3f95c28f    # -3.66f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v0, 0x41300000    # 11.0f

    .line 133
    .line 134
    const v2, 0x414e6666    # 12.9f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, 0x406a3d71    # 3.66f

    .line 141
    .line 142
    .line 143
    const v2, -0x3f95c28f    # -3.66f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, -0x3f966666    # -3.65f

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, 0x419ae148    # 19.36f

    .line 159
    .line 160
    .line 161
    const v2, 0x40d47ae1    # 6.64f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v17, 0x41500000    # 13.0f

    .line 168
    .line 169
    const/high16 v18, 0x40800000    # 4.0f

    .line 170
    .line 171
    const v13, 0x418ce148    # 17.61f

    .line 172
    .line 173
    .line 174
    const v14, 0x409c28f6    # 4.88f

    .line 175
    .line 176
    .line 177
    const v15, 0x4174cccd    # 15.3f

    .line 178
    .line 179
    .line 180
    const/high16 v16, 0x40800000    # 4.0f

    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, 0x3f428f5c    # 0.76f

    .line 186
    .line 187
    .line 188
    const/high16 v2, 0x41500000    # 13.0f

    .line 189
    .line 190
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, 0x410c28f6    # 8.76f

    .line 194
    .line 195
    .line 196
    const/high16 v2, 0x40a00000    # 5.0f

    .line 197
    .line 198
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, 0x4113d70a    # 9.24f

    .line 202
    .line 203
    .line 204
    const/high16 v2, 0x41500000    # 13.0f

    .line 205
    .line 206
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v0, 0x40c00000    # 6.0f

    .line 210
    .line 211
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, 0x409e6666    # 4.95f

    .line 215
    .line 216
    .line 217
    const v18, 0x40033333    # 2.05f

    .line 218
    .line 219
    .line 220
    const v13, 0x3fe51eb8    # 1.79f

    .line 221
    .line 222
    .line 223
    const/4 v14, 0x0

    .line 224
    const v15, 0x40651eb8    # 3.58f

    .line 225
    .line 226
    .line 227
    const v16, 0x3f2e147b    # 0.68f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/16 v17, 0x0

    .line 234
    .line 235
    const v18, 0x411e6666    # 9.9f

    .line 236
    .line 237
    .line 238
    const v13, 0x402eb852    # 2.73f

    .line 239
    .line 240
    .line 241
    const v14, 0x402eb852    # 2.73f

    .line 242
    .line 243
    .line 244
    const v15, 0x402eb852    # 2.73f

    .line 245
    .line 246
    .line 247
    const v16, 0x40e570a4    # 7.17f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v17, 0x41500000    # 13.0f

    .line 254
    .line 255
    const/high16 v18, 0x41a00000    # 20.0f

    .line 256
    .line 257
    const v13, 0x4184a3d7    # 16.58f

    .line 258
    .line 259
    .line 260
    const v14, 0x419a8f5c    # 19.32f

    .line 261
    .line 262
    .line 263
    const v15, 0x416ca3d7    # 14.79f

    .line 264
    .line 265
    .line 266
    const/high16 v16, 0x41a00000    # 20.0f

    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v17, -0x3fca3d71    # -2.84f

    .line 272
    .line 273
    .line 274
    const v18, -0x40e3d70a    # -0.61f

    .line 275
    .line 276
    .line 277
    const v13, -0x4087ae14    # -0.97f

    .line 278
    .line 279
    .line 280
    const/4 v14, 0x0

    .line 281
    const v15, -0x4007ae14    # -1.94f

    .line 282
    .line 283
    .line 284
    const v16, -0x41a8f5c3    # -0.21f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, -0x404147ae    # -1.49f

    .line 291
    .line 292
    .line 293
    const v2, 0x3fbeb852    # 1.49f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v17, 0x41500000    # 13.0f

    .line 300
    .line 301
    const/high16 v18, 0x41b00000    # 22.0f

    .line 302
    .line 303
    const v13, 0x412051ec    # 10.02f

    .line 304
    .line 305
    .line 306
    const v14, 0x41acf5c3    # 21.62f

    .line 307
    .line 308
    .line 309
    const v15, 0x413828f6    # 11.51f

    .line 310
    .line 311
    .line 312
    const/high16 v16, 0x41b00000    # 22.0f

    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, 0x40cb851f    # 6.36f

    .line 318
    .line 319
    .line 320
    const v18, -0x3fd70a3d    # -2.64f

    .line 321
    .line 322
    .line 323
    const v13, 0x40133333    # 2.3f

    .line 324
    .line 325
    .line 326
    const/4 v14, 0x0

    .line 327
    const v15, 0x4093851f    # 4.61f

    .line 328
    .line 329
    .line 330
    const v16, -0x409eb852    # -0.88f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/16 v17, 0x0

    .line 337
    .line 338
    const v18, -0x3eb47ae1    # -12.72f

    .line 339
    .line 340
    .line 341
    const v13, 0x406147ae    # 3.52f

    .line 342
    .line 343
    .line 344
    const v14, -0x3f9f5c29    # -3.51f

    .line 345
    .line 346
    .line 347
    const v15, 0x406147ae    # 3.52f

    .line 348
    .line 349
    .line 350
    const v16, -0x3eeca3d7    # -9.21f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    const/16 v16, 0x3800

    .line 364
    .line 365
    const/16 v17, 0x0

    .line 366
    .line 367
    const/high16 v6, 0x3f800000    # 1.0f

    .line 368
    .line 369
    const/high16 v8, 0x3f800000    # 1.0f

    .line 370
    .line 371
    const/4 v7, 0x0

    .line 372
    const/high16 v9, 0x3f800000    # 1.0f

    .line 373
    .line 374
    const/high16 v12, 0x3f800000    # 1.0f

    .line 375
    .line 376
    const/4 v13, 0x0

    .line 377
    const/4 v14, 0x0

    .line 378
    const/4 v15, 0x0

    .line 379
    const-string v4, ""

    .line 380
    .line 381
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    sput-object v0, Landroidx/compose/material/icons/sharp/Rotate90DegreesCcwKt;->_rotate90DegreesCcw:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 390
    .line 391
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    return-object v0
.end method
