.class public final Landroidx/compose/material/icons/outlined/AssignmentReturnedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _assignmentReturned:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAssignmentReturned(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/AssignmentReturnedKt;->_assignmentReturned:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.AssignmentReturned"

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
    const/high16 v0, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x41000000    # 8.0f

    .line 83
    .line 84
    const/high16 v2, 0x41600000    # 14.0f

    .line 85
    .line 86
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v0, -0x3f800000    # -4.0f

    .line 90
    .line 91
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v0, 0x40800000    # 4.0f

    .line 95
    .line 96
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x40e00000    # 7.0f

    .line 100
    .line 101
    const/high16 v2, 0x41400000    # 12.0f

    .line 102
    .line 103
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, 0x40a00000    # 5.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v0, 0x40400000    # 3.0f

    .line 115
    .line 116
    const/high16 v2, 0x41980000    # 19.0f

    .line 117
    .line 118
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v0, -0x3f7a3d71    # -4.18f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v17, 0x41400000    # 12.0f

    .line 128
    .line 129
    const/high16 v18, 0x3f800000    # 1.0f

    .line 130
    .line 131
    const v13, 0x41666666    # 14.4f

    .line 132
    .line 133
    .line 134
    const v14, 0x3feb851f    # 1.84f

    .line 135
    .line 136
    .line 137
    const v15, 0x4154cccd    # 13.3f

    .line 138
    .line 139
    .line 140
    const/high16 v16, 0x3f800000    # 1.0f

    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v17, -0x3fcb851f    # -2.82f

    .line 146
    .line 147
    .line 148
    const/high16 v18, 0x40000000    # 2.0f

    .line 149
    .line 150
    const v13, -0x4059999a    # -1.3f

    .line 151
    .line 152
    .line 153
    const/4 v14, 0x0

    .line 154
    const v15, -0x3fe66666    # -2.4f

    .line 155
    .line 156
    .line 157
    const v16, 0x3f570a3d    # 0.84f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v0, 0x40400000    # 3.0f

    .line 164
    .line 165
    const/high16 v2, 0x40a00000    # 5.0f

    .line 166
    .line 167
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, -0x41333333    # -0.4f

    .line 171
    .line 172
    .line 173
    const v18, 0x3d23d70a    # 0.04f

    .line 174
    .line 175
    .line 176
    const v13, -0x41f0a3d7    # -0.14f

    .line 177
    .line 178
    .line 179
    const v15, -0x4175c28f    # -0.27f

    .line 180
    .line 181
    .line 182
    const v16, 0x3c23d70a    # 0.01f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v17, -0x407eb852    # -1.01f

    .line 189
    .line 190
    .line 191
    const v18, 0x3f0ccccd    # 0.55f

    .line 192
    .line 193
    .line 194
    const v13, -0x413851ec    # -0.39f

    .line 195
    .line 196
    .line 197
    const v14, 0x3da3d70a    # 0.08f

    .line 198
    .line 199
    .line 200
    const v15, -0x40c28f5c    # -0.74f

    .line 201
    .line 202
    .line 203
    const v16, 0x3e8f5c29    # 0.28f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v17, -0x4123d70a    # -0.43f

    .line 210
    .line 211
    .line 212
    const v18, 0x3f23d70a    # 0.64f

    .line 213
    .line 214
    .line 215
    const v13, -0x41c7ae14    # -0.18f

    .line 216
    .line 217
    .line 218
    const v14, 0x3e3851ec    # 0.18f

    .line 219
    .line 220
    .line 221
    const v15, -0x41570a3d    # -0.33f

    .line 222
    .line 223
    .line 224
    const v16, 0x3ecccccd    # 0.4f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, -0x41dc28f6    # -0.16f

    .line 231
    .line 232
    .line 233
    const v18, 0x3f451eb8    # 0.77f

    .line 234
    .line 235
    .line 236
    const v13, -0x42333333    # -0.1f

    .line 237
    .line 238
    .line 239
    const v14, 0x3e6b851f    # 0.23f

    .line 240
    .line 241
    .line 242
    const v15, -0x41dc28f6    # -0.16f

    .line 243
    .line 244
    .line 245
    const v16, 0x3efae148    # 0.49f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v0, 0x41600000    # 14.0f

    .line 252
    .line 253
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, 0x3e23d70a    # 0.16f

    .line 257
    .line 258
    .line 259
    const v18, 0x3f47ae14    # 0.78f

    .line 260
    .line 261
    .line 262
    const/4 v13, 0x0

    .line 263
    const v14, 0x3e8a3d71    # 0.27f

    .line 264
    .line 265
    .line 266
    const v15, 0x3d75c28f    # 0.06f

    .line 267
    .line 268
    .line 269
    const v16, 0x3f0a3d71    # 0.54f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x3edc28f6    # 0.43f

    .line 276
    .line 277
    .line 278
    const v2, 0x3f23d70a    # 0.64f

    .line 279
    .line 280
    .line 281
    const/high16 v4, 0x3e800000    # 0.25f

    .line 282
    .line 283
    const v6, 0x3ee66666    # 0.45f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, 0x3f8147ae    # 1.01f

    .line 290
    .line 291
    .line 292
    const v18, 0x3f0ccccd    # 0.55f

    .line 293
    .line 294
    .line 295
    const v13, 0x3e8a3d71    # 0.27f

    .line 296
    .line 297
    .line 298
    const v15, 0x3f1eb852    # 0.62f

    .line 299
    .line 300
    .line 301
    const v16, 0x3ef0a3d7    # 0.47f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, 0x3ecccccd    # 0.4f

    .line 308
    .line 309
    .line 310
    const v18, 0x3cf5c28f    # 0.03f

    .line 311
    .line 312
    .line 313
    const v13, 0x3e051eb8    # 0.13f

    .line 314
    .line 315
    .line 316
    const v14, 0x3ca3d70a    # 0.02f

    .line 317
    .line 318
    .line 319
    const v15, 0x3e851eb8    # 0.26f

    .line 320
    .line 321
    .line 322
    const v16, 0x3cf5c28f    # 0.03f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v0, 0x41600000    # 14.0f

    .line 329
    .line 330
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v17, 0x40000000    # 2.0f

    .line 334
    .line 335
    const/high16 v18, -0x40000000    # -2.0f

    .line 336
    .line 337
    const v13, 0x3f8ccccd    # 1.1f

    .line 338
    .line 339
    .line 340
    const/4 v14, 0x0

    .line 341
    const/high16 v15, 0x40000000    # 2.0f

    .line 342
    .line 343
    const v16, -0x4099999a    # -0.9f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v0, 0x41a80000    # 21.0f

    .line 350
    .line 351
    const/high16 v2, 0x40a00000    # 5.0f

    .line 352
    .line 353
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v17, -0x40000000    # -2.0f

    .line 357
    .line 358
    const/4 v13, 0x0

    .line 359
    const v14, -0x40733333    # -1.1f

    .line 360
    .line 361
    .line 362
    const v15, -0x4099999a    # -0.9f

    .line 363
    .line 364
    .line 365
    const/high16 v16, -0x40000000    # -2.0f

    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v0, 0x40300000    # 2.75f

    .line 374
    .line 375
    const/high16 v2, 0x41400000    # 12.0f

    .line 376
    .line 377
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v17, 0x3f400000    # 0.75f

    .line 381
    .line 382
    const/high16 v18, 0x3f400000    # 0.75f

    .line 383
    .line 384
    const v13, 0x3ed1eb85    # 0.41f

    .line 385
    .line 386
    .line 387
    const/4 v14, 0x0

    .line 388
    const/high16 v15, 0x3f400000    # 0.75f

    .line 389
    .line 390
    const v16, 0x3eae147b    # 0.34f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, -0x4151eb85    # -0.34f

    .line 397
    .line 398
    .line 399
    const/high16 v2, 0x3f400000    # 0.75f

    .line 400
    .line 401
    const/high16 v4, -0x40c00000    # -0.75f

    .line 402
    .line 403
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v2, -0x40c00000    # -0.75f

    .line 407
    .line 408
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v0, 0x3eae147b    # 0.34f

    .line 412
    .line 413
    .line 414
    const/high16 v2, 0x3f400000    # 0.75f

    .line 415
    .line 416
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v0, 0x41980000    # 19.0f

    .line 423
    .line 424
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v2, 0x40a00000    # 5.0f

    .line 428
    .line 429
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x40a00000    # 5.0f

    .line 433
    .line 434
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x41600000    # 14.0f

    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    const/16 v16, 0x3800

    .line 453
    .line 454
    const/16 v17, 0x0

    .line 455
    .line 456
    const/high16 v6, 0x3f800000    # 1.0f

    .line 457
    .line 458
    const/high16 v8, 0x3f800000    # 1.0f

    .line 459
    .line 460
    const/4 v7, 0x0

    .line 461
    const/high16 v9, 0x3f800000    # 1.0f

    .line 462
    .line 463
    const/high16 v12, 0x3f800000    # 1.0f

    .line 464
    .line 465
    const/4 v13, 0x0

    .line 466
    const/4 v15, 0x0

    .line 467
    const-string v4, ""

    .line 468
    .line 469
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    sput-object v0, Landroidx/compose/material/icons/outlined/AssignmentReturnedKt;->_assignmentReturned:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 478
    .line 479
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    return-object v0
.end method
