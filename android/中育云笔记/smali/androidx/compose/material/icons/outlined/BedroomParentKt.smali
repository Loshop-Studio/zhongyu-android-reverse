.class public final Landroidx/compose/material/icons/outlined/BedroomParentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bedroomParent:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBedroomParent(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/BedroomParentKt;->_bedroomParent:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.BedroomParent"

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
    const v0, 0x4192cccd    # 18.35f

    .line 71
    .line 72
    .line 73
    const v2, 0x41373333    # 11.45f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x41100000    # 9.0f

    .line 80
    .line 81
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v17, -0x40000000    # -2.0f

    .line 85
    .line 86
    const/high16 v18, -0x40000000    # -2.0f

    .line 87
    .line 88
    const/4 v13, 0x0

    .line 89
    const v14, -0x40733333    # -1.1f

    .line 90
    .line 91
    .line 92
    const v15, -0x4099999a    # -0.9f

    .line 93
    .line 94
    .line 95
    const/high16 v16, -0x40000000    # -2.0f

    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x41500000    # 13.0f

    .line 101
    .line 102
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, -0x40800000    # -1.0f

    .line 106
    .line 107
    const v18, 0x3ea3d70a    # 0.32f

    .line 108
    .line 109
    .line 110
    const v13, -0x41428f5c    # -0.37f

    .line 111
    .line 112
    .line 113
    const/4 v14, 0x0

    .line 114
    const v15, -0x40c7ae14    # -0.72f

    .line 115
    .line 116
    .line 117
    const v16, 0x3df5c28f    # 0.12f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v17, 0x41300000    # 11.0f

    .line 124
    .line 125
    const/high16 v18, 0x40e00000    # 7.0f

    .line 126
    .line 127
    const v13, 0x413b851f    # 11.72f

    .line 128
    .line 129
    .line 130
    const v14, 0x40e3d70a    # 7.12f

    .line 131
    .line 132
    .line 133
    const v15, 0x4135eb85    # 11.37f

    .line 134
    .line 135
    .line 136
    const/high16 v16, 0x40e00000    # 7.0f

    .line 137
    .line 138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v0, 0x40f4cccd    # 7.65f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v17, -0x40000000    # -2.0f

    .line 148
    .line 149
    const/high16 v18, 0x40000000    # 2.0f

    .line 150
    .line 151
    const v13, -0x40733333    # -1.1f

    .line 152
    .line 153
    .line 154
    const/4 v14, 0x0

    .line 155
    const/high16 v15, -0x40000000    # -2.0f

    .line 156
    .line 157
    const v16, 0x3f666666    # 0.9f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v0, 0x401ccccd    # 2.45f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v17, 0x40a00000    # 5.0f

    .line 170
    .line 171
    const v18, 0x4152b852    # 13.17f

    .line 172
    .line 173
    .line 174
    const/high16 v13, 0x40a80000    # 5.25f

    .line 175
    .line 176
    const v14, 0x413e8f5c    # 11.91f

    .line 177
    .line 178
    .line 179
    const/high16 v15, 0x40a00000    # 5.0f

    .line 180
    .line 181
    const v16, 0x414828f6    # 12.51f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v0, 0x41880000    # 17.0f

    .line 188
    .line 189
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 193
    .line 194
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v0, -0x40400000    # -1.5f

    .line 198
    .line 199
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v0, 0x41300000    # 11.0f

    .line 203
    .line 204
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, 0x41880000    # 17.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v0, 0x41980000    # 19.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v0, -0x3f8ae148    # -3.83f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v17, 0x4192cccd    # 18.35f

    .line 224
    .line 225
    .line 226
    const v18, 0x41373333    # 11.45f

    .line 227
    .line 228
    .line 229
    const/high16 v13, 0x41980000    # 19.0f

    .line 230
    .line 231
    const v14, 0x414828f6    # 12.51f

    .line 232
    .line 233
    .line 234
    const/high16 v15, 0x41960000    # 18.75f

    .line 235
    .line 236
    const v16, 0x413e8f5c    # 11.91f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v0, 0x41860000    # 16.75f

    .line 246
    .line 247
    const/high16 v2, 0x41280000    # 10.5f

    .line 248
    .line 249
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v0, -0x3f800000    # -4.0f

    .line 253
    .line 254
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, -0x40000000    # -2.0f

    .line 258
    .line 259
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v0, 0x40800000    # 4.0f

    .line 263
    .line 264
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v0, 0x41280000    # 10.5f

    .line 268
    .line 269
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, 0x40e80000    # 7.25f

    .line 276
    .line 277
    const/high16 v2, 0x41080000    # 8.5f

    .line 278
    .line 279
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v0, 0x40800000    # 4.0f

    .line 283
    .line 284
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v0, 0x40000000    # 2.0f

    .line 288
    .line 289
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v0, -0x3f800000    # -4.0f

    .line 293
    .line 294
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v0, 0x41080000    # 8.5f

    .line 298
    .line 299
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v0, 0x418c0000    # 17.5f

    .line 306
    .line 307
    const/high16 v2, 0x41600000    # 14.0f

    .line 308
    .line 309
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v0, -0x3ed00000    # -11.0f

    .line 313
    .line 314
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v0, -0x40800000    # -1.0f

    .line 318
    .line 319
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v17, 0x3f800000    # 1.0f

    .line 323
    .line 324
    const/high16 v18, -0x40800000    # -1.0f

    .line 325
    .line 326
    const/4 v13, 0x0

    .line 327
    const v14, -0x40f33333    # -0.55f

    .line 328
    .line 329
    .line 330
    const v15, 0x3ee66666    # 0.45f

    .line 331
    .line 332
    .line 333
    const/high16 v16, -0x40800000    # -1.0f

    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v0, 0x41100000    # 9.0f

    .line 339
    .line 340
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v18, 0x3f800000    # 1.0f

    .line 344
    .line 345
    const v13, 0x3f0ccccd    # 0.55f

    .line 346
    .line 347
    .line 348
    const/4 v14, 0x0

    .line 349
    const/high16 v15, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const v16, 0x3ee66666    # 0.45f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v0, 0x41600000    # 14.0f

    .line 358
    .line 359
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x41a00000    # 20.0f

    .line 366
    .line 367
    const/high16 v2, 0x40800000    # 4.0f

    .line 368
    .line 369
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v0, 0x41800000    # 16.0f

    .line 373
    .line 374
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v0, 0x40800000    # 4.0f

    .line 378
    .line 379
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x41a00000    # 20.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x40000000    # 2.0f

    .line 391
    .line 392
    const/high16 v2, 0x41a00000    # 20.0f

    .line 393
    .line 394
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v0, 0x40800000    # 4.0f

    .line 398
    .line 399
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v17, 0x40000000    # 2.0f

    .line 403
    .line 404
    const/high16 v18, 0x40800000    # 4.0f

    .line 405
    .line 406
    const v13, 0x4039999a    # 2.9f

    .line 407
    .line 408
    .line 409
    const/high16 v14, 0x40000000    # 2.0f

    .line 410
    .line 411
    const/high16 v15, 0x40000000    # 2.0f

    .line 412
    .line 413
    const v16, 0x4039999a    # 2.9f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v0, 0x41800000    # 16.0f

    .line 420
    .line 421
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v18, 0x40000000    # 2.0f

    .line 425
    .line 426
    const/4 v13, 0x0

    .line 427
    const v14, 0x3f8ccccd    # 1.1f

    .line 428
    .line 429
    .line 430
    const v15, 0x3f666666    # 0.9f

    .line 431
    .line 432
    .line 433
    const/high16 v16, 0x40000000    # 2.0f

    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v18, -0x40000000    # -2.0f

    .line 442
    .line 443
    const v13, 0x3f8ccccd    # 1.1f

    .line 444
    .line 445
    .line 446
    const/4 v14, 0x0

    .line 447
    const/high16 v15, 0x40000000    # 2.0f

    .line 448
    .line 449
    const v16, -0x4099999a    # -0.9f

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v0, 0x40800000    # 4.0f

    .line 456
    .line 457
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v17, 0x41a00000    # 20.0f

    .line 461
    .line 462
    const/high16 v18, 0x40000000    # 2.0f

    .line 463
    .line 464
    const/high16 v13, 0x41b00000    # 22.0f

    .line 465
    .line 466
    const v14, 0x4039999a    # 2.9f

    .line 467
    .line 468
    .line 469
    const v15, 0x41a8cccd    # 21.1f

    .line 470
    .line 471
    .line 472
    const/high16 v16, 0x40000000    # 2.0f

    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    const/16 v16, 0x3800

    .line 485
    .line 486
    const/16 v17, 0x0

    .line 487
    .line 488
    const/high16 v6, 0x3f800000    # 1.0f

    .line 489
    .line 490
    const/high16 v8, 0x3f800000    # 1.0f

    .line 491
    .line 492
    const/4 v7, 0x0

    .line 493
    const/high16 v9, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/high16 v12, 0x3f800000    # 1.0f

    .line 496
    .line 497
    const/4 v13, 0x0

    .line 498
    const/4 v14, 0x0

    .line 499
    const/4 v15, 0x0

    .line 500
    const-string v4, ""

    .line 501
    .line 502
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    sput-object v0, Landroidx/compose/material/icons/outlined/BedroomParentKt;->_bedroomParent:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 511
    .line 512
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    return-object v0
.end method
