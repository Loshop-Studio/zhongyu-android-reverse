.class public final Landroidx/compose/material/icons/outlined/AccountCircleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_accountCircle",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AccountCircle",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getAccountCircle",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
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
        "SMAP\nAccountCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountCircle.kt\nandroidx/compose/material/icons/outlined/AccountCircleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n212#2,12:74\n233#2,18:87\n253#2:124\n233#2,18:125\n253#2:162\n174#3:86\n705#4,2:105\n717#4,2:107\n719#4,11:113\n705#4,2:143\n717#4,2:145\n719#4,11:151\n72#5,4:109\n72#5,4:147\n*S KotlinDebug\n*F\n+ 1 AccountCircle.kt\nandroidx/compose/material/icons/outlined/AccountCircleKt\n*L\n29#1:74,12\n30#1:87,18\n30#1:124\n54#1:125,18\n54#1:162\n29#1:86\n30#1:105,2\n30#1:107,2\n30#1:113,11\n54#1:143,2\n54#1:145,2\n54#1:151,11\n30#1:109,4\n54#1:147,4\n*E\n"
    }
.end annotation


# static fields
.field private static _accountCircle:Landroidx/compose/ui/graphics/vector/ImageVector;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public static final getAccountCircle(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27
    .param p0    # Landroidx/compose/material/icons/Icons$Outlined;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/AccountCircleKt;->_accountCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

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
    const-string v2, "Outlined.AccountCircle"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/e;)V

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
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

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
    const/high16 v2, 0x40000000    # 2.0f

    .line 66
    .line 67
    const/high16 v4, 0x41400000    # 12.0f

    .line 68
    .line 69
    invoke-static {v4, v2}, Lg/a;->a(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 70
    .line 71
    .line 72
    move-result-object v20

    .line 73
    const/high16 v25, 0x40000000    # 2.0f

    .line 74
    .line 75
    const/high16 v26, 0x41400000    # 12.0f

    .line 76
    .line 77
    const v21, 0x40cf5c29    # 6.48f

    .line 78
    .line 79
    .line 80
    const/high16 v22, 0x40000000    # 2.0f

    .line 81
    .line 82
    const/high16 v23, 0x40000000    # 2.0f

    .line 83
    .line 84
    const v24, 0x40cf5c29    # 6.48f

    .line 85
    .line 86
    .line 87
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    move-object/from16 v2, v20

    .line 91
    .line 92
    const v4, 0x408f5c29    # 4.48f

    .line 93
    .line 94
    .line 95
    const/high16 v6, 0x41200000    # 10.0f

    .line 96
    .line 97
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, -0x3f70a3d7    # -4.48f

    .line 101
    .line 102
    .line 103
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 104
    .line 105
    const/high16 v7, 0x41200000    # 10.0f

    .line 106
    .line 107
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v4, 0x418c28f6    # 17.52f

    .line 111
    .line 112
    .line 113
    const/high16 v6, 0x40000000    # 2.0f

    .line 114
    .line 115
    const/high16 v7, 0x41400000    # 12.0f

    .line 116
    .line 117
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v4, 0x41940000    # 18.5f

    .line 124
    .line 125
    const v6, 0x40eb3333    # 7.35f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v25, 0x41400000    # 12.0f

    .line 132
    .line 133
    const/high16 v26, 0x41880000    # 17.0f

    .line 134
    .line 135
    const v21, 0x410a8f5c    # 8.66f

    .line 136
    .line 137
    .line 138
    const v22, 0x418c7ae1    # 17.56f

    .line 139
    .line 140
    .line 141
    const v23, 0x412428f6    # 10.26f

    .line 142
    .line 143
    .line 144
    const/high16 v24, 0x41880000    # 17.0f

    .line 145
    .line 146
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v4, 0x3f0f5c29    # 0.56f

    .line 150
    .line 151
    .line 152
    const v6, 0x4094cccd    # 4.65f

    .line 153
    .line 154
    .line 155
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 156
    .line 157
    const v8, 0x4055c28f    # 3.34f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v26, 0x41a00000    # 20.0f

    .line 164
    .line 165
    const v21, 0x417570a4    # 15.34f

    .line 166
    .line 167
    .line 168
    const v22, 0x419b851f    # 19.44f

    .line 169
    .line 170
    .line 171
    const v23, 0x415bd70a    # 13.74f

    .line 172
    .line 173
    .line 174
    const/high16 v24, 0x41a00000    # 20.0f

    .line 175
    .line 176
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v4, 0x410a8f5c    # 8.66f

    .line 180
    .line 181
    .line 182
    const v6, 0x419b851f    # 19.44f

    .line 183
    .line 184
    .line 185
    const/high16 v7, 0x41940000    # 18.5f

    .line 186
    .line 187
    const v8, 0x40eb3333    # 7.35f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v4, v6, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v4, 0x4188f5c3    # 17.12f

    .line 197
    .line 198
    .line 199
    const v6, 0x41911eb8    # 18.14f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v26, 0x41700000    # 15.0f

    .line 209
    .line 210
    const v21, 0x4183999a    # 16.45f

    .line 211
    .line 212
    .line 213
    const v22, 0x417ccccd    # 15.8f

    .line 214
    .line 215
    .line 216
    const v23, 0x41651eb8    # 14.32f

    .line 217
    .line 218
    .line 219
    const/high16 v24, 0x41700000    # 15.0f

    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v4, -0x3f3b851f    # -6.14f

    .line 225
    .line 226
    .line 227
    const v6, 0x4007ae14    # 2.12f

    .line 228
    .line 229
    .line 230
    const v7, -0x3f71999a    # -4.45f

    .line 231
    .line 232
    .line 233
    const v8, 0x3f4ccccd    # 0.8f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/4 v4, 0x0

    .line 240
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v25, 0x40800000    # 4.0f

    .line 244
    .line 245
    const/high16 v26, 0x41400000    # 12.0f

    .line 246
    .line 247
    const v21, 0x40966666    # 4.7f

    .line 248
    .line 249
    .line 250
    const v22, 0x417bae14    # 15.73f

    .line 251
    .line 252
    .line 253
    const/high16 v23, 0x40800000    # 4.0f

    .line 254
    .line 255
    const v24, 0x415f3333    # 13.95f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v25, 0x41000000    # 8.0f

    .line 262
    .line 263
    const/high16 v26, -0x3f000000    # -8.0f

    .line 264
    .line 265
    const/16 v21, 0x0

    .line 266
    .line 267
    const v22, -0x3f728f5c    # -4.42f

    .line 268
    .line 269
    .line 270
    const v23, 0x40651eb8    # 3.58f

    .line 271
    .line 272
    .line 273
    const/high16 v24, -0x3f000000    # -8.0f

    .line 274
    .line 275
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v4, 0x40651eb8    # 3.58f

    .line 279
    .line 280
    .line 281
    const/high16 v6, 0x41000000    # 8.0f

    .line 282
    .line 283
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v25, 0x41911eb8    # 18.14f

    .line 287
    .line 288
    .line 289
    const v26, 0x4188f5c3    # 17.12f

    .line 290
    .line 291
    .line 292
    const/high16 v21, 0x41a00000    # 20.0f

    .line 293
    .line 294
    const v22, 0x415f3333    # 13.95f

    .line 295
    .line 296
    .line 297
    const v23, 0x419a6666    # 19.3f

    .line 298
    .line 299
    .line 300
    const v24, 0x417bae14    # 15.73f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    const/16 v16, 0x3800

    .line 314
    .line 315
    const/16 v17, 0x0

    .line 316
    .line 317
    const/high16 v6, 0x3f800000    # 1.0f

    .line 318
    .line 319
    const/high16 v8, 0x3f800000    # 1.0f

    .line 320
    .line 321
    const/4 v7, 0x0

    .line 322
    const/high16 v9, 0x3f800000    # 1.0f

    .line 323
    .line 324
    const/high16 v12, 0x3f800000    # 1.0f

    .line 325
    .line 326
    const/4 v13, 0x0

    .line 327
    const/4 v14, 0x0

    .line 328
    const/4 v15, 0x0

    .line 329
    const-string v4, ""

    .line 330
    .line 331
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 332
    .line 333
    .line 334
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 339
    .line 340
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 341
    .line 342
    .line 343
    move-result-wide v6

    .line 344
    const/4 v0, 0x0

    .line 345
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 349
    .line 350
    .line 351
    move-result v10

    .line 352
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 353
    .line 354
    .line 355
    move-result v11

    .line 356
    const/high16 v0, 0x40c00000    # 6.0f

    .line 357
    .line 358
    const/high16 v2, 0x41400000    # 12.0f

    .line 359
    .line 360
    invoke-static {v2, v0}, Lg/a;->a(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    move-result-object v12

    .line 364
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 365
    .line 366
    const/high16 v18, 0x40600000    # 3.5f

    .line 367
    .line 368
    const v13, -0x4008f5c3    # -1.93f

    .line 369
    .line 370
    .line 371
    const/high16 v15, -0x3fa00000    # -3.5f

    .line 372
    .line 373
    const v16, 0x3fc8f5c3    # 1.57f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, 0x41211eb8    # 10.07f

    .line 380
    .line 381
    .line 382
    const/high16 v2, 0x41500000    # 13.0f

    .line 383
    .line 384
    const/high16 v4, 0x41400000    # 12.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, -0x40370a3d    # -1.57f

    .line 390
    .line 391
    .line 392
    const/high16 v2, -0x3fa00000    # -3.5f

    .line 393
    .line 394
    const/high16 v4, 0x40600000    # 3.5f

    .line 395
    .line 396
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v0, 0x415ee148    # 13.93f

    .line 400
    .line 401
    .line 402
    const/high16 v2, 0x40c00000    # 6.0f

    .line 403
    .line 404
    const/high16 v4, 0x41400000    # 12.0f

    .line 405
    .line 406
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v0, 0x41300000    # 11.0f

    .line 413
    .line 414
    const/high16 v2, 0x41400000    # 12.0f

    .line 415
    .line 416
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v17, -0x40400000    # -1.5f

    .line 420
    .line 421
    const/high16 v18, -0x40400000    # -1.5f

    .line 422
    .line 423
    const v13, -0x40ab851f    # -0.83f

    .line 424
    .line 425
    .line 426
    const/high16 v15, -0x40400000    # -1.5f

    .line 427
    .line 428
    const v16, -0x40d47ae1    # -0.67f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v0, 0x4132b852    # 11.17f

    .line 435
    .line 436
    .line 437
    const/high16 v2, 0x41000000    # 8.0f

    .line 438
    .line 439
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, 0x3f2b851f    # 0.67f

    .line 443
    .line 444
    .line 445
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 446
    .line 447
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, 0x414d47ae    # 12.83f

    .line 451
    .line 452
    .line 453
    const/high16 v2, 0x41300000    # 11.0f

    .line 454
    .line 455
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    const/16 v16, 0x3800

    .line 466
    .line 467
    const/16 v17, 0x0

    .line 468
    .line 469
    const/high16 v6, 0x3f800000    # 1.0f

    .line 470
    .line 471
    const/4 v7, 0x0

    .line 472
    const/high16 v12, 0x3f800000    # 1.0f

    .line 473
    .line 474
    const/4 v13, 0x0

    .line 475
    const/4 v15, 0x0

    .line 476
    const-string v4, ""

    .line 477
    .line 478
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    sput-object v0, Landroidx/compose/material/icons/outlined/AccountCircleKt;->_accountCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 487
    .line 488
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    return-object v0
.end method
