.class public final Landroidx/compose/material/icons/rounded/AlarmKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_alarm",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Alarm",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getAlarm",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-extended_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAlarm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alarm.kt\nandroidx/compose/material/icons/rounded/AlarmKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 Alarm.kt\nandroidx/compose/material/icons/rounded/AlarmKt\n*L\n29#1:78,12\n30#1:91,18\n30#1:128\n29#1:90\n30#1:109,2\n30#1:111,2\n30#1:117,11\n30#1:113,4\n*E\n"
    }
.end annotation


# static fields
.field private static _alarm:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAlarm(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AlarmKt;->_alarm:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

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
    const-string v2, "Rounded.Alarm"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    const v0, 0x417deb85    # 15.87f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41740000    # 15.25f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, -0x3fa851ec    # -3.37f

    .line 79
    .line 80
    .line 81
    const/high16 v2, -0x40000000    # -2.0f

    .line 82
    .line 83
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v0, 0x41480000    # 12.5f

    .line 87
    .line 88
    const v2, 0x410b851f    # 8.72f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v17, -0x40c7ae14    # -0.72f

    .line 95
    .line 96
    .line 97
    const v18, -0x40c7ae14    # -0.72f

    .line 98
    .line 99
    .line 100
    const/4 v13, 0x0

    .line 101
    const v14, -0x41333333    # -0.4f

    .line 102
    .line 103
    .line 104
    const v15, -0x415c28f6    # -0.32f

    .line 105
    .line 106
    .line 107
    const v16, -0x40c7ae14    # -0.72f

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v0, -0x428a3d71    # -0.06f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v18, 0x3f3851ec    # 0.72f

    .line 120
    .line 121
    .line 122
    const v13, -0x41333333    # -0.4f

    .line 123
    .line 124
    .line 125
    const/4 v14, 0x0

    .line 126
    const v15, -0x40c7ae14    # -0.72f

    .line 127
    .line 128
    .line 129
    const v16, 0x3ea3d70a    # 0.32f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, 0x40970a3d    # 4.72f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v17, 0x3efae148    # 0.49f

    .line 142
    .line 143
    .line 144
    const v18, 0x3f5c28f6    # 0.86f

    .line 145
    .line 146
    .line 147
    const/4 v13, 0x0

    .line 148
    const v14, 0x3eb33333    # 0.35f

    .line 149
    .line 150
    .line 151
    const v15, 0x3e3851ec    # 0.18f

    .line 152
    .line 153
    .line 154
    const v16, 0x3f2e147b    # 0.68f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v0, 0x4069999a    # 3.65f

    .line 161
    .line 162
    .line 163
    const v2, 0x400c28f6    # 2.19f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v17, 0x3f7ae148    # 0.98f

    .line 170
    .line 171
    .line 172
    const v18, -0x418a3d71    # -0.24f

    .line 173
    .line 174
    .line 175
    const v13, 0x3eae147b    # 0.34f

    .line 176
    .line 177
    .line 178
    const v14, 0x3e4ccccd    # 0.2f

    .line 179
    .line 180
    .line 181
    const v15, 0x3f47ae14    # 0.78f

    .line 182
    .line 183
    .line 184
    const v16, 0x3dcccccd    # 0.1f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v17, -0x41800000    # -0.25f

    .line 191
    .line 192
    const/high16 v18, -0x40800000    # -1.0f

    .line 193
    .line 194
    const v13, 0x3e570a3d    # 0.21f

    .line 195
    .line 196
    .line 197
    const v14, -0x414ccccd    # -0.35f

    .line 198
    .line 199
    .line 200
    const v15, 0x3dcccccd    # 0.1f

    .line 201
    .line 202
    .line 203
    const v16, -0x40b33333    # -0.8f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, 0x41a970a4    # 21.18f

    .line 213
    .line 214
    .line 215
    const v2, 0x40a051ec    # 5.01f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v0, 0x4190cccd    # 18.1f

    .line 222
    .line 223
    .line 224
    const v2, 0x401ccccd    # 2.45f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, -0x404b851f    # -1.41f

    .line 231
    .line 232
    .line 233
    const v18, 0x3e051eb8    # 0.13f

    .line 234
    .line 235
    .line 236
    const v13, -0x4128f5c3    # -0.42f

    .line 237
    .line 238
    .line 239
    const v15, -0x4079999a    # -1.05f

    .line 240
    .line 241
    .line 242
    const v16, -0x41666666    # -0.3f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v17, 0x3e051eb8    # 0.13f

    .line 249
    .line 250
    .line 251
    const v18, 0x3fb47ae1    # 1.41f

    .line 252
    .line 253
    .line 254
    const v13, -0x414ccccd    # -0.35f

    .line 255
    .line 256
    .line 257
    const v14, 0x3ed70a3d    # 0.42f

    .line 258
    .line 259
    .line 260
    const v15, -0x416b851f    # -0.29f

    .line 261
    .line 262
    .line 263
    const v16, 0x3f866666    # 1.05f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, 0x4023d70a    # 2.56f

    .line 270
    .line 271
    .line 272
    const v2, 0x40447ae1    # 3.07f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v17, 0x3fb47ae1    # 1.41f

    .line 279
    .line 280
    .line 281
    const v18, -0x41fae148    # -0.13f

    .line 282
    .line 283
    .line 284
    const v13, 0x3ed70a3d    # 0.42f

    .line 285
    .line 286
    .line 287
    const v14, 0x3eb33333    # 0.35f

    .line 288
    .line 289
    .line 290
    const v15, 0x3f866666    # 1.05f

    .line 291
    .line 292
    .line 293
    const v16, 0x3e99999a    # 0.3f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, -0x420a3d71    # -0.12f

    .line 300
    .line 301
    .line 302
    const v18, -0x404b851f    # -1.41f

    .line 303
    .line 304
    .line 305
    const v13, 0x3eb851ec    # 0.36f

    .line 306
    .line 307
    .line 308
    const v14, -0x4128f5c3    # -0.42f

    .line 309
    .line 310
    .line 311
    const v15, 0x3e99999a    # 0.3f

    .line 312
    .line 313
    .line 314
    const v16, -0x4079999a    # -1.05f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x40833333    # 4.1f

    .line 324
    .line 325
    .line 326
    const v2, 0x40d1999a    # 6.55f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, -0x3fdc28f6    # -2.56f

    .line 333
    .line 334
    .line 335
    const v2, 0x40447ae1    # 3.07f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, 0x3e051eb8    # 0.13f

    .line 342
    .line 343
    .line 344
    const v13, 0x3edc28f6    # 0.43f

    .line 345
    .line 346
    .line 347
    const v14, -0x4147ae14    # -0.36f

    .line 348
    .line 349
    .line 350
    const v15, 0x3efae148    # 0.49f

    .line 351
    .line 352
    .line 353
    const v16, -0x40828f5c    # -0.99f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, -0x404ccccd    # -1.4f

    .line 360
    .line 361
    .line 362
    const v18, -0x41fae148    # -0.13f

    .line 363
    .line 364
    .line 365
    const v13, -0x414ccccd    # -0.35f

    .line 366
    .line 367
    .line 368
    const v14, -0x4123d70a    # -0.43f

    .line 369
    .line 370
    .line 371
    const v15, -0x40851eb8    # -0.98f

    .line 372
    .line 373
    .line 374
    const v16, -0x410a3d71    # -0.48f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x40347ae1    # 2.82f

    .line 381
    .line 382
    .line 383
    const v2, 0x40a051ec    # 5.01f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v17, -0x420a3d71    # -0.12f

    .line 390
    .line 391
    .line 392
    const v18, 0x3fb47ae1    # 1.41f

    .line 393
    .line 394
    .line 395
    const v13, -0x4128f5c3    # -0.42f

    .line 396
    .line 397
    .line 398
    const v14, 0x3eb851ec    # 0.36f

    .line 399
    .line 400
    .line 401
    const v15, -0x410a3d71    # -0.48f

    .line 402
    .line 403
    .line 404
    const v16, 0x3f7d70a4    # 0.99f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v17, 0x3fb33333    # 1.4f

    .line 411
    .line 412
    .line 413
    const v18, 0x3e051eb8    # 0.13f

    .line 414
    .line 415
    .line 416
    const v13, 0x3eb33333    # 0.35f

    .line 417
    .line 418
    .line 419
    const v14, 0x3edc28f6    # 0.43f

    .line 420
    .line 421
    .line 422
    const v15, 0x3f7ae148    # 0.98f

    .line 423
    .line 424
    .line 425
    const v16, 0x3ef5c28f    # 0.48f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v0, 0x40800000    # 4.0f

    .line 435
    .line 436
    const/high16 v2, 0x41400000    # 12.0f

    .line 437
    .line 438
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 442
    .line 443
    const/high16 v18, 0x41100000    # 9.0f

    .line 444
    .line 445
    const v13, -0x3f60f5c3    # -4.97f

    .line 446
    .line 447
    .line 448
    const/4 v14, 0x0

    .line 449
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 450
    .line 451
    const v16, 0x4080f5c3    # 4.03f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v0, 0x4080f5c3    # 4.03f

    .line 458
    .line 459
    .line 460
    const/high16 v2, 0x41100000    # 9.0f

    .line 461
    .line 462
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v0, -0x3f7f0a3d    # -4.03f

    .line 466
    .line 467
    .line 468
    const/high16 v2, -0x3ef00000    # -9.0f

    .line 469
    .line 470
    const/high16 v4, 0x41100000    # 9.0f

    .line 471
    .line 472
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v0, 0x41a00000    # 20.0f

    .line 482
    .line 483
    const/high16 v2, 0x41400000    # 12.0f

    .line 484
    .line 485
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v17, -0x3f200000    # -7.0f

    .line 489
    .line 490
    const/high16 v18, -0x3f200000    # -7.0f

    .line 491
    .line 492
    const v13, -0x3f88f5c3    # -3.86f

    .line 493
    .line 494
    .line 495
    const/high16 v15, -0x3f200000    # -7.0f

    .line 496
    .line 497
    const v16, -0x3fb70a3d    # -3.14f

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v0, 0x4048f5c3    # 3.14f

    .line 504
    .line 505
    .line 506
    const/high16 v2, -0x3f200000    # -7.0f

    .line 507
    .line 508
    const/high16 v4, 0x40e00000    # 7.0f

    .line 509
    .line 510
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v2, 0x40e00000    # 7.0f

    .line 514
    .line 515
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v0, -0x3fb70a3d    # -3.14f

    .line 519
    .line 520
    .line 521
    const/high16 v2, -0x3f200000    # -7.0f

    .line 522
    .line 523
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    const/16 v16, 0x3800

    .line 534
    .line 535
    const/16 v17, 0x0

    .line 536
    .line 537
    const/high16 v6, 0x3f800000    # 1.0f

    .line 538
    .line 539
    const/high16 v8, 0x3f800000    # 1.0f

    .line 540
    .line 541
    const/4 v7, 0x0

    .line 542
    const/high16 v9, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/high16 v12, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const/4 v13, 0x0

    .line 547
    const/4 v15, 0x0

    .line 548
    const-string v4, ""

    .line 549
    .line 550
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    sput-object v0, Landroidx/compose/material/icons/rounded/AlarmKt;->_alarm:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 559
    .line 560
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    return-object v0
.end method
