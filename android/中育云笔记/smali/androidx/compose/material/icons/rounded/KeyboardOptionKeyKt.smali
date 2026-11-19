.class public final Landroidx/compose/material/icons/rounded/KeyboardOptionKeyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _keyboardOptionKey:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getKeyboardOptionKey(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/KeyboardOptionKeyKt;->_keyboardOptionKey:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.KeyboardOptionKey"

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
    const/high16 v4, 0x41700000    # 15.0f

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
    const/high16 v26, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const/16 v21, 0x0

    .line 85
    .line 86
    const v22, 0x3f0ccccd    # 0.55f

    .line 87
    .line 88
    .line 89
    const v23, 0x3ee66666    # 0.45f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x3f800000    # 1.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v4, 0x40800000    # 4.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v26, -0x40800000    # -1.0f

    .line 105
    .line 106
    const v21, 0x3f0ccccd    # 0.55f

    .line 107
    .line 108
    .line 109
    const/16 v22, 0x0

    .line 110
    .line 111
    const/high16 v23, 0x3f800000    # 1.0f

    .line 112
    .line 113
    const v24, -0x4119999a    # -0.45f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v25, -0x40800000    # -1.0f

    .line 124
    .line 125
    const/16 v21, 0x0

    .line 126
    .line 127
    const v22, -0x40f33333    # -0.55f

    .line 128
    .line 129
    .line 130
    const v23, -0x4119999a    # -0.45f

    .line 131
    .line 132
    .line 133
    const/high16 v24, -0x40800000    # -1.0f

    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, -0x3f800000    # -4.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v25, 0x41700000    # 15.0f

    .line 144
    .line 145
    const/high16 v26, 0x40c00000    # 6.0f

    .line 146
    .line 147
    const v21, 0x41773333    # 15.45f

    .line 148
    .line 149
    .line 150
    const/high16 v22, 0x40a00000    # 5.0f

    .line 151
    .line 152
    const/high16 v23, 0x41700000    # 15.0f

    .line 153
    .line 154
    const v24, 0x40ae6666    # 5.45f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    const/16 v16, 0x3800

    .line 168
    .line 169
    const/16 v17, 0x0

    .line 170
    .line 171
    const/high16 v6, 0x3f800000    # 1.0f

    .line 172
    .line 173
    const/high16 v8, 0x3f800000    # 1.0f

    .line 174
    .line 175
    const/4 v7, 0x0

    .line 176
    const/high16 v9, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/high16 v12, 0x3f800000    # 1.0f

    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    const/4 v14, 0x0

    .line 182
    const/4 v15, 0x0

    .line 183
    const-string v4, ""

    .line 184
    .line 185
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 186
    .line 187
    .line 188
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 193
    .line 194
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 195
    .line 196
    .line 197
    move-result-wide v6

    .line 198
    const/4 v0, 0x0

    .line 199
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    const v0, 0x411947ae    # 9.58f

    .line 216
    .line 217
    .line 218
    const/high16 v2, 0x40c00000    # 6.0f

    .line 219
    .line 220
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v17, 0x40fb3333    # 7.85f

    .line 224
    .line 225
    .line 226
    const/high16 v18, 0x40a00000    # 5.0f

    .line 227
    .line 228
    const v13, 0x4113851f    # 9.22f

    .line 229
    .line 230
    .line 231
    const v14, 0x40ac28f6    # 5.38f

    .line 232
    .line 233
    .line 234
    const v15, 0x4108f5c3    # 8.56f

    .line 235
    .line 236
    .line 237
    const/high16 v16, 0x40a00000    # 5.0f

    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v0, 0x40800000    # 4.0f

    .line 243
    .line 244
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v17, 0x40400000    # 3.0f

    .line 248
    .line 249
    const/high16 v18, 0x40c00000    # 6.0f

    .line 250
    .line 251
    const v13, 0x405ccccd    # 3.45f

    .line 252
    .line 253
    .line 254
    const/high16 v14, 0x40a00000    # 5.0f

    .line 255
    .line 256
    const/high16 v15, 0x40400000    # 3.0f

    .line 257
    .line 258
    const v16, 0x40ae6666    # 5.45f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/4 v0, 0x0

    .line 265
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v17, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const/high16 v18, 0x3f800000    # 1.0f

    .line 271
    .line 272
    const/4 v13, 0x0

    .line 273
    const v14, 0x3f0ccccd    # 0.55f

    .line 274
    .line 275
    .line 276
    const v15, 0x3ee66666    # 0.45f

    .line 277
    .line 278
    .line 279
    const/high16 v16, 0x3f800000    # 1.0f

    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, 0x40766666    # 3.85f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, 0x40cb3333    # 6.35f

    .line 291
    .line 292
    .line 293
    const/high16 v2, 0x41300000    # 11.0f

    .line 294
    .line 295
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v17, 0x3fdd70a4    # 1.73f

    .line 299
    .line 300
    .line 301
    const v13, 0x3eb851ec    # 0.36f

    .line 302
    .line 303
    .line 304
    const v14, 0x3f1eb852    # 0.62f

    .line 305
    .line 306
    .line 307
    const v15, 0x3f828f5c    # 1.02f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v0, 0x41a00000    # 20.0f

    .line 314
    .line 315
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v17, 0x3f800000    # 1.0f

    .line 319
    .line 320
    const/high16 v18, -0x40800000    # -1.0f

    .line 321
    .line 322
    const v13, 0x3f0ccccd    # 0.55f

    .line 323
    .line 324
    .line 325
    const/4 v14, 0x0

    .line 326
    const/high16 v15, 0x3f800000    # 1.0f

    .line 327
    .line 328
    const v16, -0x4119999a    # -0.45f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/4 v0, 0x0

    .line 335
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v17, -0x40800000    # -1.0f

    .line 339
    .line 340
    const/4 v13, 0x0

    .line 341
    const v14, -0x40f33333    # -0.55f

    .line 342
    .line 343
    .line 344
    const v15, -0x4119999a    # -0.45f

    .line 345
    .line 346
    .line 347
    const/high16 v16, -0x40800000    # -1.0f

    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v0, -0x3f7dc28f    # -4.07f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v0, 0x411947ae    # 9.58f

    .line 359
    .line 360
    .line 361
    const/high16 v2, 0x40c00000    # 6.0f

    .line 362
    .line 363
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    const/16 v16, 0x3800

    .line 374
    .line 375
    const/16 v17, 0x0

    .line 376
    .line 377
    const/high16 v6, 0x3f800000    # 1.0f

    .line 378
    .line 379
    const/4 v7, 0x0

    .line 380
    const/high16 v12, 0x3f800000    # 1.0f

    .line 381
    .line 382
    const/4 v14, 0x0

    .line 383
    const/4 v15, 0x0

    .line 384
    const-string v4, ""

    .line 385
    .line 386
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    sput-object v0, Landroidx/compose/material/icons/rounded/KeyboardOptionKeyKt;->_keyboardOptionKey:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 395
    .line 396
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    return-object v0
.end method
