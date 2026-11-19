.class public final Landroidx/compose/material/icons/twotone/BreakfastDiningKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_breakfastDining",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "BreakfastDining",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getBreakfastDining",
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
        "SMAP\nBreakfastDining.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BreakfastDining.kt\nandroidx/compose/material/icons/twotone/BreakfastDiningKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,107:1\n212#2,12:108\n233#2,18:121\n253#2:158\n233#2,18:159\n253#2:196\n233#2,18:197\n253#2:234\n174#3:120\n705#4,2:139\n717#4,2:141\n719#4,11:147\n705#4,2:177\n717#4,2:179\n719#4,11:185\n705#4,2:215\n717#4,2:217\n719#4,11:223\n72#5,4:143\n72#5,4:181\n72#5,4:219\n*S KotlinDebug\n*F\n+ 1 BreakfastDining.kt\nandroidx/compose/material/icons/twotone/BreakfastDiningKt\n*L\n29#1:108,12\n30#1:121,18\n30#1:158\n56#1:159,18\n56#1:196\n82#1:197,18\n82#1:234\n29#1:120\n30#1:139,2\n30#1:141,2\n30#1:147,11\n56#1:177,2\n56#1:179,2\n56#1:185,11\n82#1:215,2\n82#1:217,2\n82#1:223,11\n30#1:143,4\n56#1:181,4\n82#1:219,4\n*E\n"
    }
.end annotation


# static fields
.field private static _breakfastDining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBreakfastDining(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BreakfastDiningKt;->_breakfastDining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.BreakfastDining"

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
    const/high16 v4, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v6, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40c00000    # 6.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, 0x40800000    # 4.0f

    .line 83
    .line 84
    const/high16 v26, 0x40e00000    # 7.0f

    .line 85
    .line 86
    const v21, 0x409ccccd    # 4.9f

    .line 87
    .line 88
    .line 89
    const/high16 v22, 0x40a00000    # 5.0f

    .line 90
    .line 91
    const/high16 v23, 0x40800000    # 4.0f

    .line 92
    .line 93
    const v24, 0x40bccccd    # 5.9f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v25, 0x3f8147ae    # 1.01f

    .line 102
    .line 103
    .line 104
    const v26, 0x3fdd70a4    # 1.73f

    .line 105
    .line 106
    .line 107
    const/16 v21, 0x0

    .line 108
    .line 109
    const v22, 0x3f35c28f    # 0.71f

    .line 110
    .line 111
    .line 112
    const v23, 0x3ec28f5c    # 0.38f

    .line 113
    .line 114
    .line 115
    const v24, 0x3faccccd    # 1.35f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v4, 0x4114f5c3    # 9.31f

    .line 122
    .line 123
    .line 124
    const/high16 v6, 0x40c00000    # 6.0f

    .line 125
    .line 126
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v4, 0x41980000    # 19.0f

    .line 130
    .line 131
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, 0x41400000    # 12.0f

    .line 135
    .line 136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v4, 0x4114cccd    # 9.3f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v4, 0x3f800000    # 1.0f

    .line 146
    .line 147
    const v6, -0x40eb851f    # -0.58f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v25, 0x3f800000    # 1.0f

    .line 154
    .line 155
    const v26, -0x4023d70a    # -1.72f

    .line 156
    .line 157
    .line 158
    const v21, 0x3f2147ae    # 0.63f

    .line 159
    .line 160
    .line 161
    const v22, -0x4147ae14    # -0.36f

    .line 162
    .line 163
    .line 164
    const/high16 v23, 0x3f800000    # 1.0f

    .line 165
    .line 166
    const v24, -0x407eb852    # -1.01f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v25, 0x41900000    # 18.0f

    .line 173
    .line 174
    const/high16 v26, 0x40a00000    # 5.0f

    .line 175
    .line 176
    const/high16 v21, 0x41a00000    # 20.0f

    .line 177
    .line 178
    const v22, 0x40bccccd    # 5.9f

    .line 179
    .line 180
    .line 181
    const v23, 0x4198cccd    # 19.1f

    .line 182
    .line 183
    .line 184
    const/high16 v24, 0x40a00000    # 5.0f

    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v4, 0x417b5c29    # 15.71f

    .line 193
    .line 194
    .line 195
    const v6, 0x415b3333    # 13.7f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 202
    .line 203
    const/high16 v6, 0x40400000    # 3.0f

    .line 204
    .line 205
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v25, 0x41400000    # 12.0f

    .line 209
    .line 210
    const/high16 v26, 0x41880000    # 17.0f

    .line 211
    .line 212
    const v21, 0x414828f6    # 12.51f

    .line 213
    .line 214
    .line 215
    const v22, 0x41873333    # 16.9f

    .line 216
    .line 217
    .line 218
    const v23, 0x414428f6    # 12.26f

    .line 219
    .line 220
    .line 221
    const/high16 v24, 0x41880000    # 17.0f

    .line 222
    .line 223
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v4, -0x416b851f    # -0.29f

    .line 227
    .line 228
    .line 229
    const v6, -0x40ca3d71    # -0.71f

    .line 230
    .line 231
    .line 232
    const v7, -0x42333333    # -0.1f

    .line 233
    .line 234
    .line 235
    const v8, -0x40fd70a4    # -0.51f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 242
    .line 243
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/16 v25, 0x0

    .line 247
    .line 248
    const v26, -0x404b851f    # -1.41f

    .line 249
    .line 250
    .line 251
    const v21, -0x413851ec    # -0.39f

    .line 252
    .line 253
    .line 254
    const v22, -0x413851ec    # -0.39f

    .line 255
    .line 256
    .line 257
    const v23, -0x413851ec    # -0.39f

    .line 258
    .line 259
    .line 260
    const v24, -0x407d70a4    # -1.02f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v6, 0x40400000    # 3.0f

    .line 267
    .line 268
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v25, 0x41400000    # 12.0f

    .line 272
    .line 273
    const/high16 v26, 0x41100000    # 9.0f

    .line 274
    .line 275
    const v21, 0x4137d70a    # 11.49f

    .line 276
    .line 277
    .line 278
    const v22, 0x4111999a    # 9.1f

    .line 279
    .line 280
    .line 281
    const v23, 0x413bd70a    # 11.74f

    .line 282
    .line 283
    .line 284
    const/high16 v24, 0x41100000    # 9.0f

    .line 285
    .line 286
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v4, 0x3e947ae1    # 0.29f

    .line 290
    .line 291
    .line 292
    const v6, 0x3f35c28f    # 0.71f

    .line 293
    .line 294
    .line 295
    const v7, 0x3dcccccd    # 0.1f

    .line 296
    .line 297
    .line 298
    const v8, 0x3f028f5c    # 0.51f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v4, 0x40400000    # 3.0f

    .line 305
    .line 306
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v25, 0x417b5c29    # 15.71f

    .line 310
    .line 311
    .line 312
    const v26, 0x415b3333    # 13.7f

    .line 313
    .line 314
    .line 315
    const v21, 0x4180cccd    # 16.1f

    .line 316
    .line 317
    .line 318
    const v22, 0x414ae148    # 12.68f

    .line 319
    .line 320
    .line 321
    const v23, 0x4180cccd    # 16.1f

    .line 322
    .line 323
    .line 324
    const v24, 0x4154f5c3    # 13.31f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    const/16 v16, 0x3800

    .line 338
    .line 339
    const/16 v17, 0x0

    .line 340
    .line 341
    const v6, 0x3e99999a    # 0.3f

    .line 342
    .line 343
    .line 344
    const v8, 0x3e99999a    # 0.3f

    .line 345
    .line 346
    .line 347
    const/4 v7, 0x0

    .line 348
    const/high16 v9, 0x3f800000    # 1.0f

    .line 349
    .line 350
    const/high16 v12, 0x3f800000    # 1.0f

    .line 351
    .line 352
    const/4 v13, 0x0

    .line 353
    const/4 v14, 0x0

    .line 354
    const/4 v15, 0x0

    .line 355
    const-string v4, ""

    .line 356
    .line 357
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 358
    .line 359
    .line 360
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 361
    .line 362
    .line 363
    move-result v3

    .line 364
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 365
    .line 366
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 367
    .line 368
    .line 369
    move-result-wide v6

    .line 370
    const/4 v2, 0x0

    .line 371
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 375
    .line 376
    .line 377
    move-result v10

    .line 378
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 379
    .line 380
    .line 381
    move-result v11

    .line 382
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 385
    .line 386
    .line 387
    const/high16 v4, 0x41900000    # 18.0f

    .line 388
    .line 389
    const/high16 v6, 0x40400000    # 3.0f

    .line 390
    .line 391
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v4, 0x40c00000    # 6.0f

    .line 395
    .line 396
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v25, 0x40000000    # 2.0f

    .line 400
    .line 401
    const/high16 v26, 0x40e00000    # 7.0f

    .line 402
    .line 403
    const v21, 0x40728f5c    # 3.79f

    .line 404
    .line 405
    .line 406
    const/high16 v22, 0x40400000    # 3.0f

    .line 407
    .line 408
    const/high16 v23, 0x40000000    # 2.0f

    .line 409
    .line 410
    const v24, 0x409947ae    # 4.79f

    .line 411
    .line 412
    .line 413
    move-object/from16 v20, v2

    .line 414
    .line 415
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v26, 0x405ccccd    # 3.45f

    .line 419
    .line 420
    .line 421
    const/16 v21, 0x0

    .line 422
    .line 423
    const v22, 0x3fbd70a4    # 1.48f

    .line 424
    .line 425
    .line 426
    const v23, 0x3f4f5c29    # 0.81f

    .line 427
    .line 428
    .line 429
    const/high16 v24, 0x40300000    # 2.75f

    .line 430
    .line 431
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v4, 0x41980000    # 19.0f

    .line 435
    .line 436
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v26, 0x40000000    # 2.0f

    .line 440
    .line 441
    const v22, 0x3f8ccccd    # 1.1f

    .line 442
    .line 443
    .line 444
    const v23, 0x3f666666    # 0.9f

    .line 445
    .line 446
    .line 447
    const/high16 v24, 0x40000000    # 2.0f

    .line 448
    .line 449
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v4, 0x41400000    # 12.0f

    .line 453
    .line 454
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v26, -0x40000000    # -2.0f

    .line 458
    .line 459
    const v21, 0x3f8ccccd    # 1.1f

    .line 460
    .line 461
    .line 462
    const/16 v22, 0x0

    .line 463
    .line 464
    const/high16 v23, 0x40000000    # 2.0f

    .line 465
    .line 466
    const v24, -0x4099999a    # -0.9f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v4, -0x3ef73333    # -8.55f

    .line 473
    .line 474
    .line 475
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v26, -0x3fa33333    # -3.45f

    .line 479
    .line 480
    .line 481
    const v21, 0x3f9851ec    # 1.19f

    .line 482
    .line 483
    .line 484
    const v22, -0x40cf5c29    # -0.69f

    .line 485
    .line 486
    .line 487
    const v24, -0x4003d70a    # -1.97f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v25, 0x41900000    # 18.0f

    .line 494
    .line 495
    const/high16 v26, 0x40400000    # 3.0f

    .line 496
    .line 497
    const/high16 v21, 0x41b00000    # 22.0f

    .line 498
    .line 499
    const v22, 0x409947ae    # 4.79f

    .line 500
    .line 501
    .line 502
    const v23, 0x41a1ae14    # 20.21f

    .line 503
    .line 504
    .line 505
    const/high16 v24, 0x40400000    # 3.0f

    .line 506
    .line 507
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v4, 0x410b851f    # 8.72f

    .line 514
    .line 515
    .line 516
    const/high16 v6, 0x41980000    # 19.0f

    .line 517
    .line 518
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v4, 0x4114cccd    # 9.3f

    .line 522
    .line 523
    .line 524
    const/high16 v6, 0x41900000    # 18.0f

    .line 525
    .line 526
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v4, 0x41980000    # 19.0f

    .line 530
    .line 531
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v4, 0x40c00000    # 6.0f

    .line 535
    .line 536
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v4, 0x4114f5c3    # 9.31f

    .line 540
    .line 541
    .line 542
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v4, 0x40a051ec    # 5.01f

    .line 546
    .line 547
    .line 548
    const v6, 0x410bae14    # 8.73f

    .line 549
    .line 550
    .line 551
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v25, 0x40800000    # 4.0f

    .line 555
    .line 556
    const/high16 v26, 0x40e00000    # 7.0f

    .line 557
    .line 558
    const v21, 0x408c28f6    # 4.38f

    .line 559
    .line 560
    .line 561
    const v22, 0x4105999a    # 8.35f

    .line 562
    .line 563
    .line 564
    const/high16 v23, 0x40800000    # 4.0f

    .line 565
    .line 566
    const v24, 0x40f6b852    # 7.71f

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v25, 0x40000000    # 2.0f

    .line 573
    .line 574
    const/high16 v26, -0x40000000    # -2.0f

    .line 575
    .line 576
    const/16 v21, 0x0

    .line 577
    .line 578
    const v22, -0x40733333    # -1.1f

    .line 579
    .line 580
    .line 581
    const v23, 0x3f666666    # 0.9f

    .line 582
    .line 583
    .line 584
    const/high16 v24, -0x40000000    # -2.0f

    .line 585
    .line 586
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v4, 0x41400000    # 12.0f

    .line 590
    .line 591
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v26, 0x40000000    # 2.0f

    .line 595
    .line 596
    const v21, 0x3f8ccccd    # 1.1f

    .line 597
    .line 598
    .line 599
    const/16 v22, 0x0

    .line 600
    .line 601
    const/high16 v23, 0x40000000    # 2.0f

    .line 602
    .line 603
    const v24, 0x3f666666    # 0.9f

    .line 604
    .line 605
    .line 606
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v25, 0x41980000    # 19.0f

    .line 610
    .line 611
    const v26, 0x410b851f    # 8.72f

    .line 612
    .line 613
    .line 614
    const/high16 v21, 0x41a00000    # 20.0f

    .line 615
    .line 616
    const v22, 0x40f6b852    # 7.71f

    .line 617
    .line 618
    .line 619
    const v23, 0x419cf5c3    # 19.62f

    .line 620
    .line 621
    .line 622
    const v24, 0x4105c28f    # 8.36f

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 632
    .line 633
    .line 634
    move-result-object v2

    .line 635
    const/high16 v6, 0x3f800000    # 1.0f

    .line 636
    .line 637
    const/high16 v8, 0x3f800000    # 1.0f

    .line 638
    .line 639
    const/4 v7, 0x0

    .line 640
    const-string v4, ""

    .line 641
    .line 642
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 643
    .line 644
    .line 645
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 646
    .line 647
    .line 648
    move-result v3

    .line 649
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 650
    .line 651
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 652
    .line 653
    .line 654
    move-result-wide v6

    .line 655
    const/4 v0, 0x0

    .line 656
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 660
    .line 661
    .line 662
    move-result v10

    .line 663
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 664
    .line 665
    .line 666
    move-result v11

    .line 667
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 670
    .line 671
    .line 672
    const v0, 0x4114a3d7    # 9.29f

    .line 673
    .line 674
    .line 675
    const v2, 0x414b5c29    # 12.71f

    .line 676
    .line 677
    .line 678
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/high16 v17, 0x41400000    # 12.0f

    .line 682
    .line 683
    const/high16 v18, 0x41100000    # 9.0f

    .line 684
    .line 685
    const v13, 0x414828f6    # 12.51f

    .line 686
    .line 687
    .line 688
    const v14, 0x4111999a    # 9.1f

    .line 689
    .line 690
    .line 691
    const v15, 0x414428f6    # 12.26f

    .line 692
    .line 693
    .line 694
    const/high16 v16, 0x41100000    # 9.0f

    .line 695
    .line 696
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v0, 0x3e947ae1    # 0.29f

    .line 700
    .line 701
    .line 702
    const v2, 0x3dcccccd    # 0.1f

    .line 703
    .line 704
    .line 705
    const v4, -0x40ca3d71    # -0.71f

    .line 706
    .line 707
    .line 708
    const v6, -0x40fd70a4    # -0.51f

    .line 709
    .line 710
    .line 711
    invoke-virtual {v12, v6, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 715
    .line 716
    const/high16 v2, 0x40400000    # 3.0f

    .line 717
    .line 718
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/16 v17, 0x0

    .line 722
    .line 723
    const v18, 0x3fb47ae1    # 1.41f

    .line 724
    .line 725
    .line 726
    const v13, -0x413851ec    # -0.39f

    .line 727
    .line 728
    .line 729
    const v14, 0x3ec7ae14    # 0.39f

    .line 730
    .line 731
    .line 732
    const v15, -0x413851ec    # -0.39f

    .line 733
    .line 734
    .line 735
    const v16, 0x3f828f5c    # 1.02f

    .line 736
    .line 737
    .line 738
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v0, 0x40400000    # 3.0f

    .line 742
    .line 743
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const/high16 v17, 0x41400000    # 12.0f

    .line 747
    .line 748
    const/high16 v18, 0x41880000    # 17.0f

    .line 749
    .line 750
    const v13, 0x4137d70a    # 11.49f

    .line 751
    .line 752
    .line 753
    const v14, 0x41873333    # 16.9f

    .line 754
    .line 755
    .line 756
    const v15, 0x413bd70a    # 11.74f

    .line 757
    .line 758
    .line 759
    const/high16 v16, 0x41880000    # 17.0f

    .line 760
    .line 761
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const v0, 0x3f35c28f    # 0.71f

    .line 765
    .line 766
    .line 767
    const v2, 0x3f028f5c    # 0.51f

    .line 768
    .line 769
    .line 770
    const v4, -0x416b851f    # -0.29f

    .line 771
    .line 772
    .line 773
    const v6, -0x42333333    # -0.1f

    .line 774
    .line 775
    .line 776
    invoke-virtual {v12, v2, v6, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 780
    .line 781
    const/high16 v2, 0x40400000    # 3.0f

    .line 782
    .line 783
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const/16 v17, 0x0

    .line 787
    .line 788
    const v18, -0x404b851f    # -1.41f

    .line 789
    .line 790
    .line 791
    const v13, 0x3ec7ae14    # 0.39f

    .line 792
    .line 793
    .line 794
    const v14, -0x413851ec    # -0.39f

    .line 795
    .line 796
    .line 797
    const v15, 0x3ec7ae14    # 0.39f

    .line 798
    .line 799
    .line 800
    const v16, -0x407d70a4    # -1.02f

    .line 801
    .line 802
    .line 803
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v0, 0x4114a3d7    # 9.29f

    .line 807
    .line 808
    .line 809
    const v2, 0x414b5c29    # 12.71f

    .line 810
    .line 811
    .line 812
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v0, 0x416947ae    # 14.58f

    .line 819
    .line 820
    .line 821
    const/high16 v2, 0x41400000    # 12.0f

    .line 822
    .line 823
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const v0, 0x41268f5c    # 10.41f

    .line 827
    .line 828
    .line 829
    const/high16 v2, 0x41500000    # 13.0f

    .line 830
    .line 831
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    const v0, 0x41368f5c    # 11.41f

    .line 835
    .line 836
    .line 837
    const/high16 v2, 0x41400000    # 12.0f

    .line 838
    .line 839
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const v0, 0x415970a4    # 13.59f

    .line 843
    .line 844
    .line 845
    const/high16 v2, 0x41500000    # 13.0f

    .line 846
    .line 847
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    const v0, 0x416947ae    # 14.58f

    .line 851
    .line 852
    .line 853
    const/high16 v2, 0x41400000    # 12.0f

    .line 854
    .line 855
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 862
    .line 863
    .line 864
    move-result-object v2

    .line 865
    const/16 v16, 0x3800

    .line 866
    .line 867
    const/16 v17, 0x0

    .line 868
    .line 869
    const/high16 v6, 0x3f800000    # 1.0f

    .line 870
    .line 871
    const/4 v7, 0x0

    .line 872
    const/high16 v12, 0x3f800000    # 1.0f

    .line 873
    .line 874
    const/4 v13, 0x0

    .line 875
    const/4 v14, 0x0

    .line 876
    const/4 v15, 0x0

    .line 877
    const-string v4, ""

    .line 878
    .line 879
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    sput-object v0, Landroidx/compose/material/icons/twotone/BreakfastDiningKt;->_breakfastDining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 888
    .line 889
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 890
    .line 891
    .line 892
    return-object v0
.end method
