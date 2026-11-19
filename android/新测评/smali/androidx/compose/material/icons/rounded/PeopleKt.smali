.class public final Landroidx/compose/material/icons/rounded/PeopleKt;
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
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getPeople",
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
        "SMAP\nPeople.kt\nKotlin\n*S Kotlin\n*F\n+ 1 People.kt\nandroidx/compose/material/icons/rounded/PeopleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,69:1\n212#2,12:70\n233#2,18:83\n253#2:120\n174#3:82\n705#4,2:101\n717#4,2:103\n719#4,11:109\n72#5,4:105\n*S KotlinDebug\n*F\n+ 1 People.kt\nandroidx/compose/material/icons/rounded/PeopleKt\n*L\n29#1:70,12\n30#1:83,18\n30#1:120\n29#1:82\n30#1:101,2\n30#1:103,2\n30#1:109,11\n30#1:105,4\n*E\n"
    }
.end annotation


# static fields
.field private static _people:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPeople(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PeopleKt;->_people:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.People"

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
    const/high16 v0, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v2, 0x41800000    # 16.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x403f5c29    # 2.99f

    .line 78
    .line 79
    .line 80
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 81
    .line 82
    const v13, 0x3fd47ae1    # 1.66f

    .line 83
    .line 84
    .line 85
    const/4 v14, 0x0

    .line 86
    const v15, 0x403f5c29    # 2.99f

    .line 87
    .line 88
    .line 89
    const v16, -0x40547ae1    # -1.34f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v0, 0x418d47ae    # 17.66f

    .line 96
    .line 97
    .line 98
    const/high16 v4, 0x40a00000    # 5.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 104
    .line 105
    const v2, 0x3fab851f    # 1.34f

    .line 106
    .line 107
    .line 108
    const/high16 v4, 0x40400000    # 3.0f

    .line 109
    .line 110
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v0, 0x3fab851f    # 1.34f

    .line 114
    .line 115
    .line 116
    const/high16 v2, 0x40400000    # 3.0f

    .line 117
    .line 118
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x41300000    # 11.0f

    .line 125
    .line 126
    const/high16 v2, 0x41000000    # 8.0f

    .line 127
    .line 128
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, 0x411a8f5c    # 9.66f

    .line 135
    .line 136
    .line 137
    const/high16 v4, 0x40a00000    # 5.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, 0x40cae148    # 6.34f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v0, 0x3fab851f    # 1.34f

    .line 149
    .line 150
    .line 151
    const/high16 v2, 0x40400000    # 3.0f

    .line 152
    .line 153
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v0, 0x41500000    # 13.0f

    .line 160
    .line 161
    const/high16 v2, 0x41000000    # 8.0f

    .line 162
    .line 163
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v17, -0x3f200000    # -7.0f

    .line 167
    .line 168
    const/high16 v18, 0x40600000    # 3.5f

    .line 169
    .line 170
    const v13, -0x3feae148    # -2.33f

    .line 171
    .line 172
    .line 173
    const/high16 v15, -0x3f200000    # -7.0f

    .line 174
    .line 175
    const v16, 0x3f95c28f    # 1.17f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v0, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/high16 v2, 0x41900000    # 18.0f

    .line 184
    .line 185
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v17, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/high16 v18, 0x3f800000    # 1.0f

    .line 191
    .line 192
    const/4 v13, 0x0

    .line 193
    const v14, 0x3f0ccccd    # 0.55f

    .line 194
    .line 195
    .line 196
    const v15, 0x3ee66666    # 0.45f

    .line 197
    .line 198
    .line 199
    const/high16 v16, 0x3f800000    # 1.0f

    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x41400000    # 12.0f

    .line 205
    .line 206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v18, -0x40800000    # -1.0f

    .line 210
    .line 211
    const v13, 0x3f0ccccd    # 0.55f

    .line 212
    .line 213
    .line 214
    const/4 v14, 0x0

    .line 215
    const/high16 v15, 0x3f800000    # 1.0f

    .line 216
    .line 217
    const v16, -0x4119999a    # -0.45f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, -0x40400000    # -1.5f

    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, -0x3f200000    # -7.0f

    .line 229
    .line 230
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 231
    .line 232
    const/4 v13, 0x0

    .line 233
    const v14, -0x3feae148    # -2.33f

    .line 234
    .line 235
    .line 236
    const v15, -0x3f6a8f5c    # -4.67f

    .line 237
    .line 238
    .line 239
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v0, 0x41500000    # 13.0f

    .line 248
    .line 249
    const/high16 v2, 0x41800000    # 16.0f

    .line 250
    .line 251
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, -0x4087ae14    # -0.97f

    .line 255
    .line 256
    .line 257
    const v18, 0x3d4ccccd    # 0.05f

    .line 258
    .line 259
    .line 260
    const v13, -0x416b851f    # -0.29f

    .line 261
    .line 262
    .line 263
    const/4 v14, 0x0

    .line 264
    const v15, -0x40e147ae    # -0.62f

    .line 265
    .line 266
    .line 267
    const v16, 0x3ca3d70a    # 0.02f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, 0x3d23d70a    # 0.04f

    .line 274
    .line 275
    .line 276
    const v18, 0x3d23d70a    # 0.04f

    .line 277
    .line 278
    .line 279
    const v13, 0x3ca3d70a    # 0.02f

    .line 280
    .line 281
    .line 282
    const v14, 0x3c23d70a    # 0.01f

    .line 283
    .line 284
    .line 285
    const v15, 0x3cf5c28f    # 0.03f

    .line 286
    .line 287
    .line 288
    const v16, 0x3cf5c28f    # 0.03f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, 0x3ff70a3d    # 1.93f

    .line 295
    .line 296
    .line 297
    const v18, 0x405a3d71    # 3.41f

    .line 298
    .line 299
    .line 300
    const v13, 0x3f91eb85    # 1.14f

    .line 301
    .line 302
    .line 303
    const v14, 0x3f547ae1    # 0.83f

    .line 304
    .line 305
    .line 306
    const v15, 0x3ff70a3d    # 1.93f

    .line 307
    .line 308
    .line 309
    const v16, 0x3ff851ec    # 1.94f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v0, 0x41880000    # 17.0f

    .line 316
    .line 317
    const/high16 v2, 0x41900000    # 18.0f

    .line 318
    .line 319
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v17, -0x41c7ae14    # -0.18f

    .line 323
    .line 324
    .line 325
    const/high16 v18, 0x3f800000    # 1.0f

    .line 326
    .line 327
    const/4 v13, 0x0

    .line 328
    const v14, 0x3eb33333    # 0.35f

    .line 329
    .line 330
    .line 331
    const v15, -0x4270a3d7    # -0.07f

    .line 332
    .line 333
    .line 334
    const v16, 0x3f30a3d7    # 0.69f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x41b00000    # 22.0f

    .line 341
    .line 342
    const/high16 v2, 0x41980000    # 19.0f

    .line 343
    .line 344
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v17, 0x3f800000    # 1.0f

    .line 348
    .line 349
    const/high16 v18, -0x40800000    # -1.0f

    .line 350
    .line 351
    const v13, 0x3f0ccccd    # 0.55f

    .line 352
    .line 353
    .line 354
    const/4 v14, 0x0

    .line 355
    const/high16 v15, 0x3f800000    # 1.0f

    .line 356
    .line 357
    const v16, -0x4119999a    # -0.45f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v0, -0x40400000    # -1.5f

    .line 364
    .line 365
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v17, -0x3f200000    # -7.0f

    .line 369
    .line 370
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 371
    .line 372
    const/4 v13, 0x0

    .line 373
    const v14, -0x3feae148    # -2.33f

    .line 374
    .line 375
    .line 376
    const v15, -0x3f6a8f5c    # -4.67f

    .line 377
    .line 378
    .line 379
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    const/16 v16, 0x3800

    .line 392
    .line 393
    const/16 v17, 0x0

    .line 394
    .line 395
    const/high16 v6, 0x3f800000    # 1.0f

    .line 396
    .line 397
    const/high16 v8, 0x3f800000    # 1.0f

    .line 398
    .line 399
    const/4 v7, 0x0

    .line 400
    const/high16 v9, 0x3f800000    # 1.0f

    .line 401
    .line 402
    const/high16 v12, 0x3f800000    # 1.0f

    .line 403
    .line 404
    const/4 v14, 0x0

    .line 405
    const/4 v15, 0x0

    .line 406
    const-string v4, ""

    .line 407
    .line 408
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    sput-object v0, Landroidx/compose/material/icons/rounded/PeopleKt;->_people:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 417
    .line 418
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    return-object v0
.end method
