.class public final Landroidx/compose/material/icons/filled/PhoneInTalkKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _phoneInTalk:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneInTalk(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PhoneInTalkKt;->_phoneInTalk:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.PhoneInTalk"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v2, 0x41780000    # 15.5f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x3f9b851f    # -3.57f

    .line 78
    .line 79
    .line 80
    const v18, -0x40ee147b    # -0.57f

    .line 81
    .line 82
    .line 83
    const/high16 v13, -0x40600000    # -1.25f

    .line 84
    .line 85
    const/4 v14, 0x0

    .line 86
    const v15, -0x3fe33333    # -2.45f

    .line 87
    .line 88
    .line 89
    const v16, -0x41b33333    # -0.2f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v17, -0x407d70a4    # -1.02f

    .line 96
    .line 97
    .line 98
    const v18, 0x3e75c28f    # 0.24f

    .line 99
    .line 100
    .line 101
    const v13, -0x414ccccd    # -0.35f

    .line 102
    .line 103
    .line 104
    const v14, -0x421eb852    # -0.11f

    .line 105
    .line 106
    .line 107
    const v15, -0x40c28f5c    # -0.74f

    .line 108
    .line 109
    .line 110
    const v16, -0x430a3d71    # -0.03f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, -0x3ff33333    # -2.2f

    .line 117
    .line 118
    .line 119
    const v2, 0x400ccccd    # 2.2f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v17, -0x3f2d1eb8    # -6.59f

    .line 126
    .line 127
    .line 128
    const v18, -0x3f2d1eb8    # -6.59f

    .line 129
    .line 130
    .line 131
    const v13, -0x3fcae148    # -2.83f

    .line 132
    .line 133
    .line 134
    const v14, -0x4047ae14    # -1.44f

    .line 135
    .line 136
    .line 137
    const v15, -0x3f5b3333    # -5.15f

    .line 138
    .line 139
    .line 140
    const/high16 v16, -0x3f900000    # -3.75f

    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v0, -0x3ff28f5c    # -2.21f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, 0x3e800000    # 0.25f

    .line 152
    .line 153
    const/high16 v18, -0x40800000    # -1.0f

    .line 154
    .line 155
    const v13, 0x3e8f5c29    # 0.28f

    .line 156
    .line 157
    .line 158
    const v14, -0x417ae148    # -0.26f

    .line 159
    .line 160
    .line 161
    const v15, 0x3eb851ec    # 0.36f

    .line 162
    .line 163
    .line 164
    const v16, -0x40d9999a    # -0.65f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v17, 0x41080000    # 8.5f

    .line 171
    .line 172
    const/high16 v18, 0x40800000    # 4.0f

    .line 173
    .line 174
    const v13, 0x410b3333    # 8.7f

    .line 175
    .line 176
    .line 177
    const v14, 0x40ce6666    # 6.45f

    .line 178
    .line 179
    .line 180
    const/high16 v15, 0x41080000    # 8.5f

    .line 181
    .line 182
    const/high16 v16, 0x40a80000    # 5.25f

    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, -0x40800000    # -1.0f

    .line 188
    .line 189
    const/high16 v18, -0x40800000    # -1.0f

    .line 190
    .line 191
    const/4 v13, 0x0

    .line 192
    const v14, -0x40f33333    # -0.55f

    .line 193
    .line 194
    .line 195
    const v15, -0x4119999a    # -0.45f

    .line 196
    .line 197
    .line 198
    const/high16 v16, -0x40800000    # -1.0f

    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, 0x40800000    # 4.0f

    .line 204
    .line 205
    const/high16 v2, 0x40400000    # 3.0f

    .line 206
    .line 207
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v18, 0x3f800000    # 1.0f

    .line 211
    .line 212
    const v13, -0x40f33333    # -0.55f

    .line 213
    .line 214
    .line 215
    const/4 v14, 0x0

    .line 216
    const/high16 v15, -0x40800000    # -1.0f

    .line 217
    .line 218
    const v16, 0x3ee66666    # 0.45f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v17, 0x41880000    # 17.0f

    .line 225
    .line 226
    const/high16 v18, 0x41880000    # 17.0f

    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    const v14, 0x41163d71    # 9.39f

    .line 230
    .line 231
    .line 232
    const v15, 0x40f3851f    # 7.61f

    .line 233
    .line 234
    .line 235
    const/high16 v16, 0x41880000    # 17.0f

    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v17, 0x3f800000    # 1.0f

    .line 241
    .line 242
    const/high16 v18, -0x40800000    # -1.0f

    .line 243
    .line 244
    const v13, 0x3f0ccccd    # 0.55f

    .line 245
    .line 246
    .line 247
    const/4 v14, 0x0

    .line 248
    const/high16 v15, 0x3f800000    # 1.0f

    .line 249
    .line 250
    const v16, -0x4119999a    # -0.45f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 257
    .line 258
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v17, -0x40800000    # -1.0f

    .line 262
    .line 263
    const/4 v13, 0x0

    .line 264
    const v14, -0x40f33333    # -0.55f

    .line 265
    .line 266
    .line 267
    const v15, -0x4119999a    # -0.45f

    .line 268
    .line 269
    .line 270
    const/high16 v16, -0x40800000    # -1.0f

    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v0, 0x41980000    # 19.0f

    .line 279
    .line 280
    const/high16 v2, 0x41400000    # 12.0f

    .line 281
    .line 282
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, 0x40000000    # 2.0f

    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 291
    .line 292
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 293
    .line 294
    const v14, -0x3f60f5c3    # -4.97f

    .line 295
    .line 296
    .line 297
    const v15, -0x3f7f0a3d    # -4.03f

    .line 298
    .line 299
    .line 300
    const/high16 v16, -0x3ef00000    # -9.0f

    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v17, 0x40e00000    # 7.0f

    .line 309
    .line 310
    const/high16 v18, 0x40e00000    # 7.0f

    .line 311
    .line 312
    const v13, 0x4077ae14    # 3.87f

    .line 313
    .line 314
    .line 315
    const/4 v14, 0x0

    .line 316
    const/high16 v15, 0x40e00000    # 7.0f

    .line 317
    .line 318
    const v16, 0x404851ec    # 3.13f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, 0x41700000    # 15.0f

    .line 328
    .line 329
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v0, 0x40000000    # 2.0f

    .line 333
    .line 334
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v17, -0x3f600000    # -5.0f

    .line 338
    .line 339
    const/high16 v18, -0x3f600000    # -5.0f

    .line 340
    .line 341
    const/4 v13, 0x0

    .line 342
    const v14, -0x3fcf5c29    # -2.76f

    .line 343
    .line 344
    .line 345
    const v15, -0x3ff0a3d7    # -2.24f

    .line 346
    .line 347
    .line 348
    const/high16 v16, -0x3f600000    # -5.0f

    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v17, 0x40400000    # 3.0f

    .line 357
    .line 358
    const/high16 v18, 0x40400000    # 3.0f

    .line 359
    .line 360
    const v13, 0x3fd47ae1    # 1.66f

    .line 361
    .line 362
    .line 363
    const/4 v14, 0x0

    .line 364
    const/high16 v15, 0x40400000    # 3.0f

    .line 365
    .line 366
    const v16, 0x3fab851f    # 1.34f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    const/16 v16, 0x3800

    .line 380
    .line 381
    const/16 v17, 0x0

    .line 382
    .line 383
    const/high16 v6, 0x3f800000    # 1.0f

    .line 384
    .line 385
    const/high16 v8, 0x3f800000    # 1.0f

    .line 386
    .line 387
    const/4 v7, 0x0

    .line 388
    const/high16 v9, 0x3f800000    # 1.0f

    .line 389
    .line 390
    const/high16 v12, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const/4 v13, 0x0

    .line 393
    const/4 v15, 0x0

    .line 394
    const-string v4, ""

    .line 395
    .line 396
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    sput-object v0, Landroidx/compose/material/icons/filled/PhoneInTalkKt;->_phoneInTalk:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 405
    .line 406
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    return-object v0
.end method
