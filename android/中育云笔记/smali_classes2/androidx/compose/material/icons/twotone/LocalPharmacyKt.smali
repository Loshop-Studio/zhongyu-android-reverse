.class public final Landroidx/compose/material/icons/twotone/LocalPharmacyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localPharmacy:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalPharmacy(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 32

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LocalPharmacyKt;->_localPharmacy:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.LocalPharmacy"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v4, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v6, 0x40a3851f    # 5.11f

    .line 71
    .line 72
    .line 73
    const/high16 v7, 0x41980000    # 19.0f

    .line 74
    .line 75
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v8, 0x415c7ae1    # 13.78f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v9, -0x401ae148    # -1.79f

    .line 85
    .line 86
    .line 87
    const v12, -0x3f5428f6    # -5.37f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, v9, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v13, -0x41a8f5c3    # -0.21f

    .line 94
    .line 95
    .line 96
    const v14, -0x40deb852    # -0.63f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v13, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v15, 0x3e570a3d    # 0.21f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v15, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v8, 0x41971eb8    # 18.89f

    .line 109
    .line 110
    .line 111
    const/high16 v9, 0x40e00000    # 7.0f

    .line 112
    .line 113
    invoke-virtual {v4, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v8, 0x3fe51eb8    # 1.79f

    .line 120
    .line 121
    .line 122
    const v9, 0x40abd70a    # 5.37f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v8, 0x3f2147ae    # 0.63f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, v15, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v13, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v6, 0x41000000    # 8.0f

    .line 144
    .line 145
    const/high16 v7, 0x41400000    # 12.0f

    .line 146
    .line 147
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v7, 0x40400000    # 3.0f

    .line 151
    .line 152
    invoke-virtual {v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v8, 0x41100000    # 9.0f

    .line 156
    .line 157
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v8, 0x40000000    # 2.0f

    .line 161
    .line 162
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v8, -0x3fc00000    # -3.0f

    .line 175
    .line 176
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v7, -0x40000000    # -2.0f

    .line 183
    .line 184
    invoke-virtual {v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    const v20, -0x401ae148    # -1.79f

    .line 204
    .line 205
    .line 206
    const/16 v16, 0x3800

    .line 207
    .line 208
    const v21, 0x41971eb8    # 18.89f

    .line 209
    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    move-object/from16 v22, v2

    .line 214
    .line 215
    move-object v2, v4

    .line 216
    const-string v4, ""

    .line 217
    .line 218
    move/from16 v23, v6

    .line 219
    .line 220
    const v6, 0x3e99999a    # 0.3f

    .line 221
    .line 222
    .line 223
    move/from16 v24, v7

    .line 224
    .line 225
    const/4 v7, 0x0

    .line 226
    move/from16 v25, v8

    .line 227
    .line 228
    const v8, 0x3e99999a    # 0.3f

    .line 229
    .line 230
    .line 231
    move/from16 v26, v9

    .line 232
    .line 233
    const/high16 v9, 0x3f800000    # 1.0f

    .line 234
    .line 235
    move/from16 v27, v12

    .line 236
    .line 237
    const/high16 v12, 0x3f800000    # 1.0f

    .line 238
    .line 239
    move/from16 v28, v13

    .line 240
    .line 241
    const/4 v13, 0x0

    .line 242
    move/from16 v29, v14

    .line 243
    .line 244
    const/4 v14, 0x0

    .line 245
    move/from16 v30, v15

    .line 246
    .line 247
    const/4 v15, 0x0

    .line 248
    move-object/from16 v31, v0

    .line 249
    .line 250
    move-object/from16 v0, v22

    .line 251
    .line 252
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 253
    .line 254
    .line 255
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 260
    .line 261
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 262
    .line 263
    .line 264
    move-result-wide v6

    .line 265
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 269
    .line 270
    .line 271
    move-result v10

    .line 272
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 273
    .line 274
    .line 275
    move-result v11

    .line 276
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 279
    .line 280
    .line 281
    const/high16 v2, 0x41a80000    # 21.0f

    .line 282
    .line 283
    const/high16 v4, 0x40400000    # 3.0f

    .line 284
    .line 285
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v2, 0x41900000    # 18.0f

    .line 289
    .line 290
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v2, -0x40000000    # -2.0f

    .line 294
    .line 295
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v6, -0x3f400000    # -6.0f

    .line 299
    .line 300
    invoke-virtual {v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v7, 0x40000000    # 2.0f

    .line 304
    .line 305
    invoke-virtual {v0, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v6, 0x41a80000    # 21.0f

    .line 309
    .line 310
    const/high16 v8, 0x40a00000    # 5.0f

    .line 311
    .line 312
    invoke-virtual {v0, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v6, -0x3fd70a3d    # -2.64f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v6, 0x3f91eb85    # 1.14f

    .line 322
    .line 323
    .line 324
    const v8, -0x3fb70a3d    # -3.14f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v6, 0x41893333    # 17.15f

    .line 331
    .line 332
    .line 333
    const/high16 v8, 0x3f800000    # 1.0f

    .line 334
    .line 335
    invoke-virtual {v0, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v6, -0x40451eb8    # -1.46f

    .line 339
    .line 340
    .line 341
    const/high16 v8, 0x40800000    # 4.0f

    .line 342
    .line 343
    invoke-virtual {v0, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v6, 0x40a00000    # 5.0f

    .line 347
    .line 348
    invoke-virtual {v0, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v6, 0x40c00000    # 6.0f

    .line 355
    .line 356
    invoke-virtual {v0, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v6, 0x40dccccd    # 6.9f

    .line 369
    .line 370
    .line 371
    const v8, 0x4145eb85    # 12.37f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v6, 0x40e00000    # 7.0f

    .line 378
    .line 379
    const v8, 0x40a3851f    # 5.11f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, v8, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v6, 0x415c7ae1    # 13.78f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v6, 0x40abd70a    # 5.37f

    .line 392
    .line 393
    .line 394
    const v9, -0x401ae148    # -1.79f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0, v9, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v6, 0x3f2147ae    # 0.63f

    .line 401
    .line 402
    .line 403
    const v9, -0x41a8f5c3    # -0.21f

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0, v9, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v12, 0x3e570a3d    # 0.21f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0, v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v6, 0x41971eb8    # 18.89f

    .line 416
    .line 417
    .line 418
    const/high16 v13, 0x41980000    # 19.0f

    .line 419
    .line 420
    invoke-virtual {v0, v6, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v0, v8, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v6, 0x3fe51eb8    # 1.79f

    .line 427
    .line 428
    .line 429
    const v8, -0x3f5428f6    # -5.37f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v0, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v6, -0x40deb852    # -0.63f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v0, v9, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v6, 0x41300000    # 11.0f

    .line 448
    .line 449
    const/high16 v8, 0x41880000    # 17.0f

    .line 450
    .line 451
    invoke-virtual {v0, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v0, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 458
    .line 459
    invoke-virtual {v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v6, 0x41500000    # 13.0f

    .line 472
    .line 473
    const/high16 v8, 0x41100000    # 9.0f

    .line 474
    .line 475
    invoke-virtual {v0, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v2, 0x41400000    # 12.0f

    .line 485
    .line 486
    const/high16 v6, 0x41000000    # 8.0f

    .line 487
    .line 488
    invoke-virtual {v0, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v0, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    const-string v4, ""

    .line 505
    .line 506
    const/high16 v6, 0x3f800000    # 1.0f

    .line 507
    .line 508
    const/4 v7, 0x0

    .line 509
    const/high16 v8, 0x3f800000    # 1.0f

    .line 510
    .line 511
    const/high16 v9, 0x3f800000    # 1.0f

    .line 512
    .line 513
    const/high16 v12, 0x3f800000    # 1.0f

    .line 514
    .line 515
    const/4 v13, 0x0

    .line 516
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    sput-object v0, Landroidx/compose/material/icons/twotone/LocalPharmacyKt;->_localPharmacy:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 525
    .line 526
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    return-object v0
.end method
