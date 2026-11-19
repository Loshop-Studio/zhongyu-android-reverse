.class public final Landroidx/compose/material/icons/filled/_19mpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __19mp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_19mp(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/_19mpKt;->__19mp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled._19mp"

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x40000000    # -2.0f

    .line 83
    .line 84
    const/high16 v18, 0x40000000    # 2.0f

    .line 85
    .line 86
    const v13, -0x40733333    # -1.1f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, -0x40000000    # -2.0f

    .line 91
    .line 92
    const v16, 0x3f666666    # 0.9f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x41600000    # 14.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, 0x40000000    # 2.0f

    .line 104
    .line 105
    const/4 v13, 0x0

    .line 106
    const v14, 0x3f8ccccd    # 1.1f

    .line 107
    .line 108
    .line 109
    const v15, 0x3f666666    # 0.9f

    .line 110
    .line 111
    .line 112
    const/high16 v16, 0x40000000    # 2.0f

    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v18, -0x40000000    # -2.0f

    .line 121
    .line 122
    const v13, 0x3f8ccccd    # 1.1f

    .line 123
    .line 124
    .line 125
    const/4 v14, 0x0

    .line 126
    const/high16 v15, 0x40000000    # 2.0f

    .line 127
    .line 128
    const v16, -0x4099999a    # -0.9f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v0, 0x41a80000    # 21.0f

    .line 135
    .line 136
    const/high16 v2, 0x40a00000    # 5.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v17, -0x40000000    # -2.0f

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    const v14, -0x40733333    # -1.1f

    .line 145
    .line 146
    .line 147
    const v15, -0x4099999a    # -0.9f

    .line 148
    .line 149
    .line 150
    const/high16 v16, -0x40000000    # -2.0f

    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, 0x41200000    # 10.0f

    .line 159
    .line 160
    const/high16 v2, 0x41400000    # 12.0f

    .line 161
    .line 162
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v0, 0x40400000    # 3.0f

    .line 166
    .line 167
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v0, 0x41100000    # 9.0f

    .line 171
    .line 172
    const/high16 v2, 0x41700000    # 15.0f

    .line 173
    .line 174
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v0, -0x40000000    # -2.0f

    .line 178
    .line 179
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v17, -0x40800000    # -1.0f

    .line 183
    .line 184
    const/high16 v18, -0x40800000    # -1.0f

    .line 185
    .line 186
    const v13, -0x40f33333    # -0.55f

    .line 187
    .line 188
    .line 189
    const/4 v14, 0x0

    .line 190
    const/high16 v15, -0x40800000    # -1.0f

    .line 191
    .line 192
    const v16, -0x4119999a    # -0.45f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x40d00000    # 6.5f

    .line 199
    .line 200
    const/high16 v2, 0x41400000    # 12.0f

    .line 201
    .line 202
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v17, 0x3f800000    # 1.0f

    .line 206
    .line 207
    const/4 v13, 0x0

    .line 208
    const v14, -0x40f33333    # -0.55f

    .line 209
    .line 210
    .line 211
    const v15, 0x3ee66666    # 0.45f

    .line 212
    .line 213
    .line 214
    const/high16 v16, -0x40800000    # -1.0f

    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v0, 0x40200000    # 2.5f

    .line 220
    .line 221
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v18, 0x3f800000    # 1.0f

    .line 225
    .line 226
    const v13, 0x3f0ccccd    # 0.55f

    .line 227
    .line 228
    .line 229
    const/4 v14, 0x0

    .line 230
    const/high16 v15, 0x3f800000    # 1.0f

    .line 231
    .line 232
    const v16, 0x3ee66666    # 0.45f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v0, 0x40800000    # 4.0f

    .line 239
    .line 240
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v17, -0x40800000    # -1.0f

    .line 244
    .line 245
    const/4 v13, 0x0

    .line 246
    const v14, 0x3f0ccccd    # 0.55f

    .line 247
    .line 248
    .line 249
    const v15, -0x4119999a    # -0.45f

    .line 250
    .line 251
    .line 252
    const/high16 v16, 0x3f800000    # 1.0f

    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x41380000    # 11.5f

    .line 258
    .line 259
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v0, 0x41200000    # 10.0f

    .line 263
    .line 264
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, 0x41580000    # 13.5f

    .line 271
    .line 272
    const/high16 v2, 0x41000000    # 8.0f

    .line 273
    .line 274
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v0, 0x41700000    # 15.0f

    .line 278
    .line 279
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v0, 0x40d00000    # 6.5f

    .line 283
    .line 284
    const/high16 v2, 0x41700000    # 15.0f

    .line 285
    .line 286
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v0, -0x40400000    # -1.5f

    .line 290
    .line 291
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x41580000    # 13.5f

    .line 295
    .line 296
    const/high16 v2, 0x41000000    # 8.0f

    .line 297
    .line 298
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v0, 0x40b00000    # 5.5f

    .line 305
    .line 306
    const/high16 v2, 0x40e00000    # 7.0f

    .line 307
    .line 308
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v0, 0x40400000    # 3.0f

    .line 312
    .line 313
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x40c00000    # 6.0f

    .line 317
    .line 318
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v0, 0x41080000    # 8.5f

    .line 322
    .line 323
    const/high16 v2, 0x41380000    # 11.5f

    .line 324
    .line 325
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v2, 0x40e00000    # 7.0f

    .line 329
    .line 330
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v0, 0x40e00000    # 7.0f

    .line 334
    .line 335
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v0, 0x40b00000    # 5.5f

    .line 339
    .line 340
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v0, 0x41940000    # 18.5f

    .line 347
    .line 348
    const/high16 v2, 0x41400000    # 12.0f

    .line 349
    .line 350
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v0, -0x40400000    # -1.5f

    .line 354
    .line 355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v0, 0x41280000    # 10.5f

    .line 359
    .line 360
    const/high16 v2, 0x41600000    # 14.0f

    .line 361
    .line 362
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, -0x40800000    # -1.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x40400000    # 3.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x41880000    # 17.0f

    .line 376
    .line 377
    const/high16 v2, 0x41000000    # 8.0f

    .line 378
    .line 379
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v0, 0x40e00000    # 7.0f

    .line 388
    .line 389
    const/high16 v2, 0x41600000    # 14.0f

    .line 390
    .line 391
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v0, 0x40900000    # 4.5f

    .line 395
    .line 396
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v0, 0x40b00000    # 5.5f

    .line 400
    .line 401
    const/high16 v2, 0x41940000    # 18.5f

    .line 402
    .line 403
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, -0x3f600000    # -5.0f

    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v17, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const/high16 v18, -0x40800000    # -1.0f

    .line 414
    .line 415
    const v14, -0x40f33333    # -0.55f

    .line 416
    .line 417
    .line 418
    const v15, 0x3ee66666    # 0.45f

    .line 419
    .line 420
    .line 421
    const/high16 v16, -0x40800000    # -1.0f

    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v0, 0x41300000    # 11.0f

    .line 427
    .line 428
    const/high16 v2, 0x41480000    # 12.5f

    .line 429
    .line 430
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v18, 0x3f800000    # 1.0f

    .line 434
    .line 435
    const v13, 0x3f0ccccd    # 0.55f

    .line 436
    .line 437
    .line 438
    const/4 v14, 0x0

    .line 439
    const/high16 v15, 0x3f800000    # 1.0f

    .line 440
    .line 441
    const v16, 0x3ee66666    # 0.45f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v0, 0x40a00000    # 5.0f

    .line 448
    .line 449
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v0, 0x41800000    # 16.0f

    .line 456
    .line 457
    const/high16 v2, 0x41940000    # 18.5f

    .line 458
    .line 459
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v17, -0x40800000    # -1.0f

    .line 463
    .line 464
    const/4 v13, 0x0

    .line 465
    const v14, 0x3f0ccccd    # 0.55f

    .line 466
    .line 467
    .line 468
    const v15, -0x4119999a    # -0.45f

    .line 469
    .line 470
    .line 471
    const/high16 v16, 0x3f800000    # 1.0f

    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v0, -0x40000000    # -2.0f

    .line 477
    .line 478
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 482
    .line 483
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v0, 0x41940000    # 18.5f

    .line 487
    .line 488
    const/high16 v2, 0x41600000    # 14.0f

    .line 489
    .line 490
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v0, -0x3f400000    # -6.0f

    .line 494
    .line 495
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v0, 0x40600000    # 3.5f

    .line 499
    .line 500
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v17, 0x3f800000    # 1.0f

    .line 504
    .line 505
    const v13, 0x3f0ccccd    # 0.55f

    .line 506
    .line 507
    .line 508
    const/4 v14, 0x0

    .line 509
    const/high16 v15, 0x3f800000    # 1.0f

    .line 510
    .line 511
    const v16, 0x3ee66666    # 0.45f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, 0x41800000    # 16.0f

    .line 518
    .line 519
    const/high16 v2, 0x41940000    # 18.5f

    .line 520
    .line 521
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, 0x41780000    # 15.5f

    .line 528
    .line 529
    const/high16 v2, 0x41600000    # 14.0f

    .line 530
    .line 531
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v0, 0x41880000    # 17.0f

    .line 535
    .line 536
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 540
    .line 541
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v0, -0x40400000    # -1.5f

    .line 545
    .line 546
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    const/16 v16, 0x3800

    .line 557
    .line 558
    const/16 v17, 0x0

    .line 559
    .line 560
    const/high16 v6, 0x3f800000    # 1.0f

    .line 561
    .line 562
    const/high16 v8, 0x3f800000    # 1.0f

    .line 563
    .line 564
    const/4 v7, 0x0

    .line 565
    const/high16 v9, 0x3f800000    # 1.0f

    .line 566
    .line 567
    const/high16 v12, 0x3f800000    # 1.0f

    .line 568
    .line 569
    const/4 v13, 0x0

    .line 570
    const/4 v15, 0x0

    .line 571
    const-string v4, ""

    .line 572
    .line 573
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    sput-object v0, Landroidx/compose/material/icons/filled/_19mpKt;->__19mp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 582
    .line 583
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    return-object v0
.end method
