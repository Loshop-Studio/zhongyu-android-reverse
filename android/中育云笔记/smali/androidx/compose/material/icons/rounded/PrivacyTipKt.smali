.class public final Landroidx/compose/material/icons/rounded/PrivacyTipKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _privacyTip:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPrivacyTip(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PrivacyTipKt;->_privacyTip:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PrivacyTip"

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
    const v0, 0x408f0a3d    # 4.47f

    .line 71
    .line 72
    .line 73
    const v2, 0x4086147b    # 4.19f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x40400000    # 3.0f

    .line 80
    .line 81
    const v18, 0x40c9999a    # 6.3f

    .line 82
    .line 83
    .line 84
    const v13, 0x405e147b    # 3.47f

    .line 85
    .line 86
    .line 87
    const v14, 0x409947ae    # 4.79f

    .line 88
    .line 89
    .line 90
    const/high16 v15, 0x40400000    # 3.0f

    .line 91
    .line 92
    const v16, 0x40b051ec    # 5.51f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x41300000    # 11.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, 0x41100000    # 9.0f

    .line 104
    .line 105
    const/high16 v18, 0x41400000    # 12.0f

    .line 106
    .line 107
    const/4 v13, 0x0

    .line 108
    const v14, 0x40b1999a    # 5.55f

    .line 109
    .line 110
    .line 111
    const v15, 0x4075c28f    # 3.84f

    .line 112
    .line 113
    .line 114
    const v16, 0x412bd70a    # 10.74f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v18, -0x3ec00000    # -12.0f

    .line 121
    .line 122
    const v13, 0x40a51eb8    # 5.16f

    .line 123
    .line 124
    .line 125
    const v14, -0x405eb852    # -1.26f

    .line 126
    .line 127
    .line 128
    const/high16 v15, 0x41100000    # 9.0f

    .line 129
    .line 130
    const v16, -0x3f31999a    # -6.45f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, 0x40c9999a    # 6.3f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v17, -0x4067ae14    # -1.19f

    .line 143
    .line 144
    .line 145
    const v18, -0x4015c28f    # -1.83f

    .line 146
    .line 147
    .line 148
    const/4 v13, 0x0

    .line 149
    const v14, -0x40b5c28f    # -0.79f

    .line 150
    .line 151
    .line 152
    const v15, -0x410f5c29    # -0.47f

    .line 153
    .line 154
    .line 155
    const v16, -0x403eb852    # -1.51f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, -0x3f200000    # -7.0f

    .line 162
    .line 163
    const v2, -0x3fb8f5c3    # -3.11f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v17, -0x4030a3d7    # -1.62f

    .line 170
    .line 171
    .line 172
    const/16 v18, 0x0

    .line 173
    .line 174
    const v13, -0x40fae148    # -0.52f

    .line 175
    .line 176
    .line 177
    const v14, -0x41947ae1    # -0.23f

    .line 178
    .line 179
    .line 180
    const v15, -0x4071eb85    # -1.11f

    .line 181
    .line 182
    .line 183
    const v16, -0x41947ae1    # -0.23f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v0, 0x408f0a3d    # 4.47f

    .line 190
    .line 191
    .line 192
    const v2, 0x4086147b    # 4.19f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v0, 0x40e00000    # 7.0f

    .line 202
    .line 203
    const/high16 v2, 0x41400000    # 12.0f

    .line 204
    .line 205
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v17, 0x3f800000    # 1.0f

    .line 212
    .line 213
    const/high16 v18, 0x3f800000    # 1.0f

    .line 214
    .line 215
    const v13, 0x3f0ccccd    # 0.55f

    .line 216
    .line 217
    .line 218
    const/4 v14, 0x0

    .line 219
    const/high16 v15, 0x3f800000    # 1.0f

    .line 220
    .line 221
    const v16, 0x3ee66666    # 0.45f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/4 v0, 0x0

    .line 228
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v17, -0x40800000    # -1.0f

    .line 232
    .line 233
    const/4 v13, 0x0

    .line 234
    const v14, 0x3f0ccccd    # 0.55f

    .line 235
    .line 236
    .line 237
    const v15, -0x4119999a    # -0.45f

    .line 238
    .line 239
    .line 240
    const/high16 v16, 0x3f800000    # 1.0f

    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v18, -0x40800000    # -1.0f

    .line 249
    .line 250
    const v13, -0x40f33333    # -0.55f

    .line 251
    .line 252
    .line 253
    const/4 v14, 0x0

    .line 254
    const/high16 v15, -0x40800000    # -1.0f

    .line 255
    .line 256
    const v16, -0x4119999a    # -0.45f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v17, 0x41400000    # 12.0f

    .line 266
    .line 267
    const/high16 v18, 0x40e00000    # 7.0f

    .line 268
    .line 269
    const/high16 v13, 0x41300000    # 11.0f

    .line 270
    .line 271
    const v14, 0x40ee6666    # 7.45f

    .line 272
    .line 273
    .line 274
    const v15, 0x41373333    # 11.45f

    .line 275
    .line 276
    .line 277
    const/high16 v16, 0x40e00000    # 7.0f

    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, 0x41300000    # 11.0f

    .line 286
    .line 287
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v17, 0x3f800000    # 1.0f

    .line 294
    .line 295
    const/high16 v18, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const v13, 0x3f0ccccd    # 0.55f

    .line 298
    .line 299
    .line 300
    const/4 v14, 0x0

    .line 301
    const/high16 v15, 0x3f800000    # 1.0f

    .line 302
    .line 303
    const v16, 0x3ee66666    # 0.45f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v0, 0x40800000    # 4.0f

    .line 310
    .line 311
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v17, -0x40800000    # -1.0f

    .line 315
    .line 316
    const/4 v13, 0x0

    .line 317
    const v14, 0x3f0ccccd    # 0.55f

    .line 318
    .line 319
    .line 320
    const v15, -0x4119999a    # -0.45f

    .line 321
    .line 322
    .line 323
    const/high16 v16, 0x3f800000    # 1.0f

    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/4 v0, 0x0

    .line 329
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v18, -0x40800000    # -1.0f

    .line 333
    .line 334
    const v13, -0x40f33333    # -0.55f

    .line 335
    .line 336
    .line 337
    const/4 v14, 0x0

    .line 338
    const/high16 v15, -0x40800000    # -1.0f

    .line 339
    .line 340
    const v16, -0x4119999a    # -0.45f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v0, -0x3f800000    # -4.0f

    .line 347
    .line 348
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v17, 0x41400000    # 12.0f

    .line 352
    .line 353
    const/high16 v18, 0x41300000    # 11.0f

    .line 354
    .line 355
    const/high16 v13, 0x41300000    # 11.0f

    .line 356
    .line 357
    const v14, 0x41373333    # 11.45f

    .line 358
    .line 359
    .line 360
    const v15, 0x41373333    # 11.45f

    .line 361
    .line 362
    .line 363
    const/high16 v16, 0x41300000    # 11.0f

    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    const/16 v16, 0x3800

    .line 376
    .line 377
    const/16 v17, 0x0

    .line 378
    .line 379
    const/high16 v6, 0x3f800000    # 1.0f

    .line 380
    .line 381
    const/high16 v8, 0x3f800000    # 1.0f

    .line 382
    .line 383
    const/4 v7, 0x0

    .line 384
    const/high16 v9, 0x3f800000    # 1.0f

    .line 385
    .line 386
    const/high16 v12, 0x3f800000    # 1.0f

    .line 387
    .line 388
    const/4 v13, 0x0

    .line 389
    const/4 v14, 0x0

    .line 390
    const/4 v15, 0x0

    .line 391
    const-string v4, ""

    .line 392
    .line 393
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    sput-object v0, Landroidx/compose/material/icons/rounded/PrivacyTipKt;->_privacyTip:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 402
    .line 403
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    return-object v0
.end method
