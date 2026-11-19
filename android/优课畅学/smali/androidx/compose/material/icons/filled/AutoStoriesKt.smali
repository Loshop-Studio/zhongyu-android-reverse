.class public final Landroidx/compose/material/icons/filled/AutoStoriesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _autoStories:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAutoStories(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/AutoStoriesKt;->_autoStories:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.AutoStories"

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
    const/high16 v2, 0x3f800000    # 1.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, -0x3f600000    # -5.0f

    .line 78
    .line 79
    const/high16 v2, 0x40a00000    # 5.0f

    .line 80
    .line 81
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v0, 0x41300000    # 11.0f

    .line 85
    .line 86
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v0, -0x3f700000    # -4.5f

    .line 90
    .line 91
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v0, 0x41980000    # 19.0f

    .line 95
    .line 96
    const/high16 v2, 0x3f800000    # 1.0f

    .line 97
    .line 98
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, 0x40c00000    # 6.0f

    .line 105
    .line 106
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, 0x416a6666    # 14.65f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v17, 0x3f000000    # 0.5f

    .line 116
    .line 117
    const/high16 v18, 0x3f000000    # 0.5f

    .line 118
    .line 119
    const/4 v13, 0x0

    .line 120
    const/high16 v14, 0x3e800000    # 0.25f

    .line 121
    .line 122
    const/high16 v15, 0x3e800000    # 0.25f

    .line 123
    .line 124
    const/high16 v16, 0x3f000000    # 0.5f

    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v17, 0x3e800000    # 0.25f

    .line 130
    .line 131
    const v18, -0x42b33333    # -0.05f

    .line 132
    .line 133
    .line 134
    const v13, 0x3dcccccd    # 0.1f

    .line 135
    .line 136
    .line 137
    const/4 v14, 0x0

    .line 138
    const v15, 0x3e19999a    # 0.15f

    .line 139
    .line 140
    .line 141
    const v16, -0x42b33333    # -0.05f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v17, 0x40d00000    # 6.5f

    .line 148
    .line 149
    const/high16 v18, 0x41a00000    # 20.0f

    .line 150
    .line 151
    const v13, 0x40466666    # 3.1f

    .line 152
    .line 153
    .line 154
    const v14, 0x41a3999a    # 20.45f

    .line 155
    .line 156
    .line 157
    const v15, 0x40a1999a    # 5.05f

    .line 158
    .line 159
    .line 160
    const/high16 v16, 0x41a00000    # 20.0f

    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v17, 0x40b00000    # 5.5f

    .line 166
    .line 167
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 168
    .line 169
    const v13, 0x3ff9999a    # 1.95f

    .line 170
    .line 171
    .line 172
    const/4 v14, 0x0

    .line 173
    const v15, 0x4081999a    # 4.05f

    .line 174
    .line 175
    .line 176
    const v16, 0x3ecccccd    # 0.4f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v0, 0x41400000    # 12.0f

    .line 183
    .line 184
    const/high16 v2, 0x40c00000    # 6.0f

    .line 185
    .line 186
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v17, -0x3f500000    # -5.5f

    .line 190
    .line 191
    const/high16 v18, -0x40400000    # -1.5f

    .line 192
    .line 193
    const v13, -0x40466666    # -1.45f

    .line 194
    .line 195
    .line 196
    const v14, -0x40733333    # -1.1f

    .line 197
    .line 198
    .line 199
    const v15, -0x3f9ccccd    # -3.55f

    .line 200
    .line 201
    .line 202
    const/high16 v16, -0x40400000    # -1.5f

    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x401ccccd    # 2.45f

    .line 208
    .line 209
    .line 210
    const v2, 0x409ccccd    # 4.9f

    .line 211
    .line 212
    .line 213
    const/high16 v4, 0x40c00000    # 6.0f

    .line 214
    .line 215
    const/high16 v6, 0x3f800000    # 1.0f

    .line 216
    .line 217
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x419c0000    # 19.5f

    .line 224
    .line 225
    const/high16 v2, 0x41b80000    # 23.0f

    .line 226
    .line 227
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v0, 0x41b80000    # 23.0f

    .line 231
    .line 232
    const/high16 v2, 0x40c00000    # 6.0f

    .line 233
    .line 234
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v17, -0x40000000    # -2.0f

    .line 238
    .line 239
    const/high16 v18, -0x40800000    # -1.0f

    .line 240
    .line 241
    const v13, -0x40e66666    # -0.6f

    .line 242
    .line 243
    .line 244
    const v14, -0x4119999a    # -0.45f

    .line 245
    .line 246
    .line 247
    const/high16 v15, -0x40600000    # -1.25f

    .line 248
    .line 249
    const/high16 v16, -0x40c00000    # -0.75f

    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v0, 0x41580000    # 13.5f

    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 260
    .line 261
    const/high16 v18, -0x41000000    # -0.5f

    .line 262
    .line 263
    const v13, -0x40733333    # -1.1f

    .line 264
    .line 265
    .line 266
    const v14, -0x414ccccd    # -0.35f

    .line 267
    .line 268
    .line 269
    const v15, -0x3feccccd    # -2.3f

    .line 270
    .line 271
    .line 272
    const/high16 v16, -0x41000000    # -0.5f

    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v17, -0x3f500000    # -5.5f

    .line 278
    .line 279
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 280
    .line 281
    const v13, -0x40266666    # -1.7f

    .line 282
    .line 283
    .line 284
    const/4 v14, 0x0

    .line 285
    const v15, -0x3f7b3333    # -4.15f

    .line 286
    .line 287
    .line 288
    const v16, 0x3f266666    # 0.65f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x40000000    # 2.0f

    .line 295
    .line 296
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v17, 0x40b00000    # 5.5f

    .line 300
    .line 301
    const/high16 v18, -0x40400000    # -1.5f

    .line 302
    .line 303
    const v13, 0x3faccccd    # 1.35f

    .line 304
    .line 305
    .line 306
    const v14, -0x40a66666    # -0.85f

    .line 307
    .line 308
    .line 309
    const v15, 0x40733333    # 3.8f

    .line 310
    .line 311
    .line 312
    const/high16 v16, -0x40400000    # -1.5f

    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v17, 0x40980000    # 4.75f

    .line 318
    .line 319
    const v18, 0x3f866666    # 1.05f

    .line 320
    .line 321
    .line 322
    const v13, 0x3fd33333    # 1.65f

    .line 323
    .line 324
    .line 325
    const/4 v14, 0x0

    .line 326
    const v15, 0x40566666    # 3.35f

    .line 327
    .line 328
    .line 329
    const v16, 0x3e99999a    # 0.3f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v17, 0x3e800000    # 0.25f

    .line 336
    .line 337
    const v18, 0x3d4ccccd    # 0.05f

    .line 338
    .line 339
    .line 340
    const v13, 0x3dcccccd    # 0.1f

    .line 341
    .line 342
    .line 343
    const v14, 0x3d4ccccd    # 0.05f

    .line 344
    .line 345
    .line 346
    const v15, 0x3e19999a    # 0.15f

    .line 347
    .line 348
    .line 349
    const v16, 0x3d4ccccd    # 0.05f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v17, 0x3f000000    # 0.5f

    .line 356
    .line 357
    const/high16 v18, -0x41000000    # -0.5f

    .line 358
    .line 359
    const/high16 v13, 0x3e800000    # 0.25f

    .line 360
    .line 361
    const/4 v14, 0x0

    .line 362
    const/high16 v15, 0x3f000000    # 0.5f

    .line 363
    .line 364
    const/high16 v16, -0x41800000    # -0.25f

    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, -0x40733333    # -1.1f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    const/16 v16, 0x3800

    .line 383
    .line 384
    const/16 v17, 0x0

    .line 385
    .line 386
    const/high16 v8, 0x3f800000    # 1.0f

    .line 387
    .line 388
    const/4 v7, 0x0

    .line 389
    const/high16 v9, 0x3f800000    # 1.0f

    .line 390
    .line 391
    const/high16 v12, 0x3f800000    # 1.0f

    .line 392
    .line 393
    const/4 v13, 0x0

    .line 394
    const/4 v15, 0x0

    .line 395
    const-string v4, ""

    .line 396
    .line 397
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    sput-object v0, Landroidx/compose/material/icons/filled/AutoStoriesKt;->_autoStories:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 406
    .line 407
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    return-object v0
.end method
