.class public final Landroidx/compose/material/icons/rounded/TimerOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_timerOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "TimerOff",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getTimerOff",
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
        "SMAP\nTimerOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimerOff.kt\nandroidx/compose/material/icons/rounded/TimerOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n233#2,18:131\n253#2:168\n233#2,18:169\n253#2:206\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n705#4,2:149\n717#4,2:151\n719#4,11:157\n705#4,2:187\n717#4,2:189\n719#4,11:195\n72#5,4:115\n72#5,4:153\n72#5,4:191\n*S KotlinDebug\n*F\n+ 1 TimerOff.kt\nandroidx/compose/material/icons/rounded/TimerOffKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n40#1:131,18\n40#1:168\n58#1:169,18\n58#1:206\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n40#1:149,2\n40#1:151,2\n40#1:157,11\n58#1:187,2\n58#1:189,2\n58#1:195,11\n30#1:115,4\n40#1:153,4\n58#1:191,4\n*E\n"
    }
.end annotation


# static fields
.field private static _timerOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTimerOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TimerOffKt;->_timerOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.TimerOff"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v6, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const/high16 v26, -0x40800000    # -1.0f

    .line 85
    .line 86
    const v21, 0x3f0ccccd    # 0.55f

    .line 87
    .line 88
    .line 89
    const/16 v22, 0x0

    .line 90
    .line 91
    const/high16 v23, 0x3f800000    # 1.0f

    .line 92
    .line 93
    const v24, -0x4119999a    # -0.45f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v25, -0x40800000    # -1.0f

    .line 102
    .line 103
    const/16 v21, 0x0

    .line 104
    .line 105
    const v22, -0x40f33333    # -0.55f

    .line 106
    .line 107
    .line 108
    const v23, -0x4119999a    # -0.45f

    .line 109
    .line 110
    .line 111
    const/high16 v24, -0x40800000    # -1.0f

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v4, -0x3f800000    # -4.0f

    .line 117
    .line 118
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, 0x41100000    # 9.0f

    .line 122
    .line 123
    const/high16 v26, 0x40000000    # 2.0f

    .line 124
    .line 125
    const v21, 0x41173333    # 9.45f

    .line 126
    .line 127
    .line 128
    const/high16 v22, 0x3f800000    # 1.0f

    .line 129
    .line 130
    const/high16 v23, 0x41100000    # 9.0f

    .line 131
    .line 132
    const v24, 0x3fb9999a    # 1.45f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v25, 0x41200000    # 10.0f

    .line 139
    .line 140
    const/high16 v26, 0x40400000    # 3.0f

    .line 141
    .line 142
    const/high16 v21, 0x41100000    # 9.0f

    .line 143
    .line 144
    const v22, 0x40233333    # 2.55f

    .line 145
    .line 146
    .line 147
    const v23, 0x41173333    # 9.45f

    .line 148
    .line 149
    .line 150
    const/high16 v24, 0x40400000    # 3.0f

    .line 151
    .line 152
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    const/16 v16, 0x3800

    .line 163
    .line 164
    const/16 v17, 0x0

    .line 165
    .line 166
    const/high16 v6, 0x3f800000    # 1.0f

    .line 167
    .line 168
    const/high16 v8, 0x3f800000    # 1.0f

    .line 169
    .line 170
    const/4 v7, 0x0

    .line 171
    const/high16 v9, 0x3f800000    # 1.0f

    .line 172
    .line 173
    const/high16 v12, 0x3f800000    # 1.0f

    .line 174
    .line 175
    const/4 v13, 0x0

    .line 176
    const/4 v14, 0x0

    .line 177
    const/4 v15, 0x0

    .line 178
    const-string v4, ""

    .line 179
    .line 180
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 181
    .line 182
    .line 183
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 188
    .line 189
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 190
    .line 191
    .line 192
    move-result-wide v6

    .line 193
    const/4 v2, 0x0

    .line 194
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 198
    .line 199
    .line 200
    move-result v10

    .line 201
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 208
    .line 209
    .line 210
    const/high16 v4, 0x41400000    # 12.0f

    .line 211
    .line 212
    const/high16 v6, 0x41000000    # 8.0f

    .line 213
    .line 214
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v25, 0x3f800000    # 1.0f

    .line 218
    .line 219
    const/high16 v26, 0x3f800000    # 1.0f

    .line 220
    .line 221
    const v21, 0x3f0ccccd    # 0.55f

    .line 222
    .line 223
    .line 224
    const/16 v22, 0x0

    .line 225
    .line 226
    const/high16 v23, 0x3f800000    # 1.0f

    .line 227
    .line 228
    const v24, 0x3ee66666    # 0.45f

    .line 229
    .line 230
    .line 231
    move-object/from16 v20, v2

    .line 232
    .line 233
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v4, 0x3f95c28f    # 1.17f

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v4, 0x40df5c29    # 6.98f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v25, 0x41a80000    # 21.0f

    .line 249
    .line 250
    const/high16 v26, 0x41500000    # 13.0f

    .line 251
    .line 252
    const v21, 0x41a50a3d    # 20.63f

    .line 253
    .line 254
    .line 255
    const v22, 0x417e8f5c    # 15.91f

    .line 256
    .line 257
    .line 258
    const/high16 v23, 0x41a80000    # 21.0f

    .line 259
    .line 260
    const/high16 v24, 0x41680000    # 14.5f

    .line 261
    .line 262
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v25, -0x4003d70a    # -1.97f

    .line 266
    .line 267
    .line 268
    const v26, -0x3f4c7ae1    # -5.61f

    .line 269
    .line 270
    .line 271
    const/16 v21, 0x0

    .line 272
    .line 273
    const v22, -0x3ff851ec    # -2.12f

    .line 274
    .line 275
    .line 276
    const v23, -0x40c28f5c    # -0.74f

    .line 277
    .line 278
    .line 279
    const v24, -0x3f7dc28f    # -4.07f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v4, -0x40c00000    # -0.75f

    .line 286
    .line 287
    const/high16 v6, 0x3f400000    # 0.75f

    .line 288
    .line 289
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/16 v25, 0x0

    .line 293
    .line 294
    const v26, -0x404ccccd    # -1.4f

    .line 295
    .line 296
    .line 297
    const v21, 0x3ec28f5c    # 0.38f

    .line 298
    .line 299
    .line 300
    const v22, -0x413d70a4    # -0.38f

    .line 301
    .line 302
    .line 303
    const v23, 0x3ec7ae14    # 0.39f

    .line 304
    .line 305
    .line 306
    const v24, -0x407eb852    # -1.01f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v25, -0x43dc28f6    # -0.01f

    .line 313
    .line 314
    .line 315
    const v26, -0x43dc28f6    # -0.01f

    .line 316
    .line 317
    .line 318
    const/16 v21, 0x0

    .line 319
    .line 320
    const/16 v22, 0x0

    .line 321
    .line 322
    const v23, -0x43dc28f6    # -0.01f

    .line 323
    .line 324
    .line 325
    const v24, -0x43dc28f6    # -0.01f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v25, -0x404ccccd    # -1.4f

    .line 332
    .line 333
    .line 334
    const/16 v26, 0x0

    .line 335
    .line 336
    const v21, -0x413851ec    # -0.39f

    .line 337
    .line 338
    .line 339
    const v22, -0x413851ec    # -0.39f

    .line 340
    .line 341
    .line 342
    const v23, -0x407eb852    # -1.01f

    .line 343
    .line 344
    .line 345
    const v24, -0x413d70a4    # -0.38f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v25, 0x41400000    # 12.0f

    .line 355
    .line 356
    const/high16 v26, 0x40800000    # 4.0f

    .line 357
    .line 358
    const v21, 0x41808f5c    # 16.07f

    .line 359
    .line 360
    .line 361
    const v22, 0x4097ae14    # 4.74f

    .line 362
    .line 363
    .line 364
    const v23, 0x4161eb85    # 14.12f

    .line 365
    .line 366
    .line 367
    const/high16 v24, 0x40800000    # 4.0f

    .line 368
    .line 369
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v25, -0x3f7bd70a    # -4.13f

    .line 373
    .line 374
    .line 375
    const v26, 0x3f851eb8    # 1.04f

    .line 376
    .line 377
    .line 378
    const v21, -0x40428f5c    # -1.48f

    .line 379
    .line 380
    .line 381
    const/16 v22, 0x0

    .line 382
    .line 383
    const v23, -0x3fc70a3d    # -2.89f

    .line 384
    .line 385
    .line 386
    const v24, 0x3ec28f5c    # 0.38f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v4, 0x40570a3d    # 3.36f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v25, 0x41400000    # 12.0f

    .line 399
    .line 400
    const/high16 v26, 0x41000000    # 8.0f

    .line 401
    .line 402
    const v21, 0x41368f5c    # 11.41f

    .line 403
    .line 404
    .line 405
    const v22, 0x41028f5c    # 8.16f

    .line 406
    .line 407
    .line 408
    const v23, 0x413ae148    # 11.68f

    .line 409
    .line 410
    .line 411
    const/high16 v24, 0x41000000    # 8.0f

    .line 412
    .line 413
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    const/high16 v6, 0x3f800000    # 1.0f

    .line 424
    .line 425
    const/4 v7, 0x0

    .line 426
    const-string v4, ""

    .line 427
    .line 428
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 429
    .line 430
    .line 431
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 436
    .line 437
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 438
    .line 439
    .line 440
    move-result-wide v6

    .line 441
    const/4 v0, 0x0

    .line 442
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 446
    .line 447
    .line 448
    move-result v10

    .line 449
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 450
    .line 451
    .line 452
    move-result v11

    .line 453
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 456
    .line 457
    .line 458
    const v0, 0x40066666    # 2.1f

    .line 459
    .line 460
    .line 461
    const v2, 0x4060a3d7    # 3.51f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/16 v17, 0x0

    .line 471
    .line 472
    const v18, 0x3fb47ae1    # 1.41f

    .line 473
    .line 474
    .line 475
    const v13, -0x413851ec    # -0.39f

    .line 476
    .line 477
    .line 478
    const v14, 0x3ec7ae14    # 0.39f

    .line 479
    .line 480
    .line 481
    const v15, -0x413851ec    # -0.39f

    .line 482
    .line 483
    .line 484
    const v16, 0x3f828f5c    # 1.02f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, 0x402e147b    # 2.72f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v17, 0x40400000    # 3.0f

    .line 497
    .line 498
    const v18, 0x414c28f6    # 12.76f

    .line 499
    .line 500
    .line 501
    const v13, 0x406eb852    # 3.73f

    .line 502
    .line 503
    .line 504
    const v14, 0x411170a4    # 9.09f

    .line 505
    .line 506
    .line 507
    const v15, 0x40433333    # 3.05f

    .line 508
    .line 509
    .line 510
    const v16, 0x412dc28f    # 10.86f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v17, 0x41400000    # 12.0f

    .line 517
    .line 518
    const/high16 v18, 0x41b00000    # 22.0f

    .line 519
    .line 520
    const v13, 0x4037ae14    # 2.87f

    .line 521
    .line 522
    .line 523
    const v14, 0x418eb852    # 17.84f

    .line 524
    .line 525
    .line 526
    const v15, 0x40de147b    # 6.94f

    .line 527
    .line 528
    .line 529
    const/high16 v16, 0x41b00000    # 22.0f

    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v17, 0x40ac28f6    # 5.38f

    .line 535
    .line 536
    .line 537
    const v18, -0x401ae148    # -1.79f

    .line 538
    .line 539
    .line 540
    const v13, 0x400147ae    # 2.02f

    .line 541
    .line 542
    .line 543
    const/4 v14, 0x0

    .line 544
    const v15, 0x407851ec    # 3.88f

    .line 545
    .line 546
    .line 547
    const v16, -0x40d47ae1    # -0.67f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, 0x3fd851ec    # 1.69f

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v17, 0x3fb47ae1    # 1.41f

    .line 560
    .line 561
    .line 562
    const/16 v18, 0x0

    .line 563
    .line 564
    const v13, 0x3ec7ae14    # 0.39f

    .line 565
    .line 566
    .line 567
    const v14, 0x3ec7ae14    # 0.39f

    .line 568
    .line 569
    .line 570
    const v15, 0x3f828f5c    # 1.02f

    .line 571
    .line 572
    .line 573
    const v16, 0x3ec7ae14    # 0.39f

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/4 v0, 0x0

    .line 580
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/16 v17, 0x0

    .line 584
    .line 585
    const v18, -0x404b851f    # -1.41f

    .line 586
    .line 587
    .line 588
    const v14, -0x413851ec    # -0.39f

    .line 589
    .line 590
    .line 591
    const v15, 0x3ec7ae14    # 0.39f

    .line 592
    .line 593
    .line 594
    const v16, -0x407d70a4    # -1.02f

    .line 595
    .line 596
    .line 597
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v0, 0x4060a3d7    # 3.51f

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v17, 0x40066666    # 2.1f

    .line 607
    .line 608
    .line 609
    const v18, 0x4060a3d7    # 3.51f

    .line 610
    .line 611
    .line 612
    const v13, 0x4047ae14    # 3.12f

    .line 613
    .line 614
    .line 615
    const v14, 0x4047ae14    # 3.12f

    .line 616
    .line 617
    .line 618
    const v15, 0x401f5c29    # 2.49f

    .line 619
    .line 620
    .line 621
    const v16, 0x4047ae14    # 3.12f

    .line 622
    .line 623
    .line 624
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    const/16 v16, 0x3800

    .line 635
    .line 636
    const/16 v17, 0x0

    .line 637
    .line 638
    const/high16 v6, 0x3f800000    # 1.0f

    .line 639
    .line 640
    const/4 v7, 0x0

    .line 641
    const/high16 v12, 0x3f800000    # 1.0f

    .line 642
    .line 643
    const/4 v13, 0x0

    .line 644
    const/4 v14, 0x0

    .line 645
    const/4 v15, 0x0

    .line 646
    const-string v4, ""

    .line 647
    .line 648
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    sput-object v0, Landroidx/compose/material/icons/rounded/TimerOffKt;->_timerOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 657
    .line 658
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    return-object v0
.end method
