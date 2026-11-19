.class public final Landroidx/compose/material/icons/rounded/NewLabelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _newLabel:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNewLabel(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NewLabelKt;->_newLabel:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NewLabel"

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
    const v0, 0x41a170a4    # 20.18f

    .line 71
    .line 72
    .line 73
    const v2, 0x41528f5c    # 13.16f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3f9ccccd    # -3.55f

    .line 80
    .line 81
    .line 82
    const/high16 v2, 0x40a00000    # 5.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v17, 0x41700000    # 15.0f

    .line 88
    .line 89
    const/high16 v18, 0x41980000    # 19.0f

    .line 90
    .line 91
    const/high16 v13, 0x41820000    # 16.25f

    .line 92
    .line 93
    const v14, 0x4195851f    # 18.69f

    .line 94
    .line 95
    .line 96
    const v15, 0x417a6666    # 15.65f

    .line 97
    .line 98
    .line 99
    const/high16 v16, 0x41980000    # 19.0f

    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 105
    .line 106
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v0, -0x40000000    # -2.0f

    .line 110
    .line 111
    const/4 v2, 0x0

    .line 112
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v0, -0x40800000    # -1.0f

    .line 116
    .line 117
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 121
    .line 122
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const v14, -0x402b851f    # -1.66f

    .line 126
    .line 127
    .line 128
    const v15, -0x40547ae1    # -1.34f

    .line 129
    .line 130
    .line 131
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/4 v0, 0x0

    .line 137
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v0, 0x40400000    # 3.0f

    .line 147
    .line 148
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v0, 0x40e00000    # 7.0f

    .line 152
    .line 153
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v17, 0x40000000    # 2.0f

    .line 157
    .line 158
    const/high16 v18, -0x40000000    # -2.0f

    .line 159
    .line 160
    const v14, -0x40733333    # -1.1f

    .line 161
    .line 162
    .line 163
    const v15, 0x3f666666    # 0.9f

    .line 164
    .line 165
    .line 166
    const/high16 v16, -0x40000000    # -2.0f

    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v0, 0x41200000    # 10.0f

    .line 172
    .line 173
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v17, 0x3fd0a3d7    # 1.63f

    .line 177
    .line 178
    .line 179
    const v18, 0x3f570a3d    # 0.84f

    .line 180
    .line 181
    .line 182
    const v13, 0x3f266666    # 0.65f

    .line 183
    .line 184
    .line 185
    const/4 v14, 0x0

    .line 186
    const v15, 0x3fa147ae    # 1.26f

    .line 187
    .line 188
    .line 189
    const v16, 0x3e9eb852    # 0.31f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v0, 0x40633333    # 3.55f

    .line 196
    .line 197
    .line 198
    const/high16 v2, 0x40a00000    # 5.0f

    .line 199
    .line 200
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v17, 0x41a170a4    # 20.18f

    .line 204
    .line 205
    .line 206
    const v18, 0x41528f5c    # 13.16f

    .line 207
    .line 208
    .line 209
    const v13, 0x41a55c29    # 20.67f

    .line 210
    .line 211
    .line 212
    const v14, 0x4138a3d7    # 11.54f

    .line 213
    .line 214
    .line 215
    const v15, 0x41a55c29    # 20.67f

    .line 216
    .line 217
    .line 218
    const v16, 0x41475c29    # 12.46f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v0, 0x41800000    # 16.0f

    .line 228
    .line 229
    const/high16 v2, 0x41200000    # 10.0f

    .line 230
    .line 231
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v17, -0x40800000    # -1.0f

    .line 235
    .line 236
    const/high16 v18, -0x40800000    # -1.0f

    .line 237
    .line 238
    const/4 v13, 0x0

    .line 239
    const v14, -0x40f33333    # -0.55f

    .line 240
    .line 241
    .line 242
    const v15, -0x4119999a    # -0.45f

    .line 243
    .line 244
    .line 245
    const/high16 v16, -0x40800000    # -1.0f

    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v0, 0x40e00000    # 7.0f

    .line 251
    .line 252
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v0, -0x40000000    # -2.0f

    .line 256
    .line 257
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v18, 0x3f800000    # 1.0f

    .line 264
    .line 265
    const v13, -0x40f33333    # -0.55f

    .line 266
    .line 267
    .line 268
    const/4 v14, 0x0

    .line 269
    const/high16 v15, -0x40800000    # -1.0f

    .line 270
    .line 271
    const v16, 0x3ee66666    # 0.45f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v0, 0x40000000    # 2.0f

    .line 278
    .line 279
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v0, 0x40400000    # 3.0f

    .line 283
    .line 284
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v17, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/4 v13, 0x0

    .line 293
    const v14, 0x3f0ccccd    # 0.55f

    .line 294
    .line 295
    .line 296
    const v15, 0x3ee66666    # 0.45f

    .line 297
    .line 298
    .line 299
    const/high16 v16, 0x3f800000    # 1.0f

    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v0, 0x40000000    # 2.0f

    .line 305
    .line 306
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v18, -0x40800000    # -1.0f

    .line 316
    .line 317
    const v13, 0x3f0ccccd    # 0.55f

    .line 318
    .line 319
    .line 320
    const/4 v14, 0x0

    .line 321
    const/high16 v15, 0x3f800000    # 1.0f

    .line 322
    .line 323
    const v16, -0x4119999a    # -0.45f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v0, -0x40000000    # -2.0f

    .line 330
    .line 331
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v0, 0x40000000    # 2.0f

    .line 335
    .line 336
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v17, 0x41200000    # 10.0f

    .line 340
    .line 341
    const/high16 v18, 0x41800000    # 16.0f

    .line 342
    .line 343
    const v13, 0x4118cccd    # 9.55f

    .line 344
    .line 345
    .line 346
    const/high16 v14, 0x41880000    # 17.0f

    .line 347
    .line 348
    const/high16 v15, 0x41200000    # 10.0f

    .line 349
    .line 350
    const v16, 0x41846666    # 16.55f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    const/16 v16, 0x3800

    .line 364
    .line 365
    const/16 v17, 0x0

    .line 366
    .line 367
    const/high16 v6, 0x3f800000    # 1.0f

    .line 368
    .line 369
    const/high16 v8, 0x3f800000    # 1.0f

    .line 370
    .line 371
    const/4 v7, 0x0

    .line 372
    const/high16 v9, 0x3f800000    # 1.0f

    .line 373
    .line 374
    const/high16 v12, 0x3f800000    # 1.0f

    .line 375
    .line 376
    const/4 v13, 0x0

    .line 377
    const/4 v14, 0x0

    .line 378
    const/4 v15, 0x0

    .line 379
    const-string v4, ""

    .line 380
    .line 381
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    sput-object v0, Landroidx/compose/material/icons/rounded/NewLabelKt;->_newLabel:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 390
    .line 391
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    return-object v0
.end method
