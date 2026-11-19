.class public final Landroidx/compose/material/icons/rounded/FreeCancellationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_freeCancellation",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FreeCancellation",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getFreeCancellation",
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
        "SMAP\nFreeCancellation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FreeCancellation.kt\nandroidx/compose/material/icons/rounded/FreeCancellationKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,97:1\n212#2,12:98\n233#2,18:111\n253#2:148\n174#3:110\n705#4,2:129\n717#4,2:131\n719#4,11:137\n72#5,4:133\n*S KotlinDebug\n*F\n+ 1 FreeCancellation.kt\nandroidx/compose/material/icons/rounded/FreeCancellationKt\n*L\n29#1:98,12\n30#1:111,18\n30#1:148\n29#1:110\n30#1:129,2\n30#1:131,2\n30#1:137,11\n30#1:133,4\n*E\n"
    }
.end annotation


# static fields
.field private static _freeCancellation:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFreeCancellation(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FreeCancellationKt;->_freeCancellation:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FreeCancellation"

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
    const v0, 0x412ca3d7    # 10.79f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41a00000    # 20.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x40a00000    # 5.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v0, 0x41200000    # 10.0f

    .line 84
    .line 85
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v0, 0x41600000    # 14.0f

    .line 89
    .line 90
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x403d70a4    # 2.96f

    .line 94
    .line 95
    .line 96
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, 0x3fdae148    # 1.71f

    .line 100
    .line 101
    .line 102
    const v18, 0x3f35c28f    # 0.71f

    .line 103
    .line 104
    .line 105
    const/4 v13, 0x0

    .line 106
    const v14, 0x3f63d70a    # 0.89f

    .line 107
    .line 108
    .line 109
    const v15, 0x3f8a3d71    # 1.08f

    .line 110
    .line 111
    .line 112
    const v16, 0x3fab851f    # 1.34f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/4 v0, 0x0

    .line 119
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v17, 0x3e947ae1    # 0.29f

    .line 123
    .line 124
    .line 125
    const v18, -0x40ca3d71    # -0.71f

    .line 126
    .line 127
    .line 128
    const v13, 0x3e428f5c    # 0.19f

    .line 129
    .line 130
    .line 131
    const v14, -0x41bd70a4    # -0.19f

    .line 132
    .line 133
    .line 134
    const v15, 0x3e947ae1    # 0.29f

    .line 135
    .line 136
    .line 137
    const v16, -0x411eb852    # -0.44f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v0, 0x40c00000    # 6.0f

    .line 144
    .line 145
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v17, -0x40000000    # -2.0f

    .line 149
    .line 150
    const/high16 v18, -0x40000000    # -2.0f

    .line 151
    .line 152
    const/4 v13, 0x0

    .line 153
    const v14, -0x40733333    # -1.1f

    .line 154
    .line 155
    .line 156
    const v15, -0x4099999a    # -0.9f

    .line 157
    .line 158
    .line 159
    const/high16 v16, -0x40000000    # -2.0f

    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v0, -0x40800000    # -1.0f

    .line 165
    .line 166
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v0, 0x40400000    # 3.0f

    .line 170
    .line 171
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v17, -0x40800000    # -1.0f

    .line 175
    .line 176
    const/high16 v18, -0x40800000    # -1.0f

    .line 177
    .line 178
    const v14, -0x40f33333    # -0.55f

    .line 179
    .line 180
    .line 181
    const v15, -0x4119999a    # -0.45f

    .line 182
    .line 183
    .line 184
    const/high16 v16, -0x40800000    # -1.0f

    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/4 v0, 0x0

    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v18, 0x3f800000    # 1.0f

    .line 194
    .line 195
    const v13, -0x40f33333    # -0.55f

    .line 196
    .line 197
    .line 198
    const/4 v14, 0x0

    .line 199
    const/high16 v15, -0x40800000    # -1.0f

    .line 200
    .line 201
    const v16, 0x3ee66666    # 0.45f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, 0x3f800000    # 1.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v0, 0x41000000    # 8.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v0, 0x40400000    # 3.0f

    .line 218
    .line 219
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v18, -0x40800000    # -1.0f

    .line 223
    .line 224
    const/4 v13, 0x0

    .line 225
    const v14, -0x40f33333    # -0.55f

    .line 226
    .line 227
    .line 228
    const v15, -0x4119999a    # -0.45f

    .line 229
    .line 230
    .line 231
    const/high16 v16, -0x40800000    # -1.0f

    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/4 v0, 0x0

    .line 237
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v17, 0x40c00000    # 6.0f

    .line 241
    .line 242
    const/high16 v18, 0x40400000    # 3.0f

    .line 243
    .line 244
    const v13, 0x40ce6666    # 6.45f

    .line 245
    .line 246
    .line 247
    const/high16 v14, 0x40000000    # 2.0f

    .line 248
    .line 249
    const/high16 v15, 0x40c00000    # 6.0f

    .line 250
    .line 251
    const v16, 0x401ccccd    # 2.45f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x3f800000    # 1.0f

    .line 258
    .line 259
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v0, 0x40a00000    # 5.0f

    .line 263
    .line 264
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v17, 0x4040a3d7    # 3.01f

    .line 268
    .line 269
    .line 270
    const/high16 v18, 0x40c00000    # 6.0f

    .line 271
    .line 272
    const v13, 0x4078f5c3    # 3.89f

    .line 273
    .line 274
    .line 275
    const/high16 v14, 0x40800000    # 4.0f

    .line 276
    .line 277
    const v15, 0x4040a3d7    # 3.01f

    .line 278
    .line 279
    .line 280
    const v16, 0x409ccccd    # 4.9f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v0, 0x41a00000    # 20.0f

    .line 287
    .line 288
    const/high16 v2, 0x40400000    # 3.0f

    .line 289
    .line 290
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v17, 0x40000000    # 2.0f

    .line 294
    .line 295
    const/high16 v18, 0x40000000    # 2.0f

    .line 296
    .line 297
    const/4 v13, 0x0

    .line 298
    const v14, 0x3f8ccccd    # 1.1f

    .line 299
    .line 300
    .line 301
    const v15, 0x3f63d70a    # 0.89f

    .line 302
    .line 303
    .line 304
    const/high16 v16, 0x40000000    # 2.0f

    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, 0x40b947ae    # 5.79f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, 0x3f35c28f    # 0.71f

    .line 316
    .line 317
    .line 318
    const v18, -0x40251eb8    # -1.71f

    .line 319
    .line 320
    .line 321
    const v13, 0x3f63d70a    # 0.89f

    .line 322
    .line 323
    .line 324
    const/4 v14, 0x0

    .line 325
    const v15, 0x3fab851f    # 1.34f

    .line 326
    .line 327
    .line 328
    const v16, -0x4075c28f    # -1.08f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/4 v0, 0x0

    .line 335
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, 0x412ca3d7    # 10.79f

    .line 339
    .line 340
    .line 341
    const/high16 v18, 0x41a00000    # 20.0f

    .line 342
    .line 343
    const v13, 0x4134f5c3    # 11.31f

    .line 344
    .line 345
    .line 346
    const v14, 0x41a0e148    # 20.11f

    .line 347
    .line 348
    .line 349
    const v15, 0x4130f5c3    # 11.06f

    .line 350
    .line 351
    .line 352
    const/high16 v16, 0x41a00000    # 20.0f

    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, 0x415b5c29    # 13.71f

    .line 361
    .line 362
    .line 363
    const v2, 0x4192147b    # 18.26f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, 0x3fb47ae1    # 1.41f

    .line 370
    .line 371
    .line 372
    const/16 v18, 0x0

    .line 373
    .line 374
    const v13, 0x3ec7ae14    # 0.39f

    .line 375
    .line 376
    .line 377
    const v14, -0x413851ec    # -0.39f

    .line 378
    .line 379
    .line 380
    const v15, 0x3f828f5c    # 1.02f

    .line 381
    .line 382
    .line 383
    const v16, -0x413851ec    # -0.39f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x3fb47ae1    # 1.41f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, 0x40628f5c    # 3.54f

    .line 396
    .line 397
    .line 398
    const v2, -0x3f9d70a4    # -3.54f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/16 v17, 0x0

    .line 408
    .line 409
    const v18, 0x3fb47ae1    # 1.41f

    .line 410
    .line 411
    .line 412
    const v14, 0x3ec7ae14    # 0.39f

    .line 413
    .line 414
    .line 415
    const v15, 0x3ec7ae14    # 0.39f

    .line 416
    .line 417
    .line 418
    const v16, 0x3f828f5c    # 1.02f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, -0x3f7851ec    # -4.24f

    .line 425
    .line 426
    .line 427
    const v2, 0x4087ae14    # 4.24f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v17, -0x404b851f    # -1.41f

    .line 434
    .line 435
    .line 436
    const/16 v18, 0x0

    .line 437
    .line 438
    const v13, -0x413851ec    # -0.39f

    .line 439
    .line 440
    .line 441
    const v15, -0x407d70a4    # -1.02f

    .line 442
    .line 443
    .line 444
    const v16, 0x3ec7ae14    # 0.39f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, -0x3ff851ec    # -2.12f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v17, 0x415b5c29    # 13.71f

    .line 457
    .line 458
    .line 459
    const v18, 0x4192147b    # 18.26f

    .line 460
    .line 461
    .line 462
    const v13, 0x41551eb8    # 13.32f

    .line 463
    .line 464
    .line 465
    const v14, 0x419a3d71    # 19.28f

    .line 466
    .line 467
    .line 468
    const v15, 0x41551eb8    # 13.32f

    .line 469
    .line 470
    .line 471
    const v16, 0x41953333    # 18.65f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v0, 0x4134a3d7    # 11.29f

    .line 481
    .line 482
    .line 483
    const v2, 0x418251ec    # 16.29f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v17, -0x404b851f    # -1.41f

    .line 490
    .line 491
    .line 492
    const/16 v18, 0x0

    .line 493
    .line 494
    const v13, -0x413851ec    # -0.39f

    .line 495
    .line 496
    .line 497
    const v14, 0x3ec7ae14    # 0.39f

    .line 498
    .line 499
    .line 500
    const v15, -0x407d70a4    # -1.02f

    .line 501
    .line 502
    .line 503
    const v16, 0x3ec7ae14    # 0.39f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, 0x41768f5c    # 15.41f

    .line 510
    .line 511
    .line 512
    const/high16 v2, 0x41100000    # 9.0f

    .line 513
    .line 514
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, 0x3f6147ae    # 0.88f

    .line 518
    .line 519
    .line 520
    const v2, -0x409eb852    # -0.88f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v0, -0x407d70a4    # -1.02f

    .line 530
    .line 531
    .line 532
    const v2, -0x404b851f    # -1.41f

    .line 533
    .line 534
    .line 535
    const v4, -0x413851ec    # -0.39f

    .line 536
    .line 537
    .line 538
    const/4 v6, 0x0

    .line 539
    invoke-virtual {v12, v4, v0, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, 0x40f2e148    # 7.59f

    .line 543
    .line 544
    .line 545
    const/high16 v2, 0x41600000    # 14.0f

    .line 546
    .line 547
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v0, -0x409eb852    # -0.88f

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/16 v17, 0x0

    .line 557
    .line 558
    const v18, -0x404b851f    # -1.41f

    .line 559
    .line 560
    .line 561
    const v14, -0x413851ec    # -0.39f

    .line 562
    .line 563
    .line 564
    const v15, -0x413851ec    # -0.39f

    .line 565
    .line 566
    .line 567
    const v16, -0x407d70a4    # -1.02f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, 0x3f828f5c    # 1.02f

    .line 574
    .line 575
    .line 576
    const v2, -0x413851ec    # -0.39f

    .line 577
    .line 578
    .line 579
    const v4, 0x3fb47ae1    # 1.41f

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v0, 0x414970a4    # 12.59f

    .line 586
    .line 587
    .line 588
    const/high16 v2, 0x41100000    # 9.0f

    .line 589
    .line 590
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v0, 0x3f6147ae    # 0.88f

    .line 594
    .line 595
    .line 596
    const v2, -0x409eb852    # -0.88f

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v17, 0x3fb47ae1    # 1.41f

    .line 603
    .line 604
    .line 605
    const/16 v18, 0x0

    .line 606
    .line 607
    const v13, 0x3ec7ae14    # 0.39f

    .line 608
    .line 609
    .line 610
    const v15, 0x3f828f5c    # 1.02f

    .line 611
    .line 612
    .line 613
    const v16, -0x413851ec    # -0.39f

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v0, 0x3ec7ae14    # 0.39f

    .line 620
    .line 621
    .line 622
    const v2, 0x3f828f5c    # 1.02f

    .line 623
    .line 624
    .line 625
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v0, 0x41268f5c    # 10.41f

    .line 629
    .line 630
    .line 631
    const/high16 v2, 0x41600000    # 14.0f

    .line 632
    .line 633
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v0, 0x3f6147ae    # 0.88f

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v17, 0x4134a3d7    # 11.29f

    .line 643
    .line 644
    .line 645
    const v18, 0x418251ec    # 16.29f

    .line 646
    .line 647
    .line 648
    const v13, 0x413ae148    # 11.68f

    .line 649
    .line 650
    .line 651
    const v14, 0x417451ec    # 15.27f

    .line 652
    .line 653
    .line 654
    const v15, 0x413ae148    # 11.68f

    .line 655
    .line 656
    .line 657
    const v16, 0x417e6666    # 15.9f

    .line 658
    .line 659
    .line 660
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 667
    .line 668
    .line 669
    move-result-object v2

    .line 670
    const/16 v16, 0x3800

    .line 671
    .line 672
    const/16 v17, 0x0

    .line 673
    .line 674
    const/high16 v6, 0x3f800000    # 1.0f

    .line 675
    .line 676
    const/high16 v8, 0x3f800000    # 1.0f

    .line 677
    .line 678
    const/4 v7, 0x0

    .line 679
    const/high16 v9, 0x3f800000    # 1.0f

    .line 680
    .line 681
    const/high16 v12, 0x3f800000    # 1.0f

    .line 682
    .line 683
    const/4 v13, 0x0

    .line 684
    const/4 v14, 0x0

    .line 685
    const/4 v15, 0x0

    .line 686
    const-string v4, ""

    .line 687
    .line 688
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    sput-object v0, Landroidx/compose/material/icons/rounded/FreeCancellationKt;->_freeCancellation:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 697
    .line 698
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    return-object v0
.end method
