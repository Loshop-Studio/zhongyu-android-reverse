.class public final Landroidx/compose/material/icons/twotone/Person3Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_person3",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Person3",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPerson3",
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
        "SMAP\nPerson3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Person3.kt\nandroidx/compose/material/icons/twotone/Person3Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,109:1\n212#2,12:110\n233#2,18:123\n253#2:160\n233#2,18:161\n253#2:198\n233#2,18:199\n253#2:236\n233#2,18:237\n253#2:274\n174#3:122\n705#4,2:141\n717#4,2:143\n719#4,11:149\n705#4,2:179\n717#4,2:181\n719#4,11:187\n705#4,2:217\n717#4,2:219\n719#4,11:225\n705#4,2:255\n717#4,2:257\n719#4,11:263\n72#5,4:145\n72#5,4:183\n72#5,4:221\n72#5,4:259\n*S KotlinDebug\n*F\n+ 1 Person3.kt\nandroidx/compose/material/icons/twotone/Person3Kt\n*L\n29#1:110,12\n30#1:123,18\n30#1:160\n45#1:161,18\n45#1:198\n56#1:199,18\n56#1:236\n76#1:237,18\n76#1:274\n29#1:122\n30#1:141,2\n30#1:143,2\n30#1:149,11\n45#1:179,2\n45#1:181,2\n45#1:187,11\n56#1:217,2\n56#1:219,2\n56#1:225,11\n76#1:255,2\n76#1:257,2\n76#1:263,11\n30#1:145,4\n45#1:183,4\n56#1:221,4\n76#1:259,4\n*E\n"
    }
.end annotation


# static fields
.field private static _person3:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPerson3(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/Person3Kt;->_person3:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Person3"

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
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/high16 v4, 0x40800000    # 4.0f

    .line 76
    .line 77
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const v25, 0x3f428f5c    # 0.76f

    .line 81
    .line 82
    .line 83
    const v26, -0x402f5c29    # -1.63f

    .line 84
    .line 85
    .line 86
    const v21, 0x3f4ccccd    # 0.8f

    .line 87
    .line 88
    .line 89
    const/16 v22, 0x0

    .line 90
    .line 91
    const v23, 0x3fab851f    # 1.34f

    .line 92
    .line 93
    .line 94
    const v24, -0x408f5c29    # -0.94f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v25, -0x417ae148    # -0.26f

    .line 103
    .line 104
    .line 105
    const v26, -0x3fe851ec    # -2.37f

    .line 106
    .line 107
    .line 108
    const v21, -0x40a147ae    # -0.87f

    .line 109
    .line 110
    .line 111
    const v22, -0x407ae148    # -1.04f

    .line 112
    .line 113
    .line 114
    const v23, -0x417ae148    # -0.26f

    .line 115
    .line 116
    .line 117
    const/high16 v24, -0x40000000    # -2.0f

    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v25, -0x40e147ae    # -0.62f

    .line 123
    .line 124
    .line 125
    const v26, -0x40947ae1    # -0.92f

    .line 126
    .line 127
    .line 128
    const/16 v21, 0x0

    .line 129
    .line 130
    const v22, -0x412e147b    # -0.41f

    .line 131
    .line 132
    .line 133
    const v23, -0x418a3d71    # -0.24f

    .line 134
    .line 135
    .line 136
    const v24, -0x40bae148    # -0.77f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v25, -0x40c00000    # -0.75f

    .line 143
    .line 144
    const v26, -0x40f5c28f    # -0.54f

    .line 145
    .line 146
    .line 147
    const v21, -0x416b851f    # -0.29f

    .line 148
    .line 149
    .line 150
    const v22, -0x420a3d71    # -0.12f

    .line 151
    .line 152
    .line 153
    const v23, -0x40f33333    # -0.55f

    .line 154
    .line 155
    .line 156
    const v24, -0x416147ae    # -0.31f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v25, 0x41400000    # 12.0f

    .line 163
    .line 164
    const/high16 v26, 0x40800000    # 4.0f

    .line 165
    .line 166
    const v21, 0x414f5c29    # 12.96f

    .line 167
    .line 168
    .line 169
    const v22, 0x408a8f5c    # 4.33f

    .line 170
    .line 171
    .line 172
    const v23, 0x414947ae    # 12.58f

    .line 173
    .line 174
    .line 175
    const/high16 v24, 0x40800000    # 4.0f

    .line 176
    .line 177
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v4, -0x408a3d71    # -0.96f

    .line 181
    .line 182
    .line 183
    const v6, -0x406f5c29    # -1.13f

    .line 184
    .line 185
    .line 186
    const v7, 0x3f07ae14    # 0.53f

    .line 187
    .line 188
    .line 189
    const v8, 0x3ea8f5c3    # 0.33f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v4, v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v25, -0x40c00000    # -0.75f

    .line 196
    .line 197
    const v26, 0x3f0a3d71    # 0.54f

    .line 198
    .line 199
    .line 200
    const v21, -0x41b33333    # -0.2f

    .line 201
    .line 202
    .line 203
    const v22, 0x3e75c28f    # 0.24f

    .line 204
    .line 205
    .line 206
    const v23, -0x41147ae1    # -0.46f

    .line 207
    .line 208
    .line 209
    const v24, 0x3ed70a3d    # 0.42f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v25, 0x41180000    # 9.5f

    .line 216
    .line 217
    const/high16 v26, 0x40c00000    # 6.0f

    .line 218
    .line 219
    const v21, 0x411bd70a    # 9.74f

    .line 220
    .line 221
    .line 222
    const v22, 0x40a75c29    # 5.23f

    .line 223
    .line 224
    .line 225
    const/high16 v23, 0x41180000    # 9.5f

    .line 226
    .line 227
    const v24, 0x40b2e148    # 5.59f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v25, -0x417ae148    # -0.26f

    .line 234
    .line 235
    .line 236
    const v26, 0x4017ae14    # 2.37f

    .line 237
    .line 238
    .line 239
    const/16 v21, 0x0

    .line 240
    .line 241
    const v22, 0x3ebd70a4    # 0.37f

    .line 242
    .line 243
    .line 244
    const v23, 0x3f1c28f6    # 0.61f

    .line 245
    .line 246
    .line 247
    const v24, 0x3faa3d71    # 1.33f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v25, 0x41200000    # 10.0f

    .line 254
    .line 255
    const/high16 v26, 0x41200000    # 10.0f

    .line 256
    .line 257
    const v21, 0x410a8f5c    # 8.66f

    .line 258
    .line 259
    .line 260
    const v22, 0x4110f5c3    # 9.06f

    .line 261
    .line 262
    .line 263
    const v23, 0x41133333    # 9.2f

    .line 264
    .line 265
    .line 266
    const/high16 v24, 0x41200000    # 10.0f

    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    const/16 v16, 0x3800

    .line 279
    .line 280
    const/16 v17, 0x0

    .line 281
    .line 282
    const v6, 0x3e99999a    # 0.3f

    .line 283
    .line 284
    .line 285
    const v8, 0x3e99999a    # 0.3f

    .line 286
    .line 287
    .line 288
    const/4 v7, 0x0

    .line 289
    const/high16 v9, 0x3f800000    # 1.0f

    .line 290
    .line 291
    const/high16 v12, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const/4 v13, 0x0

    .line 294
    const/4 v14, 0x0

    .line 295
    const/4 v15, 0x0

    .line 296
    const-string v4, ""

    .line 297
    .line 298
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 299
    .line 300
    .line 301
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 306
    .line 307
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 308
    .line 309
    .line 310
    move-result-wide v6

    .line 311
    const/4 v2, 0x0

    .line 312
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 316
    .line 317
    .line 318
    move-result v10

    .line 319
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 320
    .line 321
    .line 322
    move-result v11

    .line 323
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 326
    .line 327
    .line 328
    const v4, 0x418bd70a    # 17.48f

    .line 329
    .line 330
    .line 331
    const v6, 0x4182b852    # 16.34f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v25, 0x41400000    # 12.0f

    .line 338
    .line 339
    const/high16 v26, 0x41700000    # 15.0f

    .line 340
    .line 341
    const v21, 0x418251ec    # 16.29f

    .line 342
    .line 343
    .line 344
    const v22, 0x417bae14    # 15.73f

    .line 345
    .line 346
    .line 347
    const v23, 0x4165eb85    # 14.37f

    .line 348
    .line 349
    .line 350
    const/high16 v24, 0x41700000    # 15.0f

    .line 351
    .line 352
    move-object/from16 v20, v2

    .line 353
    .line 354
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v25, -0x3f50a3d7    # -5.48f

    .line 358
    .line 359
    .line 360
    const v26, 0x3fab851f    # 1.34f

    .line 361
    .line 362
    .line 363
    const v21, -0x3fe851ec    # -2.37f

    .line 364
    .line 365
    .line 366
    const/16 v22, 0x0

    .line 367
    .line 368
    const v23, -0x3f76b852    # -4.29f

    .line 369
    .line 370
    .line 371
    const v24, 0x3f3ae148    # 0.73f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v25, 0x40c00000    # 6.0f

    .line 378
    .line 379
    const v26, 0x4189c28f    # 17.22f

    .line 380
    .line 381
    .line 382
    const v21, 0x40c66666    # 6.2f

    .line 383
    .line 384
    .line 385
    const/high16 v22, 0x41840000    # 16.5f

    .line 386
    .line 387
    const/high16 v23, 0x40c00000    # 6.0f

    .line 388
    .line 389
    const v24, 0x4186b852    # 16.84f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v4, 0x41900000    # 18.0f

    .line 396
    .line 397
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v4, 0x41400000    # 12.0f

    .line 401
    .line 402
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v4, -0x40b851ec    # -0.78f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v25, 0x418bd70a    # 17.48f

    .line 412
    .line 413
    .line 414
    const v26, 0x4182b852    # 16.34f

    .line 415
    .line 416
    .line 417
    const/high16 v21, 0x41900000    # 18.0f

    .line 418
    .line 419
    const v22, 0x4186b852    # 16.84f

    .line 420
    .line 421
    .line 422
    const v23, 0x418e6666    # 17.8f

    .line 423
    .line 424
    .line 425
    const/high16 v24, 0x41840000    # 16.5f

    .line 426
    .line 427
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    const v6, 0x3e99999a    # 0.3f

    .line 438
    .line 439
    .line 440
    const/4 v7, 0x0

    .line 441
    const-string v4, ""

    .line 442
    .line 443
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 444
    .line 445
    .line 446
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 447
    .line 448
    .line 449
    move-result v3

    .line 450
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 451
    .line 452
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 453
    .line 454
    .line 455
    move-result-wide v6

    .line 456
    const/4 v2, 0x0

    .line 457
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 461
    .line 462
    .line 463
    move-result v10

    .line 464
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 465
    .line 466
    .line 467
    move-result v11

    .line 468
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 471
    .line 472
    .line 473
    const v4, 0x41931eb8    # 18.39f

    .line 474
    .line 475
    .line 476
    const v6, 0x4168f5c3    # 14.56f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v25, 0x41400000    # 12.0f

    .line 483
    .line 484
    const/high16 v26, 0x41500000    # 13.0f

    .line 485
    .line 486
    const v21, 0x4185ae14    # 16.71f

    .line 487
    .line 488
    .line 489
    const v22, 0x415b3333    # 13.7f

    .line 490
    .line 491
    .line 492
    const v23, 0x41687ae1    # 14.53f

    .line 493
    .line 494
    .line 495
    const/high16 v24, 0x41500000    # 13.0f

    .line 496
    .line 497
    move-object/from16 v20, v2

    .line 498
    .line 499
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v25, -0x3f33851f    # -6.39f

    .line 503
    .line 504
    .line 505
    const v26, 0x3fc7ae14    # 1.56f

    .line 506
    .line 507
    .line 508
    const v21, -0x3fde147b    # -2.53f

    .line 509
    .line 510
    .line 511
    const/16 v22, 0x0

    .line 512
    .line 513
    const v23, -0x3f6947ae    # -4.71f

    .line 514
    .line 515
    .line 516
    const v24, 0x3f333333    # 0.7f

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v25, 0x40800000    # 4.0f

    .line 523
    .line 524
    const v26, 0x4189c28f    # 17.22f

    .line 525
    .line 526
    .line 527
    const v21, 0x4093851f    # 4.61f

    .line 528
    .line 529
    .line 530
    const v22, 0x41711eb8    # 15.07f

    .line 531
    .line 532
    .line 533
    const/high16 v23, 0x40800000    # 4.0f

    .line 534
    .line 535
    const v24, 0x4180cccd    # 16.1f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v4, 0x41a00000    # 20.0f

    .line 542
    .line 543
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v4, 0x41800000    # 16.0f

    .line 547
    .line 548
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v4, -0x3fce147b    # -2.78f

    .line 552
    .line 553
    .line 554
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v25, 0x41931eb8    # 18.39f

    .line 558
    .line 559
    .line 560
    const v26, 0x4168f5c3    # 14.56f

    .line 561
    .line 562
    .line 563
    const/high16 v21, 0x41a00000    # 20.0f

    .line 564
    .line 565
    const v22, 0x4180cccd    # 16.1f

    .line 566
    .line 567
    .line 568
    const v23, 0x419b1eb8    # 19.39f

    .line 569
    .line 570
    .line 571
    const v24, 0x41711eb8    # 15.07f

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v4, 0x41900000    # 18.0f

    .line 581
    .line 582
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v4, 0x40c00000    # 6.0f

    .line 586
    .line 587
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v4, -0x40b851ec    # -0.78f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v25, 0x3f051eb8    # 0.52f

    .line 597
    .line 598
    .line 599
    const v26, -0x409eb852    # -0.88f

    .line 600
    .line 601
    .line 602
    const/16 v21, 0x0

    .line 603
    .line 604
    const v22, -0x413d70a4    # -0.38f

    .line 605
    .line 606
    .line 607
    const v23, 0x3e4ccccd    # 0.2f

    .line 608
    .line 609
    .line 610
    const v24, -0x40c7ae14    # -0.72f

    .line 611
    .line 612
    .line 613
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v25, 0x41400000    # 12.0f

    .line 617
    .line 618
    const/high16 v26, 0x41700000    # 15.0f

    .line 619
    .line 620
    const v21, 0x40f6b852    # 7.71f

    .line 621
    .line 622
    .line 623
    const v22, 0x417bae14    # 15.73f

    .line 624
    .line 625
    .line 626
    const v23, 0x411a147b    # 9.63f

    .line 627
    .line 628
    .line 629
    const/high16 v24, 0x41700000    # 15.0f

    .line 630
    .line 631
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v25, 0x40af5c29    # 5.48f

    .line 635
    .line 636
    .line 637
    const v26, 0x3fab851f    # 1.34f

    .line 638
    .line 639
    .line 640
    const v21, 0x4017ae14    # 2.37f

    .line 641
    .line 642
    .line 643
    const/16 v22, 0x0

    .line 644
    .line 645
    const v23, 0x408947ae    # 4.29f

    .line 646
    .line 647
    .line 648
    const v24, 0x3f3ae148    # 0.73f

    .line 649
    .line 650
    .line 651
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/high16 v25, 0x41900000    # 18.0f

    .line 655
    .line 656
    const v26, 0x4189c28f    # 17.22f

    .line 657
    .line 658
    .line 659
    const v21, 0x418e6666    # 17.8f

    .line 660
    .line 661
    .line 662
    const/high16 v22, 0x41840000    # 16.5f

    .line 663
    .line 664
    const/high16 v23, 0x41900000    # 18.0f

    .line 665
    .line 666
    const v24, 0x4186b852    # 16.84f

    .line 667
    .line 668
    .line 669
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const/high16 v4, 0x41900000    # 18.0f

    .line 673
    .line 674
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    const/high16 v6, 0x3f800000    # 1.0f

    .line 685
    .line 686
    const/high16 v8, 0x3f800000    # 1.0f

    .line 687
    .line 688
    const/4 v7, 0x0

    .line 689
    const-string v4, ""

    .line 690
    .line 691
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 692
    .line 693
    .line 694
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 695
    .line 696
    .line 697
    move-result v3

    .line 698
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 699
    .line 700
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 701
    .line 702
    .line 703
    move-result-wide v6

    .line 704
    const/4 v0, 0x0

    .line 705
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 706
    .line 707
    .line 708
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 709
    .line 710
    .line 711
    move-result v10

    .line 712
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 713
    .line 714
    .line 715
    move-result v11

    .line 716
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 719
    .line 720
    .line 721
    const/high16 v0, 0x41400000    # 12.0f

    .line 722
    .line 723
    const/high16 v2, 0x41200000    # 10.0f

    .line 724
    .line 725
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const/high16 v17, 0x40800000    # 4.0f

    .line 729
    .line 730
    const/16 v18, 0x0

    .line 731
    .line 732
    const v13, 0x3e2e147b    # 0.17f

    .line 733
    .line 734
    .line 735
    const v15, 0x40751eb8    # 3.83f

    .line 736
    .line 737
    .line 738
    const/16 v16, 0x0

    .line 739
    .line 740
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const/high16 v17, 0x40400000    # 3.0f

    .line 744
    .line 745
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 746
    .line 747
    const v13, 0x3fd47ae1    # 1.66f

    .line 748
    .line 749
    .line 750
    const/high16 v15, 0x40400000    # 3.0f

    .line 751
    .line 752
    const v16, -0x40547ae1    # -1.34f

    .line 753
    .line 754
    .line 755
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const v17, -0x40ca3d71    # -0.71f

    .line 759
    .line 760
    .line 761
    const v18, -0x400a3d71    # -1.92f

    .line 762
    .line 763
    .line 764
    const/4 v13, 0x0

    .line 765
    const v14, -0x40c51eb8    # -0.73f

    .line 766
    .line 767
    .line 768
    const v15, -0x4175c28f    # -0.27f

    .line 769
    .line 770
    .line 771
    const v16, -0x404ccccd    # -1.4f

    .line 772
    .line 773
    .line 774
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    const/high16 v17, 0x41840000    # 16.5f

    .line 778
    .line 779
    const/high16 v18, 0x40c00000    # 6.0f

    .line 780
    .line 781
    const v13, 0x41835c29    # 16.42f

    .line 782
    .line 783
    .line 784
    const/high16 v14, 0x40d80000    # 6.75f

    .line 785
    .line 786
    const/high16 v15, 0x41840000    # 16.5f

    .line 787
    .line 788
    const v16, 0x40cc28f6    # 6.38f

    .line 789
    .line 790
    .line 791
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const v17, -0x4011eb85    # -1.86f

    .line 795
    .line 796
    .line 797
    const v18, -0x3fceb852    # -2.77f

    .line 798
    .line 799
    .line 800
    const/4 v13, 0x0

    .line 801
    const/high16 v14, -0x40600000    # -1.25f

    .line 802
    .line 803
    const v15, -0x40bae148    # -0.77f

    .line 804
    .line 805
    .line 806
    const v16, -0x3feb851f    # -2.32f

    .line 807
    .line 808
    .line 809
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const/high16 v17, 0x41400000    # 12.0f

    .line 813
    .line 814
    const/high16 v18, 0x40000000    # 2.0f

    .line 815
    .line 816
    const/high16 v13, 0x41600000    # 14.0f

    .line 817
    .line 818
    const v14, 0x401eb852    # 2.48f

    .line 819
    .line 820
    .line 821
    const v15, 0x4150f5c3    # 13.06f

    .line 822
    .line 823
    .line 824
    const/high16 v16, 0x40000000    # 2.0f

    .line 825
    .line 826
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const v0, -0x3fd70a3d    # -2.64f

    .line 830
    .line 831
    .line 832
    const v2, 0x3f9d70a4    # 1.23f

    .line 833
    .line 834
    .line 835
    const/high16 v4, -0x40000000    # -2.0f

    .line 836
    .line 837
    const v6, 0x3ef5c28f    # 0.48f

    .line 838
    .line 839
    .line 840
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const/high16 v17, 0x40f00000    # 7.5f

    .line 844
    .line 845
    const/high16 v18, 0x40c00000    # 6.0f

    .line 846
    .line 847
    const v13, 0x410451ec    # 8.27f

    .line 848
    .line 849
    .line 850
    const v14, 0x406b851f    # 3.68f

    .line 851
    .line 852
    .line 853
    const/high16 v15, 0x40f00000    # 7.5f

    .line 854
    .line 855
    const/high16 v16, 0x40980000    # 4.75f

    .line 856
    .line 857
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    const v17, 0x3e570a3d    # 0.21f

    .line 861
    .line 862
    .line 863
    const v18, 0x3f8a3d71    # 1.08f

    .line 864
    .line 865
    .line 866
    const/4 v13, 0x0

    .line 867
    const v14, 0x3ec28f5c    # 0.38f

    .line 868
    .line 869
    .line 870
    const v15, 0x3da3d70a    # 0.08f

    .line 871
    .line 872
    .line 873
    const/high16 v16, 0x3f400000    # 0.75f

    .line 874
    .line 875
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    const/high16 v17, 0x40e00000    # 7.0f

    .line 879
    .line 880
    const/high16 v18, 0x41100000    # 9.0f

    .line 881
    .line 882
    const v13, 0x40e8a3d7    # 7.27f

    .line 883
    .line 884
    .line 885
    const v14, 0x40f33333    # 7.6f

    .line 886
    .line 887
    .line 888
    const/high16 v15, 0x40e00000    # 7.0f

    .line 889
    .line 890
    const v16, 0x410451ec    # 8.27f

    .line 891
    .line 892
    .line 893
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 894
    .line 895
    .line 896
    const/high16 v17, 0x41200000    # 10.0f

    .line 897
    .line 898
    const/high16 v18, 0x41400000    # 12.0f

    .line 899
    .line 900
    const/high16 v13, 0x40e00000    # 7.0f

    .line 901
    .line 902
    const v14, 0x412a8f5c    # 10.66f

    .line 903
    .line 904
    .line 905
    const v15, 0x410570a4    # 8.34f

    .line 906
    .line 907
    .line 908
    const/high16 v16, 0x41400000    # 12.0f

    .line 909
    .line 910
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 911
    .line 912
    .line 913
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 914
    .line 915
    .line 916
    const v0, 0x4113d70a    # 9.24f

    .line 917
    .line 918
    .line 919
    const v2, 0x4105eb85    # 8.37f

    .line 920
    .line 921
    .line 922
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    const/high16 v17, 0x41180000    # 9.5f

    .line 926
    .line 927
    const/high16 v18, 0x40c00000    # 6.0f

    .line 928
    .line 929
    const v13, 0x4121c28f    # 10.11f

    .line 930
    .line 931
    .line 932
    const v14, 0x40ea8f5c    # 7.33f

    .line 933
    .line 934
    .line 935
    const/high16 v15, 0x41180000    # 9.5f

    .line 936
    .line 937
    const v16, 0x40cbd70a    # 6.37f

    .line 938
    .line 939
    .line 940
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 941
    .line 942
    .line 943
    const v17, 0x3f1eb852    # 0.62f

    .line 944
    .line 945
    .line 946
    const v18, -0x40947ae1    # -0.92f

    .line 947
    .line 948
    .line 949
    const/4 v13, 0x0

    .line 950
    const v14, -0x412e147b    # -0.41f

    .line 951
    .line 952
    .line 953
    const v15, 0x3e75c28f    # 0.24f

    .line 954
    .line 955
    .line 956
    const v16, -0x40bae148    # -0.77f

    .line 957
    .line 958
    .line 959
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    const/high16 v17, 0x3f400000    # 0.75f

    .line 963
    .line 964
    const v18, -0x40f5c28f    # -0.54f

    .line 965
    .line 966
    .line 967
    const v13, 0x3e947ae1    # 0.29f

    .line 968
    .line 969
    .line 970
    const v14, -0x420a3d71    # -0.12f

    .line 971
    .line 972
    .line 973
    const v15, 0x3f0ccccd    # 0.55f

    .line 974
    .line 975
    .line 976
    const v16, -0x416147ae    # -0.31f

    .line 977
    .line 978
    .line 979
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 980
    .line 981
    .line 982
    const/high16 v17, 0x41400000    # 12.0f

    .line 983
    .line 984
    const/high16 v18, 0x40800000    # 4.0f

    .line 985
    .line 986
    const v13, 0x4130a3d7    # 11.04f

    .line 987
    .line 988
    .line 989
    const v14, 0x408a8f5c    # 4.33f

    .line 990
    .line 991
    .line 992
    const v15, 0x4136b852    # 11.42f

    .line 993
    .line 994
    .line 995
    const/high16 v16, 0x40800000    # 4.0f

    .line 996
    .line 997
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 998
    .line 999
    .line 1000
    const v0, 0x3f75c28f    # 0.96f

    .line 1001
    .line 1002
    .line 1003
    const v2, 0x3f90a3d7    # 1.13f

    .line 1004
    .line 1005
    .line 1006
    const v4, 0x3f07ae14    # 0.53f

    .line 1007
    .line 1008
    .line 1009
    const v6, 0x3ea8f5c3    # 0.33f

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1013
    .line 1014
    .line 1015
    const/high16 v17, 0x3f400000    # 0.75f

    .line 1016
    .line 1017
    const v18, 0x3f0a3d71    # 0.54f

    .line 1018
    .line 1019
    .line 1020
    const v13, 0x3e4ccccd    # 0.2f

    .line 1021
    .line 1022
    .line 1023
    const v14, 0x3e75c28f    # 0.24f

    .line 1024
    .line 1025
    .line 1026
    const v15, 0x3eeb851f    # 0.46f

    .line 1027
    .line 1028
    .line 1029
    const v16, 0x3ed70a3d    # 0.42f

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1033
    .line 1034
    .line 1035
    const/high16 v17, 0x41680000    # 14.5f

    .line 1036
    .line 1037
    const/high16 v18, 0x40c00000    # 6.0f

    .line 1038
    .line 1039
    const v13, 0x416428f6    # 14.26f

    .line 1040
    .line 1041
    .line 1042
    const v14, 0x40a75c29    # 5.23f

    .line 1043
    .line 1044
    .line 1045
    const/high16 v15, 0x41680000    # 14.5f

    .line 1046
    .line 1047
    const v16, 0x40b2e148    # 5.59f

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1051
    .line 1052
    .line 1053
    const v17, 0x3e851eb8    # 0.26f

    .line 1054
    .line 1055
    .line 1056
    const v18, 0x4017ae14    # 2.37f

    .line 1057
    .line 1058
    .line 1059
    const/4 v13, 0x0

    .line 1060
    const v14, 0x3ebd70a4    # 0.37f

    .line 1061
    .line 1062
    .line 1063
    const v15, -0x40e3d70a    # -0.61f

    .line 1064
    .line 1065
    .line 1066
    const v16, 0x3faa3d71    # 1.33f

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1070
    .line 1071
    .line 1072
    const/high16 v17, 0x41600000    # 14.0f

    .line 1073
    .line 1074
    const/high16 v18, 0x41200000    # 10.0f

    .line 1075
    .line 1076
    const v13, 0x417570a4    # 15.34f

    .line 1077
    .line 1078
    .line 1079
    const v14, 0x4110f5c3    # 9.06f

    .line 1080
    .line 1081
    .line 1082
    const v15, 0x416ccccd    # 14.8f

    .line 1083
    .line 1084
    .line 1085
    const/high16 v16, 0x41200000    # 10.0f

    .line 1086
    .line 1087
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1088
    .line 1089
    .line 1090
    const/high16 v0, -0x3f800000    # -4.0f

    .line 1091
    .line 1092
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1093
    .line 1094
    .line 1095
    const v17, 0x4113d70a    # 9.24f

    .line 1096
    .line 1097
    .line 1098
    const v18, 0x4105eb85    # 8.37f

    .line 1099
    .line 1100
    .line 1101
    const v13, 0x41133333    # 9.2f

    .line 1102
    .line 1103
    .line 1104
    const/high16 v14, 0x41200000    # 10.0f

    .line 1105
    .line 1106
    const v15, 0x410a8f5c    # 8.66f

    .line 1107
    .line 1108
    .line 1109
    const v16, 0x4110f5c3    # 9.06f

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v2

    .line 1122
    const/16 v16, 0x3800

    .line 1123
    .line 1124
    const/16 v17, 0x0

    .line 1125
    .line 1126
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1127
    .line 1128
    const/4 v7, 0x0

    .line 1129
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1130
    .line 1131
    const/4 v13, 0x0

    .line 1132
    const/4 v14, 0x0

    .line 1133
    const/4 v15, 0x0

    .line 1134
    const-string v4, ""

    .line 1135
    .line 1136
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v0

    .line 1140
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v0

    .line 1144
    sput-object v0, Landroidx/compose/material/icons/twotone/Person3Kt;->_person3:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1145
    .line 1146
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1147
    .line 1148
    .line 1149
    return-object v0
.end method
