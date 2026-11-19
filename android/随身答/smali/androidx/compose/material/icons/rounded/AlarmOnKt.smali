.class public final Landroidx/compose/material/icons/rounded/AlarmOnKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_alarmOn",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AlarmOn",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getAlarmOn",
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
        "SMAP\nAlarmOn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlarmOn.kt\nandroidx/compose/material/icons/rounded/AlarmOnKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,76:1\n212#2,12:77\n233#2,18:90\n253#2:127\n174#3:89\n705#4,2:108\n717#4,2:110\n719#4,11:116\n72#5,4:112\n*S KotlinDebug\n*F\n+ 1 AlarmOn.kt\nandroidx/compose/material/icons/rounded/AlarmOnKt\n*L\n29#1:77,12\n30#1:90,18\n30#1:127\n29#1:89\n30#1:108,2\n30#1:110,2\n30#1:116,11\n30#1:112,4\n*E\n"
    }
.end annotation


# static fields
.field private static _alarmOn:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAlarmOn(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AlarmOnKt;->_alarmOn:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AlarmOn"

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
    const v0, 0x416f0a3d    # 14.94f

    .line 71
    .line 72
    .line 73
    const v2, 0x4121c28f    # 10.11f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3f733333    # -4.4f

    .line 80
    .line 81
    .line 82
    const v2, 0x408d70a4    # 4.42f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v0, -0x40333333    # -1.6f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v17, -0x407851ec    # -1.06f

    .line 95
    .line 96
    .line 97
    const/16 v18, 0x0

    .line 98
    .line 99
    const v13, -0x416b851f    # -0.29f

    .line 100
    .line 101
    .line 102
    const v14, -0x416b851f    # -0.29f

    .line 103
    .line 104
    .line 105
    const v15, -0x40bae148    # -0.77f

    .line 106
    .line 107
    .line 108
    const v16, -0x416b851f    # -0.29f

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/16 v17, 0x0

    .line 115
    .line 116
    const v18, 0x3f87ae14    # 1.06f

    .line 117
    .line 118
    .line 119
    const v14, 0x3e947ae1    # 0.29f

    .line 120
    .line 121
    .line 122
    const v15, -0x416b851f    # -0.29f

    .line 123
    .line 124
    .line 125
    const v16, 0x3f451eb8    # 0.77f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v0, 0x41200000    # 10.0f

    .line 132
    .line 133
    const v2, 0x4180e148    # 16.11f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v17, 0x3f87ae14    # 1.06f

    .line 140
    .line 141
    .line 142
    const/16 v18, 0x0

    .line 143
    .line 144
    const v13, 0x3e947ae1    # 0.29f

    .line 145
    .line 146
    .line 147
    const v15, 0x3f451eb8    # 0.77f

    .line 148
    .line 149
    .line 150
    const v16, 0x3e947ae1    # 0.29f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v0, 0x41800000    # 16.0f

    .line 157
    .line 158
    const v2, 0x4132b852    # 11.17f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/16 v17, 0x0

    .line 165
    .line 166
    const v18, -0x407851ec    # -1.06f

    .line 167
    .line 168
    .line 169
    const v14, -0x416b851f    # -0.29f

    .line 170
    .line 171
    .line 172
    const v15, 0x3e947ae1    # 0.29f

    .line 173
    .line 174
    .line 175
    const v16, -0x40bae148    # -0.77f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, -0x407851ec    # -1.06f

    .line 182
    .line 183
    .line 184
    const/16 v18, 0x0

    .line 185
    .line 186
    const v13, -0x416b851f    # -0.29f

    .line 187
    .line 188
    .line 189
    const v15, -0x40bae148    # -0.77f

    .line 190
    .line 191
    .line 192
    const v16, -0x416b851f    # -0.29f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, 0x41a970a4    # 21.18f

    .line 202
    .line 203
    .line 204
    const v2, 0x40a051ec    # 5.01f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, 0x4190cccd    # 18.1f

    .line 211
    .line 212
    .line 213
    const v2, 0x401ccccd    # 2.45f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v17, -0x404b851f    # -1.41f

    .line 220
    .line 221
    .line 222
    const v18, 0x3e051eb8    # 0.13f

    .line 223
    .line 224
    .line 225
    const v13, -0x4128f5c3    # -0.42f

    .line 226
    .line 227
    .line 228
    const v14, -0x414ccccd    # -0.35f

    .line 229
    .line 230
    .line 231
    const v15, -0x4079999a    # -1.05f

    .line 232
    .line 233
    .line 234
    const v16, -0x41666666    # -0.3f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, 0x3e051eb8    # 0.13f

    .line 241
    .line 242
    .line 243
    const v18, 0x3fb47ae1    # 1.41f

    .line 244
    .line 245
    .line 246
    const v13, -0x414ccccd    # -0.35f

    .line 247
    .line 248
    .line 249
    const v14, 0x3ed70a3d    # 0.42f

    .line 250
    .line 251
    .line 252
    const v15, -0x416b851f    # -0.29f

    .line 253
    .line 254
    .line 255
    const v16, 0x3f866666    # 1.05f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x4023d70a    # 2.56f

    .line 262
    .line 263
    .line 264
    const v2, 0x40447ae1    # 3.07f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v17, 0x3fb47ae1    # 1.41f

    .line 271
    .line 272
    .line 273
    const v18, -0x41fae148    # -0.13f

    .line 274
    .line 275
    .line 276
    const v13, 0x3ed70a3d    # 0.42f

    .line 277
    .line 278
    .line 279
    const v14, 0x3eb33333    # 0.35f

    .line 280
    .line 281
    .line 282
    const v15, 0x3f866666    # 1.05f

    .line 283
    .line 284
    .line 285
    const v16, 0x3e99999a    # 0.3f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v17, -0x420a3d71    # -0.12f

    .line 292
    .line 293
    .line 294
    const v18, -0x404b851f    # -1.41f

    .line 295
    .line 296
    .line 297
    const v13, 0x3eb851ec    # 0.36f

    .line 298
    .line 299
    .line 300
    const v14, -0x4128f5c3    # -0.42f

    .line 301
    .line 302
    .line 303
    const v15, 0x3e99999a    # 0.3f

    .line 304
    .line 305
    .line 306
    const v16, -0x4079999a    # -1.05f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, 0x40833333    # 4.1f

    .line 316
    .line 317
    .line 318
    const v2, 0x40d1999a    # 6.55f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, -0x3fdc28f6    # -2.56f

    .line 325
    .line 326
    .line 327
    const v2, 0x40447ae1    # 3.07f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, 0x3e051eb8    # 0.13f

    .line 334
    .line 335
    .line 336
    const v13, 0x3edc28f6    # 0.43f

    .line 337
    .line 338
    .line 339
    const v14, -0x4147ae14    # -0.36f

    .line 340
    .line 341
    .line 342
    const v15, 0x3efae148    # 0.49f

    .line 343
    .line 344
    .line 345
    const v16, -0x40828f5c    # -0.99f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v17, -0x404ccccd    # -1.4f

    .line 352
    .line 353
    .line 354
    const v18, -0x41fae148    # -0.13f

    .line 355
    .line 356
    .line 357
    const v13, -0x414ccccd    # -0.35f

    .line 358
    .line 359
    .line 360
    const v14, -0x4123d70a    # -0.43f

    .line 361
    .line 362
    .line 363
    const v15, -0x40851eb8    # -0.98f

    .line 364
    .line 365
    .line 366
    const v16, -0x410a3d71    # -0.48f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x40347ae1    # 2.82f

    .line 373
    .line 374
    .line 375
    const v2, 0x40a051ec    # 5.01f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, -0x420a3d71    # -0.12f

    .line 382
    .line 383
    .line 384
    const v18, 0x3fb47ae1    # 1.41f

    .line 385
    .line 386
    .line 387
    const v13, -0x4128f5c3    # -0.42f

    .line 388
    .line 389
    .line 390
    const v14, 0x3eb851ec    # 0.36f

    .line 391
    .line 392
    .line 393
    const v15, -0x410a3d71    # -0.48f

    .line 394
    .line 395
    .line 396
    const v16, 0x3f7d70a4    # 0.99f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, 0x3fb33333    # 1.4f

    .line 403
    .line 404
    .line 405
    const v18, 0x3e051eb8    # 0.13f

    .line 406
    .line 407
    .line 408
    const v13, 0x3eb33333    # 0.35f

    .line 409
    .line 410
    .line 411
    const v14, 0x3edc28f6    # 0.43f

    .line 412
    .line 413
    .line 414
    const v15, 0x3f7ae148    # 0.98f

    .line 415
    .line 416
    .line 417
    const v16, 0x3ef5c28f    # 0.48f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v0, 0x40800000    # 4.0f

    .line 427
    .line 428
    const/high16 v2, 0x41400000    # 12.0f

    .line 429
    .line 430
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 434
    .line 435
    const/high16 v18, 0x41100000    # 9.0f

    .line 436
    .line 437
    const v13, -0x3f60f5c3    # -4.97f

    .line 438
    .line 439
    .line 440
    const/4 v14, 0x0

    .line 441
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 442
    .line 443
    const v16, 0x4080f5c3    # 4.03f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, 0x4080f5c3    # 4.03f

    .line 450
    .line 451
    .line 452
    const/high16 v2, 0x41100000    # 9.0f

    .line 453
    .line 454
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v0, -0x3f7f0a3d    # -4.03f

    .line 458
    .line 459
    .line 460
    const/high16 v2, -0x3ef00000    # -9.0f

    .line 461
    .line 462
    const/high16 v4, 0x41100000    # 9.0f

    .line 463
    .line 464
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v0, 0x41a00000    # 20.0f

    .line 474
    .line 475
    const/high16 v2, 0x41400000    # 12.0f

    .line 476
    .line 477
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v17, -0x3f200000    # -7.0f

    .line 481
    .line 482
    const/high16 v18, -0x3f200000    # -7.0f

    .line 483
    .line 484
    const v13, -0x3f88f5c3    # -3.86f

    .line 485
    .line 486
    .line 487
    const/high16 v15, -0x3f200000    # -7.0f

    .line 488
    .line 489
    const v16, -0x3fb70a3d    # -3.14f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v0, 0x4048f5c3    # 3.14f

    .line 496
    .line 497
    .line 498
    const/high16 v2, -0x3f200000    # -7.0f

    .line 499
    .line 500
    const/high16 v4, 0x40e00000    # 7.0f

    .line 501
    .line 502
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v2, 0x40e00000    # 7.0f

    .line 506
    .line 507
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v0, -0x3fb70a3d    # -3.14f

    .line 511
    .line 512
    .line 513
    const/high16 v2, -0x3f200000    # -7.0f

    .line 514
    .line 515
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    const/16 v16, 0x3800

    .line 526
    .line 527
    const/16 v17, 0x0

    .line 528
    .line 529
    const/high16 v6, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const/high16 v8, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const/4 v7, 0x0

    .line 534
    const/high16 v9, 0x3f800000    # 1.0f

    .line 535
    .line 536
    const/high16 v12, 0x3f800000    # 1.0f

    .line 537
    .line 538
    const/4 v13, 0x0

    .line 539
    const/4 v15, 0x0

    .line 540
    const-string v4, ""

    .line 541
    .line 542
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    sput-object v0, Landroidx/compose/material/icons/rounded/AlarmOnKt;->_alarmOn:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 551
    .line 552
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    return-object v0
.end method
