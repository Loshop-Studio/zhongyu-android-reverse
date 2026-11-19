.class public final Landroidx/compose/material/icons/filled/AlarmOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_alarmOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AlarmOff",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getAlarmOff",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nAlarmOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlarmOff.kt\nandroidx/compose/material/icons/filled/AlarmOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,80:1\n212#2,12:81\n233#2,18:94\n253#2:131\n174#3:93\n705#4,2:112\n717#4,2:114\n719#4,11:120\n72#5,4:116\n*S KotlinDebug\n*F\n+ 1 AlarmOff.kt\nandroidx/compose/material/icons/filled/AlarmOffKt\n*L\n29#1:81,12\n30#1:94,18\n30#1:131\n29#1:93\n30#1:112,2\n30#1:114,2\n30#1:120,11\n30#1:116,4\n*E\n"
    }
.end annotation


# static fields
.field private static _alarmOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAlarmOff(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/AlarmOffKt;->_alarmOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.AlarmOff"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40e00000    # 7.0f

    .line 78
    .line 79
    const/high16 v18, 0x40e00000    # 7.0f

    .line 80
    .line 81
    const v13, 0x4077ae14    # 3.87f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x40e00000    # 7.0f

    .line 86
    .line 87
    const v16, 0x404851ec    # 3.13f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v17, -0x4123d70a    # -0.43f

    .line 94
    .line 95
    .line 96
    const v18, 0x4019999a    # 2.4f

    .line 97
    .line 98
    .line 99
    const/4 v13, 0x0

    .line 100
    const v14, 0x3f570a3d    # 0.84f

    .line 101
    .line 102
    .line 103
    const v15, -0x41dc28f6    # -0.16f

    .line 104
    .line 105
    .line 106
    const v16, 0x3fd33333    # 1.65f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x3fc28f5c    # 1.52f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, 0x3f68f5c3    # 0.91f

    .line 119
    .line 120
    .line 121
    const v18, -0x3f851eb8    # -3.92f

    .line 122
    .line 123
    .line 124
    const v13, 0x3f147ae1    # 0.58f

    .line 125
    .line 126
    .line 127
    const v14, -0x4067ae14    # -1.19f

    .line 128
    .line 129
    .line 130
    const v15, 0x3f68f5c3    # 0.91f

    .line 131
    .line 132
    .line 133
    const v16, -0x3fdf5c29    # -2.51f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 140
    .line 141
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    const v14, -0x3f60f5c3    # -4.97f

    .line 145
    .line 146
    .line 147
    const v15, -0x3f7f0a3d    # -4.03f

    .line 148
    .line 149
    .line 150
    const/high16 v16, -0x3ef00000    # -9.0f

    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, -0x3f851eb8    # -3.92f

    .line 156
    .line 157
    .line 158
    const v18, 0x3f68f5c3    # 0.91f

    .line 159
    .line 160
    .line 161
    const v13, -0x404b851f    # -1.41f

    .line 162
    .line 163
    .line 164
    const/4 v14, 0x0

    .line 165
    const v15, -0x3fd147ae    # -2.73f

    .line 166
    .line 167
    .line 168
    const v16, 0x3ea8f5c3    # 0.33f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v0, 0x4119999a    # 9.6f

    .line 175
    .line 176
    .line 177
    const v2, 0x40cdc28f    # 6.43f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v17, 0x41400000    # 12.0f

    .line 184
    .line 185
    const/high16 v18, 0x40c00000    # 6.0f

    .line 186
    .line 187
    const v13, 0x4125999a    # 10.35f

    .line 188
    .line 189
    .line 190
    const v14, 0x40c51eb8    # 6.16f

    .line 191
    .line 192
    .line 193
    const v15, 0x41328f5c    # 11.16f

    .line 194
    .line 195
    .line 196
    const/high16 v16, 0x40c00000    # 6.0f

    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, 0x40b70a3d    # 5.72f

    .line 205
    .line 206
    .line 207
    const/high16 v2, 0x41b00000    # 22.0f

    .line 208
    .line 209
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, -0x3f6ccccd    # -4.6f

    .line 213
    .line 214
    .line 215
    const v2, -0x3f88f5c3    # -3.86f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v0, -0x405ae148    # -1.29f

    .line 222
    .line 223
    .line 224
    const v2, 0x3fc3d70a    # 1.53f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, 0x40933333    # 4.6f

    .line 231
    .line 232
    .line 233
    const v2, 0x40770a3d    # 3.86f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v0, 0x40b70a3d    # 5.72f

    .line 240
    .line 241
    .line 242
    const/high16 v2, 0x41b00000    # 22.0f

    .line 243
    .line 244
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, 0x403ae148    # 2.92f

    .line 251
    .line 252
    .line 253
    const v2, 0x40128f5c    # 2.29f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v0, 0x3fd33333    # 1.65f

    .line 260
    .line 261
    .line 262
    const v2, 0x40647ae1    # 3.57f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v0, 0x403eb852    # 2.98f

    .line 269
    .line 270
    .line 271
    const v2, 0x409ccccd    # 4.9f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v0, -0x4071eb85    # -1.11f

    .line 278
    .line 279
    .line 280
    const v2, 0x3f6e147b    # 0.93f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, 0x3fb5c28f    # 1.42f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, 0x3f8e147b    # 1.11f

    .line 293
    .line 294
    .line 295
    const v2, -0x408f5c29    # -0.94f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v0, 0x3f4ccccd    # 0.8f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v17, 0x40400000    # 3.0f

    .line 308
    .line 309
    const/high16 v18, 0x41500000    # 13.0f

    .line 310
    .line 311
    const v13, 0x40751eb8    # 3.83f

    .line 312
    .line 313
    .line 314
    const v14, 0x410b0a3d    # 8.69f

    .line 315
    .line 316
    .line 317
    const/high16 v15, 0x40400000    # 3.0f

    .line 318
    .line 319
    const/high16 v16, 0x412c0000    # 10.75f

    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v17, 0x41100000    # 9.0f

    .line 325
    .line 326
    const/high16 v18, 0x41100000    # 9.0f

    .line 327
    .line 328
    const/4 v13, 0x0

    .line 329
    const v14, 0x409f0a3d    # 4.97f

    .line 330
    .line 331
    .line 332
    const v15, 0x4080a3d7    # 4.02f

    .line 333
    .line 334
    .line 335
    const/high16 v16, 0x41100000    # 9.0f

    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v17, 0x40bc7ae1    # 5.89f

    .line 341
    .line 342
    .line 343
    const v18, -0x3ff33333    # -2.2f

    .line 344
    .line 345
    .line 346
    const/high16 v13, 0x40100000    # 2.25f

    .line 347
    .line 348
    const/4 v14, 0x0

    .line 349
    const v15, 0x4089eb85    # 4.31f

    .line 350
    .line 351
    .line 352
    const v16, -0x40ab851f    # -0.83f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v0, 0x400ccccd    # 2.2f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v0, 0x3fa28f5c    # 1.27f

    .line 365
    .line 366
    .line 367
    const v2, -0x405d70a4    # -1.27f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x4078f5c3    # 3.89f

    .line 374
    .line 375
    .line 376
    const v2, 0x405147ae    # 3.27f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, -0x4087ae14    # -0.97f

    .line 383
    .line 384
    .line 385
    const v2, -0x40851eb8    # -0.98f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v0, 0x4183c28f    # 16.47f

    .line 395
    .line 396
    .line 397
    const v2, 0x41931eb8    # 18.39f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v17, 0x41400000    # 12.0f

    .line 404
    .line 405
    const/high16 v18, 0x41a00000    # 20.0f

    .line 406
    .line 407
    const v13, 0x417428f6    # 15.26f

    .line 408
    .line 409
    .line 410
    const v14, 0x419b1eb8    # 19.39f

    .line 411
    .line 412
    .line 413
    const v15, 0x415b3333    # 13.7f

    .line 414
    .line 415
    .line 416
    const/high16 v16, 0x41a00000    # 20.0f

    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v17, -0x3f200000    # -7.0f

    .line 422
    .line 423
    const/high16 v18, -0x3f200000    # -7.0f

    .line 424
    .line 425
    const v13, -0x3f8851ec    # -3.87f

    .line 426
    .line 427
    .line 428
    const/4 v14, 0x0

    .line 429
    const/high16 v15, -0x3f200000    # -7.0f

    .line 430
    .line 431
    const v16, -0x3fb7ae14    # -3.13f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v17, 0x3fce147b    # 1.61f

    .line 438
    .line 439
    .line 440
    const v18, -0x3f70f5c3    # -4.47f

    .line 441
    .line 442
    .line 443
    const/4 v13, 0x0

    .line 444
    const v14, -0x40266666    # -1.7f

    .line 445
    .line 446
    .line 447
    const v15, 0x3f1c28f6    # 0.61f

    .line 448
    .line 449
    .line 450
    const v16, -0x3faf5c29    # -3.26f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, 0x411dc28f    # 9.86f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v0, 0x410051ec    # 8.02f

    .line 466
    .line 467
    .line 468
    const v2, 0x4051eb85    # 3.28f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x40d33333    # 6.6f

    .line 475
    .line 476
    .line 477
    const v2, 0x3fee147b    # 1.86f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, -0x40a3d70a    # -0.86f

    .line 484
    .line 485
    .line 486
    const v2, 0x3f35c28f    # 0.71f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v0, 0x3fb5c28f    # 1.42f

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v0, 0x3f5c28f6    # 0.86f

    .line 499
    .line 500
    .line 501
    const v2, -0x40ca3d71    # -0.71f

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    const/16 v16, 0x3800

    .line 515
    .line 516
    const/16 v17, 0x0

    .line 517
    .line 518
    const/high16 v6, 0x3f800000    # 1.0f

    .line 519
    .line 520
    const/high16 v8, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const/4 v7, 0x0

    .line 523
    const/high16 v9, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const/high16 v12, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const/4 v14, 0x0

    .line 528
    const/4 v15, 0x0

    .line 529
    const-string v4, ""

    .line 530
    .line 531
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    sput-object v0, Landroidx/compose/material/icons/filled/AlarmOffKt;->_alarmOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 540
    .line 541
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    return-object v0
.end method
