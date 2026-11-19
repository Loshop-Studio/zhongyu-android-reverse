.class public final Landroidx/compose/material/icons/rounded/HttpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _http:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHttp(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HttpKt;->_http:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Http"

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
    const/high16 v0, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v2, 0x40900000    # 4.5f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, -0x40000000    # -2.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x411c0000    # 9.75f

    .line 83
    .line 84
    const/high16 v2, 0x40200000    # 2.5f

    .line 85
    .line 86
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v17, -0x40c00000    # -0.75f

    .line 90
    .line 91
    const/high16 v18, -0x40c00000    # -0.75f

    .line 92
    .line 93
    const/4 v13, 0x0

    .line 94
    const v14, -0x412e147b    # -0.41f

    .line 95
    .line 96
    .line 97
    const v15, -0x4151eb85    # -0.34f

    .line 98
    .line 99
    .line 100
    const/high16 v16, -0x40c00000    # -0.75f

    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, 0x411570a4    # 9.34f

    .line 106
    .line 107
    .line 108
    const/high16 v2, 0x411c0000    # 9.75f

    .line 109
    .line 110
    const/high16 v4, 0x3f800000    # 1.0f

    .line 111
    .line 112
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v0, 0x40900000    # 4.5f

    .line 116
    .line 117
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v17, 0x3f400000    # 0.75f

    .line 121
    .line 122
    const/high16 v18, 0x3f400000    # 0.75f

    .line 123
    .line 124
    const v14, 0x3ed1eb85    # 0.41f

    .line 125
    .line 126
    .line 127
    const v15, 0x3eae147b    # 0.34f

    .line 128
    .line 129
    .line 130
    const/high16 v16, 0x3f400000    # 0.75f

    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, -0x4151eb85    # -0.34f

    .line 136
    .line 137
    .line 138
    const/high16 v2, -0x40c00000    # -0.75f

    .line 139
    .line 140
    const/high16 v4, 0x3f400000    # 0.75f

    .line 141
    .line 142
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v0, 0x41480000    # 12.5f

    .line 146
    .line 147
    const/high16 v2, 0x40200000    # 2.5f

    .line 148
    .line 149
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v0, 0x40000000    # 2.0f

    .line 153
    .line 154
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 158
    .line 159
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v0, -0x4151eb85    # -0.34f

    .line 166
    .line 167
    .line 168
    const/high16 v2, -0x40c00000    # -0.75f

    .line 169
    .line 170
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, -0x3f700000    # -4.5f

    .line 174
    .line 175
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v17, 0x40a80000    # 5.25f

    .line 179
    .line 180
    const/high16 v18, 0x41100000    # 9.0f

    .line 181
    .line 182
    const/high16 v13, 0x40c00000    # 6.0f

    .line 183
    .line 184
    const v14, 0x411570a4    # 9.34f

    .line 185
    .line 186
    .line 187
    const v15, 0x40b51eb8    # 5.66f

    .line 188
    .line 189
    .line 190
    const/high16 v16, 0x41100000    # 9.0f

    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v0, 0x3eae147b    # 0.34f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v0, 0x41300000    # 11.0f

    .line 202
    .line 203
    const/high16 v2, 0x40900000    # 4.5f

    .line 204
    .line 205
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v0, 0x40f80000    # 7.75f

    .line 212
    .line 213
    const/high16 v2, 0x41280000    # 10.5f

    .line 214
    .line 215
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v0, 0x3f400000    # 0.75f

    .line 219
    .line 220
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x40700000    # 3.75f

    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, 0x3f400000    # 0.75f

    .line 229
    .line 230
    const/high16 v18, 0x3f400000    # 0.75f

    .line 231
    .line 232
    const/4 v13, 0x0

    .line 233
    const v14, 0x3ed1eb85    # 0.41f

    .line 234
    .line 235
    .line 236
    const v15, 0x3eae147b    # 0.34f

    .line 237
    .line 238
    .line 239
    const/high16 v16, 0x3f400000    # 0.75f

    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, -0x4151eb85    # -0.34f

    .line 245
    .line 246
    .line 247
    const/high16 v2, -0x40c00000    # -0.75f

    .line 248
    .line 249
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v0, 0x41200000    # 10.0f

    .line 253
    .line 254
    const/high16 v2, 0x41280000    # 10.5f

    .line 255
    .line 256
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v0, 0x3f400000    # 0.75f

    .line 260
    .line 261
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v18, -0x40c00000    # -0.75f

    .line 265
    .line 266
    const v13, 0x3ed1eb85    # 0.41f

    .line 267
    .line 268
    .line 269
    const/4 v14, 0x0

    .line 270
    const/high16 v15, 0x3f400000    # 0.75f

    .line 271
    .line 272
    const v16, -0x4151eb85    # -0.34f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, 0x41328f5c    # 11.16f

    .line 279
    .line 280
    .line 281
    const/high16 v2, 0x412c0000    # 10.75f

    .line 282
    .line 283
    const/high16 v4, 0x41100000    # 9.0f

    .line 284
    .line 285
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 289
    .line 290
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v17, -0x40c00000    # -0.75f

    .line 294
    .line 295
    const/high16 v18, 0x3f400000    # 0.75f

    .line 296
    .line 297
    const v13, -0x412e147b    # -0.41f

    .line 298
    .line 299
    .line 300
    const/high16 v15, -0x40c00000    # -0.75f

    .line 301
    .line 302
    const v16, 0x3eae147b    # 0.34f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, 0x3eae147b    # 0.34f

    .line 309
    .line 310
    .line 311
    const/high16 v2, 0x3f400000    # 0.75f

    .line 312
    .line 313
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, 0x41540000    # 13.25f

    .line 320
    .line 321
    const/high16 v2, 0x41280000    # 10.5f

    .line 322
    .line 323
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, 0x41600000    # 14.0f

    .line 327
    .line 328
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x40700000    # 3.75f

    .line 332
    .line 333
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v17, 0x3f400000    # 0.75f

    .line 337
    .line 338
    const/4 v13, 0x0

    .line 339
    const v14, 0x3ed1eb85    # 0.41f

    .line 340
    .line 341
    .line 342
    const v15, 0x3eae147b    # 0.34f

    .line 343
    .line 344
    .line 345
    const/high16 v16, 0x3f400000    # 0.75f

    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, -0x4151eb85    # -0.34f

    .line 351
    .line 352
    .line 353
    const/high16 v2, -0x40c00000    # -0.75f

    .line 354
    .line 355
    const/high16 v4, 0x3f400000    # 0.75f

    .line 356
    .line 357
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v0, 0x41780000    # 15.5f

    .line 361
    .line 362
    const/high16 v2, 0x41280000    # 10.5f

    .line 363
    .line 364
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v0, 0x3f400000    # 0.75f

    .line 368
    .line 369
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v18, -0x40c00000    # -0.75f

    .line 373
    .line 374
    const v13, 0x3ed1eb85    # 0.41f

    .line 375
    .line 376
    .line 377
    const/4 v14, 0x0

    .line 378
    const/high16 v15, 0x3f400000    # 0.75f

    .line 379
    .line 380
    const v16, -0x4151eb85    # -0.34f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, 0x418547ae    # 16.66f

    .line 387
    .line 388
    .line 389
    const/high16 v2, 0x41820000    # 16.25f

    .line 390
    .line 391
    const/high16 v4, 0x41100000    # 9.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v17, -0x40c00000    # -0.75f

    .line 402
    .line 403
    const/high16 v18, 0x3f400000    # 0.75f

    .line 404
    .line 405
    const v13, -0x412e147b    # -0.41f

    .line 406
    .line 407
    .line 408
    const/high16 v15, -0x40c00000    # -0.75f

    .line 409
    .line 410
    const v16, 0x3eae147b    # 0.34f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v0, 0x3eae147b    # 0.34f

    .line 417
    .line 418
    .line 419
    const/high16 v2, 0x3f400000    # 0.75f

    .line 420
    .line 421
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v0, 0x41ac0000    # 21.5f

    .line 428
    .line 429
    const/high16 v2, 0x41100000    # 9.0f

    .line 430
    .line 431
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v0, 0x41980000    # 19.0f

    .line 435
    .line 436
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v17, -0x40800000    # -1.0f

    .line 440
    .line 441
    const/high16 v18, 0x3f800000    # 1.0f

    .line 442
    .line 443
    const v13, -0x40f33333    # -0.55f

    .line 444
    .line 445
    .line 446
    const/high16 v15, -0x40800000    # -1.0f

    .line 447
    .line 448
    const v16, 0x3ee66666    # 0.45f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v0, 0x40880000    # 4.25f

    .line 455
    .line 456
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v17, 0x3f400000    # 0.75f

    .line 460
    .line 461
    const/high16 v18, 0x3f400000    # 0.75f

    .line 462
    .line 463
    const/4 v13, 0x0

    .line 464
    const v14, 0x3ed1eb85    # 0.41f

    .line 465
    .line 466
    .line 467
    const v15, 0x3eae147b    # 0.34f

    .line 468
    .line 469
    .line 470
    const/high16 v16, 0x3f400000    # 0.75f

    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v0, -0x4151eb85    # -0.34f

    .line 476
    .line 477
    .line 478
    const/high16 v2, -0x40c00000    # -0.75f

    .line 479
    .line 480
    const/high16 v4, 0x3f400000    # 0.75f

    .line 481
    .line 482
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v0, 0x419c0000    # 19.5f

    .line 486
    .line 487
    const/high16 v2, 0x41500000    # 13.0f

    .line 488
    .line 489
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v0, 0x40000000    # 2.0f

    .line 493
    .line 494
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 498
    .line 499
    const/high16 v18, -0x40400000    # -1.5f

    .line 500
    .line 501
    const v13, 0x3f547ae1    # 0.83f

    .line 502
    .line 503
    .line 504
    const/4 v14, 0x0

    .line 505
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 506
    .line 507
    const v16, -0x40d1eb85    # -0.68f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v0, -0x40800000    # -1.0f

    .line 514
    .line 515
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v17, -0x40400000    # -1.5f

    .line 519
    .line 520
    const/4 v13, 0x0

    .line 521
    const v14, -0x40ae147b    # -0.82f

    .line 522
    .line 523
    .line 524
    const v15, -0x40d47ae1    # -0.67f

    .line 525
    .line 526
    .line 527
    const/high16 v16, -0x40400000    # -1.5f

    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v0, 0x41380000    # 11.5f

    .line 536
    .line 537
    const/high16 v2, 0x41ac0000    # 21.5f

    .line 538
    .line 539
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v0, -0x40000000    # -2.0f

    .line 543
    .line 544
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v0, -0x40800000    # -1.0f

    .line 548
    .line 549
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v0, 0x40000000    # 2.0f

    .line 553
    .line 554
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const/high16 v0, 0x3f800000    # 1.0f

    .line 558
    .line 559
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    const/16 v16, 0x3800

    .line 570
    .line 571
    const/16 v17, 0x0

    .line 572
    .line 573
    const/high16 v6, 0x3f800000    # 1.0f

    .line 574
    .line 575
    const/high16 v8, 0x3f800000    # 1.0f

    .line 576
    .line 577
    const/4 v7, 0x0

    .line 578
    const/high16 v9, 0x3f800000    # 1.0f

    .line 579
    .line 580
    const/high16 v12, 0x3f800000    # 1.0f

    .line 581
    .line 582
    const/4 v14, 0x0

    .line 583
    const/4 v15, 0x0

    .line 584
    const-string v4, ""

    .line 585
    .line 586
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    sput-object v0, Landroidx/compose/material/icons/rounded/HttpKt;->_http:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 595
    .line 596
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    return-object v0
.end method
