.class public final Landroidx/compose/material/icons/rounded/HighlightAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _highlightAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHighlightAlt(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HighlightAltKt;->_highlightAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.HighlightAlt"

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
    const/high16 v0, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v2, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v0, 0x40400000    # 3.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v0, 0x40000000    # 2.0f

    .line 88
    .line 89
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v0, 0x40a00000    # 5.0f

    .line 93
    .line 94
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x41980000    # 19.0f

    .line 101
    .line 102
    const/high16 v2, 0x41100000    # 9.0f

    .line 103
    .line 104
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v0, 0x40000000    # 2.0f

    .line 108
    .line 109
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v0, 0x40e00000    # 7.0f

    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, -0x40000000    # -2.0f

    .line 118
    .line 119
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v0, 0x41100000    # 9.0f

    .line 123
    .line 124
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v0, 0x41980000    # 19.0f

    .line 131
    .line 132
    const/high16 v2, 0x41500000    # 13.0f

    .line 133
    .line 134
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x40000000    # 2.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v0, -0x40000000    # -2.0f

    .line 143
    .line 144
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v0, 0x41500000    # 13.0f

    .line 151
    .line 152
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, 0x41300000    # 11.0f

    .line 159
    .line 160
    const/high16 v2, 0x41a80000    # 21.0f

    .line 161
    .line 162
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v0, 0x40000000    # 2.0f

    .line 166
    .line 167
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v0, -0x40000000    # -2.0f

    .line 171
    .line 172
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v0, 0x41a80000    # 21.0f

    .line 179
    .line 180
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v0, 0x40e00000    # 7.0f

    .line 187
    .line 188
    const/high16 v2, 0x40a00000    # 5.0f

    .line 189
    .line 190
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, 0x40000000    # 2.0f

    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x40400000    # 3.0f

    .line 199
    .line 200
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, 0x40e00000    # 7.0f

    .line 204
    .line 205
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v0, 0x40a00000    # 5.0f

    .line 209
    .line 210
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v0, 0x41880000    # 17.0f

    .line 217
    .line 218
    const/high16 v2, 0x40400000    # 3.0f

    .line 219
    .line 220
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x40000000    # 2.0f

    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v0, -0x40000000    # -2.0f

    .line 229
    .line 230
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v0, 0x40400000    # 3.0f

    .line 234
    .line 235
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v0, 0x41880000    # 17.0f

    .line 239
    .line 240
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v0, 0x41a80000    # 21.0f

    .line 247
    .line 248
    const/high16 v2, 0x40a00000    # 5.0f

    .line 249
    .line 250
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v0, -0x40000000    # -2.0f

    .line 254
    .line 255
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v0, 0x40400000    # 3.0f

    .line 259
    .line 260
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v17, 0x40a00000    # 5.0f

    .line 264
    .line 265
    const/high16 v18, 0x41a80000    # 21.0f

    .line 266
    .line 267
    const/high16 v13, 0x40400000    # 3.0f

    .line 268
    .line 269
    const v14, 0x41a0cccd    # 20.1f

    .line 270
    .line 271
    .line 272
    const v15, 0x4079999a    # 3.9f

    .line 273
    .line 274
    .line 275
    const/high16 v16, 0x41a80000    # 21.0f

    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v0, 0x41980000    # 19.0f

    .line 284
    .line 285
    const/high16 v2, 0x40400000    # 3.0f

    .line 286
    .line 287
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v0, 0x40000000    # 2.0f

    .line 291
    .line 292
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v17, 0x41980000    # 19.0f

    .line 299
    .line 300
    const/high16 v18, 0x40400000    # 3.0f

    .line 301
    .line 302
    const/high16 v13, 0x41a80000    # 21.0f

    .line 303
    .line 304
    const v14, 0x4079999a    # 3.9f

    .line 305
    .line 306
    .line 307
    const v15, 0x41a0cccd    # 20.1f

    .line 308
    .line 309
    .line 310
    const/high16 v16, 0x40400000    # 3.0f

    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v0, 0x41300000    # 11.0f

    .line 319
    .line 320
    const/high16 v2, 0x40a00000    # 5.0f

    .line 321
    .line 322
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v0, 0x40000000    # 2.0f

    .line 326
    .line 327
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v0, 0x40400000    # 3.0f

    .line 331
    .line 332
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, -0x40000000    # -2.0f

    .line 336
    .line 337
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x40a00000    # 5.0f

    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, 0x41100000    # 9.0f

    .line 349
    .line 350
    const/high16 v2, 0x40400000    # 3.0f

    .line 351
    .line 352
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v0, 0x40000000    # 2.0f

    .line 356
    .line 357
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v0, 0x40e00000    # 7.0f

    .line 361
    .line 362
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x40400000    # 3.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x41100000    # 9.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v0, 0x41a80000    # 21.0f

    .line 379
    .line 380
    const/high16 v2, 0x40e00000    # 7.0f

    .line 381
    .line 382
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x40000000    # 2.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, -0x40000000    # -2.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, 0x40e00000    # 7.0f

    .line 396
    .line 397
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x41a80000    # 21.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x41500000    # 13.0f

    .line 409
    .line 410
    const/high16 v2, 0x40400000    # 3.0f

    .line 411
    .line 412
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x40000000    # 2.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, -0x40000000    # -2.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x40400000    # 3.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, 0x41500000    # 13.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v0, 0x40a00000    # 5.0f

    .line 439
    .line 440
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v0, 0x40000000    # 2.0f

    .line 444
    .line 445
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v0, 0x40400000    # 3.0f

    .line 449
    .line 450
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v17, 0x40400000    # 3.0f

    .line 454
    .line 455
    const/high16 v18, 0x40a00000    # 5.0f

    .line 456
    .line 457
    const v13, 0x4079999a    # 3.9f

    .line 458
    .line 459
    .line 460
    const/high16 v14, 0x40400000    # 3.0f

    .line 461
    .line 462
    const/high16 v15, 0x40400000    # 3.0f

    .line 463
    .line 464
    const v16, 0x4079999a    # 3.9f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v0, 0x418a51ec    # 17.29f

    .line 474
    .line 475
    .line 476
    const v2, 0x4195ae14    # 18.71f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, -0x4047ae14    # -1.44f

    .line 483
    .line 484
    .line 485
    const v2, 0x3fb851ec    # 1.44f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v17, -0x414ccccd    # -0.35f

    .line 492
    .line 493
    .line 494
    const v18, -0x40a66666    # -0.85f

    .line 495
    .line 496
    .line 497
    const v13, 0x3ea3d70a    # 0.32f

    .line 498
    .line 499
    .line 500
    const v14, -0x415c28f6    # -0.32f

    .line 501
    .line 502
    .line 503
    const v15, 0x3db851ec    # 0.09f

    .line 504
    .line 505
    .line 506
    const v16, -0x40a66666    # -0.85f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v0, 0x41800000    # 16.0f

    .line 513
    .line 514
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v17, -0x40800000    # -1.0f

    .line 518
    .line 519
    const/high16 v18, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const v13, -0x40f33333    # -0.55f

    .line 522
    .line 523
    .line 524
    const/4 v14, 0x0

    .line 525
    const/high16 v15, -0x40800000    # -1.0f

    .line 526
    .line 527
    const v16, 0x3ee66666    # 0.45f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v0, 0x40728f5c    # 3.79f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v17, 0x3f59999a    # 0.85f

    .line 540
    .line 541
    .line 542
    const v18, 0x3eb33333    # 0.35f

    .line 543
    .line 544
    .line 545
    const/4 v13, 0x0

    .line 546
    const v14, 0x3ee66666    # 0.45f

    .line 547
    .line 548
    .line 549
    const v15, 0x3f0a3d71    # 0.54f

    .line 550
    .line 551
    .line 552
    const v16, 0x3f2b851f    # 0.67f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v0, -0x4047ae14    # -1.44f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v0, 0x40000000    # 2.0f

    .line 565
    .line 566
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v17, 0x3fb47ae1    # 1.41f

    .line 570
    .line 571
    .line 572
    const/16 v18, 0x0

    .line 573
    .line 574
    const v13, 0x3ec7ae14    # 0.39f

    .line 575
    .line 576
    .line 577
    const v14, 0x3ec7ae14    # 0.39f

    .line 578
    .line 579
    .line 580
    const v15, 0x3f828f5c    # 1.02f

    .line 581
    .line 582
    .line 583
    const v16, 0x3ec7ae14    # 0.39f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/16 v17, 0x0

    .line 590
    .line 591
    const v18, -0x404b851f    # -1.41f

    .line 592
    .line 593
    .line 594
    const v14, -0x413851ec    # -0.39f

    .line 595
    .line 596
    .line 597
    const v15, 0x3ec7ae14    # 0.39f

    .line 598
    .line 599
    .line 600
    const v16, -0x407d70a4    # -1.02f

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v0, 0x418a51ec    # 17.29f

    .line 607
    .line 608
    .line 609
    const v2, 0x4195ae14    # 18.71f

    .line 610
    .line 611
    .line 612
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    const/16 v16, 0x3800

    .line 623
    .line 624
    const/16 v17, 0x0

    .line 625
    .line 626
    const/high16 v6, 0x3f800000    # 1.0f

    .line 627
    .line 628
    const/high16 v8, 0x3f800000    # 1.0f

    .line 629
    .line 630
    const/4 v7, 0x0

    .line 631
    const/high16 v9, 0x3f800000    # 1.0f

    .line 632
    .line 633
    const/high16 v12, 0x3f800000    # 1.0f

    .line 634
    .line 635
    const/4 v13, 0x0

    .line 636
    const/4 v14, 0x0

    .line 637
    const/4 v15, 0x0

    .line 638
    const-string v4, ""

    .line 639
    .line 640
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    sput-object v0, Landroidx/compose/material/icons/rounded/HighlightAltKt;->_highlightAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 649
    .line 650
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 651
    .line 652
    .line 653
    return-object v0
.end method
