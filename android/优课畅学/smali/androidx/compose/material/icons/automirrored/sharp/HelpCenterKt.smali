.class public final Landroidx/compose/material/icons/automirrored/sharp/HelpCenterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _helpCenter:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHelpCenter(Landroidx/compose/material/icons/Icons$AutoMirrored$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/automirrored/sharp/HelpCenterKt;->_helpCenter:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const/4 v10, 0x1

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
    const-string v2, "AutoMirrored.Sharp.HelpCenter"

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
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40400000    # 3.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x41900000    # 18.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v0, 0x40400000    # 3.0f

    .line 91
    .line 92
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, 0x414028f6    # 12.01f

    .line 99
    .line 100
    .line 101
    const/high16 v2, 0x41900000    # 18.0f

    .line 102
    .line 103
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v17, -0x405eb852    # -1.26f

    .line 107
    .line 108
    .line 109
    const v18, -0x405eb852    # -1.26f

    .line 110
    .line 111
    .line 112
    const v13, -0x40cccccd    # -0.7f

    .line 113
    .line 114
    .line 115
    const/4 v14, 0x0

    .line 116
    const v15, -0x405eb852    # -1.26f

    .line 117
    .line 118
    .line 119
    const v16, -0x40f0a3d7    # -0.56f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v17, 0x3fa147ae    # 1.26f

    .line 126
    .line 127
    .line 128
    const/high16 v18, -0x40600000    # -1.25f

    .line 129
    .line 130
    const/4 v13, 0x0

    .line 131
    const v14, -0x40ca3d71    # -0.71f

    .line 132
    .line 133
    .line 134
    const v15, 0x3f0f5c29    # 0.56f

    .line 135
    .line 136
    .line 137
    const/high16 v16, -0x40600000    # -1.25f

    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 143
    .line 144
    const/high16 v18, 0x3fa00000    # 1.25f

    .line 145
    .line 146
    const v13, 0x3f35c28f    # 0.71f

    .line 147
    .line 148
    .line 149
    const/4 v14, 0x0

    .line 150
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 151
    .line 152
    const v16, 0x3f0a3d71    # 0.54f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v17, 0x414028f6    # 12.01f

    .line 159
    .line 160
    .line 161
    const/high16 v18, 0x41900000    # 18.0f

    .line 162
    .line 163
    const/high16 v13, 0x41540000    # 13.25f

    .line 164
    .line 165
    const v14, 0x418b70a4    # 17.43f

    .line 166
    .line 167
    .line 168
    const v15, 0x414b851f    # 12.72f

    .line 169
    .line 170
    .line 171
    const/high16 v16, 0x41900000    # 18.0f

    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v0, 0x417051ec    # 15.02f

    .line 180
    .line 181
    .line 182
    const v2, 0x4129999a    # 10.6f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v17, -0x4010a3d7    # -1.87f

    .line 189
    .line 190
    .line 191
    const v18, 0x400ae148    # 2.17f

    .line 192
    .line 193
    .line 194
    const v13, -0x40bd70a4    # -0.76f

    .line 195
    .line 196
    .line 197
    const v14, 0x3f8e147b    # 1.11f

    .line 198
    .line 199
    .line 200
    const v15, -0x40428f5c    # -1.48f

    .line 201
    .line 202
    .line 203
    const v16, 0x3fbae148    # 1.46f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v17, -0x419eb852    # -0.22f

    .line 210
    .line 211
    .line 212
    const v18, 0x3fb47ae1    # 1.41f

    .line 213
    .line 214
    .line 215
    const v13, -0x41dc28f6    # -0.16f

    .line 216
    .line 217
    .line 218
    const v14, 0x3e947ae1    # 0.29f

    .line 219
    .line 220
    .line 221
    const v15, -0x419eb852    # -0.22f

    .line 222
    .line 223
    .line 224
    const v16, 0x3ef5c28f    # 0.48f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, -0x40170a3d    # -1.82f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, 0x3e9eb852    # 0.31f

    .line 237
    .line 238
    .line 239
    const v18, -0x40028f5c    # -1.98f

    .line 240
    .line 241
    .line 242
    const/4 v13, 0x0

    .line 243
    const v14, -0x41051eb8    # -0.49f

    .line 244
    .line 245
    .line 246
    const v15, -0x425c28f6    # -0.08f

    .line 247
    .line 248
    .line 249
    const v16, -0x405ae148    # -1.29f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v17, 0x3ffae148    # 1.96f

    .line 256
    .line 257
    .line 258
    const v18, -0x3ff5c28f    # -2.16f

    .line 259
    .line 260
    .line 261
    const v13, 0x3efae148    # 0.49f

    .line 262
    .line 263
    .line 264
    const v14, -0x40a147ae    # -0.87f

    .line 265
    .line 266
    .line 267
    const v15, 0x3fb5c28f    # 1.42f

    .line 268
    .line 269
    .line 270
    const v16, -0x404e147b    # -1.39f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v17, -0x4050a3d7    # -1.37f

    .line 277
    .line 278
    .line 279
    const v18, -0x3feae148    # -2.33f

    .line 280
    .line 281
    .line 282
    const v13, 0x3f11eb85    # 0.57f

    .line 283
    .line 284
    .line 285
    const v14, -0x40b0a3d7    # -0.81f

    .line 286
    .line 287
    .line 288
    const/high16 v15, 0x3e800000    # 0.25f

    .line 289
    .line 290
    const v16, -0x3feae148    # -2.33f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v17, -0x4019999a    # -1.8f

    .line 297
    .line 298
    .line 299
    const v18, 0x3fbd70a4    # 1.48f

    .line 300
    .line 301
    .line 302
    const v13, -0x407851ec    # -1.06f

    .line 303
    .line 304
    .line 305
    const/4 v14, 0x0

    .line 306
    const v15, -0x4035c28f    # -1.58f

    .line 307
    .line 308
    .line 309
    const v16, 0x3f4ccccd    # 0.8f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, 0x4108f5c3    # 8.56f

    .line 316
    .line 317
    .line 318
    const v2, 0x4107d70a    # 8.49f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, 0x413fd70a    # 11.99f

    .line 325
    .line 326
    .line 327
    const/high16 v18, 0x40c00000    # 6.0f

    .line 328
    .line 329
    const v13, 0x411028f6    # 9.01f

    .line 330
    .line 331
    .line 332
    const v14, 0x40e4cccd    # 7.15f

    .line 333
    .line 334
    .line 335
    const v15, 0x4123851f    # 10.22f

    .line 336
    .line 337
    .line 338
    const/high16 v16, 0x40c00000    # 6.0f

    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, 0x4040a3d7    # 3.01f

    .line 344
    .line 345
    .line 346
    const v18, 0x3fc28f5c    # 1.52f

    .line 347
    .line 348
    .line 349
    const v13, 0x3fbd70a4    # 1.48f

    .line 350
    .line 351
    .line 352
    const/4 v14, 0x0

    .line 353
    const v15, 0x401f5c29    # 2.49f

    .line 354
    .line 355
    .line 356
    const v16, 0x3f2b851f    # 0.67f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v17, 0x417051ec    # 15.02f

    .line 363
    .line 364
    .line 365
    const v18, 0x4129999a    # 10.6f

    .line 366
    .line 367
    .line 368
    const v13, 0x41770a3d    # 15.44f

    .line 369
    .line 370
    .line 371
    const v14, 0x4103d70a    # 8.24f

    .line 372
    .line 373
    .line 374
    const v15, 0x417b3333    # 15.7f

    .line 375
    .line 376
    .line 377
    const v16, 0x411970a4    # 9.59f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    const/16 v16, 0x3800

    .line 391
    .line 392
    const/16 v17, 0x0

    .line 393
    .line 394
    const/high16 v6, 0x3f800000    # 1.0f

    .line 395
    .line 396
    const/high16 v8, 0x3f800000    # 1.0f

    .line 397
    .line 398
    const/4 v7, 0x0

    .line 399
    const/high16 v9, 0x3f800000    # 1.0f

    .line 400
    .line 401
    const/high16 v12, 0x3f800000    # 1.0f

    .line 402
    .line 403
    const/4 v13, 0x0

    .line 404
    const/4 v14, 0x0

    .line 405
    const/4 v15, 0x0

    .line 406
    const-string v4, ""

    .line 407
    .line 408
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    sput-object v0, Landroidx/compose/material/icons/automirrored/sharp/HelpCenterKt;->_helpCenter:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 417
    .line 418
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    return-object v0
.end method
