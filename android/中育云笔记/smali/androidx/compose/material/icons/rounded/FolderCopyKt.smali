.class public final Landroidx/compose/material/icons/rounded/FolderCopyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _folderCopy:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFolderCopy(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FolderCopyKt;->_folderCopy:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FolderCopy"

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
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v25, 0x3f800000    # 1.0f

    .line 81
    .line 82
    const/high16 v26, 0x40e00000    # 7.0f

    .line 83
    .line 84
    const v21, 0x3fb9999a    # 1.45f

    .line 85
    .line 86
    .line 87
    const/high16 v22, 0x40c00000    # 6.0f

    .line 88
    .line 89
    const/high16 v23, 0x3f800000    # 1.0f

    .line 90
    .line 91
    const v24, 0x40ce6666    # 6.45f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v4, 0x41400000    # 12.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v25, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v26, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/16 v21, 0x0

    .line 109
    .line 110
    const v22, 0x3f8ccccd    # 1.1f

    .line 111
    .line 112
    .line 113
    const v23, 0x3f666666    # 0.9f

    .line 114
    .line 115
    .line 116
    const/high16 v24, 0x40000000    # 2.0f

    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v4, 0x41800000    # 16.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v25, 0x3f800000    # 1.0f

    .line 127
    .line 128
    const/high16 v26, -0x40800000    # -1.0f

    .line 129
    .line 130
    const v21, 0x3f0ccccd    # 0.55f

    .line 131
    .line 132
    .line 133
    const/16 v22, 0x0

    .line 134
    .line 135
    const/high16 v23, 0x3f800000    # 1.0f

    .line 136
    .line 137
    const v24, -0x4119999a    # -0.45f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/4 v4, 0x0

    .line 144
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v25, -0x40800000    # -1.0f

    .line 148
    .line 149
    const/16 v21, 0x0

    .line 150
    .line 151
    const v22, -0x40f33333    # -0.55f

    .line 152
    .line 153
    .line 154
    const v23, -0x4119999a    # -0.45f

    .line 155
    .line 156
    .line 157
    const/high16 v24, -0x40800000    # -1.0f

    .line 158
    .line 159
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v4, 0x40400000    # 3.0f

    .line 163
    .line 164
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, 0x40e00000    # 7.0f

    .line 168
    .line 169
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v25, 0x40000000    # 2.0f

    .line 173
    .line 174
    const/high16 v26, 0x40c00000    # 6.0f

    .line 175
    .line 176
    const/high16 v21, 0x40400000    # 3.0f

    .line 177
    .line 178
    const v22, 0x40ce6666    # 6.45f

    .line 179
    .line 180
    .line 181
    const v23, 0x40233333    # 2.55f

    .line 182
    .line 183
    .line 184
    const/high16 v24, 0x40c00000    # 6.0f

    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    const/16 v16, 0x3800

    .line 197
    .line 198
    const/16 v17, 0x0

    .line 199
    .line 200
    const/high16 v6, 0x3f800000    # 1.0f

    .line 201
    .line 202
    const/high16 v8, 0x3f800000    # 1.0f

    .line 203
    .line 204
    const/4 v7, 0x0

    .line 205
    const/high16 v9, 0x3f800000    # 1.0f

    .line 206
    .line 207
    const/high16 v12, 0x3f800000    # 1.0f

    .line 208
    .line 209
    const/4 v13, 0x0

    .line 210
    const/4 v14, 0x0

    .line 211
    const/4 v15, 0x0

    .line 212
    const-string v4, ""

    .line 213
    .line 214
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 215
    .line 216
    .line 217
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 222
    .line 223
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 224
    .line 225
    .line 226
    move-result-wide v6

    .line 227
    const/4 v0, 0x0

    .line 228
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 232
    .line 233
    .line 234
    move-result v10

    .line 235
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 236
    .line 237
    .line 238
    move-result v11

    .line 239
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    const/high16 v0, 0x41a80000    # 21.0f

    .line 245
    .line 246
    const/high16 v2, 0x40800000    # 4.0f

    .line 247
    .line 248
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v0, -0x3f200000    # -7.0f

    .line 252
    .line 253
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v0, -0x404b851f    # -1.41f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v17, 0x4132b852    # 11.17f

    .line 263
    .line 264
    .line 265
    const/high16 v18, 0x40000000    # 2.0f

    .line 266
    .line 267
    const v13, 0x41435c29    # 12.21f

    .line 268
    .line 269
    .line 270
    const v14, 0x400d70a4    # 2.21f

    .line 271
    .line 272
    .line 273
    const v15, 0x413b3333    # 11.7f

    .line 274
    .line 275
    .line 276
    const/high16 v16, 0x40000000    # 2.0f

    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x40e00000    # 7.0f

    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v17, 0x40a051ec    # 5.01f

    .line 287
    .line 288
    .line 289
    const/high16 v18, 0x40800000    # 4.0f

    .line 290
    .line 291
    const v13, 0x40bccccd    # 5.9f

    .line 292
    .line 293
    .line 294
    const/high16 v14, 0x40000000    # 2.0f

    .line 295
    .line 296
    const v15, 0x40a051ec    # 5.01f

    .line 297
    .line 298
    .line 299
    const v16, 0x4039999a    # 2.9f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v0, 0x40a00000    # 5.0f

    .line 306
    .line 307
    const/high16 v2, 0x41700000    # 15.0f

    .line 308
    .line 309
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v17, 0x40000000    # 2.0f

    .line 313
    .line 314
    const/high16 v18, 0x40000000    # 2.0f

    .line 315
    .line 316
    const/4 v13, 0x0

    .line 317
    const v14, 0x3f8ccccd    # 1.1f

    .line 318
    .line 319
    .line 320
    const v15, 0x3f666666    # 0.9f

    .line 321
    .line 322
    .line 323
    const/high16 v16, 0x40000000    # 2.0f

    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v0, 0x41600000    # 14.0f

    .line 329
    .line 330
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v18, -0x40000000    # -2.0f

    .line 334
    .line 335
    const v13, 0x3f8ccccd    # 1.1f

    .line 336
    .line 337
    .line 338
    const/4 v14, 0x0

    .line 339
    const/high16 v15, 0x40000000    # 2.0f

    .line 340
    .line 341
    const v16, -0x4099999a    # -0.9f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x40c00000    # 6.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v17, 0x41a80000    # 21.0f

    .line 353
    .line 354
    const/high16 v18, 0x40800000    # 4.0f

    .line 355
    .line 356
    const/high16 v13, 0x41b80000    # 23.0f

    .line 357
    .line 358
    const v14, 0x409ccccd    # 4.9f

    .line 359
    .line 360
    .line 361
    const v15, 0x41b0cccd    # 22.1f

    .line 362
    .line 363
    .line 364
    const/high16 v16, 0x40800000    # 4.0f

    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    const/16 v16, 0x3800

    .line 377
    .line 378
    const/16 v17, 0x0

    .line 379
    .line 380
    const/high16 v6, 0x3f800000    # 1.0f

    .line 381
    .line 382
    const/4 v7, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/rounded/FolderCopyKt;->_folderCopy:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 399
    .line 400
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    return-object v0
.end method
