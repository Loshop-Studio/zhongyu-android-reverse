.class public final Landroidx/compose/material/icons/twotone/CurrencyPoundKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _currencyPound:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCurrencyPound(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CurrencyPoundKt;->_currencyPound:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.CurrencyPound"

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
    const/high16 v0, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const/high16 v2, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40800000    # 4.0f

    .line 78
    .line 79
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 80
    .line 81
    const v13, 0x3ff70a3d    # 1.93f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const v15, 0x4067ae14    # 3.62f

    .line 86
    .line 87
    .line 88
    const v16, -0x406a3d71    # -1.17f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v0, -0x40200000    # -1.75f

    .line 95
    .line 96
    const v2, -0x409eb852    # -0.88f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v17, 0x41600000    # 14.0f

    .line 103
    .line 104
    const/high16 v18, 0x41980000    # 19.0f

    .line 105
    .line 106
    const/high16 v13, 0x41800000    # 16.0f

    .line 107
    .line 108
    const v14, 0x4191ae14    # 18.21f

    .line 109
    .line 110
    .line 111
    const v15, 0x417547ae    # 15.33f

    .line 112
    .line 113
    .line 114
    const/high16 v16, 0x41980000    # 19.0f

    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v0, -0x3f633333    # -4.9f

    .line 120
    .line 121
    .line 122
    const/4 v2, 0x0

    .line 123
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 127
    .line 128
    const/high16 v18, -0x3f800000    # -4.0f

    .line 129
    .line 130
    const v13, 0x3f547ae1    # 0.83f

    .line 131
    .line 132
    .line 133
    const/high16 v14, -0x40800000    # -1.0f

    .line 134
    .line 135
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 136
    .line 137
    const v16, -0x3fea3d71    # -2.34f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v17, -0x425c28f6    # -0.08f

    .line 144
    .line 145
    .line 146
    const/high16 v18, -0x40800000    # -1.0f

    .line 147
    .line 148
    const/4 v13, 0x0

    .line 149
    const v14, -0x414ccccd    # -0.35f

    .line 150
    .line 151
    .line 152
    const v15, -0x430a3d71    # -0.03f

    .line 153
    .line 154
    .line 155
    const v16, -0x40cf5c29    # -0.69f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, 0x41600000    # 14.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, -0x40000000    # -2.0f

    .line 167
    .line 168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v0, -0x3f7a3d71    # -4.18f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v17, 0x41000000    # 8.0f

    .line 178
    .line 179
    const/high16 v18, 0x41000000    # 8.0f

    .line 180
    .line 181
    const/high16 v13, 0x41100000    # 9.0f

    .line 182
    .line 183
    const v14, 0x4126b852    # 10.42f

    .line 184
    .line 185
    .line 186
    const/high16 v15, 0x41000000    # 8.0f

    .line 187
    .line 188
    const v16, 0x4119999a    # 9.6f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v17, 0x40600000    # 3.5f

    .line 195
    .line 196
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 197
    .line 198
    const/4 v13, 0x0

    .line 199
    const v14, -0x4008f5c3    # -1.93f

    .line 200
    .line 201
    .line 202
    const v15, 0x3fc8f5c3    # 1.57f

    .line 203
    .line 204
    .line 205
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v17, 0x4051eb85    # 3.28f

    .line 211
    .line 212
    .line 213
    const v18, 0x4011eb85    # 2.28f

    .line 214
    .line 215
    .line 216
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 217
    .line 218
    const/4 v14, 0x0

    .line 219
    const v15, 0x40328f5c    # 2.79f

    .line 220
    .line 221
    .line 222
    const v16, 0x3f733333    # 0.95f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, 0x41850a3d    # 16.63f

    .line 229
    .line 230
    .line 231
    const/high16 v2, 0x40c00000    # 6.0f

    .line 232
    .line 233
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, -0x3f5bd70a    # -5.13f

    .line 237
    .line 238
    .line 239
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 240
    .line 241
    const v13, -0x40b33333    # -0.8f

    .line 242
    .line 243
    .line 244
    const v14, -0x3ffccccd    # -2.05f

    .line 245
    .line 246
    .line 247
    const v15, -0x3fcd70a4    # -2.79f

    .line 248
    .line 249
    .line 250
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v17, 0x40c00000    # 6.0f

    .line 256
    .line 257
    const/high16 v18, 0x41000000    # 8.0f

    .line 258
    .line 259
    const v13, 0x41075c29    # 8.46f

    .line 260
    .line 261
    .line 262
    const/high16 v14, 0x40200000    # 2.5f

    .line 263
    .line 264
    const/high16 v15, 0x40c00000    # 6.0f

    .line 265
    .line 266
    const v16, 0x409eb852    # 4.96f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, 0x3fbeb852    # 1.49f

    .line 273
    .line 274
    .line 275
    const/high16 v18, 0x40800000    # 4.0f

    .line 276
    .line 277
    const/4 v13, 0x0

    .line 278
    const v14, 0x3fe3d70a    # 1.78f

    .line 279
    .line 280
    .line 281
    const v15, 0x3f4a3d71    # 0.79f

    .line 282
    .line 283
    .line 284
    const v16, 0x4039999a    # 2.9f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v0, 0x41400000    # 12.0f

    .line 291
    .line 292
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, 0x40000000    # 2.0f

    .line 296
    .line 297
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, 0x401e147b    # 2.47f

    .line 301
    .line 302
    .line 303
    const/4 v2, 0x0

    .line 304
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, 0x3e051eb8    # 0.13f

    .line 308
    .line 309
    .line 310
    const/high16 v18, 0x3f800000    # 1.0f

    .line 311
    .line 312
    const v13, 0x3da3d70a    # 0.08f

    .line 313
    .line 314
    .line 315
    const v14, 0x3e9eb852    # 0.31f

    .line 316
    .line 317
    .line 318
    const v15, 0x3e051eb8    # 0.13f

    .line 319
    .line 320
    .line 321
    const v16, 0x3f23d70a    # 0.64f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, -0x3fd9999a    # -2.6f

    .line 328
    .line 329
    .line 330
    const/high16 v18, 0x40800000    # 4.0f

    .line 331
    .line 332
    const/4 v13, 0x0

    .line 333
    const v14, 0x402ccccd    # 2.7f

    .line 334
    .line 335
    .line 336
    const v15, -0x3fd9999a    # -2.6f

    .line 337
    .line 338
    .line 339
    const/high16 v16, 0x40800000    # 4.0f

    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v0, 0x40000000    # 2.0f

    .line 345
    .line 346
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v0, 0x41600000    # 14.0f

    .line 350
    .line 351
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    const/16 v16, 0x3800

    .line 362
    .line 363
    const/16 v17, 0x0

    .line 364
    .line 365
    const/high16 v6, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const/high16 v8, 0x3f800000    # 1.0f

    .line 368
    .line 369
    const/4 v7, 0x0

    .line 370
    const/high16 v9, 0x3f800000    # 1.0f

    .line 371
    .line 372
    const/high16 v12, 0x3f800000    # 1.0f

    .line 373
    .line 374
    const/4 v14, 0x0

    .line 375
    const/4 v15, 0x0

    .line 376
    const-string v4, ""

    .line 377
    .line 378
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    sput-object v0, Landroidx/compose/material/icons/twotone/CurrencyPoundKt;->_currencyPound:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 387
    .line 388
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    return-object v0
.end method
