.class public final Landroidx/compose/material/icons/sharp/CoronavirusKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_coronavirus",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Coronavirus",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getCoronavirus",
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
        "SMAP\nCoronavirus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Coronavirus.kt\nandroidx/compose/material/icons/sharp/CoronavirusKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,153:1\n212#2,12:154\n233#2,18:167\n253#2:204\n174#3:166\n705#4,2:185\n717#4,2:187\n719#4,11:193\n72#5,4:189\n*S KotlinDebug\n*F\n+ 1 Coronavirus.kt\nandroidx/compose/material/icons/sharp/CoronavirusKt\n*L\n29#1:154,12\n30#1:167,18\n30#1:204\n29#1:166\n30#1:185,2\n30#1:187,2\n30#1:193,11\n30#1:189,4\n*E\n"
    }
.end annotation


# static fields
.field private static _coronavirus:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCoronavirus(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/CoronavirusKt;->_coronavirus:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Coronavirus"

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
    const/high16 v0, 0x41a40000    # 20.5f

    .line 71
    .line 72
    const/high16 v2, 0x41280000    # 10.5f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x3f400000    # 0.75f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v0, -0x403ae148    # -1.54f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, -0x403d70a4    # -1.52f

    .line 89
    .line 90
    .line 91
    const v18, -0x3f966666    # -3.65f

    .line 92
    .line 93
    .line 94
    const v13, -0x41e66666    # -0.15f

    .line 95
    .line 96
    .line 97
    const v14, -0x4050a3d7    # -1.37f

    .line 98
    .line 99
    .line 100
    const v15, -0x40cf5c29    # -0.69f

    .line 101
    .line 102
    .line 103
    const v16, -0x3fd7ae14    # -2.63f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, -0x40747ae1    # -1.09f

    .line 110
    .line 111
    .line 112
    const v2, 0x3f8b851f    # 1.09f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, 0x3c23d70a    # 0.01f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, 0x3f07ae14    # 0.53f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v0, -0x407851ec    # -1.06f

    .line 131
    .line 132
    .line 133
    const v2, 0x3f87ae14    # 1.06f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, -0x3ff851ec    # -2.12f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v0, -0x407851ec    # -1.06f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v0, 0x3f051eb8    # 0.52f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, -0x40747ae1    # -1.09f

    .line 158
    .line 159
    .line 160
    const v2, 0x3f8b851f    # 1.09f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v17, -0x3f970a3d    # -3.64f

    .line 167
    .line 168
    .line 169
    const v18, -0x403eb852    # -1.51f

    .line 170
    .line 171
    .line 172
    const v13, -0x407d70a4    # -1.02f

    .line 173
    .line 174
    .line 175
    const v14, -0x40ae147b    # -0.82f

    .line 176
    .line 177
    .line 178
    const v15, -0x3feeb852    # -2.27f

    .line 179
    .line 180
    .line 181
    const v16, -0x4051eb85    # -1.36f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v0, 0x40600000    # 3.5f

    .line 188
    .line 189
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x3c23d70a    # 0.01f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x3f400000    # 0.75f

    .line 199
    .line 200
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, 0x40000000    # 2.0f

    .line 204
    .line 205
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 209
    .line 210
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 214
    .line 215
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v0, 0x3f3d70a4    # 0.74f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x3fc51eb8    # 1.54f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, 0x40f33333    # 7.6f

    .line 231
    .line 232
    .line 233
    const v18, 0x40d1eb85    # 6.56f

    .line 234
    .line 235
    .line 236
    const v13, 0x411deb85    # 9.87f

    .line 237
    .line 238
    .line 239
    const v14, 0x40a6147b    # 5.19f

    .line 240
    .line 241
    .line 242
    const v15, 0x4109eb85    # 8.62f

    .line 243
    .line 244
    .line 245
    const v16, 0x40b7ae14    # 5.74f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v0, 0x40d051ec    # 6.51f

    .line 252
    .line 253
    .line 254
    const v2, 0x40af0a3d    # 5.47f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, -0x43dc28f6    # -0.01f

    .line 261
    .line 262
    .line 263
    const v2, 0x3c23d70a    # 0.01f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, -0x40f851ec    # -0.53f

    .line 270
    .line 271
    .line 272
    const v2, 0x3f07ae14    # 0.53f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, 0x40bfae14    # 5.99f

    .line 279
    .line 280
    .line 281
    const v2, 0x4077ae14    # 3.87f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, 0x4077ae14    # 3.87f

    .line 288
    .line 289
    .line 290
    const v2, 0x40bfae14    # 5.99f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x3f87ae14    # 1.06f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, -0x40fae148    # -0.52f

    .line 303
    .line 304
    .line 305
    const v2, 0x3f051eb8    # 0.52f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, 0x3f8b851f    # 1.09f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v17, -0x40400000    # -1.5f

    .line 318
    .line 319
    const v18, 0x406851ec    # 3.63f

    .line 320
    .line 321
    .line 322
    const v13, -0x40ae147b    # -0.82f

    .line 323
    .line 324
    .line 325
    const v14, 0x3f828f5c    # 1.02f

    .line 326
    .line 327
    .line 328
    const v15, -0x4051eb85    # -1.36f

    .line 329
    .line 330
    .line 331
    const v16, 0x4010a3d7    # 2.26f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v0, 0x40600000    # 3.5f

    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v0, 0x41280000    # 10.5f

    .line 343
    .line 344
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x40000000    # 2.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v0, 0x40400000    # 3.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 358
    .line 359
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v0, -0x40c00000    # -0.75f

    .line 363
    .line 364
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, 0x3fc51eb8    # 1.54f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 374
    .line 375
    const v13, 0x3e19999a    # 0.15f

    .line 376
    .line 377
    .line 378
    const v14, 0x3faf5c29    # 1.37f

    .line 379
    .line 380
    .line 381
    const v15, 0x3f30a3d7    # 0.69f

    .line 382
    .line 383
    .line 384
    const v16, 0x40270a3d    # 2.61f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, -0x40747ae1    # -1.09f

    .line 391
    .line 392
    .line 393
    const v2, 0x3f8b851f    # 1.09f

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v0, -0x40fae148    # -0.52f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, -0x407851ec    # -1.06f

    .line 406
    .line 407
    .line 408
    const v2, 0x3f87ae14    # 1.06f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, 0x4007ae14    # 2.12f

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, -0x407851ec    # -1.06f

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, -0x40f851ec    # -0.53f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/4 v0, 0x0

    .line 433
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, -0x43dc28f6    # -0.01f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, -0x40747ae1    # -1.09f

    .line 443
    .line 444
    .line 445
    const v2, 0x3f8b851f    # 1.09f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v17, 0x406851ec    # 3.63f

    .line 452
    .line 453
    .line 454
    const v18, 0x3fc147ae    # 1.51f

    .line 455
    .line 456
    .line 457
    const v13, 0x3f828f5c    # 1.02f

    .line 458
    .line 459
    .line 460
    const v14, 0x3f51eb85    # 0.82f

    .line 461
    .line 462
    .line 463
    const v15, 0x4010a3d7    # 2.26f

    .line 464
    .line 465
    .line 466
    const v16, 0x3fae147b    # 1.36f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, 0x3fc51eb8    # 1.54f

    .line 473
    .line 474
    .line 475
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v0, 0x41280000    # 10.5f

    .line 479
    .line 480
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x41b00000    # 22.0f

    .line 484
    .line 485
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v0, 0x40400000    # 3.0f

    .line 489
    .line 490
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v0, -0x40400000    # -1.5f

    .line 494
    .line 495
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v0, -0x40c00000    # -0.75f

    .line 499
    .line 500
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v0, -0x43dc28f6    # -0.01f

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, -0x403ae148    # -1.54f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v17, 0x4068f5c3    # 3.64f

    .line 516
    .line 517
    .line 518
    const v18, -0x403eb852    # -1.51f

    .line 519
    .line 520
    .line 521
    const v13, 0x3faf5c29    # 1.37f

    .line 522
    .line 523
    .line 524
    const v14, -0x41f0a3d7    # -0.14f

    .line 525
    .line 526
    .line 527
    const v15, 0x4027ae14    # 2.62f

    .line 528
    .line 529
    .line 530
    const v16, -0x40cf5c29    # -0.69f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v0, 0x3f8b851f    # 1.09f

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, -0x40fae148    # -0.52f

    .line 543
    .line 544
    .line 545
    const v2, 0x3f051eb8    # 0.52f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, 0x3f87ae14    # 1.06f

    .line 552
    .line 553
    .line 554
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v0, 0x4007ae14    # 2.12f

    .line 558
    .line 559
    .line 560
    const v2, -0x3ff851ec    # -2.12f

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v0, -0x407851ec    # -1.06f

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v0, -0x40f851ec    # -0.53f

    .line 573
    .line 574
    .line 575
    const v2, 0x3f07ae14    # 0.53f

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const/16 v17, 0x0

    .line 582
    .line 583
    const/16 v18, 0x0

    .line 584
    .line 585
    const/4 v13, 0x0

    .line 586
    const/4 v14, 0x0

    .line 587
    const/4 v15, 0x0

    .line 588
    const/16 v16, 0x0

    .line 589
    .line 590
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v0, -0x43dc28f6    # -0.01f

    .line 594
    .line 595
    .line 596
    const v2, 0x3c23d70a    # 0.01f

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, -0x40747ae1    # -1.09f

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v17, 0x3fc28f5c    # 1.52f

    .line 609
    .line 610
    .line 611
    const v18, -0x3f966666    # -3.65f

    .line 612
    .line 613
    .line 614
    const v13, 0x3f51eb85    # 0.82f

    .line 615
    .line 616
    .line 617
    const v14, -0x407d70a4    # -1.02f

    .line 618
    .line 619
    .line 620
    const v15, 0x3faf5c29    # 1.37f

    .line 621
    .line 622
    .line 623
    const v16, -0x3feeb852    # -2.27f

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, 0x3fc51eb8    # 1.54f

    .line 630
    .line 631
    .line 632
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const/high16 v0, 0x3f400000    # 0.75f

    .line 636
    .line 637
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const/high16 v0, 0x41b00000    # 22.0f

    .line 641
    .line 642
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 646
    .line 647
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v0, 0x41a40000    # 20.5f

    .line 651
    .line 652
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/high16 v0, 0x415c0000    # 13.75f

    .line 659
    .line 660
    const/high16 v2, 0x41000000    # 8.0f

    .line 661
    .line 662
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v17, 0x3f800000    # 1.0f

    .line 666
    .line 667
    const/high16 v18, 0x3f800000    # 1.0f

    .line 668
    .line 669
    const v13, 0x3f0ccccd    # 0.55f

    .line 670
    .line 671
    .line 672
    const/4 v14, 0x0

    .line 673
    const/high16 v15, 0x3f800000    # 1.0f

    .line 674
    .line 675
    const v16, 0x3ee66666    # 0.45f

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v0, -0x4119999a    # -0.45f

    .line 682
    .line 683
    .line 684
    const/high16 v2, -0x40800000    # -1.0f

    .line 685
    .line 686
    const/high16 v4, 0x3f800000    # 1.0f

    .line 687
    .line 688
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const v0, 0x41533333    # 13.2f

    .line 695
    .line 696
    .line 697
    const/high16 v2, 0x415c0000    # 13.75f

    .line 698
    .line 699
    const/high16 v4, 0x41000000    # 8.0f

    .line 700
    .line 701
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const/high16 v0, 0x41240000    # 10.25f

    .line 708
    .line 709
    const/high16 v2, 0x41000000    # 8.0f

    .line 710
    .line 711
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v0, -0x4119999a    # -0.45f

    .line 718
    .line 719
    .line 720
    const/high16 v2, -0x40800000    # -1.0f

    .line 721
    .line 722
    const/high16 v4, 0x3f800000    # 1.0f

    .line 723
    .line 724
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const v0, 0x411b3333    # 9.7f

    .line 731
    .line 732
    .line 733
    const/high16 v2, 0x41240000    # 10.25f

    .line 734
    .line 735
    const/high16 v4, 0x41000000    # 8.0f

    .line 736
    .line 737
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const/high16 v0, 0x41080000    # 8.5f

    .line 744
    .line 745
    const/high16 v2, 0x41500000    # 13.0f

    .line 746
    .line 747
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const/high16 v17, -0x40800000    # -1.0f

    .line 751
    .line 752
    const/high16 v18, -0x40800000    # -1.0f

    .line 753
    .line 754
    const v13, -0x40f33333    # -0.55f

    .line 755
    .line 756
    .line 757
    const/high16 v15, -0x40800000    # -1.0f

    .line 758
    .line 759
    const v16, -0x4119999a    # -0.45f

    .line 760
    .line 761
    .line 762
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const/high16 v17, 0x3f800000    # 1.0f

    .line 766
    .line 767
    const/4 v13, 0x0

    .line 768
    const v14, -0x40f33333    # -0.55f

    .line 769
    .line 770
    .line 771
    const v15, 0x3ee66666    # 0.45f

    .line 772
    .line 773
    .line 774
    const/high16 v16, -0x40800000    # -1.0f

    .line 775
    .line 776
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const v0, 0x3ee66666    # 0.45f

    .line 780
    .line 781
    .line 782
    const/high16 v2, 0x3f800000    # 1.0f

    .line 783
    .line 784
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const/high16 v17, 0x41080000    # 8.5f

    .line 788
    .line 789
    const/high16 v18, 0x41500000    # 13.0f

    .line 790
    .line 791
    const/high16 v13, 0x41180000    # 9.5f

    .line 792
    .line 793
    const v14, 0x4148cccd    # 12.55f

    .line 794
    .line 795
    .line 796
    const v15, 0x4110cccd    # 9.05f

    .line 797
    .line 798
    .line 799
    const/high16 v16, 0x41500000    # 13.0f

    .line 800
    .line 801
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const/high16 v0, 0x41800000    # 16.0f

    .line 808
    .line 809
    const/high16 v2, 0x41240000    # 10.25f

    .line 810
    .line 811
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const/high16 v17, -0x40800000    # -1.0f

    .line 815
    .line 816
    const/high16 v18, -0x40800000    # -1.0f

    .line 817
    .line 818
    const v13, -0x40f33333    # -0.55f

    .line 819
    .line 820
    .line 821
    const/4 v14, 0x0

    .line 822
    const/high16 v15, -0x40800000    # -1.0f

    .line 823
    .line 824
    const v16, -0x4119999a    # -0.45f

    .line 825
    .line 826
    .line 827
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const/high16 v17, 0x3f800000    # 1.0f

    .line 831
    .line 832
    const/4 v13, 0x0

    .line 833
    const v14, -0x40f33333    # -0.55f

    .line 834
    .line 835
    .line 836
    const v15, 0x3ee66666    # 0.45f

    .line 837
    .line 838
    .line 839
    const/high16 v16, -0x40800000    # -1.0f

    .line 840
    .line 841
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    const v0, 0x3ee66666    # 0.45f

    .line 845
    .line 846
    .line 847
    const/high16 v2, 0x3f800000    # 1.0f

    .line 848
    .line 849
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const/high16 v17, 0x41240000    # 10.25f

    .line 853
    .line 854
    const/high16 v18, 0x41800000    # 16.0f

    .line 855
    .line 856
    const/high16 v13, 0x41340000    # 11.25f

    .line 857
    .line 858
    const v14, 0x4178cccd    # 15.55f

    .line 859
    .line 860
    .line 861
    const v15, 0x412ccccd    # 10.8f

    .line 862
    .line 863
    .line 864
    const/high16 v16, 0x41800000    # 16.0f

    .line 865
    .line 866
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const/high16 v0, 0x41400000    # 12.0f

    .line 873
    .line 874
    const/high16 v2, 0x41500000    # 13.0f

    .line 875
    .line 876
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    const/high16 v17, -0x40800000    # -1.0f

    .line 880
    .line 881
    const/high16 v18, -0x40800000    # -1.0f

    .line 882
    .line 883
    const v13, -0x40f33333    # -0.55f

    .line 884
    .line 885
    .line 886
    const/4 v14, 0x0

    .line 887
    const/high16 v15, -0x40800000    # -1.0f

    .line 888
    .line 889
    const v16, -0x4119999a    # -0.45f

    .line 890
    .line 891
    .line 892
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 893
    .line 894
    .line 895
    const/high16 v17, 0x3f800000    # 1.0f

    .line 896
    .line 897
    const/4 v13, 0x0

    .line 898
    const v14, -0x40f33333    # -0.55f

    .line 899
    .line 900
    .line 901
    const v15, 0x3ee66666    # 0.45f

    .line 902
    .line 903
    .line 904
    const/high16 v16, -0x40800000    # -1.0f

    .line 905
    .line 906
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 907
    .line 908
    .line 909
    const v0, 0x3ee66666    # 0.45f

    .line 910
    .line 911
    .line 912
    const/high16 v2, 0x3f800000    # 1.0f

    .line 913
    .line 914
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 915
    .line 916
    .line 917
    const/high16 v17, 0x41400000    # 12.0f

    .line 918
    .line 919
    const/high16 v18, 0x41500000    # 13.0f

    .line 920
    .line 921
    const/high16 v13, 0x41500000    # 13.0f

    .line 922
    .line 923
    const v14, 0x4148cccd    # 12.55f

    .line 924
    .line 925
    .line 926
    const v15, 0x4148cccd    # 12.55f

    .line 927
    .line 928
    .line 929
    const/high16 v16, 0x41500000    # 13.0f

    .line 930
    .line 931
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 932
    .line 933
    .line 934
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    const/high16 v0, 0x41800000    # 16.0f

    .line 938
    .line 939
    const/high16 v2, 0x415c0000    # 13.75f

    .line 940
    .line 941
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const/high16 v17, -0x40800000    # -1.0f

    .line 945
    .line 946
    const/high16 v18, -0x40800000    # -1.0f

    .line 947
    .line 948
    const v13, -0x40f33333    # -0.55f

    .line 949
    .line 950
    .line 951
    const/4 v14, 0x0

    .line 952
    const/high16 v15, -0x40800000    # -1.0f

    .line 953
    .line 954
    const v16, -0x4119999a    # -0.45f

    .line 955
    .line 956
    .line 957
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 958
    .line 959
    .line 960
    const/high16 v17, 0x3f800000    # 1.0f

    .line 961
    .line 962
    const/4 v13, 0x0

    .line 963
    const v14, -0x40f33333    # -0.55f

    .line 964
    .line 965
    .line 966
    const v15, 0x3ee66666    # 0.45f

    .line 967
    .line 968
    .line 969
    const/high16 v16, -0x40800000    # -1.0f

    .line 970
    .line 971
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 972
    .line 973
    .line 974
    const v0, 0x3ee66666    # 0.45f

    .line 975
    .line 976
    .line 977
    const/high16 v2, 0x3f800000    # 1.0f

    .line 978
    .line 979
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 980
    .line 981
    .line 982
    const/high16 v17, 0x415c0000    # 13.75f

    .line 983
    .line 984
    const/high16 v18, 0x41800000    # 16.0f

    .line 985
    .line 986
    const/high16 v13, 0x416c0000    # 14.75f

    .line 987
    .line 988
    const v14, 0x4178cccd    # 15.55f

    .line 989
    .line 990
    .line 991
    const v15, 0x4164cccd    # 14.3f

    .line 992
    .line 993
    .line 994
    const/high16 v16, 0x41800000    # 16.0f

    .line 995
    .line 996
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 997
    .line 998
    .line 999
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1000
    .line 1001
    .line 1002
    const/high16 v0, 0x41780000    # 15.5f

    .line 1003
    .line 1004
    const/high16 v2, 0x41500000    # 13.0f

    .line 1005
    .line 1006
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1007
    .line 1008
    .line 1009
    const/high16 v17, -0x40800000    # -1.0f

    .line 1010
    .line 1011
    const/high16 v18, -0x40800000    # -1.0f

    .line 1012
    .line 1013
    const v13, -0x40f33333    # -0.55f

    .line 1014
    .line 1015
    .line 1016
    const/4 v14, 0x0

    .line 1017
    const/high16 v15, -0x40800000    # -1.0f

    .line 1018
    .line 1019
    const v16, -0x4119999a    # -0.45f

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1023
    .line 1024
    .line 1025
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1026
    .line 1027
    const/4 v13, 0x0

    .line 1028
    const v14, -0x40f33333    # -0.55f

    .line 1029
    .line 1030
    .line 1031
    const v15, 0x3ee66666    # 0.45f

    .line 1032
    .line 1033
    .line 1034
    const/high16 v16, -0x40800000    # -1.0f

    .line 1035
    .line 1036
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1037
    .line 1038
    .line 1039
    const v0, 0x3ee66666    # 0.45f

    .line 1040
    .line 1041
    .line 1042
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1043
    .line 1044
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1045
    .line 1046
    .line 1047
    const/high16 v17, 0x41780000    # 15.5f

    .line 1048
    .line 1049
    const/high16 v18, 0x41500000    # 13.0f

    .line 1050
    .line 1051
    const/high16 v13, 0x41840000    # 16.5f

    .line 1052
    .line 1053
    const v14, 0x4148cccd    # 12.55f

    .line 1054
    .line 1055
    .line 1056
    const v15, 0x41806666    # 16.05f

    .line 1057
    .line 1058
    .line 1059
    const/high16 v16, 0x41500000    # 13.0f

    .line 1060
    .line 1061
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v2

    .line 1071
    const/16 v16, 0x3800

    .line 1072
    .line 1073
    const/16 v17, 0x0

    .line 1074
    .line 1075
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1076
    .line 1077
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1078
    .line 1079
    const/4 v7, 0x0

    .line 1080
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1081
    .line 1082
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1083
    .line 1084
    const/4 v13, 0x0

    .line 1085
    const/4 v14, 0x0

    .line 1086
    const/4 v15, 0x0

    .line 1087
    const-string v4, ""

    .line 1088
    .line 1089
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v0

    .line 1097
    sput-object v0, Landroidx/compose/material/icons/sharp/CoronavirusKt;->_coronavirus:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1098
    .line 1099
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1100
    .line 1101
    .line 1102
    return-object v0
.end method
