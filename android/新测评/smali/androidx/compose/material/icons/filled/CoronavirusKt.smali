.class public final Landroidx/compose/material/icons/filled/CoronavirusKt;
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
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getCoronavirus",
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
        "SMAP\nCoronavirus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Coronavirus.kt\nandroidx/compose/material/icons/filled/CoronavirusKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,151:1\n212#2,12:152\n233#2,18:165\n253#2:202\n174#3:164\n705#4,2:183\n717#4,2:185\n719#4,11:191\n72#5,4:187\n*S KotlinDebug\n*F\n+ 1 Coronavirus.kt\nandroidx/compose/material/icons/filled/CoronavirusKt\n*L\n29#1:152,12\n30#1:165,18\n30#1:202\n29#1:164\n30#1:183,2\n30#1:185,2\n30#1:191,11\n30#1:187,4\n*E\n"
    }
.end annotation


# static fields
.field private static _coronavirus:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCoronavirus(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/CoronavirusKt;->_coronavirus:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Coronavirus"

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
    const/high16 v0, 0x41aa0000    # 21.25f

    .line 71
    .line 72
    const/high16 v2, 0x41280000    # 10.5f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40c00000    # -0.75f

    .line 78
    .line 79
    const/high16 v18, 0x3f400000    # 0.75f

    .line 80
    .line 81
    const v13, -0x412e147b    # -0.41f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x40c00000    # -0.75f

    .line 86
    .line 87
    const v16, 0x3eae147b    # 0.34f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, -0x403ae148    # -1.54f

    .line 94
    .line 95
    .line 96
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, -0x403d70a4    # -1.52f

    .line 100
    .line 101
    .line 102
    const v18, -0x3f966666    # -3.65f

    .line 103
    .line 104
    .line 105
    const v13, -0x41e66666    # -0.15f

    .line 106
    .line 107
    .line 108
    const v14, -0x4050a3d7    # -1.37f

    .line 109
    .line 110
    .line 111
    const v15, -0x40cf5c29    # -0.69f

    .line 112
    .line 113
    .line 114
    const v16, -0x3fd7ae14    # -2.63f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v0, -0x40747ae1    # -1.09f

    .line 121
    .line 122
    .line 123
    const v2, 0x3f8b851f    # 1.09f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, 0x3c23d70a    # 0.01f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, 0x3f87ae14    # 1.06f

    .line 136
    .line 137
    .line 138
    const/16 v18, 0x0

    .line 139
    .line 140
    const v13, 0x3e947ae1    # 0.29f

    .line 141
    .line 142
    .line 143
    const v14, 0x3e947ae1    # 0.29f

    .line 144
    .line 145
    .line 146
    const v15, 0x3f451eb8    # 0.77f

    .line 147
    .line 148
    .line 149
    const v16, 0x3e947ae1    # 0.29f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v0, -0x40bae148    # -0.77f

    .line 156
    .line 157
    .line 158
    const/4 v2, 0x0

    .line 159
    const v4, -0x407851ec    # -1.06f

    .line 160
    .line 161
    .line 162
    const v6, 0x3e947ae1    # 0.29f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v0, 0x419451ec    # 18.54f

    .line 169
    .line 170
    .line 171
    const v2, 0x408ccccd    # 4.4f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, -0x407851ec    # -1.06f

    .line 178
    .line 179
    .line 180
    const v13, -0x416b851f    # -0.29f

    .line 181
    .line 182
    .line 183
    const v14, -0x416b851f    # -0.29f

    .line 184
    .line 185
    .line 186
    const v15, -0x40bae148    # -0.77f

    .line 187
    .line 188
    .line 189
    const v16, -0x416b851f    # -0.29f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v17, -0x43dc28f6    # -0.01f

    .line 196
    .line 197
    .line 198
    const v18, 0x3f866666    # 1.05f

    .line 199
    .line 200
    .line 201
    const v14, 0x3e947ae1    # 0.29f

    .line 202
    .line 203
    .line 204
    const v15, -0x416b851f    # -0.29f

    .line 205
    .line 206
    .line 207
    const v16, 0x3f428f5c    # 0.76f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, -0x40747ae1    # -1.09f

    .line 214
    .line 215
    .line 216
    const v2, 0x3f8b851f    # 1.09f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, -0x3f970a3d    # -3.64f

    .line 223
    .line 224
    .line 225
    const v18, -0x403eb852    # -1.51f

    .line 226
    .line 227
    .line 228
    const v13, -0x407d70a4    # -1.02f

    .line 229
    .line 230
    .line 231
    const v14, -0x40ae147b    # -0.82f

    .line 232
    .line 233
    .line 234
    const v15, -0x3feeb852    # -2.27f

    .line 235
    .line 236
    .line 237
    const v16, -0x4051eb85    # -1.36f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v0, 0x40600000    # 3.5f

    .line 244
    .line 245
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v0, 0x3c23d70a    # 0.01f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v17, 0x3f400000    # 0.75f

    .line 255
    .line 256
    const/high16 v18, -0x40c00000    # -0.75f

    .line 257
    .line 258
    const v13, 0x3ed1eb85    # 0.41f

    .line 259
    .line 260
    .line 261
    const/4 v14, 0x0

    .line 262
    const/high16 v15, 0x3f400000    # 0.75f

    .line 263
    .line 264
    const v16, -0x4151eb85    # -0.34f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v17, 0x414c0000    # 12.75f

    .line 271
    .line 272
    const/high16 v18, 0x40000000    # 2.0f

    .line 273
    .line 274
    const/high16 v13, 0x41580000    # 13.5f

    .line 275
    .line 276
    const v14, 0x4015c28f    # 2.34f

    .line 277
    .line 278
    .line 279
    const v15, 0x41528f5c    # 13.16f

    .line 280
    .line 281
    .line 282
    const/high16 v16, 0x40000000    # 2.0f

    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v0, -0x40400000    # -1.5f

    .line 288
    .line 289
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v17, -0x40c00000    # -0.75f

    .line 293
    .line 294
    const/high16 v18, 0x3f400000    # 0.75f

    .line 295
    .line 296
    const v13, -0x412e147b    # -0.41f

    .line 297
    .line 298
    .line 299
    const/4 v14, 0x0

    .line 300
    const/high16 v15, -0x40c00000    # -0.75f

    .line 301
    .line 302
    const v16, 0x3eae147b    # 0.34f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, 0x3f3d70a4    # 0.74f

    .line 309
    .line 310
    .line 311
    const/4 v13, 0x0

    .line 312
    const v14, 0x3ed1eb85    # 0.41f

    .line 313
    .line 314
    .line 315
    const v15, 0x3ea8f5c3    # 0.33f

    .line 316
    .line 317
    .line 318
    const v16, 0x3f3d70a4    # 0.74f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, 0x3fc66666    # 1.55f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v17, 0x40f33333    # 7.6f

    .line 331
    .line 332
    .line 333
    const v18, 0x40d1eb85    # 6.56f

    .line 334
    .line 335
    .line 336
    const v13, 0x411deb85    # 9.87f

    .line 337
    .line 338
    .line 339
    const v14, 0x40a6147b    # 5.19f

    .line 340
    .line 341
    .line 342
    const v15, 0x4109eb85    # 8.62f

    .line 343
    .line 344
    .line 345
    const v16, 0x40b7ae14    # 5.74f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, 0x40d051ec    # 6.51f

    .line 352
    .line 353
    .line 354
    const v2, 0x40af0a3d    # 5.47f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, -0x43dc28f6    # -0.01f

    .line 361
    .line 362
    .line 363
    const v2, 0x3c23d70a    # 0.01f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/16 v17, 0x0

    .line 370
    .line 371
    const v18, -0x407851ec    # -1.06f

    .line 372
    .line 373
    .line 374
    const v13, 0x3e947ae1    # 0.29f

    .line 375
    .line 376
    .line 377
    const v14, -0x416b851f    # -0.29f

    .line 378
    .line 379
    .line 380
    const v15, 0x3e947ae1    # 0.29f

    .line 381
    .line 382
    .line 383
    const v16, -0x40bae148    # -0.77f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v17, -0x407851ec    # -1.06f

    .line 390
    .line 391
    .line 392
    const/16 v18, 0x0

    .line 393
    .line 394
    const v13, -0x416b851f    # -0.29f

    .line 395
    .line 396
    .line 397
    const v15, -0x40bae148    # -0.77f

    .line 398
    .line 399
    .line 400
    const v16, -0x416b851f    # -0.29f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v0, 0x40aeb852    # 5.46f

    .line 407
    .line 408
    .line 409
    const v2, 0x408ccccd    # 4.4f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/16 v17, 0x0

    .line 416
    .line 417
    const v18, 0x3f87ae14    # 1.06f

    .line 418
    .line 419
    .line 420
    const v14, 0x3e947ae1    # 0.29f

    .line 421
    .line 422
    .line 423
    const v15, -0x416b851f    # -0.29f

    .line 424
    .line 425
    .line 426
    const v16, 0x3f451eb8    # 0.77f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v17, 0x3f866666    # 1.05f

    .line 433
    .line 434
    .line 435
    const v18, 0x3c23d70a    # 0.01f

    .line 436
    .line 437
    .line 438
    const v13, 0x3e947ae1    # 0.29f

    .line 439
    .line 440
    .line 441
    const v15, 0x3f428f5c    # 0.76f

    .line 442
    .line 443
    .line 444
    const v16, 0x3e947ae1    # 0.29f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, 0x3f8b851f    # 1.09f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v17, -0x40400000    # -1.5f

    .line 457
    .line 458
    const v18, 0x406851ec    # 3.63f

    .line 459
    .line 460
    .line 461
    const v13, -0x40ae147b    # -0.82f

    .line 462
    .line 463
    .line 464
    const v14, 0x3f828f5c    # 1.02f

    .line 465
    .line 466
    .line 467
    const v15, -0x4051eb85    # -1.36f

    .line 468
    .line 469
    .line 470
    const v16, 0x4010a3d7    # 2.26f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v0, 0x40600000    # 3.5f

    .line 477
    .line 478
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v17, -0x40c00000    # -0.75f

    .line 482
    .line 483
    const/high16 v18, -0x40c00000    # -0.75f

    .line 484
    .line 485
    const/4 v13, 0x0

    .line 486
    const v14, -0x412e147b    # -0.41f

    .line 487
    .line 488
    .line 489
    const v15, -0x4151eb85    # -0.34f

    .line 490
    .line 491
    .line 492
    const/high16 v16, -0x40c00000    # -0.75f

    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v17, 0x40000000    # 2.0f

    .line 498
    .line 499
    const/high16 v18, 0x41340000    # 11.25f

    .line 500
    .line 501
    const v13, 0x4015c28f    # 2.34f

    .line 502
    .line 503
    .line 504
    const/high16 v14, 0x41280000    # 10.5f

    .line 505
    .line 506
    const/high16 v15, 0x40000000    # 2.0f

    .line 507
    .line 508
    const v16, 0x412d70a4    # 10.84f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 515
    .line 516
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v17, 0x3f400000    # 0.75f

    .line 520
    .line 521
    const/high16 v18, 0x3f400000    # 0.75f

    .line 522
    .line 523
    const/4 v13, 0x0

    .line 524
    const v14, 0x3ed1eb85    # 0.41f

    .line 525
    .line 526
    .line 527
    const v15, 0x3eae147b    # 0.34f

    .line 528
    .line 529
    .line 530
    const/high16 v16, 0x3f400000    # 0.75f

    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v18, -0x40c00000    # -0.75f

    .line 536
    .line 537
    const v13, 0x3ed1eb85    # 0.41f

    .line 538
    .line 539
    .line 540
    const/4 v14, 0x0

    .line 541
    const/high16 v15, 0x3f400000    # 0.75f

    .line 542
    .line 543
    const v16, -0x4151eb85    # -0.34f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v0, 0x3fc51eb8    # 1.54f

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 556
    .line 557
    const v18, 0x406851ec    # 3.63f

    .line 558
    .line 559
    .line 560
    const v13, 0x3e19999a    # 0.15f

    .line 561
    .line 562
    .line 563
    const v14, 0x3faf5c29    # 1.37f

    .line 564
    .line 565
    .line 566
    const v15, 0x3f30a3d7    # 0.69f

    .line 567
    .line 568
    .line 569
    const v16, 0x40270a3d    # 2.61f

    .line 570
    .line 571
    .line 572
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v0, -0x40747ae1    # -1.09f

    .line 576
    .line 577
    .line 578
    const v2, 0x3f8b851f    # 1.09f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v17, -0x4079999a    # -1.05f

    .line 585
    .line 586
    .line 587
    const v18, 0x3c23d70a    # 0.01f

    .line 588
    .line 589
    .line 590
    const v13, -0x416b851f    # -0.29f

    .line 591
    .line 592
    .line 593
    const v14, -0x416b851f    # -0.29f

    .line 594
    .line 595
    .line 596
    const v15, -0x40bd70a4    # -0.76f

    .line 597
    .line 598
    .line 599
    const v16, -0x4170a3d7    # -0.28f

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/16 v17, 0x0

    .line 606
    .line 607
    const v18, 0x3f87ae14    # 1.06f

    .line 608
    .line 609
    .line 610
    const v14, 0x3e947ae1    # 0.29f

    .line 611
    .line 612
    .line 613
    const v15, -0x416b851f    # -0.29f

    .line 614
    .line 615
    .line 616
    const v16, 0x3f451eb8    # 0.77f

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v0, 0x3f87ae14    # 1.06f

    .line 623
    .line 624
    .line 625
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v17, 0x3f87ae14    # 1.06f

    .line 629
    .line 630
    .line 631
    const/16 v18, 0x0

    .line 632
    .line 633
    const v13, 0x3e947ae1    # 0.29f

    .line 634
    .line 635
    .line 636
    const v15, 0x3f451eb8    # 0.77f

    .line 637
    .line 638
    .line 639
    const v16, 0x3e947ae1    # 0.29f

    .line 640
    .line 641
    .line 642
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/16 v17, 0x0

    .line 646
    .line 647
    const v18, -0x407851ec    # -1.06f

    .line 648
    .line 649
    .line 650
    const v14, -0x416b851f    # -0.29f

    .line 651
    .line 652
    .line 653
    const v15, 0x3e947ae1    # 0.29f

    .line 654
    .line 655
    .line 656
    const v16, -0x40bae148    # -0.77f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v0, -0x43dc28f6    # -0.01f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v0, -0x40747ae1    # -1.09f

    .line 669
    .line 670
    .line 671
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v17, 0x406851ec    # 3.63f

    .line 675
    .line 676
    .line 677
    const v18, 0x3fc147ae    # 1.51f

    .line 678
    .line 679
    .line 680
    const v13, 0x3f828f5c    # 1.02f

    .line 681
    .line 682
    .line 683
    const v14, 0x3f51eb85    # 0.82f

    .line 684
    .line 685
    .line 686
    const v15, 0x4010a3d7    # 2.26f

    .line 687
    .line 688
    .line 689
    const v16, 0x3fae147b    # 1.36f

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v0, 0x3fc66666    # 1.55f

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v17, -0x40c28f5c    # -0.74f

    .line 702
    .line 703
    .line 704
    const/high16 v18, 0x3f400000    # 0.75f

    .line 705
    .line 706
    const v13, -0x412e147b    # -0.41f

    .line 707
    .line 708
    .line 709
    const v14, 0x3c23d70a    # 0.01f

    .line 710
    .line 711
    .line 712
    const v15, -0x40c28f5c    # -0.74f

    .line 713
    .line 714
    .line 715
    const v16, 0x3eae147b    # 0.34f

    .line 716
    .line 717
    .line 718
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v17, 0x3f400000    # 0.75f

    .line 722
    .line 723
    const/4 v13, 0x0

    .line 724
    const v14, 0x3ed1eb85    # 0.41f

    .line 725
    .line 726
    .line 727
    const v15, 0x3eae147b    # 0.34f

    .line 728
    .line 729
    .line 730
    const/high16 v16, 0x3f400000    # 0.75f

    .line 731
    .line 732
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 736
    .line 737
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v18, -0x40c00000    # -0.75f

    .line 741
    .line 742
    const v13, 0x3ed1eb85    # 0.41f

    .line 743
    .line 744
    .line 745
    const/4 v14, 0x0

    .line 746
    const/high16 v15, 0x3f400000    # 0.75f

    .line 747
    .line 748
    const v16, -0x4151eb85    # -0.34f

    .line 749
    .line 750
    .line 751
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const/high16 v17, -0x40c00000    # -0.75f

    .line 755
    .line 756
    const/4 v13, 0x0

    .line 757
    const v14, -0x412e147b    # -0.41f

    .line 758
    .line 759
    .line 760
    const v15, -0x4151eb85    # -0.34f

    .line 761
    .line 762
    .line 763
    const/high16 v16, -0x40c00000    # -0.75f

    .line 764
    .line 765
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const v0, -0x43dc28f6    # -0.01f

    .line 769
    .line 770
    .line 771
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const v0, -0x403ae148    # -1.54f

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v17, 0x4068f5c3    # 3.64f

    .line 781
    .line 782
    .line 783
    const v18, -0x403eb852    # -1.51f

    .line 784
    .line 785
    .line 786
    const v13, 0x3faf5c29    # 1.37f

    .line 787
    .line 788
    .line 789
    const v14, -0x41f0a3d7    # -0.14f

    .line 790
    .line 791
    .line 792
    const v15, 0x4027ae14    # 2.62f

    .line 793
    .line 794
    .line 795
    const v16, -0x40cf5c29    # -0.69f

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const v0, 0x3f8b851f    # 1.09f

    .line 802
    .line 803
    .line 804
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const v17, 0x3c23d70a    # 0.01f

    .line 808
    .line 809
    .line 810
    const v18, 0x3f866666    # 1.05f

    .line 811
    .line 812
    .line 813
    const v13, -0x416b851f    # -0.29f

    .line 814
    .line 815
    .line 816
    const v14, 0x3e947ae1    # 0.29f

    .line 817
    .line 818
    .line 819
    const v15, -0x4170a3d7    # -0.28f

    .line 820
    .line 821
    .line 822
    const v16, 0x3f428f5c    # 0.76f

    .line 823
    .line 824
    .line 825
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const v17, 0x3f87ae14    # 1.06f

    .line 829
    .line 830
    .line 831
    const/16 v18, 0x0

    .line 832
    .line 833
    const v13, 0x3e947ae1    # 0.29f

    .line 834
    .line 835
    .line 836
    const v15, 0x3f451eb8    # 0.77f

    .line 837
    .line 838
    .line 839
    const v16, 0x3e947ae1    # 0.29f

    .line 840
    .line 841
    .line 842
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const v0, -0x407851ec    # -1.06f

    .line 846
    .line 847
    .line 848
    const v2, 0x3f87ae14    # 1.06f

    .line 849
    .line 850
    .line 851
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    const/16 v17, 0x0

    .line 855
    .line 856
    const v18, -0x407851ec    # -1.06f

    .line 857
    .line 858
    .line 859
    const v14, -0x416b851f    # -0.29f

    .line 860
    .line 861
    .line 862
    const v15, 0x3e947ae1    # 0.29f

    .line 863
    .line 864
    .line 865
    const v16, -0x40bae148    # -0.77f

    .line 866
    .line 867
    .line 868
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 869
    .line 870
    .line 871
    const v17, -0x407851ec    # -1.06f

    .line 872
    .line 873
    .line 874
    const/16 v18, 0x0

    .line 875
    .line 876
    const v13, -0x416b851f    # -0.29f

    .line 877
    .line 878
    .line 879
    const v15, -0x40bae148    # -0.77f

    .line 880
    .line 881
    .line 882
    const v16, -0x416b851f    # -0.29f

    .line 883
    .line 884
    .line 885
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    const v0, -0x43dc28f6    # -0.01f

    .line 889
    .line 890
    .line 891
    const v2, 0x3c23d70a    # 0.01f

    .line 892
    .line 893
    .line 894
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const v0, -0x40747ae1    # -1.09f

    .line 898
    .line 899
    .line 900
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    const v17, 0x3fc28f5c    # 1.52f

    .line 904
    .line 905
    .line 906
    const v18, -0x3f966666    # -3.65f

    .line 907
    .line 908
    .line 909
    const v13, 0x3f51eb85    # 0.82f

    .line 910
    .line 911
    .line 912
    const v14, -0x407d70a4    # -1.02f

    .line 913
    .line 914
    .line 915
    const v15, 0x3faf5c29    # 1.37f

    .line 916
    .line 917
    .line 918
    const v16, -0x3feeb852    # -2.27f

    .line 919
    .line 920
    .line 921
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    const v0, 0x3fc51eb8    # 1.54f

    .line 925
    .line 926
    .line 927
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    const/high16 v17, 0x3f400000    # 0.75f

    .line 931
    .line 932
    const/high16 v18, 0x3f400000    # 0.75f

    .line 933
    .line 934
    const/4 v13, 0x0

    .line 935
    const v14, 0x3ed1eb85    # 0.41f

    .line 936
    .line 937
    .line 938
    const v15, 0x3eae147b    # 0.34f

    .line 939
    .line 940
    .line 941
    const/high16 v16, 0x3f400000    # 0.75f

    .line 942
    .line 943
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 944
    .line 945
    .line 946
    const/high16 v18, -0x40c00000    # -0.75f

    .line 947
    .line 948
    const v13, 0x3ed1eb85    # 0.41f

    .line 949
    .line 950
    .line 951
    const/4 v14, 0x0

    .line 952
    const/high16 v15, 0x3f400000    # 0.75f

    .line 953
    .line 954
    const v16, -0x4151eb85    # -0.34f

    .line 955
    .line 956
    .line 957
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 958
    .line 959
    .line 960
    const/high16 v0, -0x40400000    # -1.5f

    .line 961
    .line 962
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const/high16 v17, 0x41aa0000    # 21.25f

    .line 966
    .line 967
    const/high16 v18, 0x41280000    # 10.5f

    .line 968
    .line 969
    const/high16 v13, 0x41b00000    # 22.0f

    .line 970
    .line 971
    const v14, 0x412d70a4    # 10.84f

    .line 972
    .line 973
    .line 974
    const v15, 0x41ad47ae    # 21.66f

    .line 975
    .line 976
    .line 977
    const/high16 v16, 0x41280000    # 10.5f

    .line 978
    .line 979
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 980
    .line 981
    .line 982
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 983
    .line 984
    .line 985
    const/high16 v0, 0x415c0000    # 13.75f

    .line 986
    .line 987
    const/high16 v2, 0x41000000    # 8.0f

    .line 988
    .line 989
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 990
    .line 991
    .line 992
    const/high16 v17, 0x3f800000    # 1.0f

    .line 993
    .line 994
    const/high16 v18, 0x3f800000    # 1.0f

    .line 995
    .line 996
    const v13, 0x3f0ccccd    # 0.55f

    .line 997
    .line 998
    .line 999
    const/4 v14, 0x0

    .line 1000
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1001
    .line 1002
    const v16, 0x3ee66666    # 0.45f

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1006
    .line 1007
    .line 1008
    const v0, -0x4119999a    # -0.45f

    .line 1009
    .line 1010
    .line 1011
    const/high16 v2, -0x40800000    # -1.0f

    .line 1012
    .line 1013
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1014
    .line 1015
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1019
    .line 1020
    .line 1021
    const v0, 0x41533333    # 13.2f

    .line 1022
    .line 1023
    .line 1024
    const/high16 v2, 0x415c0000    # 13.75f

    .line 1025
    .line 1026
    const/high16 v4, 0x41000000    # 8.0f

    .line 1027
    .line 1028
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1032
    .line 1033
    .line 1034
    const/high16 v0, 0x41500000    # 13.0f

    .line 1035
    .line 1036
    const/high16 v2, 0x41400000    # 12.0f

    .line 1037
    .line 1038
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1039
    .line 1040
    .line 1041
    const/high16 v17, -0x40800000    # -1.0f

    .line 1042
    .line 1043
    const/high16 v18, -0x40800000    # -1.0f

    .line 1044
    .line 1045
    const v13, -0x40f33333    # -0.55f

    .line 1046
    .line 1047
    .line 1048
    const/high16 v15, -0x40800000    # -1.0f

    .line 1049
    .line 1050
    const v16, -0x4119999a    # -0.45f

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1054
    .line 1055
    .line 1056
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1057
    .line 1058
    const/4 v13, 0x0

    .line 1059
    const v14, -0x40f33333    # -0.55f

    .line 1060
    .line 1061
    .line 1062
    const v15, 0x3ee66666    # 0.45f

    .line 1063
    .line 1064
    .line 1065
    const/high16 v16, -0x40800000    # -1.0f

    .line 1066
    .line 1067
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1068
    .line 1069
    .line 1070
    const v0, 0x3ee66666    # 0.45f

    .line 1071
    .line 1072
    .line 1073
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1074
    .line 1075
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1076
    .line 1077
    .line 1078
    const/high16 v17, 0x41400000    # 12.0f

    .line 1079
    .line 1080
    const/high16 v18, 0x41500000    # 13.0f

    .line 1081
    .line 1082
    const/high16 v13, 0x41500000    # 13.0f

    .line 1083
    .line 1084
    const v14, 0x4148cccd    # 12.55f

    .line 1085
    .line 1086
    .line 1087
    const v15, 0x4148cccd    # 12.55f

    .line 1088
    .line 1089
    .line 1090
    const/high16 v16, 0x41500000    # 13.0f

    .line 1091
    .line 1092
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1096
    .line 1097
    .line 1098
    const/high16 v0, 0x41240000    # 10.25f

    .line 1099
    .line 1100
    const/high16 v2, 0x41000000    # 8.0f

    .line 1101
    .line 1102
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1103
    .line 1104
    .line 1105
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1106
    .line 1107
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1108
    .line 1109
    const v13, 0x3f0ccccd    # 0.55f

    .line 1110
    .line 1111
    .line 1112
    const/4 v14, 0x0

    .line 1113
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1114
    .line 1115
    const v16, 0x3ee66666    # 0.45f

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1119
    .line 1120
    .line 1121
    const v0, -0x4119999a    # -0.45f

    .line 1122
    .line 1123
    .line 1124
    const/high16 v2, -0x40800000    # -1.0f

    .line 1125
    .line 1126
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1127
    .line 1128
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1129
    .line 1130
    .line 1131
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1132
    .line 1133
    .line 1134
    const v0, 0x411b3333    # 9.7f

    .line 1135
    .line 1136
    .line 1137
    const/high16 v2, 0x41240000    # 10.25f

    .line 1138
    .line 1139
    const/high16 v4, 0x41000000    # 8.0f

    .line 1140
    .line 1141
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1145
    .line 1146
    .line 1147
    const/high16 v0, 0x41080000    # 8.5f

    .line 1148
    .line 1149
    const/high16 v2, 0x41500000    # 13.0f

    .line 1150
    .line 1151
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1152
    .line 1153
    .line 1154
    const/high16 v17, -0x40800000    # -1.0f

    .line 1155
    .line 1156
    const/high16 v18, -0x40800000    # -1.0f

    .line 1157
    .line 1158
    const v13, -0x40f33333    # -0.55f

    .line 1159
    .line 1160
    .line 1161
    const/high16 v15, -0x40800000    # -1.0f

    .line 1162
    .line 1163
    const v16, -0x4119999a    # -0.45f

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1167
    .line 1168
    .line 1169
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1170
    .line 1171
    const/4 v13, 0x0

    .line 1172
    const v14, -0x40f33333    # -0.55f

    .line 1173
    .line 1174
    .line 1175
    const v15, 0x3ee66666    # 0.45f

    .line 1176
    .line 1177
    .line 1178
    const/high16 v16, -0x40800000    # -1.0f

    .line 1179
    .line 1180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1181
    .line 1182
    .line 1183
    const v0, 0x3ee66666    # 0.45f

    .line 1184
    .line 1185
    .line 1186
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1187
    .line 1188
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1189
    .line 1190
    .line 1191
    const/high16 v17, 0x41080000    # 8.5f

    .line 1192
    .line 1193
    const/high16 v18, 0x41500000    # 13.0f

    .line 1194
    .line 1195
    const/high16 v13, 0x41180000    # 9.5f

    .line 1196
    .line 1197
    const v14, 0x4148cccd    # 12.55f

    .line 1198
    .line 1199
    .line 1200
    const v15, 0x4110cccd    # 9.05f

    .line 1201
    .line 1202
    .line 1203
    const/high16 v16, 0x41500000    # 13.0f

    .line 1204
    .line 1205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1209
    .line 1210
    .line 1211
    const/high16 v0, 0x41800000    # 16.0f

    .line 1212
    .line 1213
    const/high16 v2, 0x41240000    # 10.25f

    .line 1214
    .line 1215
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1216
    .line 1217
    .line 1218
    const/high16 v17, -0x40800000    # -1.0f

    .line 1219
    .line 1220
    const/high16 v18, -0x40800000    # -1.0f

    .line 1221
    .line 1222
    const v13, -0x40f33333    # -0.55f

    .line 1223
    .line 1224
    .line 1225
    const/4 v14, 0x0

    .line 1226
    const/high16 v15, -0x40800000    # -1.0f

    .line 1227
    .line 1228
    const v16, -0x4119999a    # -0.45f

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1232
    .line 1233
    .line 1234
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1235
    .line 1236
    const/4 v13, 0x0

    .line 1237
    const v14, -0x40f33333    # -0.55f

    .line 1238
    .line 1239
    .line 1240
    const v15, 0x3ee66666    # 0.45f

    .line 1241
    .line 1242
    .line 1243
    const/high16 v16, -0x40800000    # -1.0f

    .line 1244
    .line 1245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1246
    .line 1247
    .line 1248
    const v0, 0x3ee66666    # 0.45f

    .line 1249
    .line 1250
    .line 1251
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1252
    .line 1253
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1254
    .line 1255
    .line 1256
    const/high16 v17, 0x41240000    # 10.25f

    .line 1257
    .line 1258
    const/high16 v18, 0x41800000    # 16.0f

    .line 1259
    .line 1260
    const/high16 v13, 0x41340000    # 11.25f

    .line 1261
    .line 1262
    const v14, 0x4178cccd    # 15.55f

    .line 1263
    .line 1264
    .line 1265
    const v15, 0x412ccccd    # 10.8f

    .line 1266
    .line 1267
    .line 1268
    const/high16 v16, 0x41800000    # 16.0f

    .line 1269
    .line 1270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1274
    .line 1275
    .line 1276
    const/high16 v0, 0x41800000    # 16.0f

    .line 1277
    .line 1278
    const/high16 v2, 0x415c0000    # 13.75f

    .line 1279
    .line 1280
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1281
    .line 1282
    .line 1283
    const/high16 v17, -0x40800000    # -1.0f

    .line 1284
    .line 1285
    const/high16 v18, -0x40800000    # -1.0f

    .line 1286
    .line 1287
    const v13, -0x40f33333    # -0.55f

    .line 1288
    .line 1289
    .line 1290
    const/4 v14, 0x0

    .line 1291
    const/high16 v15, -0x40800000    # -1.0f

    .line 1292
    .line 1293
    const v16, -0x4119999a    # -0.45f

    .line 1294
    .line 1295
    .line 1296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1297
    .line 1298
    .line 1299
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1300
    .line 1301
    const/4 v13, 0x0

    .line 1302
    const v14, -0x40f33333    # -0.55f

    .line 1303
    .line 1304
    .line 1305
    const v15, 0x3ee66666    # 0.45f

    .line 1306
    .line 1307
    .line 1308
    const/high16 v16, -0x40800000    # -1.0f

    .line 1309
    .line 1310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1311
    .line 1312
    .line 1313
    const v0, 0x3ee66666    # 0.45f

    .line 1314
    .line 1315
    .line 1316
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1317
    .line 1318
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1319
    .line 1320
    .line 1321
    const/high16 v17, 0x415c0000    # 13.75f

    .line 1322
    .line 1323
    const/high16 v18, 0x41800000    # 16.0f

    .line 1324
    .line 1325
    const/high16 v13, 0x416c0000    # 14.75f

    .line 1326
    .line 1327
    const v14, 0x4178cccd    # 15.55f

    .line 1328
    .line 1329
    .line 1330
    const v15, 0x4164cccd    # 14.3f

    .line 1331
    .line 1332
    .line 1333
    const/high16 v16, 0x41800000    # 16.0f

    .line 1334
    .line 1335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1336
    .line 1337
    .line 1338
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1339
    .line 1340
    .line 1341
    const/high16 v0, 0x41680000    # 14.5f

    .line 1342
    .line 1343
    const/high16 v2, 0x41400000    # 12.0f

    .line 1344
    .line 1345
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1346
    .line 1347
    .line 1348
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1349
    .line 1350
    const/high16 v18, -0x40800000    # -1.0f

    .line 1351
    .line 1352
    const/4 v13, 0x0

    .line 1353
    const v14, -0x40f33333    # -0.55f

    .line 1354
    .line 1355
    .line 1356
    const v15, 0x3ee66666    # 0.45f

    .line 1357
    .line 1358
    .line 1359
    const/high16 v16, -0x40800000    # -1.0f

    .line 1360
    .line 1361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1362
    .line 1363
    .line 1364
    const v0, 0x3ee66666    # 0.45f

    .line 1365
    .line 1366
    .line 1367
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1368
    .line 1369
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1370
    .line 1371
    .line 1372
    const/high16 v17, -0x40800000    # -1.0f

    .line 1373
    .line 1374
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1375
    .line 1376
    const v14, 0x3f0ccccd    # 0.55f

    .line 1377
    .line 1378
    .line 1379
    const v15, -0x4119999a    # -0.45f

    .line 1380
    .line 1381
    .line 1382
    const/high16 v16, 0x3f800000    # 1.0f

    .line 1383
    .line 1384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1385
    .line 1386
    .line 1387
    const v0, 0x4148cccd    # 12.55f

    .line 1388
    .line 1389
    .line 1390
    const/high16 v2, 0x41680000    # 14.5f

    .line 1391
    .line 1392
    const/high16 v4, 0x41400000    # 12.0f

    .line 1393
    .line 1394
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1398
    .line 1399
    .line 1400
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v2

    .line 1404
    const/16 v16, 0x3800

    .line 1405
    .line 1406
    const/16 v17, 0x0

    .line 1407
    .line 1408
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1409
    .line 1410
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1411
    .line 1412
    const/4 v7, 0x0

    .line 1413
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1414
    .line 1415
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1416
    .line 1417
    const/4 v14, 0x0

    .line 1418
    const/4 v15, 0x0

    .line 1419
    const-string v4, ""

    .line 1420
    .line 1421
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v0

    .line 1425
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v0

    .line 1429
    sput-object v0, Landroidx/compose/material/icons/filled/CoronavirusKt;->_coronavirus:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1430
    .line 1431
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1432
    .line 1433
    .line 1434
    return-object v0
.end method
