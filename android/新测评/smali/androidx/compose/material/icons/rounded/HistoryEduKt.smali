.class public final Landroidx/compose/material/icons/rounded/HistoryEduKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_historyEdu",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "HistoryEdu",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getHistoryEdu",
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
        "SMAP\nHistoryEdu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryEdu.kt\nandroidx/compose/material/icons/rounded/HistoryEduKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,86:1\n212#2,12:87\n233#2,18:100\n253#2:137\n174#3:99\n705#4,2:118\n717#4,2:120\n719#4,11:126\n72#5,4:122\n*S KotlinDebug\n*F\n+ 1 HistoryEdu.kt\nandroidx/compose/material/icons/rounded/HistoryEduKt\n*L\n29#1:87,12\n30#1:100,18\n30#1:137\n29#1:99\n30#1:118,2\n30#1:120,2\n30#1:126,11\n30#1:122,4\n*E\n"
    }
.end annotation


# static fields
.field private static _historyEdu:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHistoryEdu(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HistoryEduKt;->_historyEdu:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.HistoryEdu"

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
    const/high16 v0, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v2, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, 0x3ec28f5c    # 0.38f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, -0x3fd8f5c3    # -2.61f

    .line 84
    .line 85
    .line 86
    const/high16 v18, -0x41000000    # -0.5f

    .line 87
    .line 88
    const v13, -0x40ab851f    # -0.83f

    .line 89
    .line 90
    .line 91
    const v14, -0x41570a3d    # -0.33f

    .line 92
    .line 93
    .line 94
    const v15, -0x4023d70a    # -1.72f

    .line 95
    .line 96
    .line 97
    const/high16 v16, -0x41000000    # -0.5f

    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v17, -0x3f7e6666    # -4.05f

    .line 103
    .line 104
    .line 105
    const v18, 0x3fa51eb8    # 1.29f

    .line 106
    .line 107
    .line 108
    const v13, -0x404a3d71    # -1.42f

    .line 109
    .line 110
    .line 111
    const/4 v14, 0x0

    .line 112
    const v15, -0x3fca3d71    # -2.84f

    .line 113
    .line 114
    .line 115
    const v16, 0x3edc28f6    # 0.43f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, 0x400d70a4    # 2.21f

    .line 122
    .line 123
    .line 124
    const v18, 0x40f66666    # 7.7f

    .line 125
    .line 126
    .line 127
    const v13, 0x3fea3d71    # 1.83f

    .line 128
    .line 129
    .line 130
    const v14, 0x40d0f5c3    # 6.53f

    .line 131
    .line 132
    .line 133
    const v15, 0x3fe28f5c    # 1.77f

    .line 134
    .line 135
    .line 136
    const v16, 0x40e851ec    # 7.26f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, 0x40247ae1    # 2.57f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v0, 0x3f8e147b    # 1.11f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v17, 0x40470a3d    # 3.11f

    .line 158
    .line 159
    .line 160
    const v18, 0x3fae147b    # 1.36f

    .line 161
    .line 162
    .line 163
    const v13, 0x3f5c28f6    # 0.86f

    .line 164
    .line 165
    .line 166
    const v14, 0x3f5c28f6    # 0.86f

    .line 167
    .line 168
    .line 169
    const v15, 0x3ffd70a4    # 1.98f

    .line 170
    .line 171
    .line 172
    const v16, 0x3fa7ae14    # 1.31f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v0, 0x41700000    # 15.0f

    .line 179
    .line 180
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v0, 0x40e00000    # 7.0f

    .line 184
    .line 185
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v17, -0x40800000    # -1.0f

    .line 189
    .line 190
    const/high16 v18, 0x3f800000    # 1.0f

    .line 191
    .line 192
    const v13, -0x40f33333    # -0.55f

    .line 193
    .line 194
    .line 195
    const/4 v14, 0x0

    .line 196
    const/high16 v15, -0x40800000    # -1.0f

    .line 197
    .line 198
    const v16, 0x3ee66666    # 0.45f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x40000000    # 2.0f

    .line 205
    .line 206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v17, 0x40000000    # 2.0f

    .line 210
    .line 211
    const/high16 v18, 0x40000000    # 2.0f

    .line 212
    .line 213
    const/4 v13, 0x0

    .line 214
    const v14, 0x3f8ccccd    # 1.1f

    .line 215
    .line 216
    .line 217
    const v15, 0x3f666666    # 0.9f

    .line 218
    .line 219
    .line 220
    const/high16 v16, 0x40000000    # 2.0f

    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, 0x41200000    # 10.0f

    .line 226
    .line 227
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v17, 0x40400000    # 3.0f

    .line 231
    .line 232
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 233
    .line 234
    const v13, 0x3fd47ae1    # 1.66f

    .line 235
    .line 236
    .line 237
    const/4 v14, 0x0

    .line 238
    const/high16 v15, 0x40400000    # 3.0f

    .line 239
    .line 240
    const v16, -0x40547ae1    # -1.34f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v0, 0x40a00000    # 5.0f

    .line 247
    .line 248
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v17, -0x40800000    # -1.0f

    .line 252
    .line 253
    const/high16 v18, -0x40800000    # -1.0f

    .line 254
    .line 255
    const/4 v13, 0x0

    .line 256
    const v14, -0x40f33333    # -0.55f

    .line 257
    .line 258
    .line 259
    const v15, -0x4119999a    # -0.45f

    .line 260
    .line 261
    .line 262
    const/high16 v16, -0x40800000    # -1.0f

    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v0, 0x41200000    # 10.0f

    .line 268
    .line 269
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v17, 0x41100000    # 9.0f

    .line 273
    .line 274
    const/high16 v18, 0x40a00000    # 5.0f

    .line 275
    .line 276
    const v13, 0x41173333    # 9.45f

    .line 277
    .line 278
    .line 279
    const/high16 v14, 0x40800000    # 4.0f

    .line 280
    .line 281
    const/high16 v15, 0x41100000    # 9.0f

    .line 282
    .line 283
    const v16, 0x408e6666    # 4.45f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, 0x40fc7ae1    # 7.89f

    .line 293
    .line 294
    .line 295
    const v2, 0x41268f5c    # 10.41f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v0, 0x410428f6    # 8.26f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v0, 0x40b3851f    # 5.61f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, 0x40923d71    # 4.57f

    .line 314
    .line 315
    .line 316
    const v2, 0x40e70a3d    # 7.22f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v17, 0x40cc7ae1    # 6.39f

    .line 323
    .line 324
    .line 325
    const v18, 0x40dc28f6    # 6.88f

    .line 326
    .line 327
    .line 328
    const v13, 0x40a47ae1    # 5.14f

    .line 329
    .line 330
    .line 331
    const/high16 v14, 0x40e00000    # 7.0f

    .line 332
    .line 333
    const v15, 0x40b851ec    # 5.76f

    .line 334
    .line 335
    .line 336
    const v16, 0x40dc28f6    # 6.88f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v17, 0x40628f5c    # 3.54f

    .line 343
    .line 344
    .line 345
    const v18, 0x3fbae148    # 1.46f

    .line 346
    .line 347
    .line 348
    const v13, 0x3fab851f    # 1.34f

    .line 349
    .line 350
    .line 351
    const/4 v14, 0x0

    .line 352
    const v15, 0x4025c28f    # 2.59f

    .line 353
    .line 354
    .line 355
    const v16, 0x3f051eb8    # 0.52f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v0, 0x3fb47ae1    # 1.41f

    .line 362
    .line 363
    .line 364
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, 0x3e4ccccd    # 0.2f

    .line 368
    .line 369
    .line 370
    const v2, -0x41b33333    # -0.2f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v17, -0x400a3d71    # -1.92f

    .line 377
    .line 378
    .line 379
    const v18, 0x3f4ccccd    # 0.8f

    .line 380
    .line 381
    .line 382
    const v13, -0x40fd70a4    # -0.51f

    .line 383
    .line 384
    .line 385
    const v14, 0x3f028f5c    # 0.51f

    .line 386
    .line 387
    .line 388
    const v15, -0x4067ae14    # -1.19f

    .line 389
    .line 390
    .line 391
    const v16, 0x3f4ccccd    # 0.8f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, 0x40fc7ae1    # 7.89f

    .line 398
    .line 399
    .line 400
    const v18, 0x41268f5c    # 10.41f

    .line 401
    .line 402
    .line 403
    const/high16 v13, 0x410c0000    # 8.75f

    .line 404
    .line 405
    const/high16 v14, 0x412c0000    # 10.75f

    .line 406
    .line 407
    const v15, 0x4104a3d7    # 8.29f

    .line 408
    .line 409
    .line 410
    const v16, 0x412a147b    # 10.63f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v0, 0x41980000    # 19.0f

    .line 420
    .line 421
    const/high16 v2, 0x41880000    # 17.0f

    .line 422
    .line 423
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v17, -0x40800000    # -1.0f

    .line 427
    .line 428
    const/high16 v18, 0x3f800000    # 1.0f

    .line 429
    .line 430
    const/4 v13, 0x0

    .line 431
    const v14, 0x3f0ccccd    # 0.55f

    .line 432
    .line 433
    .line 434
    const v15, -0x4119999a    # -0.45f

    .line 435
    .line 436
    .line 437
    const/high16 v16, 0x3f800000    # 1.0f

    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, -0x4119999a    # -0.45f

    .line 443
    .line 444
    .line 445
    const/high16 v2, -0x40800000    # -1.0f

    .line 446
    .line 447
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v0, -0x40800000    # -1.0f

    .line 451
    .line 452
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v18, -0x40800000    # -1.0f

    .line 456
    .line 457
    const v14, -0x40f33333    # -0.55f

    .line 458
    .line 459
    .line 460
    const/high16 v16, -0x40800000    # -1.0f

    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v0, -0x3f600000    # -5.0f

    .line 466
    .line 467
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, -0x3fda3d71    # -2.59f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v17, 0x3fc7ae14    # 1.56f

    .line 477
    .line 478
    .line 479
    const v18, -0x407c28f6    # -1.03f

    .line 480
    .line 481
    .line 482
    const v13, 0x3f11eb85    # 0.57f

    .line 483
    .line 484
    .line 485
    const v14, -0x41947ae1    # -0.23f

    .line 486
    .line 487
    .line 488
    const v15, 0x3f8ccccd    # 1.1f

    .line 489
    .line 490
    .line 491
    const v16, -0x40ee147b    # -0.57f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v0, 0x3e4ccccd    # 0.2f

    .line 498
    .line 499
    .line 500
    const v2, -0x41b33333    # -0.2f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x417970a4    # 15.59f

    .line 507
    .line 508
    .line 509
    const/high16 v2, 0x41600000    # 14.0f

    .line 510
    .line 511
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x41880000    # 17.0f

    .line 515
    .line 516
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v0, -0x404b851f    # -1.41f

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v0, -0x3f400000    # -6.0f

    .line 526
    .line 527
    const v2, -0x3f40f5c3    # -5.97f

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v0, 0x40c00000    # 6.0f

    .line 534
    .line 535
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v0, 0x41000000    # 8.0f

    .line 539
    .line 540
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v0, 0x41880000    # 17.0f

    .line 544
    .line 545
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    const/16 v16, 0x3800

    .line 556
    .line 557
    const/16 v17, 0x0

    .line 558
    .line 559
    const/high16 v6, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/high16 v8, 0x3f800000    # 1.0f

    .line 562
    .line 563
    const/4 v7, 0x0

    .line 564
    const/high16 v9, 0x3f800000    # 1.0f

    .line 565
    .line 566
    const/high16 v12, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/4 v13, 0x0

    .line 569
    const/4 v14, 0x0

    .line 570
    const/4 v15, 0x0

    .line 571
    const-string v4, ""

    .line 572
    .line 573
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    sput-object v0, Landroidx/compose/material/icons/rounded/HistoryEduKt;->_historyEdu:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 582
    .line 583
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    return-object v0
.end method
