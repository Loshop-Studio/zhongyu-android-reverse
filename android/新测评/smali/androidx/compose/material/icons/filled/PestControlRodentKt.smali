.class public final Landroidx/compose/material/icons/filled/PestControlRodentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_pestControlRodent",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PestControlRodent",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getPestControlRodent",
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
        "SMAP\nPestControlRodent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PestControlRodent.kt\nandroidx/compose/material/icons/filled/PestControlRodentKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,72:1\n212#2,12:73\n233#2,18:86\n253#2:123\n174#3:85\n705#4,2:104\n717#4,2:106\n719#4,11:112\n72#5,4:108\n*S KotlinDebug\n*F\n+ 1 PestControlRodent.kt\nandroidx/compose/material/icons/filled/PestControlRodentKt\n*L\n29#1:73,12\n30#1:86,18\n30#1:123\n29#1:85\n30#1:104,2\n30#1:106,2\n30#1:112,11\n30#1:108,4\n*E\n"
    }
.end annotation


# static fields
.field private static _pestControlRodent:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPestControlRodent(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PestControlRodentKt;->_pestControlRodent:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.PestControlRodent"

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
    const v0, 0x41aa7ae1    # 21.31f

    .line 71
    .line 72
    .line 73
    const v2, 0x418b0a3d    # 17.38f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3fe70a3d    # -2.39f

    .line 80
    .line 81
    .line 82
    const v2, -0x3ff7ae14    # -2.13f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v17, 0x41780000    # 15.5f

    .line 89
    .line 90
    const/high16 v18, 0x41300000    # 11.0f

    .line 91
    .line 92
    const v13, 0x419b851f    # 19.44f

    .line 93
    .line 94
    .line 95
    const v14, 0x414e3d71    # 12.89f

    .line 96
    .line 97
    .line 98
    const v15, 0x418c7ae1    # 17.56f

    .line 99
    .line 100
    .line 101
    const/high16 v16, 0x41300000    # 11.0f

    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 107
    .line 108
    const/high16 v18, 0x40600000    # 3.5f

    .line 109
    .line 110
    const v13, -0x406b851f    # -1.16f

    .line 111
    .line 112
    .line 113
    const/4 v14, 0x0

    .line 114
    const/high16 v15, -0x3fa00000    # -3.5f

    .line 115
    .line 116
    const v16, 0x3f666666    # 0.9f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v17, 0x3f83d70a    # 1.03f

    .line 123
    .line 124
    .line 125
    const v18, 0x401e147b    # 2.47f

    .line 126
    .line 127
    .line 128
    const/4 v13, 0x0

    .line 129
    const v14, 0x3f7851ec    # 0.97f

    .line 130
    .line 131
    .line 132
    const v15, 0x3ec7ae14    # 0.39f

    .line 133
    .line 134
    .line 135
    const v16, 0x3feb851f    # 1.84f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v0, -0x40ca3d71    # -0.71f

    .line 142
    .line 143
    .line 144
    const v2, 0x3f35c28f    # 0.71f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v17, 0x41300000    # 11.0f

    .line 151
    .line 152
    const/high16 v18, 0x41680000    # 14.5f

    .line 153
    .line 154
    const/high16 v13, 0x41380000    # 11.5f

    .line 155
    .line 156
    const v14, 0x4186f5c3    # 16.87f

    .line 157
    .line 158
    .line 159
    const/high16 v15, 0x41300000    # 11.0f

    .line 160
    .line 161
    const v16, 0x417bd70a    # 15.74f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v17, 0x40166666    # 2.35f

    .line 168
    .line 169
    .line 170
    const v18, -0x3f847ae1    # -3.93f

    .line 171
    .line 172
    .line 173
    const/4 v13, 0x0

    .line 174
    const v14, -0x40266666    # -1.7f

    .line 175
    .line 176
    .line 177
    const v15, 0x3f75c28f    # 0.96f

    .line 178
    .line 179
    .line 180
    const v16, -0x3fb51eb8    # -3.17f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, -0x3fee147b    # -2.28f

    .line 187
    .line 188
    .line 189
    const v18, -0x40ee147b    # -0.57f

    .line 190
    .line 191
    .line 192
    const v13, -0x40cccccd    # -0.7f

    .line 193
    .line 194
    .line 195
    const v14, -0x4147ae14    # -0.36f

    .line 196
    .line 197
    .line 198
    const v15, -0x40428f5c    # -1.48f

    .line 199
    .line 200
    .line 201
    const v16, -0x40ee147b    # -0.57f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, -0x3f62e148    # -4.91f

    .line 208
    .line 209
    .line 210
    const v18, 0x4077ae14    # 3.87f

    .line 211
    .line 212
    .line 213
    const v13, -0x3fe7ae14    # -2.38f

    .line 214
    .line 215
    .line 216
    const/4 v14, 0x0

    .line 217
    const v15, -0x3f7428f6    # -4.37f

    .line 218
    .line 219
    .line 220
    const v16, 0x3fd33333    # 1.65f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v17, 0x40800000    # 4.0f

    .line 227
    .line 228
    const/high16 v18, 0x41300000    # 11.0f

    .line 229
    .line 230
    const v13, 0x409d1eb8    # 4.91f

    .line 231
    .line 232
    .line 233
    const/high16 v14, 0x41580000    # 13.5f

    .line 234
    .line 235
    const/high16 v15, 0x40800000    # 4.0f

    .line 236
    .line 237
    const v16, 0x4145c28f    # 12.36f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v17, 0x40400000    # 3.0f

    .line 244
    .line 245
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 246
    .line 247
    const/4 v13, 0x0

    .line 248
    const v14, -0x402b851f    # -1.66f

    .line 249
    .line 250
    .line 251
    const v15, 0x3fab851f    # 1.34f

    .line 252
    .line 253
    .line 254
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, 0x40200000    # 2.5f

    .line 260
    .line 261
    const/16 v18, 0x0

    .line 262
    .line 263
    const v13, 0x3f70a3d7    # 0.94f

    .line 264
    .line 265
    .line 266
    const/4 v14, 0x0

    .line 267
    const v15, 0x3fc7ae14    # 1.56f

    .line 268
    .line 269
    .line 270
    const/16 v16, 0x0

    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v17, 0x41400000    # 12.0f

    .line 276
    .line 277
    const/high16 v18, 0x40b00000    # 5.5f

    .line 278
    .line 279
    const v13, 0x412e147b    # 10.88f

    .line 280
    .line 281
    .line 282
    const/high16 v14, 0x41000000    # 8.0f

    .line 283
    .line 284
    const/high16 v15, 0x41400000    # 12.0f

    .line 285
    .line 286
    const v16, 0x40dc28f6    # 6.88f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v17, 0x41180000    # 9.5f

    .line 293
    .line 294
    const/high16 v18, 0x40400000    # 3.0f

    .line 295
    .line 296
    const/high16 v13, 0x41400000    # 12.0f

    .line 297
    .line 298
    const v14, 0x4083d70a    # 4.12f

    .line 299
    .line 300
    .line 301
    const v15, 0x412e147b    # 10.88f

    .line 302
    .line 303
    .line 304
    const/high16 v16, 0x40400000    # 3.0f

    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v0, 0x41000000    # 8.0f

    .line 310
    .line 311
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v17, 0x40e00000    # 7.0f

    .line 315
    .line 316
    const/high16 v18, 0x40800000    # 4.0f

    .line 317
    .line 318
    const v13, 0x40ee6666    # 7.45f

    .line 319
    .line 320
    .line 321
    const/high16 v14, 0x40400000    # 3.0f

    .line 322
    .line 323
    const/high16 v15, 0x40e00000    # 7.0f

    .line 324
    .line 325
    const v16, 0x405ccccd    # 3.45f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v17, 0x3f800000    # 1.0f

    .line 332
    .line 333
    const/high16 v18, 0x3f800000    # 1.0f

    .line 334
    .line 335
    const/4 v13, 0x0

    .line 336
    const v14, 0x3f0ccccd    # 0.55f

    .line 337
    .line 338
    .line 339
    const v15, 0x3ee66666    # 0.45f

    .line 340
    .line 341
    .line 342
    const/high16 v16, 0x3f800000    # 1.0f

    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 348
    .line 349
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v17, 0x41200000    # 10.0f

    .line 353
    .line 354
    const/high16 v18, 0x40b00000    # 5.5f

    .line 355
    .line 356
    const v13, 0x411c7ae1    # 9.78f

    .line 357
    .line 358
    .line 359
    const/high16 v14, 0x40a00000    # 5.0f

    .line 360
    .line 361
    const/high16 v15, 0x41200000    # 10.0f

    .line 362
    .line 363
    const v16, 0x40a70a3d    # 5.22f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v17, 0x41180000    # 9.5f

    .line 370
    .line 371
    const/high16 v18, 0x40c00000    # 6.0f

    .line 372
    .line 373
    const/high16 v13, 0x41200000    # 10.0f

    .line 374
    .line 375
    const v14, 0x40b8f5c3    # 5.78f

    .line 376
    .line 377
    .line 378
    const v15, 0x411c7ae1    # 9.78f

    .line 379
    .line 380
    .line 381
    const/high16 v16, 0x40c00000    # 6.0f

    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v17, 0x40e00000    # 7.0f

    .line 387
    .line 388
    const v13, 0x4117851f    # 9.47f

    .line 389
    .line 390
    .line 391
    const/high16 v14, 0x40c00000    # 6.0f

    .line 392
    .line 393
    const/high16 v15, 0x41100000    # 9.0f

    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v17, -0x3f600000    # -5.0f

    .line 399
    .line 400
    const/high16 v18, 0x40a00000    # 5.0f

    .line 401
    .line 402
    const v13, -0x3fcf5c29    # -2.76f

    .line 403
    .line 404
    .line 405
    const/4 v14, 0x0

    .line 406
    const/high16 v15, -0x3f600000    # -5.0f

    .line 407
    .line 408
    const v16, 0x400f5c29    # 2.24f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v17, 0x40800000    # 4.0f

    .line 415
    .line 416
    const v18, 0x409ccccd    # 4.9f

    .line 417
    .line 418
    .line 419
    const/4 v13, 0x0

    .line 420
    const v14, 0x401ae148    # 2.42f

    .line 421
    .line 422
    .line 423
    const v15, 0x3fdc28f6    # 1.72f

    .line 424
    .line 425
    .line 426
    const v16, 0x408e147b    # 4.44f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, 0x3cf5c28f    # 0.03f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v17, 0x41311eb8    # 11.07f

    .line 439
    .line 440
    .line 441
    const/high16 v18, 0x41a80000    # 21.0f

    .line 442
    .line 443
    const/high16 v13, 0x40c00000    # 6.0f

    .line 444
    .line 445
    const v14, 0x4195d70a    # 18.73f

    .line 446
    .line 447
    .line 448
    const v15, 0x410451ec    # 8.27f

    .line 449
    .line 450
    .line 451
    const/high16 v16, 0x41a80000    # 21.0f

    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, 0x410dc28f    # 8.86f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v17, 0x41aa7ae1    # 21.31f

    .line 463
    .line 464
    .line 465
    const v18, 0x418b0a3d    # 17.38f

    .line 466
    .line 467
    .line 468
    const v13, 0x41ae6666    # 21.8f

    .line 469
    .line 470
    .line 471
    const/high16 v14, 0x41a80000    # 21.0f

    .line 472
    .line 473
    const v15, 0x41b5eb85    # 22.74f

    .line 474
    .line 475
    .line 476
    const v16, 0x419547ae    # 18.66f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v0, 0x41900000    # 18.0f

    .line 486
    .line 487
    const/high16 v2, 0x41980000    # 19.0f

    .line 488
    .line 489
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v17, -0x40800000    # -1.0f

    .line 493
    .line 494
    const/high16 v18, -0x40800000    # -1.0f

    .line 495
    .line 496
    const v13, -0x40f33333    # -0.55f

    .line 497
    .line 498
    .line 499
    const/4 v14, 0x0

    .line 500
    const/high16 v15, -0x40800000    # -1.0f

    .line 501
    .line 502
    const v16, -0x4119999a    # -0.45f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v17, 0x3f800000    # 1.0f

    .line 509
    .line 510
    const/4 v13, 0x0

    .line 511
    const v14, -0x40f33333    # -0.55f

    .line 512
    .line 513
    .line 514
    const v15, 0x3ee66666    # 0.45f

    .line 515
    .line 516
    .line 517
    const/high16 v16, -0x40800000    # -1.0f

    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v0, 0x3ee66666    # 0.45f

    .line 523
    .line 524
    .line 525
    const/high16 v2, 0x3f800000    # 1.0f

    .line 526
    .line 527
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v17, 0x41900000    # 18.0f

    .line 531
    .line 532
    const/high16 v18, 0x41980000    # 19.0f

    .line 533
    .line 534
    const/high16 v13, 0x41980000    # 19.0f

    .line 535
    .line 536
    const v14, 0x41946666    # 18.55f

    .line 537
    .line 538
    .line 539
    const v15, 0x41946666    # 18.55f

    .line 540
    .line 541
    .line 542
    const/high16 v16, 0x41980000    # 19.0f

    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    const/16 v16, 0x3800

    .line 555
    .line 556
    const/16 v17, 0x0

    .line 557
    .line 558
    const/high16 v6, 0x3f800000    # 1.0f

    .line 559
    .line 560
    const/high16 v8, 0x3f800000    # 1.0f

    .line 561
    .line 562
    const/4 v7, 0x0

    .line 563
    const/high16 v9, 0x3f800000    # 1.0f

    .line 564
    .line 565
    const/high16 v12, 0x3f800000    # 1.0f

    .line 566
    .line 567
    const/4 v13, 0x0

    .line 568
    const/4 v14, 0x0

    .line 569
    const/4 v15, 0x0

    .line 570
    const-string v4, ""

    .line 571
    .line 572
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    sput-object v0, Landroidx/compose/material/icons/filled/PestControlRodentKt;->_pestControlRodent:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 581
    .line 582
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    return-object v0
.end method
