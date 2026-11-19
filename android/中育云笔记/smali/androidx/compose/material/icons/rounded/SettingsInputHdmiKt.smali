.class public final Landroidx/compose/material/icons/rounded/SettingsInputHdmiKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _settingsInputHdmi:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsInputHdmi(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SettingsInputHdmiKt;->_settingsInputHdmi:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SettingsInputHdmi"

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
    const/high16 v0, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v2, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x40000000    # -2.0f

    .line 83
    .line 84
    const/high16 v18, -0x40000000    # -2.0f

    .line 85
    .line 86
    const/4 v13, 0x0

    .line 87
    const v14, -0x40733333    # -1.1f

    .line 88
    .line 89
    .line 90
    const v15, -0x4099999a    # -0.9f

    .line 91
    .line 92
    .line 93
    const/high16 v16, -0x40000000    # -2.0f

    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x41000000    # 8.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, 0x40c00000    # 6.0f

    .line 104
    .line 105
    const/high16 v18, 0x40800000    # 4.0f

    .line 106
    .line 107
    const v13, 0x40dccccd    # 6.9f

    .line 108
    .line 109
    .line 110
    const/high16 v14, 0x40000000    # 2.0f

    .line 111
    .line 112
    const/high16 v15, 0x40c00000    # 6.0f

    .line 113
    .line 114
    const v16, 0x4039999a    # 2.9f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v0, 0x40400000    # 3.0f

    .line 121
    .line 122
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v17, 0x40a00000    # 5.0f

    .line 126
    .line 127
    const/high16 v18, 0x41000000    # 8.0f

    .line 128
    .line 129
    const v13, 0x40ae6666    # 5.45f

    .line 130
    .line 131
    .line 132
    const/high16 v14, 0x40e00000    # 7.0f

    .line 133
    .line 134
    const/high16 v15, 0x40a00000    # 5.0f

    .line 135
    .line 136
    const v16, 0x40ee6666    # 7.45f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, 0x40966666    # 4.7f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, 0x3e2e147b    # 0.17f

    .line 149
    .line 150
    .line 151
    const v18, 0x3f0ccccd    # 0.55f

    .line 152
    .line 153
    .line 154
    const/4 v13, 0x0

    .line 155
    const v14, 0x3e4ccccd    # 0.2f

    .line 156
    .line 157
    .line 158
    const v15, 0x3d75c28f    # 0.06f

    .line 159
    .line 160
    .line 161
    const v16, 0x3ec7ae14    # 0.39f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, 0x41980000    # 19.0f

    .line 168
    .line 169
    const/high16 v2, 0x41000000    # 8.0f

    .line 170
    .line 171
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v0, 0x40000000    # 2.0f

    .line 175
    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v17, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const/high16 v18, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const v14, 0x3f0ccccd    # 0.55f

    .line 184
    .line 185
    .line 186
    const v15, 0x3ee66666    # 0.45f

    .line 187
    .line 188
    .line 189
    const/high16 v16, 0x3f800000    # 1.0f

    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, 0x40c00000    # 6.0f

    .line 195
    .line 196
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v18, -0x40800000    # -1.0f

    .line 200
    .line 201
    const v13, 0x3f0ccccd    # 0.55f

    .line 202
    .line 203
    .line 204
    const/4 v14, 0x0

    .line 205
    const/high16 v15, 0x3f800000    # 1.0f

    .line 206
    .line 207
    const v16, -0x4119999a    # -0.45f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v0, -0x40000000    # -2.0f

    .line 214
    .line 215
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v0, 0x40351eb8    # 2.83f

    .line 219
    .line 220
    .line 221
    const/high16 v2, -0x3f480000    # -5.75f

    .line 222
    .line 223
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v17, 0x41980000    # 19.0f

    .line 227
    .line 228
    const v18, 0x414b3333    # 12.7f

    .line 229
    .line 230
    .line 231
    const v13, 0x4197851f    # 18.94f

    .line 232
    .line 233
    .line 234
    const v14, 0x415170a4    # 13.09f

    .line 235
    .line 236
    .line 237
    const/high16 v15, 0x41980000    # 19.0f

    .line 238
    .line 239
    const v16, 0x414e3d71    # 12.89f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v0, 0x41000000    # 8.0f

    .line 246
    .line 247
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v17, 0x41900000    # 18.0f

    .line 251
    .line 252
    const/high16 v18, 0x40e00000    # 7.0f

    .line 253
    .line 254
    const/high16 v13, 0x41980000    # 19.0f

    .line 255
    .line 256
    const v14, 0x40ee6666    # 7.45f

    .line 257
    .line 258
    .line 259
    const v15, 0x41946666    # 18.55f

    .line 260
    .line 261
    .line 262
    const/high16 v16, 0x40e00000    # 7.0f

    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, 0x41800000    # 16.0f

    .line 271
    .line 272
    const/high16 v2, 0x40e00000    # 7.0f

    .line 273
    .line 274
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v0, -0x40000000    # -2.0f

    .line 278
    .line 279
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v0, 0x40b00000    # 5.5f

    .line 283
    .line 284
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v17, 0x41580000    # 13.5f

    .line 288
    .line 289
    const/high16 v18, 0x40a00000    # 5.0f

    .line 290
    .line 291
    const/high16 v13, 0x41600000    # 14.0f

    .line 292
    .line 293
    const v14, 0x40a70a3d    # 5.22f

    .line 294
    .line 295
    .line 296
    const v15, 0x415c7ae1    # 13.78f

    .line 297
    .line 298
    .line 299
    const/high16 v16, 0x40a00000    # 5.0f

    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, 0x40a70a3d    # 5.22f

    .line 305
    .line 306
    .line 307
    const/high16 v2, 0x41500000    # 13.0f

    .line 308
    .line 309
    const/high16 v4, 0x40b00000    # 5.5f

    .line 310
    .line 311
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v0, 0x40e00000    # 7.0f

    .line 315
    .line 316
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, -0x40000000    # -2.0f

    .line 320
    .line 321
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v0, 0x40b00000    # 5.5f

    .line 325
    .line 326
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v17, 0x41280000    # 10.5f

    .line 330
    .line 331
    const/high16 v13, 0x41300000    # 11.0f

    .line 332
    .line 333
    const v15, 0x412c7ae1    # 10.78f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v0, 0x41200000    # 10.0f

    .line 340
    .line 341
    const v2, 0x40a70a3d    # 5.22f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x40e00000    # 7.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v0, 0x41000000    # 8.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v0, 0x40800000    # 4.0f

    .line 358
    .line 359
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v0, 0x41000000    # 8.0f

    .line 363
    .line 364
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v0, 0x40e00000    # 7.0f

    .line 368
    .line 369
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/4 v14, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/rounded/SettingsInputHdmiKt;->_settingsInputHdmi:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 406
    .line 407
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    return-object v0
.end method
