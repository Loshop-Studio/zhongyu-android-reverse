.class public final Landroidx/compose/material/icons/sharp/AlarmOffKt;
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
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getAlarmOff",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nAlarmOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlarmOff.kt\nandroidx/compose/material/icons/sharp/AlarmOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 AlarmOff.kt\nandroidx/compose/material/icons/sharp/AlarmOffKt\n*L\n29#1:78,12\n30#1:91,18\n30#1:128\n29#1:90\n30#1:109,2\n30#1:111,2\n30#1:117,11\n30#1:113,4\n*E\n"
    }
.end annotation


# static fields
.field private static _alarmOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAlarmOff(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/AlarmOffKt;->_alarmOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.AlarmOff"

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
    const v0, 0x4120a3d7    # 10.04f

    .line 71
    .line 72
    .line 73
    const v2, 0x40c947ae    # 6.29f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v18, 0x40c00000    # 6.0f

    .line 82
    .line 83
    const v13, 0x412a8f5c    # 10.66f

    .line 84
    .line 85
    .line 86
    const v14, 0x40c3851f    # 6.11f

    .line 87
    .line 88
    .line 89
    const v15, 0x41351eb8    # 11.32f

    .line 90
    .line 91
    .line 92
    const/high16 v16, 0x40c00000    # 6.0f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, 0x40e00000    # 7.0f

    .line 98
    .line 99
    const/high16 v18, 0x40e00000    # 7.0f

    .line 100
    .line 101
    const v13, 0x40770a3d    # 3.86f

    .line 102
    .line 103
    .line 104
    const/4 v14, 0x0

    .line 105
    const/high16 v15, 0x40e00000    # 7.0f

    .line 106
    .line 107
    const v16, 0x4048f5c3    # 3.14f

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v17, -0x416b851f    # -0.29f

    .line 114
    .line 115
    .line 116
    const v18, 0x3ffae148    # 1.96f

    .line 117
    .line 118
    .line 119
    const/4 v13, 0x0

    .line 120
    const v14, 0x3f2e147b    # 0.68f

    .line 121
    .line 122
    .line 123
    const v15, -0x421eb852    # -0.11f

    .line 124
    .line 125
    .line 126
    const v16, 0x3fab851f    # 1.34f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v0, 0x3fc7ae14    # 1.56f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, 0x3f3ae148    # 0.73f

    .line 139
    .line 140
    .line 141
    const v18, -0x3f9eb852    # -3.52f

    .line 142
    .line 143
    .line 144
    const v13, 0x3ef0a3d7    # 0.47f

    .line 145
    .line 146
    .line 147
    const v14, -0x4075c28f    # -1.08f

    .line 148
    .line 149
    .line 150
    const v15, 0x3f3ae148    # 0.73f

    .line 151
    .line 152
    .line 153
    const v16, -0x3feeb852    # -2.27f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 160
    .line 161
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 162
    .line 163
    const/4 v13, 0x0

    .line 164
    const v14, -0x3f60f5c3    # -4.97f

    .line 165
    .line 166
    .line 167
    const v15, -0x3f7f0a3d    # -4.03f

    .line 168
    .line 169
    .line 170
    const/high16 v16, -0x3ef00000    # -9.0f

    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, -0x3f9e147b    # -3.53f

    .line 176
    .line 177
    .line 178
    const v18, 0x3f3851ec    # 0.72f

    .line 179
    .line 180
    .line 181
    const/high16 v13, -0x40600000    # -1.25f

    .line 182
    .line 183
    const/4 v14, 0x0

    .line 184
    const v15, -0x3fe3d70a    # -2.44f

    .line 185
    .line 186
    .line 187
    const v16, 0x3e851eb8    # 0.26f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, 0x3fc8f5c3    # 1.57f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, 0x418ab22d    # 17.337f

    .line 203
    .line 204
    .line 205
    const v2, 0x3fe7ae14    # 1.81f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v0, 0x40936c8b    # 4.607f

    .line 212
    .line 213
    .line 214
    const v2, 0x4076147b    # 3.845f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, 0x3fc47ae1    # 1.535f

    .line 221
    .line 222
    .line 223
    const v2, -0x405c28f6    # -1.28f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, -0x3f6c7ae1    # -4.61f

    .line 230
    .line 231
    .line 232
    const v2, -0x3f8a0c4a    # -3.843f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, 0x404147ae    # 3.02f

    .line 242
    .line 243
    .line 244
    const v2, 0x40066666    # 2.1f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, 0x3fce147b    # 1.61f

    .line 251
    .line 252
    .line 253
    const v2, 0x4060a3d7    # 3.51f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v0, 0x3faf5c29    # 1.37f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, -0x40947ae1    # -0.92f

    .line 266
    .line 267
    .line 268
    const v2, 0x3f451eb8    # 0.77f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, 0x3fa3d70a    # 1.28f

    .line 275
    .line 276
    .line 277
    const v2, 0x3fc51eb8    # 1.54f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, 0x3f87ae14    # 1.06f

    .line 284
    .line 285
    .line 286
    const v2, -0x409eb852    # -0.88f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, 0x3f4ccccd    # 0.8f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v17, 0x40400000    # 3.0f

    .line 299
    .line 300
    const/high16 v18, 0x41500000    # 13.0f

    .line 301
    .line 302
    const v13, 0x40751eb8    # 3.83f

    .line 303
    .line 304
    .line 305
    const v14, 0x410b0a3d    # 8.69f

    .line 306
    .line 307
    .line 308
    const/high16 v15, 0x40400000    # 3.0f

    .line 309
    .line 310
    const/high16 v16, 0x412c0000    # 10.75f

    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v17, 0x41100000    # 9.0f

    .line 316
    .line 317
    const/high16 v18, 0x41100000    # 9.0f

    .line 318
    .line 319
    const/4 v13, 0x0

    .line 320
    const v14, 0x409f0a3d    # 4.97f

    .line 321
    .line 322
    .line 323
    const v15, 0x4080f5c3    # 4.03f

    .line 324
    .line 325
    .line 326
    const/high16 v16, 0x41100000    # 9.0f

    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v17, 0x40bc7ae1    # 5.89f

    .line 332
    .line 333
    .line 334
    const v18, -0x3ff33333    # -2.2f

    .line 335
    .line 336
    .line 337
    const/high16 v13, 0x40100000    # 2.25f

    .line 338
    .line 339
    const/4 v14, 0x0

    .line 340
    const v15, 0x4089eb85    # 4.31f

    .line 341
    .line 342
    .line 343
    const v16, -0x40ab851f    # -0.83f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, 0x40066666    # 2.1f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x3fb47ae1    # 1.41f

    .line 356
    .line 357
    .line 358
    const v2, -0x404b851f    # -1.41f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v0, 0x404147ae    # 3.02f

    .line 365
    .line 366
    .line 367
    const v2, 0x40066666    # 2.1f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x41400000    # 12.0f

    .line 377
    .line 378
    const/high16 v2, 0x41a00000    # 20.0f

    .line 379
    .line 380
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v17, -0x3f200000    # -7.0f

    .line 384
    .line 385
    const/high16 v18, -0x3f200000    # -7.0f

    .line 386
    .line 387
    const v13, -0x3f88f5c3    # -3.86f

    .line 388
    .line 389
    .line 390
    const/high16 v15, -0x3f200000    # -7.0f

    .line 391
    .line 392
    const v16, -0x3fb70a3d    # -3.14f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, 0x3fcf5c29    # 1.62f

    .line 399
    .line 400
    .line 401
    const v18, -0x3f70f5c3    # -4.47f

    .line 402
    .line 403
    .line 404
    const/4 v13, 0x0

    .line 405
    const v14, -0x40266666    # -1.7f

    .line 406
    .line 407
    .line 408
    const v15, 0x3f1c28f6    # 0.61f

    .line 409
    .line 410
    .line 411
    const v16, -0x3faf5c29    # -3.26f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v0, 0x411d999a    # 9.85f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v17, 0x41400000    # 12.0f

    .line 424
    .line 425
    const/high16 v18, 0x41a00000    # 20.0f

    .line 426
    .line 427
    const v13, 0x417428f6    # 15.26f

    .line 428
    .line 429
    .line 430
    const v14, 0x419b1eb8    # 19.39f

    .line 431
    .line 432
    .line 433
    const v15, 0x415b3333    # 13.7f

    .line 434
    .line 435
    .line 436
    const/high16 v16, 0x41a00000    # 20.0f

    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, 0x40ef5c29    # 7.48f

    .line 445
    .line 446
    .line 447
    const v2, 0x406eb852    # 3.73f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, 0x3eeb851f    # 0.46f

    .line 454
    .line 455
    .line 456
    const v2, -0x413d70a4    # -0.38f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, -0x403ae148    # -1.54f

    .line 463
    .line 464
    .line 465
    const v2, -0x405c28f6    # -1.28f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, -0x40e66666    # -0.6f

    .line 472
    .line 473
    .line 474
    const/high16 v2, 0x3f000000    # 0.5f

    .line 475
    .line 476
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    const/16 v16, 0x3800

    .line 487
    .line 488
    const/16 v17, 0x0

    .line 489
    .line 490
    const/high16 v6, 0x3f800000    # 1.0f

    .line 491
    .line 492
    const/high16 v8, 0x3f800000    # 1.0f

    .line 493
    .line 494
    const/4 v7, 0x0

    .line 495
    const/high16 v9, 0x3f800000    # 1.0f

    .line 496
    .line 497
    const/high16 v12, 0x3f800000    # 1.0f

    .line 498
    .line 499
    const/4 v13, 0x0

    .line 500
    const/4 v14, 0x0

    .line 501
    const/4 v15, 0x0

    .line 502
    const-string v4, ""

    .line 503
    .line 504
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    sput-object v0, Landroidx/compose/material/icons/sharp/AlarmOffKt;->_alarmOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 513
    .line 514
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    return-object v0
.end method
