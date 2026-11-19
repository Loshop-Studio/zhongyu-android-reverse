.class public final Landroidx/compose/material/icons/filled/DirectionsCarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _directionsCar:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirectionsCar(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/DirectionsCarKt;->_directionsCar:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.DirectionsCar"

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
    const v0, 0x41975c29    # 18.92f

    .line 71
    .line 72
    .line 73
    const v2, 0x40c051ec    # 6.01f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x418c0000    # 17.5f

    .line 80
    .line 81
    const/high16 v18, 0x40a00000    # 5.0f

    .line 82
    .line 83
    const v13, 0x4195c28f    # 18.72f

    .line 84
    .line 85
    .line 86
    const v14, 0x40ad70a4    # 5.42f

    .line 87
    .line 88
    .line 89
    const v15, 0x419147ae    # 18.16f

    .line 90
    .line 91
    .line 92
    const/high16 v16, 0x40a00000    # 5.0f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v0, -0x3ed00000    # -11.0f

    .line 98
    .line 99
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v17, -0x404a3d71    # -1.42f

    .line 103
    .line 104
    .line 105
    const v18, 0x3f8147ae    # 1.01f

    .line 106
    .line 107
    .line 108
    const v13, -0x40d70a3d    # -0.66f

    .line 109
    .line 110
    .line 111
    const/4 v14, 0x0

    .line 112
    const v15, -0x40651eb8    # -1.21f

    .line 113
    .line 114
    .line 115
    const v16, 0x3ed70a3d    # 0.42f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v0, 0x40400000    # 3.0f

    .line 122
    .line 123
    const/high16 v2, 0x41400000    # 12.0f

    .line 124
    .line 125
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v0, 0x41000000    # 8.0f

    .line 129
    .line 130
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, 0x3f800000    # 1.0f

    .line 134
    .line 135
    const/high16 v18, 0x3f800000    # 1.0f

    .line 136
    .line 137
    const/4 v13, 0x0

    .line 138
    const v14, 0x3f0ccccd    # 0.55f

    .line 139
    .line 140
    .line 141
    const v15, 0x3ee66666    # 0.45f

    .line 142
    .line 143
    .line 144
    const/high16 v16, 0x3f800000    # 1.0f

    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v0, 0x3f800000    # 1.0f

    .line 150
    .line 151
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v18, -0x40800000    # -1.0f

    .line 155
    .line 156
    const v13, 0x3f0ccccd    # 0.55f

    .line 157
    .line 158
    .line 159
    const/4 v14, 0x0

    .line 160
    const/high16 v15, 0x3f800000    # 1.0f

    .line 161
    .line 162
    const v16, -0x4119999a    # -0.45f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, -0x40800000    # -1.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, 0x41400000    # 12.0f

    .line 174
    .line 175
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v0, 0x3f800000    # 1.0f

    .line 179
    .line 180
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v18, 0x3f800000    # 1.0f

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    const v14, 0x3f0ccccd    # 0.55f

    .line 187
    .line 188
    .line 189
    const v15, 0x3ee66666    # 0.45f

    .line 190
    .line 191
    .line 192
    const/high16 v16, 0x3f800000    # 1.0f

    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v18, -0x40800000    # -1.0f

    .line 201
    .line 202
    const v13, 0x3f0ccccd    # 0.55f

    .line 203
    .line 204
    .line 205
    const/4 v14, 0x0

    .line 206
    const/high16 v15, 0x3f800000    # 1.0f

    .line 207
    .line 208
    const v16, -0x4119999a    # -0.45f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v0, -0x3f000000    # -8.0f

    .line 215
    .line 216
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v0, -0x3ffae148    # -2.08f

    .line 220
    .line 221
    .line 222
    const v2, -0x3f4051ec    # -5.99f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v0, 0x40d00000    # 6.5f

    .line 232
    .line 233
    const/high16 v2, 0x41800000    # 16.0f

    .line 234
    .line 235
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v17, -0x40400000    # -1.5f

    .line 239
    .line 240
    const/high16 v18, -0x40400000    # -1.5f

    .line 241
    .line 242
    const v13, -0x40ab851f    # -0.83f

    .line 243
    .line 244
    .line 245
    const/high16 v15, -0x40400000    # -1.5f

    .line 246
    .line 247
    const v16, -0x40d47ae1    # -0.67f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, 0x40b570a4    # 5.67f

    .line 254
    .line 255
    .line 256
    const/high16 v2, 0x41500000    # 13.0f

    .line 257
    .line 258
    const/high16 v4, 0x40d00000    # 6.5f

    .line 259
    .line 260
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, 0x3f2b851f    # 0.67f

    .line 264
    .line 265
    .line 266
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 267
    .line 268
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v0, 0x40ea8f5c    # 7.33f

    .line 272
    .line 273
    .line 274
    const/high16 v2, 0x40d00000    # 6.5f

    .line 275
    .line 276
    const/high16 v4, 0x41800000    # 16.0f

    .line 277
    .line 278
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v0, 0x418c0000    # 17.5f

    .line 285
    .line 286
    const/high16 v2, 0x41800000    # 16.0f

    .line 287
    .line 288
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, -0x40400000    # -1.5f

    .line 295
    .line 296
    const v2, 0x3f2b851f    # 0.67f

    .line 297
    .line 298
    .line 299
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 300
    .line 301
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, 0x3f2b851f    # 0.67f

    .line 305
    .line 306
    .line 307
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 308
    .line 309
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, -0x40d47ae1    # -0.67f

    .line 313
    .line 314
    .line 315
    const/high16 v2, -0x40400000    # -1.5f

    .line 316
    .line 317
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v0, 0x40a00000    # 5.0f

    .line 324
    .line 325
    const/high16 v2, 0x41300000    # 11.0f

    .line 326
    .line 327
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v0, -0x3f700000    # -4.5f

    .line 331
    .line 332
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 333
    .line 334
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v0, 0x41300000    # 11.0f

    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v0, 0x41980000    # 19.0f

    .line 343
    .line 344
    const/high16 v2, 0x41300000    # 11.0f

    .line 345
    .line 346
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v0, 0x40a00000    # 5.0f

    .line 350
    .line 351
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    const/16 v16, 0x3800

    .line 362
    .line 363
    const/16 v17, 0x0

    .line 364
    .line 365
    const/high16 v6, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const/high16 v8, 0x3f800000    # 1.0f

    .line 368
    .line 369
    const/4 v7, 0x0

    .line 370
    const/high16 v9, 0x3f800000    # 1.0f

    .line 371
    .line 372
    const/high16 v12, 0x3f800000    # 1.0f

    .line 373
    .line 374
    const/4 v13, 0x0

    .line 375
    const/4 v15, 0x0

    .line 376
    const-string v4, ""

    .line 377
    .line 378
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    sput-object v0, Landroidx/compose/material/icons/filled/DirectionsCarKt;->_directionsCar:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 387
    .line 388
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    return-object v0
.end method
