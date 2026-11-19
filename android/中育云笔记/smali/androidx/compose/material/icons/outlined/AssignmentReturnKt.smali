.class public final Landroidx/compose/material/icons/outlined/AssignmentReturnKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _assignmentReturn:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAssignmentReturn(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/AssignmentReturnKt;->_assignmentReturn:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.AssignmentReturn"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, -0x3f800000    # -4.0f

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
    const/high16 v0, 0x40e00000    # 7.0f

    .line 91
    .line 92
    const/high16 v2, 0x41400000    # 12.0f

    .line 93
    .line 94
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v0, -0x3f600000    # -5.0f

    .line 98
    .line 99
    const/high16 v2, 0x40a00000    # 5.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, 0x40a00000    # 5.0f

    .line 105
    .line 106
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v0, 0x40400000    # 3.0f

    .line 113
    .line 114
    const/high16 v2, 0x41980000    # 19.0f

    .line 115
    .line 116
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v0, -0x3f7a3d71    # -4.18f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v17, 0x41400000    # 12.0f

    .line 126
    .line 127
    const/high16 v18, 0x3f800000    # 1.0f

    .line 128
    .line 129
    const v13, 0x41666666    # 14.4f

    .line 130
    .line 131
    .line 132
    const v14, 0x3feb851f    # 1.84f

    .line 133
    .line 134
    .line 135
    const v15, 0x4154cccd    # 13.3f

    .line 136
    .line 137
    .line 138
    const/high16 v16, 0x3f800000    # 1.0f

    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v17, -0x3fcb851f    # -2.82f

    .line 144
    .line 145
    .line 146
    const/high16 v18, 0x40000000    # 2.0f

    .line 147
    .line 148
    const v13, -0x4059999a    # -1.3f

    .line 149
    .line 150
    .line 151
    const/4 v14, 0x0

    .line 152
    const v15, -0x3fe66666    # -2.4f

    .line 153
    .line 154
    .line 155
    const v16, 0x3f570a3d    # 0.84f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, 0x40400000    # 3.0f

    .line 162
    .line 163
    const/high16 v2, 0x40a00000    # 5.0f

    .line 164
    .line 165
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v17, -0x41333333    # -0.4f

    .line 169
    .line 170
    .line 171
    const v18, 0x3d23d70a    # 0.04f

    .line 172
    .line 173
    .line 174
    const v13, -0x41f0a3d7    # -0.14f

    .line 175
    .line 176
    .line 177
    const v15, -0x4175c28f    # -0.27f

    .line 178
    .line 179
    .line 180
    const v16, 0x3c23d70a    # 0.01f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, -0x407eb852    # -1.01f

    .line 187
    .line 188
    .line 189
    const v18, 0x3f0ccccd    # 0.55f

    .line 190
    .line 191
    .line 192
    const v13, -0x413851ec    # -0.39f

    .line 193
    .line 194
    .line 195
    const v14, 0x3da3d70a    # 0.08f

    .line 196
    .line 197
    .line 198
    const v15, -0x40c28f5c    # -0.74f

    .line 199
    .line 200
    .line 201
    const v16, 0x3e8f5c29    # 0.28f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, -0x4123d70a    # -0.43f

    .line 208
    .line 209
    .line 210
    const v18, 0x3f23d70a    # 0.64f

    .line 211
    .line 212
    .line 213
    const v13, -0x41c7ae14    # -0.18f

    .line 214
    .line 215
    .line 216
    const v14, 0x3e3851ec    # 0.18f

    .line 217
    .line 218
    .line 219
    const v15, -0x41570a3d    # -0.33f

    .line 220
    .line 221
    .line 222
    const v16, 0x3ecccccd    # 0.4f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v17, -0x41dc28f6    # -0.16f

    .line 229
    .line 230
    .line 231
    const v18, 0x3f451eb8    # 0.77f

    .line 232
    .line 233
    .line 234
    const v13, -0x42333333    # -0.1f

    .line 235
    .line 236
    .line 237
    const v14, 0x3e6b851f    # 0.23f

    .line 238
    .line 239
    .line 240
    const v15, -0x41dc28f6    # -0.16f

    .line 241
    .line 242
    .line 243
    const v16, 0x3efae148    # 0.49f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, 0x41600000    # 14.0f

    .line 250
    .line 251
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, 0x3e23d70a    # 0.16f

    .line 255
    .line 256
    .line 257
    const v18, 0x3f47ae14    # 0.78f

    .line 258
    .line 259
    .line 260
    const/4 v13, 0x0

    .line 261
    const v14, 0x3e8a3d71    # 0.27f

    .line 262
    .line 263
    .line 264
    const v15, 0x3d75c28f    # 0.06f

    .line 265
    .line 266
    .line 267
    const v16, 0x3f0a3d71    # 0.54f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, 0x3edc28f6    # 0.43f

    .line 274
    .line 275
    .line 276
    const v2, 0x3f23d70a    # 0.64f

    .line 277
    .line 278
    .line 279
    const/high16 v4, 0x3e800000    # 0.25f

    .line 280
    .line 281
    const v6, 0x3ee66666    # 0.45f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v17, 0x3f8147ae    # 1.01f

    .line 288
    .line 289
    .line 290
    const v18, 0x3f0ccccd    # 0.55f

    .line 291
    .line 292
    .line 293
    const v13, 0x3e8a3d71    # 0.27f

    .line 294
    .line 295
    .line 296
    const v15, 0x3f1eb852    # 0.62f

    .line 297
    .line 298
    .line 299
    const v16, 0x3ef0a3d7    # 0.47f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, 0x3ecccccd    # 0.4f

    .line 306
    .line 307
    .line 308
    const v18, 0x3cf5c28f    # 0.03f

    .line 309
    .line 310
    .line 311
    const v13, 0x3e051eb8    # 0.13f

    .line 312
    .line 313
    .line 314
    const v14, 0x3ca3d70a    # 0.02f

    .line 315
    .line 316
    .line 317
    const v15, 0x3e851eb8    # 0.26f

    .line 318
    .line 319
    .line 320
    const v16, 0x3cf5c28f    # 0.03f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, 0x41600000    # 14.0f

    .line 327
    .line 328
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v17, 0x40000000    # 2.0f

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
    const/high16 v0, 0x41a80000    # 21.0f

    .line 348
    .line 349
    const/high16 v2, 0x40a00000    # 5.0f

    .line 350
    .line 351
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v17, -0x40000000    # -2.0f

    .line 355
    .line 356
    const/4 v13, 0x0

    .line 357
    const v14, -0x40733333    # -1.1f

    .line 358
    .line 359
    .line 360
    const v15, -0x4099999a    # -0.9f

    .line 361
    .line 362
    .line 363
    const/high16 v16, -0x40000000    # -2.0f

    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, 0x40300000    # 2.75f

    .line 372
    .line 373
    const/high16 v2, 0x41400000    # 12.0f

    .line 374
    .line 375
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v17, 0x3f400000    # 0.75f

    .line 379
    .line 380
    const/high16 v18, 0x3f400000    # 0.75f

    .line 381
    .line 382
    const v13, 0x3ed1eb85    # 0.41f

    .line 383
    .line 384
    .line 385
    const/4 v14, 0x0

    .line 386
    const/high16 v15, 0x3f400000    # 0.75f

    .line 387
    .line 388
    const v16, 0x3eae147b    # 0.34f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v0, -0x4151eb85    # -0.34f

    .line 395
    .line 396
    .line 397
    const/high16 v2, 0x3f400000    # 0.75f

    .line 398
    .line 399
    const/high16 v4, -0x40c00000    # -0.75f

    .line 400
    .line 401
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v2, -0x40c00000    # -0.75f

    .line 405
    .line 406
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v0, 0x3eae147b    # 0.34f

    .line 410
    .line 411
    .line 412
    const/high16 v2, 0x3f400000    # 0.75f

    .line 413
    .line 414
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x41980000    # 19.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v2, 0x40a00000    # 5.0f

    .line 426
    .line 427
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, 0x40a00000    # 5.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v0, 0x41600000    # 14.0f

    .line 436
    .line 437
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    const/16 v16, 0x3800

    .line 451
    .line 452
    const/16 v17, 0x0

    .line 453
    .line 454
    const/high16 v6, 0x3f800000    # 1.0f

    .line 455
    .line 456
    const/high16 v8, 0x3f800000    # 1.0f

    .line 457
    .line 458
    const/4 v7, 0x0

    .line 459
    const/high16 v9, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/high16 v12, 0x3f800000    # 1.0f

    .line 462
    .line 463
    const/4 v13, 0x0

    .line 464
    const/4 v15, 0x0

    .line 465
    const-string v4, ""

    .line 466
    .line 467
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    sput-object v0, Landroidx/compose/material/icons/outlined/AssignmentReturnKt;->_assignmentReturn:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 476
    .line 477
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    return-object v0
.end method

.method public static synthetic getAssignmentReturn$annotations(Landroidx/compose/material/icons/Icons$Outlined;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
