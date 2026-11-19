.class public final Landroidx/compose/material/icons/twotone/FilterTiltShiftKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_filterTiltShift",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FilterTiltShift",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getFilterTiltShift",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nFilterTiltShift.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterTiltShift.kt\nandroidx/compose/material/icons/twotone/FilterTiltShiftKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n72#5,4:127\n*S KotlinDebug\n*F\n+ 1 FilterTiltShift.kt\nandroidx/compose/material/icons/twotone/FilterTiltShiftKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n30#1:127,4\n*E\n"
    }
.end annotation


# static fields
.field private static _filterTiltShift:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFilterTiltShift(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FilterTiltShiftKt;->_filterTiltShift:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.FilterTiltShift"

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
    const/high16 v0, 0x41500000    # 13.0f

    .line 71
    .line 72
    const v2, 0x40033333    # 2.05f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x400147ae    # 2.02f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v17, 0x4079999a    # 3.9f

    .line 85
    .line 86
    .line 87
    const v18, 0x3fcf5c29    # 1.62f

    .line 88
    .line 89
    .line 90
    const v13, 0x3fbae148    # 1.46f

    .line 91
    .line 92
    .line 93
    const v14, 0x3e3851ec    # 0.18f

    .line 94
    .line 95
    .line 96
    const v15, 0x40328f5c    # 2.79f

    .line 97
    .line 98
    .line 99
    const v16, 0x3f428f5c    # 0.76f

    .line 100
    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, 0x3fb5c28f    # 1.42f

    .line 106
    .line 107
    .line 108
    const v2, -0x4048f5c3    # -1.43f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v17, 0x41500000    # 13.0f

    .line 115
    .line 116
    const v18, 0x40033333    # 2.05f

    .line 117
    .line 118
    .line 119
    const v13, 0x4186b852    # 16.84f

    .line 120
    .line 121
    .line 122
    const v14, 0x40433333    # 3.05f

    .line 123
    .line 124
    .line 125
    const v15, 0x417028f6    # 15.01f

    .line 126
    .line 127
    .line 128
    const/high16 v16, 0x40100000    # 2.25f

    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, 0x419f70a4    # 19.93f

    .line 137
    .line 138
    .line 139
    const/high16 v2, 0x41500000    # 13.0f

    .line 140
    .line 141
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v0, 0x400147ae    # 2.02f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v17, 0x40aa3d71    # 5.32f

    .line 151
    .line 152
    .line 153
    const v18, -0x3ff28f5c    # -2.21f

    .line 154
    .line 155
    .line 156
    const v13, 0x4000a3d7    # 2.01f

    .line 157
    .line 158
    .line 159
    const v14, -0x41b33333    # -0.2f

    .line 160
    .line 161
    .line 162
    const v15, 0x4075c28f    # 3.84f

    .line 163
    .line 164
    .line 165
    const/high16 v16, -0x40800000    # -1.0f

    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v0, -0x4048f5c3    # -1.43f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v17, -0x3f870a3d    # -3.89f

    .line 177
    .line 178
    .line 179
    const v18, 0x3fcf5c29    # 1.62f

    .line 180
    .line 181
    .line 182
    const v13, -0x40733333    # -1.1f

    .line 183
    .line 184
    .line 185
    const v14, 0x3f5c28f6    # 0.86f

    .line 186
    .line 187
    .line 188
    const v15, -0x3fe47ae1    # -2.43f

    .line 189
    .line 190
    .line 191
    const v16, 0x3fb851ec    # 1.44f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v0, 0x41928f5c    # 18.32f

    .line 201
    .line 202
    .line 203
    const v2, 0x408851ec    # 4.26f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v0, 0x3fb70a3d    # 1.43f

    .line 210
    .line 211
    .line 212
    const v2, -0x4048f5c3    # -1.43f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v17, -0x4030a3d7    # -1.62f

    .line 219
    .line 220
    .line 221
    const v18, -0x3f870a3d    # -3.89f

    .line 222
    .line 223
    .line 224
    const v13, -0x40a3d70a    # -0.86f

    .line 225
    .line 226
    .line 227
    const v14, -0x40733333    # -1.1f

    .line 228
    .line 229
    .line 230
    const v15, -0x4047ae14    # -1.44f

    .line 231
    .line 232
    .line 233
    const v16, -0x3fe47ae1    # -2.43f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v0, 0x41500000    # 13.0f

    .line 240
    .line 241
    const v2, 0x40033333    # 2.05f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v17, 0x400d70a4    # 2.21f

    .line 248
    .line 249
    .line 250
    const v18, 0x40aa3d71    # 5.32f

    .line 251
    .line 252
    .line 253
    const v13, 0x3e4ccccd    # 0.2f

    .line 254
    .line 255
    .line 256
    const v14, 0x4000a3d7    # 2.01f

    .line 257
    .line 258
    .line 259
    const/high16 v15, 0x3f800000    # 1.0f

    .line 260
    .line 261
    const v16, 0x4075c28f    # 3.84f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, 0x41300000    # 11.0f

    .line 271
    .line 272
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x400147ae    # 2.02f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, 0x3fcf5c29    # 1.62f

    .line 282
    .line 283
    .line 284
    const v18, -0x3f866666    # -3.9f

    .line 285
    .line 286
    .line 287
    const v13, 0x3e3851ec    # 0.18f

    .line 288
    .line 289
    .line 290
    const v14, -0x40451eb8    # -1.46f

    .line 291
    .line 292
    .line 293
    const v15, 0x3f428f5c    # 0.76f

    .line 294
    .line 295
    .line 296
    const v16, -0x3fcd70a4    # -2.79f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x40b5c28f    # 5.68f

    .line 303
    .line 304
    .line 305
    const v2, 0x408851ec    # 4.26f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, 0x40033333    # 2.05f

    .line 312
    .line 313
    .line 314
    const/high16 v18, 0x41300000    # 11.0f

    .line 315
    .line 316
    const v13, 0x40433333    # 3.05f

    .line 317
    .line 318
    .line 319
    const v14, 0x40e51eb8    # 7.16f

    .line 320
    .line 321
    .line 322
    const/high16 v15, 0x40100000    # 2.25f

    .line 323
    .line 324
    const v16, 0x410fd70a    # 8.99f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, 0x41927ae1    # 18.31f

    .line 334
    .line 335
    .line 336
    const v2, 0x40e33333    # 7.1f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v17, 0x3fcf5c29    # 1.62f

    .line 343
    .line 344
    .line 345
    const v18, 0x4079999a    # 3.9f

    .line 346
    .line 347
    .line 348
    const v13, 0x3f5c28f6    # 0.86f

    .line 349
    .line 350
    .line 351
    const v14, 0x3f8e147b    # 1.11f

    .line 352
    .line 353
    .line 354
    const v15, 0x3fb851ec    # 1.44f

    .line 355
    .line 356
    .line 357
    const v16, 0x401c28f6    # 2.44f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v0, 0x400147ae    # 2.02f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, -0x3ff28f5c    # -2.21f

    .line 370
    .line 371
    .line 372
    const v18, -0x3f55c28f    # -5.32f

    .line 373
    .line 374
    .line 375
    const v13, -0x41b33333    # -0.2f

    .line 376
    .line 377
    .line 378
    const v14, -0x3fff5c29    # -2.01f

    .line 379
    .line 380
    .line 381
    const/high16 v15, -0x40800000    # -1.0f

    .line 382
    .line 383
    const v16, -0x3f8a3d71    # -3.84f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x41927ae1    # 18.31f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x40b6147b    # 5.69f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, 0x4079999a    # 3.9f

    .line 405
    .line 406
    .line 407
    const v18, -0x4030a3d7    # -1.62f

    .line 408
    .line 409
    .line 410
    const v13, 0x3f8e147b    # 1.11f

    .line 411
    .line 412
    .line 413
    const v14, -0x40a3d70a    # -0.86f

    .line 414
    .line 415
    .line 416
    const v15, 0x401c28f6    # 2.44f

    .line 417
    .line 418
    .line 419
    const v16, -0x4047ae14    # -1.44f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x41300000    # 11.0f

    .line 426
    .line 427
    const v2, 0x40033333    # 2.05f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v17, -0x3f55c28f    # -5.32f

    .line 434
    .line 435
    .line 436
    const v18, 0x400d70a4    # 2.21f

    .line 437
    .line 438
    .line 439
    const v13, -0x3fff5c29    # -2.01f

    .line 440
    .line 441
    .line 442
    const v14, 0x3e4ccccd    # 0.2f

    .line 443
    .line 444
    .line 445
    const v15, -0x3f8a3d71    # -3.84f

    .line 446
    .line 447
    .line 448
    const/high16 v16, 0x3f800000    # 1.0f

    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, 0x40b6147b    # 5.69f

    .line 454
    .line 455
    .line 456
    const v2, 0x40e33333    # 7.1f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v0, 0x419deb85    # 19.74f

    .line 466
    .line 467
    .line 468
    const v2, 0x40b5c28f    # 5.68f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v17, 0x41300000    # 11.0f

    .line 475
    .line 476
    const v18, 0x41af999a    # 21.95f

    .line 477
    .line 478
    .line 479
    const v13, 0x40e51eb8    # 7.16f

    .line 480
    .line 481
    .line 482
    const v14, 0x41a7999a    # 20.95f

    .line 483
    .line 484
    .line 485
    const/high16 v15, 0x41100000    # 9.0f

    .line 486
    .line 487
    const/high16 v16, 0x41ae0000    # 21.75f

    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v0, -0x3ffeb852    # -2.02f

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v17, -0x3f866666    # -3.9f

    .line 499
    .line 500
    .line 501
    const v18, -0x4030a3d7    # -1.62f

    .line 502
    .line 503
    .line 504
    const v13, -0x40451eb8    # -1.46f

    .line 505
    .line 506
    .line 507
    const v14, -0x41c7ae14    # -0.18f

    .line 508
    .line 509
    .line 510
    const v15, -0x3fcd70a4    # -2.79f

    .line 511
    .line 512
    .line 513
    const v16, -0x40bd70a4    # -0.76f

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v0, -0x404a3d71    # -1.42f

    .line 520
    .line 521
    .line 522
    const v2, 0x3fb70a3d    # 1.43f

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v0, 0x41af999a    # 21.95f

    .line 532
    .line 533
    .line 534
    const v2, 0x415028f6    # 13.01f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v0, -0x3ffeb852    # -2.02f

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v17, -0x4030a3d7    # -1.62f

    .line 547
    .line 548
    .line 549
    const v18, 0x4078f5c3    # 3.89f

    .line 550
    .line 551
    .line 552
    const v13, -0x41c7ae14    # -0.18f

    .line 553
    .line 554
    .line 555
    const v14, 0x3fb9999a    # 1.45f

    .line 556
    .line 557
    .line 558
    const v15, -0x40bd70a4    # -0.76f

    .line 559
    .line 560
    .line 561
    const v16, 0x4031eb85    # 2.78f

    .line 562
    .line 563
    .line 564
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v0, 0x3fb70a3d    # 1.43f

    .line 568
    .line 569
    .line 570
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v17, 0x400d70a4    # 2.21f

    .line 574
    .line 575
    .line 576
    const v18, -0x3f55c28f    # -5.32f

    .line 577
    .line 578
    .line 579
    const v13, 0x3f9ae148    # 1.21f

    .line 580
    .line 581
    .line 582
    const v14, -0x40428f5c    # -1.48f

    .line 583
    .line 584
    .line 585
    const v15, 0x4000a3d7    # 2.01f

    .line 586
    .line 587
    .line 588
    const v16, -0x3fab851f    # -3.32f

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, 0x41100000    # 9.0f

    .line 598
    .line 599
    const/high16 v2, 0x41400000    # 12.0f

    .line 600
    .line 601
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v17, 0x40400000    # 3.0f

    .line 605
    .line 606
    const/high16 v18, 0x40400000    # 3.0f

    .line 607
    .line 608
    const/4 v13, 0x0

    .line 609
    const v14, 0x3fd47ae1    # 1.66f

    .line 610
    .line 611
    .line 612
    const v15, 0x3fab851f    # 1.34f

    .line 613
    .line 614
    .line 615
    const/high16 v16, 0x40400000    # 3.0f

    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v0, -0x40547ae1    # -1.34f

    .line 621
    .line 622
    .line 623
    const/high16 v2, 0x40400000    # 3.0f

    .line 624
    .line 625
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 626
    .line 627
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 631
    .line 632
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v0, 0x3fab851f    # 1.34f

    .line 636
    .line 637
    .line 638
    const/high16 v2, 0x40400000    # 3.0f

    .line 639
    .line 640
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 647
    .line 648
    .line 649
    move-result-object v2

    .line 650
    const/16 v16, 0x3800

    .line 651
    .line 652
    const/16 v17, 0x0

    .line 653
    .line 654
    const/high16 v6, 0x3f800000    # 1.0f

    .line 655
    .line 656
    const/high16 v8, 0x3f800000    # 1.0f

    .line 657
    .line 658
    const/4 v7, 0x0

    .line 659
    const/high16 v9, 0x3f800000    # 1.0f

    .line 660
    .line 661
    const/high16 v12, 0x3f800000    # 1.0f

    .line 662
    .line 663
    const/4 v14, 0x0

    .line 664
    const/4 v15, 0x0

    .line 665
    const-string v4, ""

    .line 666
    .line 667
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    sput-object v0, Landroidx/compose/material/icons/twotone/FilterTiltShiftKt;->_filterTiltShift:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 676
    .line 677
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 678
    .line 679
    .line 680
    return-object v0
.end method
