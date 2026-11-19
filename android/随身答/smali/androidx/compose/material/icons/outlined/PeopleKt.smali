.class public final Landroidx/compose/material/icons/outlined/PeopleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_people",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "People",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getPeople",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nPeople.kt\nKotlin\n*S Kotlin\n*F\n+ 1 People.kt\nandroidx/compose/material/icons/outlined/PeopleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,76:1\n212#2,12:77\n233#2,18:90\n253#2:127\n174#3:89\n705#4,2:108\n717#4,2:110\n719#4,11:116\n72#5,4:112\n*S KotlinDebug\n*F\n+ 1 People.kt\nandroidx/compose/material/icons/outlined/PeopleKt\n*L\n29#1:77,12\n30#1:90,18\n30#1:127\n29#1:89\n30#1:108,2\n30#1:110,2\n30#1:116,11\n30#1:112,4\n*E\n"
    }
.end annotation


# static fields
.field private static _people:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPeople(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PeopleKt;->_people:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.People"

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
    const/high16 v0, 0x415c0000    # 13.75f

    .line 71
    .line 72
    const/high16 v2, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3f200000    # -7.0f

    .line 78
    .line 79
    const/high16 v18, 0x40600000    # 3.5f

    .line 80
    .line 81
    const v13, -0x3fea3d71    # -2.34f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x3f200000    # -7.0f

    .line 86
    .line 87
    const v16, 0x3f95c28f    # 1.17f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, 0x40000000    # 2.0f

    .line 94
    .line 95
    const/high16 v2, 0x41980000    # 19.0f

    .line 96
    .line 97
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x41600000    # 14.0f

    .line 101
    .line 102
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v0, -0x40200000    # -1.75f

    .line 106
    .line 107
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 111
    .line 112
    const/4 v13, 0x0

    .line 113
    const v14, -0x3feae148    # -2.33f

    .line 114
    .line 115
    .line 116
    const v15, -0x3f6ae148    # -4.66f

    .line 117
    .line 118
    .line 119
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 120
    .line 121
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v0, 0x41880000    # 17.0f

    .line 128
    .line 129
    const v2, 0x408ae148    # 4.34f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, 0x40951eb8    # 4.66f

    .line 136
    .line 137
    .line 138
    const/high16 v18, -0x40600000    # -1.25f

    .line 139
    .line 140
    const v13, 0x3f570a3d    # 0.84f

    .line 141
    .line 142
    .line 143
    const v14, -0x40eb851f    # -0.58f

    .line 144
    .line 145
    .line 146
    const v15, 0x4037ae14    # 2.87f

    .line 147
    .line 148
    .line 149
    const/high16 v16, -0x40600000    # -1.25f

    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, 0x40951eb8    # 4.66f

    .line 155
    .line 156
    .line 157
    const/high16 v2, 0x3fa00000    # 1.25f

    .line 158
    .line 159
    const v4, 0x40747ae1    # 3.82f

    .line 160
    .line 161
    .line 162
    const v6, 0x3f2b851f    # 0.67f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, 0x41880000    # 17.0f

    .line 169
    .line 170
    const v2, 0x408ae148    # 4.34f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v0, 0x41400000    # 12.0f

    .line 180
    .line 181
    const/high16 v2, 0x41100000    # 9.0f

    .line 182
    .line 183
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v17, 0x40600000    # 3.5f

    .line 187
    .line 188
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 189
    .line 190
    const v13, 0x3ff70a3d    # 1.93f

    .line 191
    .line 192
    .line 193
    const/4 v14, 0x0

    .line 194
    const/high16 v15, 0x40600000    # 3.5f

    .line 195
    .line 196
    const v16, -0x40370a3d    # -1.57f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, 0x412ee148    # 10.93f

    .line 203
    .line 204
    .line 205
    const/high16 v2, 0x40a00000    # 5.0f

    .line 206
    .line 207
    const/high16 v4, 0x41100000    # 9.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, 0x40d23d71    # 6.57f

    .line 213
    .line 214
    .line 215
    const/high16 v2, 0x41080000    # 8.5f

    .line 216
    .line 217
    const/high16 v4, 0x40b00000    # 5.5f

    .line 218
    .line 219
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, 0x40e23d71    # 7.07f

    .line 223
    .line 224
    .line 225
    const/high16 v2, 0x41400000    # 12.0f

    .line 226
    .line 227
    const/high16 v4, 0x41100000    # 9.0f

    .line 228
    .line 229
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v0, 0x40e00000    # 7.0f

    .line 236
    .line 237
    const/high16 v2, 0x41100000    # 9.0f

    .line 238
    .line 239
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 243
    .line 244
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 245
    .line 246
    const v13, 0x3f547ae1    # 0.83f

    .line 247
    .line 248
    .line 249
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 250
    .line 251
    const v16, 0x3f2b851f    # 0.67f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, 0x411d47ae    # 9.83f

    .line 258
    .line 259
    .line 260
    const/high16 v2, 0x41200000    # 10.0f

    .line 261
    .line 262
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, -0x40d47ae1    # -0.67f

    .line 266
    .line 267
    .line 268
    const/high16 v2, -0x40400000    # -1.5f

    .line 269
    .line 270
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, 0x4102b852    # 8.17f

    .line 274
    .line 275
    .line 276
    const/high16 v2, 0x40e00000    # 7.0f

    .line 277
    .line 278
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, 0x418051ec    # 16.04f

    .line 285
    .line 286
    .line 287
    const v2, 0x415cf5c3    # 13.81f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v17, 0x3ffae148    # 1.96f

    .line 294
    .line 295
    .line 296
    const v18, 0x405c28f6    # 3.44f

    .line 297
    .line 298
    .line 299
    const v13, 0x3f947ae1    # 1.16f

    .line 300
    .line 301
    .line 302
    const v14, 0x3f570a3d    # 0.84f

    .line 303
    .line 304
    .line 305
    const v15, 0x3ffae148    # 1.96f

    .line 306
    .line 307
    .line 308
    const v16, 0x3ffae148    # 1.96f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v0, 0x41900000    # 18.0f

    .line 315
    .line 316
    const/high16 v2, 0x41980000    # 19.0f

    .line 317
    .line 318
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v0, 0x40800000    # 4.0f

    .line 322
    .line 323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, -0x40200000    # -1.75f

    .line 327
    .line 328
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v17, -0x3f4147ae    # -5.96f

    .line 332
    .line 333
    .line 334
    const v18, -0x3fa3d70a    # -3.44f

    .line 335
    .line 336
    .line 337
    const/4 v13, 0x0

    .line 338
    const v14, -0x3ffeb852    # -2.02f

    .line 339
    .line 340
    .line 341
    const/high16 v15, -0x3fa00000    # -3.5f

    .line 342
    .line 343
    const v16, -0x3fb51eb8    # -3.17f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v0, 0x41700000    # 15.0f

    .line 353
    .line 354
    const/high16 v2, 0x41400000    # 12.0f

    .line 355
    .line 356
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v17, 0x40600000    # 3.5f

    .line 360
    .line 361
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 362
    .line 363
    const v13, 0x3ff70a3d    # 1.93f

    .line 364
    .line 365
    .line 366
    const/4 v14, 0x0

    .line 367
    const/high16 v15, 0x40600000    # 3.5f

    .line 368
    .line 369
    const v16, -0x40370a3d    # -1.57f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, 0x418770a4    # 16.93f

    .line 376
    .line 377
    .line 378
    const/high16 v2, 0x41700000    # 15.0f

    .line 379
    .line 380
    const/high16 v4, 0x40a00000    # 5.0f

    .line 381
    .line 382
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v17, -0x40400000    # -1.5f

    .line 386
    .line 387
    const v18, 0x3eb33333    # 0.35f

    .line 388
    .line 389
    .line 390
    const v13, -0x40f5c28f    # -0.54f

    .line 391
    .line 392
    .line 393
    const v15, -0x407ae148    # -1.04f

    .line 394
    .line 395
    .line 396
    const v16, 0x3e051eb8    # 0.13f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v17, 0x3f800000    # 1.0f

    .line 403
    .line 404
    const v18, 0x4049999a    # 3.15f

    .line 405
    .line 406
    .line 407
    const v13, 0x3f2147ae    # 0.63f

    .line 408
    .line 409
    .line 410
    const v14, 0x3f63d70a    # 0.89f

    .line 411
    .line 412
    .line 413
    const/high16 v15, 0x3f800000    # 1.0f

    .line 414
    .line 415
    const v16, 0x3ffd70a4    # 1.98f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v0, -0x40800000    # -1.0f

    .line 422
    .line 423
    const v2, 0x4049999a    # 3.15f

    .line 424
    .line 425
    .line 426
    const v4, -0x41428f5c    # -0.37f

    .line 427
    .line 428
    .line 429
    const v6, 0x4010a3d7    # 2.26f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 436
    .line 437
    const v18, 0x3eb33333    # 0.35f

    .line 438
    .line 439
    .line 440
    const v13, 0x3eeb851f    # 0.46f

    .line 441
    .line 442
    .line 443
    const v14, 0x3e6147ae    # 0.22f

    .line 444
    .line 445
    .line 446
    const v15, 0x3f75c28f    # 0.96f

    .line 447
    .line 448
    .line 449
    const v16, 0x3eb33333    # 0.35f

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    const/16 v16, 0x3800

    .line 463
    .line 464
    const/16 v17, 0x0

    .line 465
    .line 466
    const/high16 v6, 0x3f800000    # 1.0f

    .line 467
    .line 468
    const/high16 v8, 0x3f800000    # 1.0f

    .line 469
    .line 470
    const/4 v7, 0x0

    .line 471
    const/high16 v9, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/high16 v12, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/4 v13, 0x0

    .line 476
    const/4 v14, 0x0

    .line 477
    const/4 v15, 0x0

    .line 478
    const-string v4, ""

    .line 479
    .line 480
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    sput-object v0, Landroidx/compose/material/icons/outlined/PeopleKt;->_people:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 489
    .line 490
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    return-object v0
.end method
