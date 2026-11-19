.class public final Landroidx/compose/material/icons/filled/SoapKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_soap",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Soap",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getSoap",
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
        "SMAP\nSoap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Soap.kt\nandroidx/compose/material/icons/filled/SoapKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,99:1\n212#2,12:100\n233#2,18:113\n253#2:150\n174#3:112\n705#4,2:131\n717#4,2:133\n719#4,11:139\n72#5,4:135\n*S KotlinDebug\n*F\n+ 1 Soap.kt\nandroidx/compose/material/icons/filled/SoapKt\n*L\n29#1:100,12\n30#1:113,18\n30#1:150\n29#1:112\n30#1:131,2\n30#1:133,2\n30#1:139,11\n30#1:135,4\n*E\n"
    }
.end annotation


# static fields
.field private static _soap:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSoap(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/SoapKt;->_soap:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Soap"

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
    const/high16 v0, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const v2, 0x4111eb85    # 9.12f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, -0x3f1a3d71    # -7.18f

    .line 79
    .line 80
    .line 81
    const v2, 0x40d947ae    # 6.79f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v17, 0x3f800000    # 1.0f

    .line 88
    .line 89
    const v18, 0x415f851f    # 13.97f

    .line 90
    .line 91
    .line 92
    const v13, 0x3fab851f    # 1.34f

    .line 93
    .line 94
    .line 95
    const v14, 0x4145999a    # 12.35f

    .line 96
    .line 97
    .line 98
    const/high16 v15, 0x3f800000    # 1.0f

    .line 99
    .line 100
    const v16, 0x41523d71    # 13.14f

    .line 101
    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, 0x41a00000    # 20.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v17, 0x40400000    # 3.0f

    .line 112
    .line 113
    const/high16 v18, 0x40400000    # 3.0f

    .line 114
    .line 115
    const/4 v13, 0x0

    .line 116
    const v14, 0x3fd47ae1    # 1.66f

    .line 117
    .line 118
    .line 119
    const v15, 0x3fab851f    # 1.34f

    .line 120
    .line 121
    .line 122
    const/high16 v16, 0x40400000    # 3.0f

    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v0, 0x40c80000    # 6.25f

    .line 128
    .line 129
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v0, 0x41400000    # 12.0f

    .line 133
    .line 134
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x40b80000    # 5.75f

    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 143
    .line 144
    const/high16 v18, -0x40600000    # -1.25f

    .line 145
    .line 146
    const v13, 0x3f30a3d7    # 0.69f

    .line 147
    .line 148
    .line 149
    const/4 v14, 0x0

    .line 150
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 151
    .line 152
    const v16, -0x40f0a3d7    # -0.56f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, -0x40f0a3d7    # -0.56f

    .line 159
    .line 160
    .line 161
    const/high16 v2, -0x40600000    # -1.25f

    .line 162
    .line 163
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x41400000    # 12.0f

    .line 167
    .line 168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v0, -0x40800000    # -1.0f

    .line 172
    .line 173
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v0, 0x40f80000    # 7.75f

    .line 177
    .line 178
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v0, 0x41a3851f    # 20.44f

    .line 185
    .line 186
    .line 187
    const/high16 v2, 0x41880000    # 17.0f

    .line 188
    .line 189
    const/high16 v4, 0x419e0000    # 19.75f

    .line 190
    .line 191
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, 0x41400000    # 12.0f

    .line 195
    .line 196
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v0, -0x40800000    # -1.0f

    .line 200
    .line 201
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x410c0000    # 8.75f

    .line 205
    .line 206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, -0x40f0a3d7    # -0.56f

    .line 213
    .line 214
    .line 215
    const/high16 v2, -0x40600000    # -1.25f

    .line 216
    .line 217
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v0, 0x41400000    # 12.0f

    .line 221
    .line 222
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, -0x40800000    # -1.0f

    .line 226
    .line 227
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v0, 0x40d80000    # 6.75f

    .line 231
    .line 232
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, 0x419b851f    # 19.44f

    .line 239
    .line 240
    .line 241
    const/high16 v2, 0x41960000    # 18.75f

    .line 242
    .line 243
    const/high16 v4, 0x41200000    # 10.0f

    .line 244
    .line 245
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v0, 0x410dc28f    # 8.86f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, 0x3fbeb852    # 1.49f

    .line 255
    .line 256
    .line 257
    const v18, -0x3fd8f5c3    # -2.61f

    .line 258
    .line 259
    .line 260
    const v13, 0x3f23d70a    # 0.64f

    .line 261
    .line 262
    .line 263
    const v14, -0x4071eb85    # -1.11f

    .line 264
    .line 265
    .line 266
    const v15, 0x3fbd70a4    # 1.48f

    .line 267
    .line 268
    .line 269
    const v16, -0x3fdae148    # -2.58f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, 0x3e0f5c29    # 0.14f

    .line 276
    .line 277
    .line 278
    const v18, -0x40f851ec    # -0.53f

    .line 279
    .line 280
    .line 281
    const v13, 0x3db851ec    # 0.09f

    .line 282
    .line 283
    .line 284
    const v14, -0x41dc28f6    # -0.16f

    .line 285
    .line 286
    .line 287
    const v15, 0x3e0f5c29    # 0.14f

    .line 288
    .line 289
    .line 290
    const v16, -0x41570a3d    # -0.33f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v17, -0x417ae148    # -0.26f

    .line 297
    .line 298
    .line 299
    const v18, -0x40cccccd    # -0.7f

    .line 300
    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    const v14, -0x417ae148    # -0.26f

    .line 304
    .line 305
    .line 306
    const v15, -0x4247ae14    # -0.09f

    .line 307
    .line 308
    .line 309
    const/high16 v16, -0x41000000    # -0.5f

    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, 0x4111eb85    # 9.12f

    .line 315
    .line 316
    .line 317
    const/high16 v18, 0x40a00000    # 5.0f

    .line 318
    .line 319
    const v13, 0x4123851f    # 10.22f

    .line 320
    .line 321
    .line 322
    const v14, 0x40c3d70a    # 6.12f

    .line 323
    .line 324
    .line 325
    const v15, 0x4111eb85    # 9.12f

    .line 326
    .line 327
    .line 328
    const/high16 v16, 0x40a00000    # 5.0f

    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v0, 0x40a00000    # 5.0f

    .line 334
    .line 335
    const v2, 0x4111eb85    # 9.12f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v0, 0x40c80000    # 6.25f

    .line 345
    .line 346
    const/high16 v2, 0x41600000    # 14.0f

    .line 347
    .line 348
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v17, 0x3f400000    # 0.75f

    .line 352
    .line 353
    const/high16 v18, 0x3f400000    # 0.75f

    .line 354
    .line 355
    const v13, 0x3ed1eb85    # 0.41f

    .line 356
    .line 357
    .line 358
    const/4 v14, 0x0

    .line 359
    const/high16 v15, 0x3f400000    # 0.75f

    .line 360
    .line 361
    const v16, 0x3eae147b    # 0.34f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, 0x41668f5c    # 14.41f

    .line 368
    .line 369
    .line 370
    const/high16 v2, 0x40f80000    # 7.75f

    .line 371
    .line 372
    const/high16 v4, 0x41600000    # 14.0f

    .line 373
    .line 374
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, 0x40ed1eb8    # 7.41f

    .line 378
    .line 379
    .line 380
    const/high16 v2, 0x40e00000    # 7.0f

    .line 381
    .line 382
    const/high16 v4, 0x41540000    # 13.25f

    .line 383
    .line 384
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, 0x415970a4    # 13.59f

    .line 388
    .line 389
    .line 390
    const/high16 v2, 0x40c80000    # 6.25f

    .line 391
    .line 392
    const/high16 v4, 0x41600000    # 14.0f

    .line 393
    .line 394
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v0, 0x40980000    # 4.75f

    .line 398
    .line 399
    const/high16 v2, 0x41600000    # 14.0f

    .line 400
    .line 401
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v17, -0x3ff00000    # -2.25f

    .line 405
    .line 406
    const/high16 v18, 0x40100000    # 2.25f

    .line 407
    .line 408
    const v13, -0x406147ae    # -1.24f

    .line 409
    .line 410
    .line 411
    const/high16 v15, -0x3ff00000    # -2.25f

    .line 412
    .line 413
    const v16, 0x3f8147ae    # 1.01f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v0, 0x41140000    # 9.25f

    .line 420
    .line 421
    const/high16 v2, 0x41140000    # 9.25f

    .line 422
    .line 423
    const v6, 0x414c28f6    # 12.76f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, 0x4103d70a    # 8.24f

    .line 430
    .line 431
    .line 432
    const/high16 v2, 0x41820000    # 16.25f

    .line 433
    .line 434
    const/high16 v4, 0x40e00000    # 7.0f

    .line 435
    .line 436
    const/high16 v6, 0x41820000    # 16.25f

    .line 437
    .line 438
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, 0x4173d70a    # 15.24f

    .line 442
    .line 443
    .line 444
    const/high16 v2, 0x40980000    # 4.75f

    .line 445
    .line 446
    const/high16 v4, 0x41600000    # 14.0f

    .line 447
    .line 448
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v0, 0x40980000    # 4.75f

    .line 452
    .line 453
    const/high16 v2, 0x41600000    # 14.0f

    .line 454
    .line 455
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v0, 0x40b00000    # 5.5f

    .line 462
    .line 463
    const/high16 v2, 0x419e0000    # 19.75f

    .line 464
    .line 465
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v17, 0x3f000000    # 0.5f

    .line 469
    .line 470
    const/high16 v18, 0x3f000000    # 0.5f

    .line 471
    .line 472
    const v13, 0x3e8f5c29    # 0.28f

    .line 473
    .line 474
    .line 475
    const/high16 v15, 0x3f000000    # 0.5f

    .line 476
    .line 477
    const v16, 0x3e6147ae    # 0.22f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x3f000000    # 0.5f

    .line 484
    .line 485
    const/high16 v2, 0x3f000000    # 0.5f

    .line 486
    .line 487
    const/high16 v4, -0x41000000    # -0.5f

    .line 488
    .line 489
    const v6, -0x419eb852    # -0.22f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v0, -0x419eb852    # -0.22f

    .line 496
    .line 497
    .line 498
    const/high16 v2, -0x41000000    # -0.5f

    .line 499
    .line 500
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v0, 0x419bc28f    # 19.47f

    .line 504
    .line 505
    .line 506
    const/high16 v2, 0x40b00000    # 5.5f

    .line 507
    .line 508
    const/high16 v4, 0x419e0000    # 19.75f

    .line 509
    .line 510
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v0, 0x40800000    # 4.0f

    .line 514
    .line 515
    const/high16 v2, 0x419e0000    # 19.75f

    .line 516
    .line 517
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v17, -0x40000000    # -2.0f

    .line 521
    .line 522
    const/high16 v18, 0x40000000    # 2.0f

    .line 523
    .line 524
    const v13, -0x40733333    # -1.1f

    .line 525
    .line 526
    .line 527
    const/high16 v15, -0x40000000    # -2.0f

    .line 528
    .line 529
    const v16, 0x3f666666    # 0.9f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v0, 0x3f666666    # 0.9f

    .line 536
    .line 537
    .line 538
    const/high16 v2, 0x40000000    # 2.0f

    .line 539
    .line 540
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v0, -0x4099999a    # -0.9f

    .line 544
    .line 545
    .line 546
    const/high16 v2, -0x40000000    # -2.0f

    .line 547
    .line 548
    const/high16 v4, 0x40000000    # 2.0f

    .line 549
    .line 550
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, 0x41a6cccd    # 20.85f

    .line 554
    .line 555
    .line 556
    const/high16 v2, 0x40800000    # 4.0f

    .line 557
    .line 558
    const/high16 v4, 0x419e0000    # 19.75f

    .line 559
    .line 560
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v0, 0x40800000    # 4.0f

    .line 564
    .line 565
    const/high16 v2, 0x419e0000    # 19.75f

    .line 566
    .line 567
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v0, 0x3f800000    # 1.0f

    .line 574
    .line 575
    const/high16 v2, 0x41840000    # 16.5f

    .line 576
    .line 577
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v17, 0x41700000    # 15.0f

    .line 581
    .line 582
    const/high16 v18, 0x40200000    # 2.5f

    .line 583
    .line 584
    const v13, 0x417ab852    # 15.67f

    .line 585
    .line 586
    .line 587
    const/high16 v14, 0x3f800000    # 1.0f

    .line 588
    .line 589
    const/high16 v15, 0x41700000    # 15.0f

    .line 590
    .line 591
    const v16, 0x3fd5c28f    # 1.67f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v0, 0x417ab852    # 15.67f

    .line 598
    .line 599
    .line 600
    const/high16 v4, 0x40800000    # 4.0f

    .line 601
    .line 602
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v17, 0x41900000    # 18.0f

    .line 606
    .line 607
    const v13, 0x418aa3d7    # 17.33f

    .line 608
    .line 609
    .line 610
    const/high16 v14, 0x40800000    # 4.0f

    .line 611
    .line 612
    const/high16 v15, 0x41900000    # 18.0f

    .line 613
    .line 614
    const v16, 0x40551eb8    # 3.33f

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v0, 0x418aa3d7    # 17.33f

    .line 621
    .line 622
    .line 623
    const/high16 v2, 0x3f800000    # 1.0f

    .line 624
    .line 625
    const/high16 v4, 0x41840000    # 16.5f

    .line 626
    .line 627
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    const/16 v16, 0x3800

    .line 638
    .line 639
    const/16 v17, 0x0

    .line 640
    .line 641
    const/high16 v6, 0x3f800000    # 1.0f

    .line 642
    .line 643
    const/high16 v8, 0x3f800000    # 1.0f

    .line 644
    .line 645
    const/4 v7, 0x0

    .line 646
    const/high16 v9, 0x3f800000    # 1.0f

    .line 647
    .line 648
    const/high16 v12, 0x3f800000    # 1.0f

    .line 649
    .line 650
    const/4 v13, 0x0

    .line 651
    const/4 v14, 0x0

    .line 652
    const/4 v15, 0x0

    .line 653
    const-string v4, ""

    .line 654
    .line 655
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    sput-object v0, Landroidx/compose/material/icons/filled/SoapKt;->_soap:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 664
    .line 665
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    return-object v0
.end method
