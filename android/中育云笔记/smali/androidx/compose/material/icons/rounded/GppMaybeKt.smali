.class public final Landroidx/compose/material/icons/rounded/GppMaybeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _gppMaybe:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGppMaybe(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/GppMaybeKt;->_gppMaybe:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.GppMaybe"

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
    const v0, 0x4134cccd    # 11.3f

    .line 71
    .line 72
    .line 73
    const v2, 0x4010a3d7    # 2.26f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x40100000    # 2.25f

    .line 80
    .line 81
    const/high16 v2, -0x3f400000    # -6.0f

    .line 82
    .line 83
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v17, 0x40800000    # 4.0f

    .line 87
    .line 88
    const v18, 0x40cc7ae1    # 6.39f

    .line 89
    .line 90
    .line 91
    const v13, 0x4090a3d7    # 4.52f

    .line 92
    .line 93
    .line 94
    const v14, 0x4099eb85    # 4.81f

    .line 95
    .line 96
    .line 97
    const/high16 v15, 0x40800000    # 4.0f

    .line 98
    .line 99
    const v16, 0x40b1999a    # 5.55f

    .line 100
    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, 0x40966666    # 4.7f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v17, 0x41000000    # 8.0f

    .line 112
    .line 113
    const v18, 0x412e8f5c    # 10.91f

    .line 114
    .line 115
    .line 116
    const/4 v13, 0x0

    .line 117
    const v14, 0x40a1999a    # 5.05f

    .line 118
    .line 119
    .line 120
    const v15, 0x405a3d71    # 3.41f

    .line 121
    .line 122
    .line 123
    const v16, 0x411c28f6    # 9.76f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v18, -0x3ed170a4    # -10.91f

    .line 130
    .line 131
    .line 132
    const v13, 0x4092e148    # 4.59f

    .line 133
    .line 134
    .line 135
    const v14, -0x406ccccd    # -1.15f

    .line 136
    .line 137
    .line 138
    const/high16 v15, 0x41000000    # 8.0f

    .line 139
    .line 140
    const v16, -0x3f447ae1    # -5.86f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, -0x3f69999a    # -4.7f

    .line 147
    .line 148
    .line 149
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v17, -0x4059999a    # -1.3f

    .line 153
    .line 154
    .line 155
    const v18, -0x4010a3d7    # -1.87f

    .line 156
    .line 157
    .line 158
    const/4 v13, 0x0

    .line 159
    const v14, -0x40ab851f    # -0.83f

    .line 160
    .line 161
    .line 162
    const v15, -0x40fae148    # -0.52f

    .line 163
    .line 164
    .line 165
    const v16, -0x4035c28f    # -1.58f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v0, -0x3ff00000    # -2.25f

    .line 172
    .line 173
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v17, 0x4134cccd    # 11.3f

    .line 177
    .line 178
    .line 179
    const v18, 0x4010a3d7    # 2.26f

    .line 180
    .line 181
    .line 182
    const/high16 v13, 0x41440000    # 12.25f

    .line 183
    .line 184
    const v14, 0x4005c28f    # 2.09f

    .line 185
    .line 186
    .line 187
    const/high16 v15, 0x413c0000    # 11.75f

    .line 188
    .line 189
    const v16, 0x4005c28f    # 2.09f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x41800000    # 16.0f

    .line 199
    .line 200
    const/high16 v2, 0x41400000    # 12.0f

    .line 201
    .line 202
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v17, -0x40800000    # -1.0f

    .line 209
    .line 210
    const/high16 v18, -0x40800000    # -1.0f

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
    const v16, -0x4119999a    # -0.45f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/4 v0, 0x0

    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, 0x3f800000    # 1.0f

    .line 229
    .line 230
    const/4 v13, 0x0

    .line 231
    const v14, -0x40f33333    # -0.55f

    .line 232
    .line 233
    .line 234
    const v15, 0x3ee66666    # 0.45f

    .line 235
    .line 236
    .line 237
    const/high16 v16, -0x40800000    # -1.0f

    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v18, 0x3f800000    # 1.0f

    .line 246
    .line 247
    const v13, 0x3f0ccccd    # 0.55f

    .line 248
    .line 249
    .line 250
    const/4 v14, 0x0

    .line 251
    const/high16 v15, 0x3f800000    # 1.0f

    .line 252
    .line 253
    const v16, 0x3ee66666    # 0.45f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v17, 0x41400000    # 12.0f

    .line 263
    .line 264
    const/high16 v18, 0x41800000    # 16.0f

    .line 265
    .line 266
    const/high16 v13, 0x41500000    # 13.0f

    .line 267
    .line 268
    const v14, 0x4178cccd    # 15.55f

    .line 269
    .line 270
    .line 271
    const v15, 0x4148cccd    # 12.55f

    .line 272
    .line 273
    .line 274
    const/high16 v16, 0x41800000    # 16.0f

    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v0, 0x41400000    # 12.0f

    .line 283
    .line 284
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v17, -0x40800000    # -1.0f

    .line 291
    .line 292
    const/high16 v18, -0x40800000    # -1.0f

    .line 293
    .line 294
    const v13, -0x40f33333    # -0.55f

    .line 295
    .line 296
    .line 297
    const/4 v14, 0x0

    .line 298
    const/high16 v15, -0x40800000    # -1.0f

    .line 299
    .line 300
    const v16, -0x4119999a    # -0.45f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v0, 0x41000000    # 8.0f

    .line 307
    .line 308
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v17, 0x3f800000    # 1.0f

    .line 312
    .line 313
    const/4 v13, 0x0

    .line 314
    const v14, -0x40f33333    # -0.55f

    .line 315
    .line 316
    .line 317
    const v15, 0x3ee66666    # 0.45f

    .line 318
    .line 319
    .line 320
    const/high16 v16, -0x40800000    # -1.0f

    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/4 v0, 0x0

    .line 326
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v18, 0x3f800000    # 1.0f

    .line 330
    .line 331
    const v13, 0x3f0ccccd    # 0.55f

    .line 332
    .line 333
    .line 334
    const/4 v14, 0x0

    .line 335
    const/high16 v15, 0x3f800000    # 1.0f

    .line 336
    .line 337
    const v16, 0x3ee66666    # 0.45f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v0, 0x40400000    # 3.0f

    .line 344
    .line 345
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v17, 0x41400000    # 12.0f

    .line 349
    .line 350
    const/high16 v18, 0x41400000    # 12.0f

    .line 351
    .line 352
    const/high16 v13, 0x41500000    # 13.0f

    .line 353
    .line 354
    const v14, 0x4138cccd    # 11.55f

    .line 355
    .line 356
    .line 357
    const v15, 0x4148cccd    # 12.55f

    .line 358
    .line 359
    .line 360
    const/high16 v16, 0x41400000    # 12.0f

    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    const/16 v16, 0x3800

    .line 373
    .line 374
    const/16 v17, 0x0

    .line 375
    .line 376
    const/high16 v6, 0x3f800000    # 1.0f

    .line 377
    .line 378
    const/high16 v8, 0x3f800000    # 1.0f

    .line 379
    .line 380
    const/4 v7, 0x0

    .line 381
    const/high16 v9, 0x3f800000    # 1.0f

    .line 382
    .line 383
    const/high16 v12, 0x3f800000    # 1.0f

    .line 384
    .line 385
    const/4 v13, 0x0

    .line 386
    const/4 v14, 0x0

    .line 387
    const/4 v15, 0x0

    .line 388
    const-string v4, ""

    .line 389
    .line 390
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    sput-object v0, Landroidx/compose/material/icons/rounded/GppMaybeKt;->_gppMaybe:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 399
    .line 400
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    return-object v0
.end method
