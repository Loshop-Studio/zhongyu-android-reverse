.class public final Landroidx/compose/material/icons/rounded/LooksKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _looks:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLooks(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LooksKt;->_looks:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Looks"

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
    const/high16 v0, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x3f22e148    # -6.91f

    .line 78
    .line 79
    .line 80
    const v18, 0x40bb851f    # 5.86f

    .line 81
    .line 82
    .line 83
    const v13, -0x3fa1eb85    # -3.47f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, -0x3f347ae1    # -6.36f

    .line 88
    .line 89
    .line 90
    const v16, 0x40228f5c    # 2.54f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v17, 0x3f800000    # 1.0f

    .line 97
    .line 98
    const v18, 0x3f91eb85    # 1.14f

    .line 99
    .line 100
    .line 101
    const v13, -0x42333333    # -0.1f

    .line 102
    .line 103
    .line 104
    const v14, 0x3f19999a    # 0.6f

    .line 105
    .line 106
    .line 107
    const v15, 0x3ec7ae14    # 0.39f

    .line 108
    .line 109
    .line 110
    const v16, 0x3f91eb85    # 1.14f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, 0x3f7ae148    # 0.98f

    .line 117
    .line 118
    .line 119
    const v18, -0x40a66666    # -0.85f

    .line 120
    .line 121
    .line 122
    const v13, 0x3efae148    # 0.49f

    .line 123
    .line 124
    .line 125
    const/4 v14, 0x0

    .line 126
    const v15, 0x3f666666    # 0.9f

    .line 127
    .line 128
    .line 129
    const v16, -0x4147ae14    # -0.36f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v17, 0x41400000    # 12.0f

    .line 136
    .line 137
    const/high16 v18, 0x41400000    # 12.0f

    .line 138
    .line 139
    const v13, 0x40ef5c29    # 7.48f

    .line 140
    .line 141
    .line 142
    const v14, 0x415ca3d7    # 13.79f

    .line 143
    .line 144
    .line 145
    const v15, 0x41187ae1    # 9.53f

    .line 146
    .line 147
    .line 148
    const/high16 v16, 0x41400000    # 12.0f

    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, 0x409dc28f    # 4.93f

    .line 154
    .line 155
    .line 156
    const v2, 0x4084cccd    # 4.15f

    .line 157
    .line 158
    .line 159
    const v4, 0x4090a3d7    # 4.52f

    .line 160
    .line 161
    .line 162
    const v6, 0x3fe51eb8    # 1.79f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v17, 0x3f7ae148    # 0.98f

    .line 169
    .line 170
    .line 171
    const v18, 0x3f59999a    # 0.85f

    .line 172
    .line 173
    .line 174
    const v13, 0x3da3d70a    # 0.08f

    .line 175
    .line 176
    .line 177
    const v14, 0x3efae148    # 0.49f

    .line 178
    .line 179
    .line 180
    const v15, 0x3efae148    # 0.49f

    .line 181
    .line 182
    .line 183
    const v16, 0x3f59999a    # 0.85f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, 0x3f7d70a4    # 0.99f

    .line 190
    .line 191
    .line 192
    const v18, -0x406e147b    # -1.14f

    .line 193
    .line 194
    .line 195
    const v13, 0x3f1c28f6    # 0.61f

    .line 196
    .line 197
    .line 198
    const/4 v14, 0x0

    .line 199
    const v15, 0x3f8b851f    # 1.09f

    .line 200
    .line 201
    .line 202
    const v16, -0x40f5c28f    # -0.54f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v17, 0x41400000    # 12.0f

    .line 209
    .line 210
    const/high16 v18, 0x41200000    # 10.0f

    .line 211
    .line 212
    const v13, 0x4192e148    # 18.36f

    .line 213
    .line 214
    .line 215
    const v14, 0x4148a3d7    # 12.54f

    .line 216
    .line 217
    .line 218
    const v15, 0x4177851f    # 15.47f

    .line 219
    .line 220
    .line 221
    const/high16 v16, 0x41200000    # 10.0f

    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v0, 0x40c00000    # 6.0f

    .line 230
    .line 231
    const/high16 v2, 0x41400000    # 12.0f

    .line 232
    .line 233
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, 0x3f866666    # 1.05f

    .line 237
    .line 238
    .line 239
    const v18, 0x417e6666    # 15.9f

    .line 240
    .line 241
    .line 242
    const v13, 0x40c9999a    # 6.3f

    .line 243
    .line 244
    .line 245
    const/high16 v14, 0x40c00000    # 6.0f

    .line 246
    .line 247
    const v15, 0x3fce147b    # 1.61f

    .line 248
    .line 249
    .line 250
    const v16, 0x412570a4    # 10.34f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, 0x3f8147ae    # 1.01f

    .line 257
    .line 258
    .line 259
    const v18, 0x3f8ccccd    # 1.1f

    .line 260
    .line 261
    .line 262
    const v13, -0x42b33333    # -0.05f

    .line 263
    .line 264
    .line 265
    const v14, 0x3f170a3d    # 0.59f

    .line 266
    .line 267
    .line 268
    const v15, 0x3ed1eb85    # 0.41f

    .line 269
    .line 270
    .line 271
    const v16, 0x3f8ccccd    # 1.1f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, 0x3f7d70a4    # 0.99f

    .line 278
    .line 279
    .line 280
    const v18, -0x409eb852    # -0.88f

    .line 281
    .line 282
    .line 283
    const v13, 0x3f028f5c    # 0.51f

    .line 284
    .line 285
    .line 286
    const/4 v14, 0x0

    .line 287
    const v15, 0x3f70a3d7    # 0.94f

    .line 288
    .line 289
    .line 290
    const v16, -0x413d70a4    # -0.38f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v17, 0x41400000    # 12.0f

    .line 297
    .line 298
    const/high16 v18, 0x41000000    # 8.0f

    .line 299
    .line 300
    const v13, 0x405f5c29    # 3.49f

    .line 301
    .line 302
    .line 303
    const v14, 0x41391eb8    # 11.57f

    .line 304
    .line 305
    .line 306
    const v15, 0x40eae148    # 7.34f

    .line 307
    .line 308
    .line 309
    const/high16 v16, 0x41000000    # 8.0f

    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, 0x410f5c29    # 8.96f

    .line 315
    .line 316
    .line 317
    const v2, 0x4101eb85    # 8.12f

    .line 318
    .line 319
    .line 320
    const v4, 0x410828f6    # 8.51f

    .line 321
    .line 322
    .line 323
    const v6, 0x40647ae1    # 3.57f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, 0x3f7d70a4    # 0.99f

    .line 330
    .line 331
    .line 332
    const v18, 0x3f6147ae    # 0.88f

    .line 333
    .line 334
    .line 335
    const v13, 0x3d4ccccd    # 0.05f

    .line 336
    .line 337
    .line 338
    const/high16 v14, 0x3f000000    # 0.5f

    .line 339
    .line 340
    const v15, 0x3ef5c28f    # 0.48f

    .line 341
    .line 342
    .line 343
    const v16, 0x3f6147ae    # 0.88f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v17, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const v18, -0x40733333    # -1.1f

    .line 352
    .line 353
    .line 354
    const v13, 0x3f170a3d    # 0.59f

    .line 355
    .line 356
    .line 357
    const/4 v14, 0x0

    .line 358
    const v15, 0x3f87ae14    # 1.06f

    .line 359
    .line 360
    .line 361
    const v16, -0x40fd70a4    # -0.51f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v17, 0x41400000    # 12.0f

    .line 368
    .line 369
    const/high16 v18, 0x40c00000    # 6.0f

    .line 370
    .line 371
    const v13, 0x41b31eb8    # 22.39f

    .line 372
    .line 373
    .line 374
    const v14, 0x412570a4    # 10.34f

    .line 375
    .line 376
    .line 377
    const v15, 0x418d999a    # 17.7f

    .line 378
    .line 379
    .line 380
    const/high16 v16, 0x40c00000    # 6.0f

    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    const/16 v16, 0x3800

    .line 393
    .line 394
    const/16 v17, 0x0

    .line 395
    .line 396
    const/high16 v6, 0x3f800000    # 1.0f

    .line 397
    .line 398
    const/high16 v8, 0x3f800000    # 1.0f

    .line 399
    .line 400
    const/4 v7, 0x0

    .line 401
    const/high16 v9, 0x3f800000    # 1.0f

    .line 402
    .line 403
    const/high16 v12, 0x3f800000    # 1.0f

    .line 404
    .line 405
    const/4 v13, 0x0

    .line 406
    const/4 v14, 0x0

    .line 407
    const/4 v15, 0x0

    .line 408
    const-string v4, ""

    .line 409
    .line 410
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    sput-object v0, Landroidx/compose/material/icons/rounded/LooksKt;->_looks:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 419
    .line 420
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    return-object v0
.end method
