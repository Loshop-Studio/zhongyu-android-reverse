.class public final Landroidx/compose/material/icons/filled/WashKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_wash",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Wash",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getWash",
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
        "SMAP\nWash.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Wash.kt\nandroidx/compose/material/icons/filled/WashKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n72#5,4:117\n*S KotlinDebug\n*F\n+ 1 Wash.kt\nandroidx/compose/material/icons/filled/WashKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n30#1:117,4\n*E\n"
    }
.end annotation


# static fields
.field private static _wash:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWash(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/WashKt;->_wash:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Wash"

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
    const/high16 v0, 0x41940000    # 18.5f

    .line 71
    .line 72
    const/high16 v2, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x41a80000    # 21.0f

    .line 78
    .line 79
    const/high16 v18, 0x40b00000    # 5.5f

    .line 80
    .line 81
    const v13, 0x419f0a3d    # 19.88f

    .line 82
    .line 83
    .line 84
    const/high16 v14, 0x41000000    # 8.0f

    .line 85
    .line 86
    const/high16 v15, 0x41a80000    # 21.0f

    .line 87
    .line 88
    const v16, 0x40dc28f6    # 6.88f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v17, 0x41940000    # 18.5f

    .line 95
    .line 96
    const/high16 v18, 0x3f800000    # 1.0f

    .line 97
    .line 98
    const/high16 v13, 0x41a80000    # 21.0f

    .line 99
    .line 100
    const v14, 0x40751eb8    # 3.83f

    .line 101
    .line 102
    .line 103
    const/high16 v15, 0x41940000    # 18.5f

    .line 104
    .line 105
    const/high16 v16, 0x3f800000    # 1.0f

    .line 106
    .line 107
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v0, 0x40751eb8    # 3.83f

    .line 111
    .line 112
    .line 113
    const/high16 v2, 0x40b00000    # 5.5f

    .line 114
    .line 115
    const/high16 v4, 0x41800000    # 16.0f

    .line 116
    .line 117
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v18, 0x41000000    # 8.0f

    .line 121
    .line 122
    const/high16 v13, 0x41800000    # 16.0f

    .line 123
    .line 124
    const v14, 0x40dc28f6    # 6.88f

    .line 125
    .line 126
    .line 127
    const v15, 0x4188f5c3    # 17.12f

    .line 128
    .line 129
    .line 130
    const/high16 v16, 0x41000000    # 8.0f

    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v0, 0x41580000    # 13.5f

    .line 139
    .line 140
    const/high16 v2, 0x41100000    # 9.0f

    .line 141
    .line 142
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v17, 0x41700000    # 15.0f

    .line 146
    .line 147
    const/high16 v18, 0x40f00000    # 7.5f

    .line 148
    .line 149
    const v13, 0x416547ae    # 14.33f

    .line 150
    .line 151
    .line 152
    const/high16 v14, 0x41100000    # 9.0f

    .line 153
    .line 154
    const/high16 v15, 0x41700000    # 15.0f

    .line 155
    .line 156
    const v16, 0x410547ae    # 8.33f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v17, 0x41580000    # 13.5f

    .line 163
    .line 164
    const/high16 v18, 0x40a00000    # 5.0f

    .line 165
    .line 166
    const/high16 v13, 0x41700000    # 15.0f

    .line 167
    .line 168
    const v14, 0x40d51eb8    # 6.66f

    .line 169
    .line 170
    .line 171
    const/high16 v15, 0x41580000    # 13.5f

    .line 172
    .line 173
    const/high16 v16, 0x40a00000    # 5.0f

    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v0, 0x40d51eb8    # 6.66f

    .line 179
    .line 180
    .line 181
    const/high16 v2, 0x40f00000    # 7.5f

    .line 182
    .line 183
    const/high16 v4, 0x41400000    # 12.0f

    .line 184
    .line 185
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v18, 0x41100000    # 9.0f

    .line 189
    .line 190
    const/high16 v13, 0x41400000    # 12.0f

    .line 191
    .line 192
    const v14, 0x410547ae    # 8.33f

    .line 193
    .line 194
    .line 195
    const v15, 0x414ab852    # 12.67f

    .line 196
    .line 197
    .line 198
    const/high16 v16, 0x41100000    # 9.0f

    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v0, 0x40a00000    # 5.0f

    .line 207
    .line 208
    const v2, 0x4111eb85    # 9.12f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v0, -0x3f1a3d71    # -7.18f

    .line 215
    .line 216
    .line 217
    const v2, 0x40d947ae    # 6.79f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v17, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const v18, 0x415f851f    # 13.97f

    .line 226
    .line 227
    .line 228
    const v13, 0x3fab851f    # 1.34f

    .line 229
    .line 230
    .line 231
    const v14, 0x4145999a    # 12.35f

    .line 232
    .line 233
    .line 234
    const/high16 v15, 0x3f800000    # 1.0f

    .line 235
    .line 236
    const v16, 0x41523d71    # 13.14f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v0, 0x41a00000    # 20.0f

    .line 243
    .line 244
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v17, 0x40400000    # 3.0f

    .line 248
    .line 249
    const/high16 v18, 0x40400000    # 3.0f

    .line 250
    .line 251
    const/4 v13, 0x0

    .line 252
    const v14, 0x3fd47ae1    # 1.66f

    .line 253
    .line 254
    .line 255
    const v15, 0x3fab851f    # 1.34f

    .line 256
    .line 257
    .line 258
    const/high16 v16, 0x40400000    # 3.0f

    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v0, 0x40c80000    # 6.25f

    .line 264
    .line 265
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v0, 0x41400000    # 12.0f

    .line 269
    .line 270
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v0, 0x40b80000    # 5.75f

    .line 274
    .line 275
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 279
    .line 280
    const/high16 v18, -0x40600000    # -1.25f

    .line 281
    .line 282
    const v13, 0x3f30a3d7    # 0.69f

    .line 283
    .line 284
    .line 285
    const/4 v14, 0x0

    .line 286
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 287
    .line 288
    const v16, -0x40f0a3d7    # -0.56f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, -0x40f0a3d7    # -0.56f

    .line 295
    .line 296
    .line 297
    const/high16 v2, -0x40600000    # -1.25f

    .line 298
    .line 299
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v0, 0x41400000    # 12.0f

    .line 303
    .line 304
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v0, -0x40800000    # -1.0f

    .line 308
    .line 309
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v0, 0x40f80000    # 7.75f

    .line 313
    .line 314
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v0, 0x41a3851f    # 20.44f

    .line 321
    .line 322
    .line 323
    const/high16 v2, 0x419e0000    # 19.75f

    .line 324
    .line 325
    const/high16 v4, 0x41880000    # 17.0f

    .line 326
    .line 327
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v0, 0x41400000    # 12.0f

    .line 331
    .line 332
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, -0x40800000    # -1.0f

    .line 336
    .line 337
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x410c0000    # 8.75f

    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, -0x40f0a3d7    # -0.56f

    .line 349
    .line 350
    .line 351
    const/high16 v2, -0x40600000    # -1.25f

    .line 352
    .line 353
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v0, 0x41400000    # 12.0f

    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v0, -0x40800000    # -1.0f

    .line 362
    .line 363
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v0, 0x40d80000    # 6.75f

    .line 367
    .line 368
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x419b851f    # 19.44f

    .line 375
    .line 376
    .line 377
    const/high16 v2, 0x41960000    # 18.75f

    .line 378
    .line 379
    const/high16 v4, 0x41200000    # 10.0f

    .line 380
    .line 381
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v0, 0x410dc28f    # 8.86f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, 0x3fbeb852    # 1.49f

    .line 391
    .line 392
    .line 393
    const v18, -0x3fd8f5c3    # -2.61f

    .line 394
    .line 395
    .line 396
    const v13, 0x3f23d70a    # 0.64f

    .line 397
    .line 398
    .line 399
    const v14, -0x4071eb85    # -1.11f

    .line 400
    .line 401
    .line 402
    const v15, 0x3fbd70a4    # 1.48f

    .line 403
    .line 404
    .line 405
    const v16, -0x3fdae148    # -2.58f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v17, 0x3e0f5c29    # 0.14f

    .line 412
    .line 413
    .line 414
    const v18, -0x40f851ec    # -0.53f

    .line 415
    .line 416
    .line 417
    const v13, 0x3db851ec    # 0.09f

    .line 418
    .line 419
    .line 420
    const v14, -0x41dc28f6    # -0.16f

    .line 421
    .line 422
    .line 423
    const v15, 0x3e0f5c29    # 0.14f

    .line 424
    .line 425
    .line 426
    const v16, -0x41570a3d    # -0.33f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v17, -0x417ae148    # -0.26f

    .line 433
    .line 434
    .line 435
    const v18, -0x40cccccd    # -0.7f

    .line 436
    .line 437
    .line 438
    const/4 v13, 0x0

    .line 439
    const v14, -0x417ae148    # -0.26f

    .line 440
    .line 441
    .line 442
    const v15, -0x4247ae14    # -0.09f

    .line 443
    .line 444
    .line 445
    const/high16 v16, -0x41000000    # -0.5f

    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v17, 0x4111eb85    # 9.12f

    .line 451
    .line 452
    .line 453
    const/high16 v18, 0x40a00000    # 5.0f

    .line 454
    .line 455
    const v13, 0x4123851f    # 10.22f

    .line 456
    .line 457
    .line 458
    const v14, 0x40c3d70a    # 6.12f

    .line 459
    .line 460
    .line 461
    const v15, 0x4111eb85    # 9.12f

    .line 462
    .line 463
    .line 464
    const/high16 v16, 0x40a00000    # 5.0f

    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v0, 0x40a00000    # 5.0f

    .line 470
    .line 471
    const v2, 0x4111eb85    # 9.12f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    const/16 v16, 0x3800

    .line 485
    .line 486
    const/16 v17, 0x0

    .line 487
    .line 488
    const/high16 v6, 0x3f800000    # 1.0f

    .line 489
    .line 490
    const/high16 v8, 0x3f800000    # 1.0f

    .line 491
    .line 492
    const/4 v7, 0x0

    .line 493
    const/high16 v9, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/high16 v12, 0x3f800000    # 1.0f

    .line 496
    .line 497
    const/4 v13, 0x0

    .line 498
    const/4 v14, 0x0

    .line 499
    const/4 v15, 0x0

    .line 500
    const-string v4, ""

    .line 501
    .line 502
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    sput-object v0, Landroidx/compose/material/icons/filled/WashKt;->_wash:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 511
    .line 512
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    return-object v0
.end method
