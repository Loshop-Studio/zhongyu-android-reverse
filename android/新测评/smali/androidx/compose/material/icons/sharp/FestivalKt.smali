.class public final Landroidx/compose/material/icons/sharp/FestivalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_festival",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Festival",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getFestival",
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
        "SMAP\nFestival.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Festival.kt\nandroidx/compose/material/icons/sharp/FestivalKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,96:1\n212#2,12:97\n233#2,18:110\n253#2:147\n174#3:109\n705#4,2:128\n717#4,2:130\n719#4,11:136\n72#5,4:132\n*S KotlinDebug\n*F\n+ 1 Festival.kt\nandroidx/compose/material/icons/sharp/FestivalKt\n*L\n29#1:97,12\n30#1:110,18\n30#1:147\n29#1:109\n30#1:128,2\n30#1:130,2\n30#1:136,11\n30#1:132,4\n*E\n"
    }
.end annotation


# static fields
.field private static _festival:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFestival(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/FestivalKt;->_festival:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Festival"

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
    const/high16 v0, 0x41b80000    # 23.0f

    .line 71
    .line 72
    const/high16 v2, 0x41300000    # 11.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x41100000    # 9.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x3ed00000    # -11.0f

    .line 83
    .line 84
    const/high16 v18, -0x3f200000    # -7.0f

    .line 85
    .line 86
    const/high16 v13, -0x3f400000    # -6.0f

    .line 87
    .line 88
    const/high16 v14, -0x40000000    # -2.0f

    .line 89
    .line 90
    const/high16 v15, -0x3ed00000    # -11.0f

    .line 91
    .line 92
    const/high16 v16, -0x3f200000    # -7.0f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v0, 0x3f800000    # 1.0f

    .line 98
    .line 99
    const/high16 v2, 0x40e00000    # 7.0f

    .line 100
    .line 101
    const/high16 v4, 0x41100000    # 9.0f

    .line 102
    .line 103
    invoke-virtual {v12, v2, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, 0x40000000    # 2.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v17, 0x400f5c29    # 2.24f

    .line 112
    .line 113
    .line 114
    const v18, 0x4050a3d7    # 3.26f

    .line 115
    .line 116
    .line 117
    const/4 v13, 0x0

    .line 118
    const v14, 0x3fbeb852    # 1.49f

    .line 119
    .line 120
    .line 121
    const v15, 0x3f6e147b    # 0.93f

    .line 122
    .line 123
    .line 124
    const/high16 v16, 0x40300000    # 2.75f

    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v17, 0x40000000    # 2.0f

    .line 130
    .line 131
    const/high16 v18, 0x41b00000    # 22.0f

    .line 132
    .line 133
    const v13, 0x404ccccd    # 3.2f

    .line 134
    .line 135
    .line 136
    const v14, 0x4186147b    # 16.76f

    .line 137
    .line 138
    .line 139
    const v15, 0x403ae148    # 2.92f

    .line 140
    .line 141
    .line 142
    const v16, 0x419d851f    # 19.69f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v0, 0x40a00000    # 5.0f

    .line 149
    .line 150
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v0, 0x41200000    # 10.0f

    .line 154
    .line 155
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, 0x40a00000    # 5.0f

    .line 159
    .line 160
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, -0x406147ae    # -1.24f

    .line 164
    .line 165
    .line 166
    const v18, -0x3f0851ec    # -7.74f

    .line 167
    .line 168
    .line 169
    const v13, -0x40947ae1    # -0.92f

    .line 170
    .line 171
    .line 172
    const v14, -0x3fec28f6    # -2.31f

    .line 173
    .line 174
    .line 175
    const v15, -0x40666666    # -1.2f

    .line 176
    .line 177
    .line 178
    const v16, -0x3f5851ec    # -5.24f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v17, 0x41b80000    # 23.0f

    .line 185
    .line 186
    const/high16 v18, 0x41300000    # 11.0f

    .line 187
    .line 188
    const v13, 0x41b08f5c    # 22.07f

    .line 189
    .line 190
    .line 191
    const/high16 v14, 0x415c0000    # 13.75f

    .line 192
    .line 193
    const/high16 v15, 0x41b80000    # 23.0f

    .line 194
    .line 195
    const v16, 0x4147d70a    # 12.49f

    .line 196
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
    const/high16 v0, 0x41400000    # 12.0f

    .line 205
    .line 206
    const v2, 0x4096b852    # 4.71f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v17, 0x40c3851f    # 6.11f

    .line 213
    .line 214
    .line 215
    const v18, 0x408947ae    # 4.29f

    .line 216
    .line 217
    .line 218
    const v13, 0x3faa3d71    # 1.33f

    .line 219
    .line 220
    .line 221
    const v14, 0x3f91eb85    # 1.14f

    .line 222
    .line 223
    .line 224
    const v15, 0x405f5c29    # 3.49f

    .line 225
    .line 226
    .line 227
    const v16, 0x4035c28f    # 2.84f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v0, 0x40bc7ae1    # 5.89f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v17, 0x41400000    # 12.0f

    .line 240
    .line 241
    const v18, 0x4096b852    # 4.71f

    .line 242
    .line 243
    .line 244
    const v13, 0x410828f6    # 8.51f

    .line 245
    .line 246
    .line 247
    const v14, 0x40f1999a    # 7.55f

    .line 248
    .line 249
    .line 250
    const v15, 0x412ab852    # 10.67f

    .line 251
    .line 252
    .line 253
    const v16, 0x40bb3333    # 5.85f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v0, 0x41500000    # 13.0f

    .line 263
    .line 264
    const/high16 v2, 0x41300000    # 11.0f

    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v0, 0x40400000    # 3.0f

    .line 270
    .line 271
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, -0x40400000    # -1.5f

    .line 275
    .line 276
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 277
    .line 278
    const/4 v13, 0x0

    .line 279
    const v14, 0x3f547ae1    # 0.83f

    .line 280
    .line 281
    .line 282
    const v15, -0x40d47ae1    # -0.67f

    .line 283
    .line 284
    .line 285
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, 0x413d47ae    # 11.83f

    .line 291
    .line 292
    .line 293
    const/high16 v2, 0x41500000    # 13.0f

    .line 294
    .line 295
    const/high16 v4, 0x41300000    # 11.0f

    .line 296
    .line 297
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v0, 0x41180000    # 9.5f

    .line 304
    .line 305
    const/high16 v2, 0x41480000    # 12.5f

    .line 306
    .line 307
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v17, 0x41000000    # 8.0f

    .line 311
    .line 312
    const/high16 v18, 0x41300000    # 11.0f

    .line 313
    .line 314
    const v13, 0x410ab852    # 8.67f

    .line 315
    .line 316
    .line 317
    const/high16 v14, 0x41480000    # 12.5f

    .line 318
    .line 319
    const/high16 v15, 0x41000000    # 8.0f

    .line 320
    .line 321
    const v16, 0x413d47ae    # 11.83f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, 0x40400000    # 3.0f

    .line 328
    .line 329
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v17, 0x41180000    # 9.5f

    .line 333
    .line 334
    const/high16 v18, 0x41480000    # 12.5f

    .line 335
    .line 336
    const/high16 v13, 0x41300000    # 11.0f

    .line 337
    .line 338
    const v14, 0x413d47ae    # 11.83f

    .line 339
    .line 340
    .line 341
    const v15, 0x412547ae    # 10.33f

    .line 342
    .line 343
    .line 344
    const/high16 v16, 0x41480000    # 12.5f

    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v0, 0x40c00000    # 6.0f

    .line 353
    .line 354
    const/high16 v2, 0x41300000    # 11.0f

    .line 355
    .line 356
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v17, -0x40400000    # -1.5f

    .line 360
    .line 361
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 362
    .line 363
    const/4 v13, 0x0

    .line 364
    const v14, 0x3f547ae1    # 0.83f

    .line 365
    .line 366
    .line 367
    const v15, -0x40d47ae1    # -0.67f

    .line 368
    .line 369
    .line 370
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, 0x413d47ae    # 11.83f

    .line 376
    .line 377
    .line 378
    const/high16 v2, 0x40400000    # 3.0f

    .line 379
    .line 380
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v0, 0x40c00000    # 6.0f

    .line 384
    .line 385
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x40951eb8    # 4.66f

    .line 392
    .line 393
    .line 394
    const/high16 v2, 0x41a00000    # 20.0f

    .line 395
    .line 396
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v17, 0x3f11eb85    # 0.57f

    .line 400
    .line 401
    .line 402
    const v18, -0x3f4d70a4    # -5.58f

    .line 403
    .line 404
    .line 405
    const v13, 0x3ec7ae14    # 0.39f

    .line 406
    .line 407
    .line 408
    const v14, -0x4011eb85    # -1.86f

    .line 409
    .line 410
    .line 411
    const v15, 0x3f0a3d71    # 0.54f

    .line 412
    .line 413
    .line 414
    const v16, -0x3f8b851f    # -3.82f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v17, 0x3fe147ae    # 1.76f

    .line 421
    .line 422
    .line 423
    const v18, -0x40851eb8    # -0.98f

    .line 424
    .line 425
    .line 426
    const v13, 0x3f2e147b    # 0.68f

    .line 427
    .line 428
    .line 429
    const v14, -0x41e66666    # -0.15f

    .line 430
    .line 431
    .line 432
    const v15, 0x3fa51eb8    # 1.29f

    .line 433
    .line 434
    .line 435
    const v16, -0x41051eb8    # -0.49f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v17, 0x3f59999a    # 0.85f

    .line 442
    .line 443
    .line 444
    const v18, 0x3f1eb852    # 0.62f

    .line 445
    .line 446
    .line 447
    const/high16 v13, 0x3e800000    # 0.25f

    .line 448
    .line 449
    const/high16 v14, 0x3e800000    # 0.25f

    .line 450
    .line 451
    const v15, 0x3f0a3d71    # 0.54f

    .line 452
    .line 453
    .line 454
    const v16, 0x3ee66666    # 0.45f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, -0x40fae148    # -0.52f

    .line 461
    .line 462
    .line 463
    const v18, 0x40bdc28f    # 5.93f

    .line 464
    .line 465
    .line 466
    const v13, -0x42333333    # -0.1f

    .line 467
    .line 468
    .line 469
    const v14, 0x3fef5c29    # 1.87f

    .line 470
    .line 471
    .line 472
    const v15, -0x417ae148    # -0.26f

    .line 473
    .line 474
    .line 475
    const/high16 v16, 0x40800000    # 4.0f

    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, 0x4115999a    # 9.35f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, 0x3ef5c28f    # 0.48f

    .line 493
    .line 494
    .line 495
    const v18, -0x3f4f0a3d    # -5.53f

    .line 496
    .line 497
    .line 498
    const v13, 0x3e75c28f    # 0.24f

    .line 499
    .line 500
    .line 501
    const v14, -0x4015c28f    # -1.83f

    .line 502
    .line 503
    .line 504
    const v15, 0x3ec7ae14    # 0.39f

    .line 505
    .line 506
    .line 507
    const v16, -0x3f8e147b    # -3.78f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v17, 0x400ae148    # 2.17f

    .line 514
    .line 515
    .line 516
    const v18, -0x407d70a4    # -1.02f

    .line 517
    .line 518
    .line 519
    const v13, 0x3f570a3d    # 0.84f

    .line 520
    .line 521
    .line 522
    const v14, -0x425c28f6    # -0.08f

    .line 523
    .line 524
    .line 525
    const v15, 0x3fce147b    # 1.61f

    .line 526
    .line 527
    .line 528
    const v16, -0x4119999a    # -0.45f

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v18, 0x3f828f5c    # 1.02f

    .line 535
    .line 536
    .line 537
    const v13, 0x3f0f5c29    # 0.56f

    .line 538
    .line 539
    .line 540
    const v14, 0x3f11eb85    # 0.57f

    .line 541
    .line 542
    .line 543
    const v15, 0x3fa8f5c3    # 1.32f

    .line 544
    .line 545
    .line 546
    const v16, 0x3f70a3d7    # 0.94f

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v17, 0x3ef5c28f    # 0.48f

    .line 553
    .line 554
    .line 555
    const v18, 0x40b0f5c3    # 5.53f

    .line 556
    .line 557
    .line 558
    const v13, 0x3dcccccd    # 0.1f

    .line 559
    .line 560
    .line 561
    const/high16 v14, 0x3fe00000    # 1.75f

    .line 562
    .line 563
    const v15, 0x3e75c28f    # 0.24f

    .line 564
    .line 565
    .line 566
    const v16, 0x406ccccd    # 3.7f

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v0, 0x41855c29    # 16.67f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v17, -0x40fae148    # -0.52f

    .line 585
    .line 586
    .line 587
    const v18, -0x3f423d71    # -5.93f

    .line 588
    .line 589
    .line 590
    const v13, -0x4175c28f    # -0.27f

    .line 591
    .line 592
    .line 593
    const v14, -0x4007ae14    # -1.94f

    .line 594
    .line 595
    .line 596
    const v15, -0x4123d70a    # -0.43f

    .line 597
    .line 598
    .line 599
    const v16, -0x3f7dc28f    # -4.07f

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v17, 0x3f59999a    # 0.85f

    .line 606
    .line 607
    .line 608
    const v18, -0x40e147ae    # -0.62f

    .line 609
    .line 610
    .line 611
    const v13, 0x3e9eb852    # 0.31f

    .line 612
    .line 613
    .line 614
    const v14, -0x41d1eb85    # -0.17f

    .line 615
    .line 616
    .line 617
    const v15, 0x3f1c28f6    # 0.61f

    .line 618
    .line 619
    .line 620
    const v16, -0x41428f5c    # -0.37f

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v17, 0x3fe147ae    # 1.76f

    .line 627
    .line 628
    .line 629
    const v18, 0x3f7ae148    # 0.98f

    .line 630
    .line 631
    .line 632
    const v13, 0x3ef0a3d7    # 0.47f

    .line 633
    .line 634
    .line 635
    const v14, 0x3ef5c28f    # 0.48f

    .line 636
    .line 637
    .line 638
    const v15, 0x3f8a3d71    # 1.08f

    .line 639
    .line 640
    .line 641
    const v16, 0x3f547ae1    # 0.83f

    .line 642
    .line 643
    .line 644
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v17, 0x3f11eb85    # 0.57f

    .line 648
    .line 649
    .line 650
    const v18, 0x40b28f5c    # 5.58f

    .line 651
    .line 652
    .line 653
    const v13, 0x3cf5c28f    # 0.03f

    .line 654
    .line 655
    .line 656
    const v14, 0x3fe147ae    # 1.76f

    .line 657
    .line 658
    .line 659
    const v15, 0x3e3851ec    # 0.18f

    .line 660
    .line 661
    .line 662
    const v16, 0x406e147b    # 3.72f

    .line 663
    .line 664
    .line 665
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const/high16 v0, 0x419c0000    # 19.5f

    .line 675
    .line 676
    const/high16 v2, 0x41480000    # 12.5f

    .line 677
    .line 678
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/high16 v17, -0x40400000    # -1.5f

    .line 682
    .line 683
    const/high16 v18, -0x40400000    # -1.5f

    .line 684
    .line 685
    const v13, -0x40ab851f    # -0.83f

    .line 686
    .line 687
    .line 688
    const/4 v14, 0x0

    .line 689
    const/high16 v15, -0x40400000    # -1.5f

    .line 690
    .line 691
    const v16, -0x40d47ae1    # -0.67f

    .line 692
    .line 693
    .line 694
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v0, 0x40400000    # 3.0f

    .line 698
    .line 699
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const/high16 v17, 0x419c0000    # 19.5f

    .line 703
    .line 704
    const/high16 v18, 0x41480000    # 12.5f

    .line 705
    .line 706
    const/high16 v13, 0x41a80000    # 21.0f

    .line 707
    .line 708
    const v14, 0x413d47ae    # 11.83f

    .line 709
    .line 710
    .line 711
    const v15, 0x41a2a3d7    # 20.33f

    .line 712
    .line 713
    .line 714
    const/high16 v16, 0x41480000    # 12.5f

    .line 715
    .line 716
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 723
    .line 724
    .line 725
    move-result-object v2

    .line 726
    const/16 v16, 0x3800

    .line 727
    .line 728
    const/16 v17, 0x0

    .line 729
    .line 730
    const/high16 v6, 0x3f800000    # 1.0f

    .line 731
    .line 732
    const/high16 v8, 0x3f800000    # 1.0f

    .line 733
    .line 734
    const/4 v7, 0x0

    .line 735
    const/high16 v9, 0x3f800000    # 1.0f

    .line 736
    .line 737
    const/high16 v12, 0x3f800000    # 1.0f

    .line 738
    .line 739
    const/4 v13, 0x0

    .line 740
    const/4 v14, 0x0

    .line 741
    const/4 v15, 0x0

    .line 742
    const-string v4, ""

    .line 743
    .line 744
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    sput-object v0, Landroidx/compose/material/icons/sharp/FestivalKt;->_festival:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 753
    .line 754
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 755
    .line 756
    .line 757
    return-object v0
.end method
