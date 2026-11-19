.class public final Landroidx/compose/material/icons/rounded/SettingsCellKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _settingsCell:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsCell(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SettingsCellKt;->_settingsCell:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SettingsCell"

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
    const/high16 v0, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v2, 0x41c00000    # 24.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v17, 0x3f800000    # 1.0f

    .line 81
    .line 82
    const/high16 v18, -0x40800000    # -1.0f

    .line 83
    .line 84
    const v13, 0x3f0ccccd    # 0.55f

    .line 85
    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    const/high16 v15, 0x3f800000    # 1.0f

    .line 89
    .line 90
    const v16, -0x4119999a    # -0.45f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, -0x40800000    # -1.0f

    .line 101
    .line 102
    const/4 v13, 0x0

    .line 103
    const v14, -0x40f33333    # -0.55f

    .line 104
    .line 105
    .line 106
    const v15, -0x4119999a    # -0.45f

    .line 107
    .line 108
    .line 109
    const/high16 v16, -0x40800000    # -1.0f

    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v18, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const v13, -0x40f33333    # -0.55f

    .line 120
    .line 121
    .line 122
    const/4 v14, 0x0

    .line 123
    const/high16 v15, -0x40800000    # -1.0f

    .line 124
    .line 125
    const v16, 0x3ee66666    # 0.45f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v17, 0x41000000    # 8.0f

    .line 135
    .line 136
    const/high16 v18, 0x41c00000    # 24.0f

    .line 137
    .line 138
    const/high16 v13, 0x40e00000    # 7.0f

    .line 139
    .line 140
    const v14, 0x41bc6666    # 23.55f

    .line 141
    .line 142
    .line 143
    const v15, 0x40ee6666    # 7.45f

    .line 144
    .line 145
    .line 146
    const/high16 v16, 0x41c00000    # 24.0f

    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v0, 0x41400000    # 12.0f

    .line 155
    .line 156
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v17, 0x3f800000    # 1.0f

    .line 163
    .line 164
    const/high16 v18, -0x40800000    # -1.0f

    .line 165
    .line 166
    const v13, 0x3f0ccccd    # 0.55f

    .line 167
    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    const/high16 v15, 0x3f800000    # 1.0f

    .line 171
    .line 172
    const v16, -0x4119999a    # -0.45f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/4 v0, 0x0

    .line 179
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v17, -0x40800000    # -1.0f

    .line 183
    .line 184
    const/4 v13, 0x0

    .line 185
    const v14, -0x40f33333    # -0.55f

    .line 186
    .line 187
    .line 188
    const v15, -0x4119999a    # -0.45f

    .line 189
    .line 190
    .line 191
    const/high16 v16, -0x40800000    # -1.0f

    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v18, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const v13, -0x40f33333    # -0.55f

    .line 202
    .line 203
    .line 204
    const/4 v14, 0x0

    .line 205
    const/high16 v15, -0x40800000    # -1.0f

    .line 206
    .line 207
    const v16, 0x3ee66666    # 0.45f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v17, 0x41400000    # 12.0f

    .line 217
    .line 218
    const/high16 v18, 0x41c00000    # 24.0f

    .line 219
    .line 220
    const/high16 v13, 0x41300000    # 11.0f

    .line 221
    .line 222
    const v14, 0x41bc6666    # 23.55f

    .line 223
    .line 224
    .line 225
    const v15, 0x41373333    # 11.45f

    .line 226
    .line 227
    .line 228
    const/high16 v16, 0x41c00000    # 24.0f

    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v0, 0x41800000    # 16.0f

    .line 237
    .line 238
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, 0x3f800000    # 1.0f

    .line 245
    .line 246
    const/high16 v18, -0x40800000    # -1.0f

    .line 247
    .line 248
    const v13, 0x3f0ccccd    # 0.55f

    .line 249
    .line 250
    .line 251
    const/4 v14, 0x0

    .line 252
    const/high16 v15, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const v16, -0x4119999a    # -0.45f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/4 v0, 0x0

    .line 261
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v17, -0x40800000    # -1.0f

    .line 265
    .line 266
    const/4 v13, 0x0

    .line 267
    const v14, -0x40f33333    # -0.55f

    .line 268
    .line 269
    .line 270
    const v15, -0x4119999a    # -0.45f

    .line 271
    .line 272
    .line 273
    const/high16 v16, -0x40800000    # -1.0f

    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v18, 0x3f800000    # 1.0f

    .line 282
    .line 283
    const v13, -0x40f33333    # -0.55f

    .line 284
    .line 285
    .line 286
    const/4 v14, 0x0

    .line 287
    const/high16 v15, -0x40800000    # -1.0f

    .line 288
    .line 289
    const v16, 0x3ee66666    # 0.45f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v17, 0x41800000    # 16.0f

    .line 299
    .line 300
    const/high16 v18, 0x41c00000    # 24.0f

    .line 301
    .line 302
    const/high16 v13, 0x41700000    # 15.0f

    .line 303
    .line 304
    const v14, 0x41bc6666    # 23.55f

    .line 305
    .line 306
    .line 307
    const v15, 0x41773333    # 15.45f

    .line 308
    .line 309
    .line 310
    const/high16 v16, 0x41c00000    # 24.0f

    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x3c23d70a    # 0.01f

    .line 319
    .line 320
    .line 321
    const/high16 v2, 0x41800000    # 16.0f

    .line 322
    .line 323
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, 0x41000000    # 8.0f

    .line 327
    .line 328
    const/4 v2, 0x0

    .line 329
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v17, 0x40c00000    # 6.0f

    .line 333
    .line 334
    const/high16 v18, 0x40000000    # 2.0f

    .line 335
    .line 336
    const v13, 0x40dccccd    # 6.9f

    .line 337
    .line 338
    .line 339
    const/4 v14, 0x0

    .line 340
    const/high16 v15, 0x40c00000    # 6.0f

    .line 341
    .line 342
    const v16, 0x3f666666    # 0.9f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, 0x41800000    # 16.0f

    .line 349
    .line 350
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v17, 0x40000000    # 2.0f

    .line 354
    .line 355
    const/4 v13, 0x0

    .line 356
    const v14, 0x3f8ccccd    # 1.1f

    .line 357
    .line 358
    .line 359
    const v15, 0x3f666666    # 0.9f

    .line 360
    .line 361
    .line 362
    const/high16 v16, 0x40000000    # 2.0f

    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v0, 0x41000000    # 8.0f

    .line 368
    .line 369
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v18, -0x40000000    # -2.0f

    .line 373
    .line 374
    const v13, 0x3f8ccccd    # 1.1f

    .line 375
    .line 376
    .line 377
    const/4 v14, 0x0

    .line 378
    const/high16 v15, 0x40000000    # 2.0f

    .line 379
    .line 380
    const v16, -0x4099999a    # -0.9f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v0, 0x40000000    # 2.0f

    .line 387
    .line 388
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v17, 0x41800000    # 16.0f

    .line 392
    .line 393
    const v18, 0x3c23d70a    # 0.01f

    .line 394
    .line 395
    .line 396
    const/high16 v13, 0x41900000    # 18.0f

    .line 397
    .line 398
    const v14, 0x3f666666    # 0.9f

    .line 399
    .line 400
    .line 401
    const v15, 0x4188cccd    # 17.1f

    .line 402
    .line 403
    .line 404
    const v16, 0x3c23d70a    # 0.01f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v0, 0x41800000    # 16.0f

    .line 414
    .line 415
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v0, 0x41000000    # 8.0f

    .line 419
    .line 420
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, 0x40800000    # 4.0f

    .line 424
    .line 425
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v0, 0x41000000    # 8.0f

    .line 429
    .line 430
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v0, 0x41800000    # 16.0f

    .line 434
    .line 435
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    const/16 v16, 0x3800

    .line 446
    .line 447
    const/16 v17, 0x0

    .line 448
    .line 449
    const/high16 v6, 0x3f800000    # 1.0f

    .line 450
    .line 451
    const/high16 v8, 0x3f800000    # 1.0f

    .line 452
    .line 453
    const/4 v7, 0x0

    .line 454
    const/high16 v9, 0x3f800000    # 1.0f

    .line 455
    .line 456
    const/high16 v12, 0x3f800000    # 1.0f

    .line 457
    .line 458
    const/4 v13, 0x0

    .line 459
    const/4 v14, 0x0

    .line 460
    const/4 v15, 0x0

    .line 461
    const-string v4, ""

    .line 462
    .line 463
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    sput-object v0, Landroidx/compose/material/icons/rounded/SettingsCellKt;->_settingsCell:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 472
    .line 473
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    return-object v0
.end method
