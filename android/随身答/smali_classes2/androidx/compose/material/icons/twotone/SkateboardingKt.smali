.class public final Landroidx/compose/material/icons/twotone/SkateboardingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_skateboarding",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Skateboarding",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSkateboarding",
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
        "SMAP\nSkateboarding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Skateboarding.kt\nandroidx/compose/material/icons/twotone/SkateboardingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n72#5,4:129\n*S KotlinDebug\n*F\n+ 1 Skateboarding.kt\nandroidx/compose/material/icons/twotone/SkateboardingKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n30#1:129,4\n*E\n"
    }
.end annotation


# static fields
.field private static _skateboarding:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSkateboarding(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SkateboardingKt;->_skateboarding:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Skateboarding"

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
    const/high16 v0, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v2, 0x41500000    # 13.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, -0x40000000    # -2.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, -0x40733333    # -1.1f

    .line 83
    .line 84
    .line 85
    const v15, 0x3f666666    # 0.9f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x40000000    # -2.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x3f666666    # 0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x40000000    # 2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, -0x4099999a    # -0.9f

    .line 102
    .line 103
    .line 104
    const/high16 v2, -0x40000000    # -2.0f

    .line 105
    .line 106
    const/high16 v4, 0x40000000    # 2.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x40833333    # 4.1f

    .line 112
    .line 113
    .line 114
    const/high16 v2, 0x40400000    # 3.0f

    .line 115
    .line 116
    const/high16 v4, 0x41500000    # 13.0f

    .line 117
    .line 118
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x40e80000    # 7.25f

    .line 125
    .line 126
    const/high16 v2, 0x41b40000    # 22.5f

    .line 127
    .line 128
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v17, -0x40c00000    # -0.75f

    .line 132
    .line 133
    const/high16 v18, 0x3f400000    # 0.75f

    .line 134
    .line 135
    const v13, -0x412e147b    # -0.41f

    .line 136
    .line 137
    .line 138
    const/4 v14, 0x0

    .line 139
    const/high16 v15, -0x40c00000    # -0.75f

    .line 140
    .line 141
    const v16, 0x3eae147b    # 0.34f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, 0x40dae148    # 6.84f

    .line 148
    .line 149
    .line 150
    const/high16 v2, 0x40e80000    # 7.25f

    .line 151
    .line 152
    const/high16 v4, 0x41c00000    # 24.0f

    .line 153
    .line 154
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, 0x41bd47ae    # 23.66f

    .line 158
    .line 159
    .line 160
    const/high16 v2, 0x41ba0000    # 23.25f

    .line 161
    .line 162
    const/high16 v4, 0x41000000    # 8.0f

    .line 163
    .line 164
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v0, 0x40f51eb8    # 7.66f

    .line 168
    .line 169
    .line 170
    const/high16 v2, 0x40e80000    # 7.25f

    .line 171
    .line 172
    const/high16 v4, 0x41b40000    # 22.5f

    .line 173
    .line 174
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v0, 0x417c0000    # 15.75f

    .line 181
    .line 182
    const/high16 v2, 0x41b40000    # 22.5f

    .line 183
    .line 184
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v0, 0x417570a4    # 15.34f

    .line 191
    .line 192
    .line 193
    const/high16 v2, 0x417c0000    # 15.75f

    .line 194
    .line 195
    const/high16 v4, 0x41c00000    # 24.0f

    .line 196
    .line 197
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v0, -0x4151eb85    # -0.34f

    .line 201
    .line 202
    .line 203
    const/high16 v2, -0x40c00000    # -0.75f

    .line 204
    .line 205
    const/high16 v4, 0x3f400000    # 0.75f

    .line 206
    .line 207
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, 0x418147ae    # 16.16f

    .line 211
    .line 212
    .line 213
    const/high16 v2, 0x417c0000    # 15.75f

    .line 214
    .line 215
    const/high16 v4, 0x41b40000    # 22.5f

    .line 216
    .line 217
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v0, 0x4199eb85    # 19.24f

    .line 224
    .line 225
    .line 226
    const/high16 v2, 0x41980000    # 19.0f

    .line 227
    .line 228
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v17, -0x40e8f5c3    # -0.59f

    .line 232
    .line 233
    .line 234
    const v18, 0x3e99999a    # 0.3f

    .line 235
    .line 236
    .line 237
    const v13, -0x418a3d71    # -0.24f

    .line 238
    .line 239
    .line 240
    const v15, -0x4119999a    # -0.45f

    .line 241
    .line 242
    .line 243
    const v16, 0x3de147ae    # 0.11f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v17, -0x3fe66666    # -2.4f

    .line 250
    .line 251
    .line 252
    const v18, 0x3f99999a    # 1.2f

    .line 253
    .line 254
    .line 255
    const v13, -0x40f33333    # -0.55f

    .line 256
    .line 257
    .line 258
    const v14, 0x3f3ae148    # 0.73f

    .line 259
    .line 260
    .line 261
    const v15, -0x404a3d71    # -1.42f

    .line 262
    .line 263
    .line 264
    const v16, 0x3f99999a    # 1.2f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, 0x41800000    # 16.0f

    .line 271
    .line 272
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, -0x3f400000    # -6.0f

    .line 276
    .line 277
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, -0x3f75c28f    # -4.32f

    .line 281
    .line 282
    .line 283
    const v2, -0x3fd51eb8    # -2.67f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, 0x3fe66666    # 1.8f

    .line 290
    .line 291
    .line 292
    const v2, -0x3fc70a3d    # -2.89f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v17, 0x41980000    # 19.0f

    .line 299
    .line 300
    const/high16 v18, 0x41400000    # 12.0f

    .line 301
    .line 302
    const v13, 0x416a147b    # 14.63f

    .line 303
    .line 304
    .line 305
    const v14, 0x412c7ae1    # 10.78f

    .line 306
    .line 307
    .line 308
    const v15, 0x418570a4    # 16.68f

    .line 309
    .line 310
    .line 311
    const/high16 v16, 0x41400000    # 12.0f

    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, -0x40000000    # -2.0f

    .line 317
    .line 318
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v17, -0x3f7bd70a    # -4.13f

    .line 322
    .line 323
    .line 324
    const v18, -0x3fd1eb85    # -2.72f

    .line 325
    .line 326
    .line 327
    const v13, -0x40133333    # -1.85f

    .line 328
    .line 329
    .line 330
    const/4 v14, 0x0

    .line 331
    const v15, -0x3fa3d70a    # -3.44f

    .line 332
    .line 333
    .line 334
    const v16, -0x4070a3d7    # -1.12f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, -0x40fae148    # -0.52f

    .line 341
    .line 342
    .line 343
    const v2, -0x40651eb8    # -1.21f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, 0x414b3333    # 12.7f

    .line 350
    .line 351
    .line 352
    const/high16 v18, 0x40a00000    # 5.0f

    .line 353
    .line 354
    const v13, 0x41628f5c    # 14.16f

    .line 355
    .line 356
    .line 357
    const v14, 0x40b47ae1    # 5.64f

    .line 358
    .line 359
    .line 360
    const v15, 0x4159c28f    # 13.61f

    .line 361
    .line 362
    .line 363
    const/high16 v16, 0x40a00000    # 5.0f

    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v0, 0x40e00000    # 7.0f

    .line 369
    .line 370
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v0, 0x40900000    # 4.5f

    .line 374
    .line 375
    const/high16 v2, 0x41100000    # 9.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x3fd9999a    # 1.7f

    .line 381
    .line 382
    .line 383
    const v2, 0x3f87ae14    # 1.06f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x4101999a    # 8.1f

    .line 390
    .line 391
    .line 392
    const/high16 v2, 0x40e00000    # 7.0f

    .line 393
    .line 394
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, 0x40166666    # 2.35f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, -0x3fe66666    # -2.4f

    .line 404
    .line 405
    .line 406
    const v2, 0x4075c28f    # 3.84f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, -0x41a8f5c3    # -0.21f

    .line 413
    .line 414
    .line 415
    const v18, 0x3fd5c28f    # 1.67f

    .line 416
    .line 417
    .line 418
    const v13, -0x416147ae    # -0.31f

    .line 419
    .line 420
    .line 421
    const/high16 v14, 0x3f000000    # 0.5f

    .line 422
    .line 423
    const v15, -0x413851ec    # -0.39f

    .line 424
    .line 425
    .line 426
    const v16, 0x3f8e147b    # 1.11f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, 0x3fab851f    # 1.34f

    .line 433
    .line 434
    .line 435
    const v2, 0x40847ae1    # 4.14f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, -0x3fb851ec    # -3.12f

    .line 442
    .line 443
    .line 444
    const v2, 0x4070a3d7    # 3.76f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v17, -0x40251eb8    # -1.71f

    .line 451
    .line 452
    .line 453
    const v18, -0x4070a3d7    # -1.12f

    .line 454
    .line 455
    .line 456
    const v13, -0x40cccccd    # -0.7f

    .line 457
    .line 458
    .line 459
    const v14, -0x41dc28f6    # -0.16f

    .line 460
    .line 461
    .line 462
    const v15, -0x4059999a    # -1.3f

    .line 463
    .line 464
    .line 465
    const v16, -0x40ee147b    # -0.57f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v17, 0x40700000    # 3.75f

    .line 472
    .line 473
    const/high16 v18, 0x41980000    # 19.0f

    .line 474
    .line 475
    const v13, 0x4086b852    # 4.21f

    .line 476
    .line 477
    .line 478
    const v14, 0x4198e148    # 19.11f

    .line 479
    .line 480
    .line 481
    const v15, 0x407f5c29    # 3.99f

    .line 482
    .line 483
    .line 484
    const/high16 v16, 0x41980000    # 19.0f

    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v17, 0x40400000    # 3.0f

    .line 490
    .line 491
    const/high16 v18, 0x419e0000    # 19.75f

    .line 492
    .line 493
    const v13, 0x4053d70a    # 3.31f

    .line 494
    .line 495
    .line 496
    const/high16 v14, 0x41980000    # 19.0f

    .line 497
    .line 498
    const/high16 v15, 0x40400000    # 3.0f

    .line 499
    .line 500
    const v16, 0x419ae148    # 19.36f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, 0x3e19999a    # 0.15f

    .line 507
    .line 508
    .line 509
    const v18, 0x3ee66666    # 0.45f

    .line 510
    .line 511
    .line 512
    const/4 v13, 0x0

    .line 513
    const v14, 0x3e19999a    # 0.15f

    .line 514
    .line 515
    .line 516
    const v15, 0x3d4ccccd    # 0.05f

    .line 517
    .line 518
    .line 519
    const v16, 0x3e9eb852    # 0.31f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v17, 0x40666666    # 3.6f

    .line 526
    .line 527
    .line 528
    const v18, 0x3fe66666    # 1.8f

    .line 529
    .line 530
    .line 531
    const v13, 0x3f51eb85    # 0.82f

    .line 532
    .line 533
    .line 534
    const v14, 0x3f8ccccd    # 1.1f

    .line 535
    .line 536
    .line 537
    const v15, 0x400851ec    # 2.13f

    .line 538
    .line 539
    .line 540
    const v16, 0x3fe66666    # 1.8f

    .line 541
    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v0, 0x41180000    # 9.5f

    .line 547
    .line 548
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v18, -0x4019999a    # -1.8f

    .line 552
    .line 553
    .line 554
    const v13, 0x3fbc28f6    # 1.47f

    .line 555
    .line 556
    .line 557
    const/4 v14, 0x0

    .line 558
    const v15, 0x4031eb85    # 2.78f

    .line 559
    .line 560
    .line 561
    const v16, -0x40cccccd    # -0.7f

    .line 562
    .line 563
    .line 564
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v17, 0x3e19999a    # 0.15f

    .line 568
    .line 569
    .line 570
    const v18, -0x4119999a    # -0.45f

    .line 571
    .line 572
    .line 573
    const v13, 0x3dcccccd    # 0.1f

    .line 574
    .line 575
    .line 576
    const v14, -0x41f0a3d7    # -0.14f

    .line 577
    .line 578
    .line 579
    const v15, 0x3e19999a    # 0.15f

    .line 580
    .line 581
    .line 582
    const v16, -0x41666666    # -0.3f

    .line 583
    .line 584
    .line 585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v17, 0x4199eb85    # 19.24f

    .line 589
    .line 590
    .line 591
    const/high16 v18, 0x41980000    # 19.0f

    .line 592
    .line 593
    const/high16 v13, 0x41a00000    # 20.0f

    .line 594
    .line 595
    const v14, 0x419ae148    # 19.36f

    .line 596
    .line 597
    .line 598
    const v15, 0x419d70a4    # 19.68f

    .line 599
    .line 600
    .line 601
    const/high16 v16, 0x41980000    # 19.0f

    .line 602
    .line 603
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v0, 0x41600000    # 14.0f

    .line 610
    .line 611
    const/high16 v2, 0x41a40000    # 20.5f

    .line 612
    .line 613
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v0, 0x4109999a    # 8.6f

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v0, 0x4039999a    # 2.9f

    .line 623
    .line 624
    .line 625
    const/high16 v2, -0x3fa00000    # -3.5f

    .line 626
    .line 627
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v0, -0x40800000    # -1.0f

    .line 631
    .line 632
    const v2, -0x3faccccd    # -3.3f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v0, 0x40600000    # 3.5f

    .line 639
    .line 640
    const v2, 0x400ccccd    # 2.2f

    .line 641
    .line 642
    .line 643
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/high16 v0, 0x41a40000    # 20.5f

    .line 647
    .line 648
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 655
    .line 656
    .line 657
    move-result-object v2

    .line 658
    const/16 v16, 0x3800

    .line 659
    .line 660
    const/16 v17, 0x0

    .line 661
    .line 662
    const/high16 v6, 0x3f800000    # 1.0f

    .line 663
    .line 664
    const/high16 v8, 0x3f800000    # 1.0f

    .line 665
    .line 666
    const/4 v7, 0x0

    .line 667
    const/high16 v9, 0x3f800000    # 1.0f

    .line 668
    .line 669
    const/high16 v12, 0x3f800000    # 1.0f

    .line 670
    .line 671
    const/4 v13, 0x0

    .line 672
    const/4 v14, 0x0

    .line 673
    const/4 v15, 0x0

    .line 674
    const-string v4, ""

    .line 675
    .line 676
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    sput-object v0, Landroidx/compose/material/icons/twotone/SkateboardingKt;->_skateboarding:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 685
    .line 686
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 687
    .line 688
    .line 689
    return-object v0
.end method
