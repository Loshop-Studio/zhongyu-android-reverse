.class public final Landroidx/compose/material/icons/outlined/Person3Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_person3",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Person3",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getPerson3",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nPerson3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Person3.kt\nandroidx/compose/material/icons/outlined/Person3Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n233#2,18:135\n253#2:172\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n705#4,2:153\n717#4,2:155\n719#4,11:161\n72#5,4:119\n72#5,4:157\n*S KotlinDebug\n*F\n+ 1 Person3.kt\nandroidx/compose/material/icons/outlined/Person3Kt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n50#1:135,18\n50#1:172\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n50#1:153,2\n50#1:155,2\n50#1:161,11\n30#1:119,4\n50#1:157,4\n*E\n"
    }
.end annotation


# static fields
.field private static _person3:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPerson3(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/Person3Kt;->_person3:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Person3"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v4, 0x41931eb8    # 18.39f

    .line 71
    .line 72
    .line 73
    const v6, 0x4168f5c3    # 14.56f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v26, 0x41500000    # 13.0f

    .line 82
    .line 83
    const v21, 0x4185ae14    # 16.71f

    .line 84
    .line 85
    .line 86
    const v22, 0x415b3333    # 13.7f

    .line 87
    .line 88
    .line 89
    const v23, 0x41687ae1    # 14.53f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x41500000    # 13.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, -0x3f33851f    # -6.39f

    .line 100
    .line 101
    .line 102
    const v26, 0x3fc7ae14    # 1.56f

    .line 103
    .line 104
    .line 105
    const v21, -0x3fde147b    # -2.53f

    .line 106
    .line 107
    .line 108
    const/16 v22, 0x0

    .line 109
    .line 110
    const v23, -0x3f6947ae    # -4.71f

    .line 111
    .line 112
    .line 113
    const v24, 0x3f333333    # 0.7f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v25, 0x40800000    # 4.0f

    .line 120
    .line 121
    const v26, 0x4189c28f    # 17.22f

    .line 122
    .line 123
    .line 124
    const v21, 0x4093851f    # 4.61f

    .line 125
    .line 126
    .line 127
    const v22, 0x41711eb8    # 15.07f

    .line 128
    .line 129
    .line 130
    const/high16 v23, 0x40800000    # 4.0f

    .line 131
    .line 132
    const v24, 0x4180cccd    # 16.1f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, 0x41a00000    # 20.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, 0x41800000    # 16.0f

    .line 144
    .line 145
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v4, -0x3fce147b    # -2.78f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v25, 0x41931eb8    # 18.39f

    .line 155
    .line 156
    .line 157
    const v26, 0x4168f5c3    # 14.56f

    .line 158
    .line 159
    .line 160
    const/high16 v21, 0x41a00000    # 20.0f

    .line 161
    .line 162
    const v22, 0x4180cccd    # 16.1f

    .line 163
    .line 164
    .line 165
    const v23, 0x419b1eb8    # 19.39f

    .line 166
    .line 167
    .line 168
    const v24, 0x41711eb8    # 15.07f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v4, 0x41900000    # 18.0f

    .line 178
    .line 179
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v4, 0x40c00000    # 6.0f

    .line 183
    .line 184
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v4, -0x40b851ec    # -0.78f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v25, 0x3f051eb8    # 0.52f

    .line 194
    .line 195
    .line 196
    const v26, -0x409eb852    # -0.88f

    .line 197
    .line 198
    .line 199
    const/16 v21, 0x0

    .line 200
    .line 201
    const v22, -0x413d70a4    # -0.38f

    .line 202
    .line 203
    .line 204
    const v23, 0x3e4ccccd    # 0.2f

    .line 205
    .line 206
    .line 207
    const v24, -0x40c7ae14    # -0.72f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v25, 0x41400000    # 12.0f

    .line 214
    .line 215
    const/high16 v26, 0x41700000    # 15.0f

    .line 216
    .line 217
    const v21, 0x40f6b852    # 7.71f

    .line 218
    .line 219
    .line 220
    const v22, 0x417bae14    # 15.73f

    .line 221
    .line 222
    .line 223
    const v23, 0x411a147b    # 9.63f

    .line 224
    .line 225
    .line 226
    const/high16 v24, 0x41700000    # 15.0f

    .line 227
    .line 228
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v25, 0x40af5c29    # 5.48f

    .line 232
    .line 233
    .line 234
    const v26, 0x3fab851f    # 1.34f

    .line 235
    .line 236
    .line 237
    const v21, 0x4017ae14    # 2.37f

    .line 238
    .line 239
    .line 240
    const/16 v22, 0x0

    .line 241
    .line 242
    const v23, 0x408947ae    # 4.29f

    .line 243
    .line 244
    .line 245
    const v24, 0x3f3ae148    # 0.73f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v25, 0x41900000    # 18.0f

    .line 252
    .line 253
    const v26, 0x4189c28f    # 17.22f

    .line 254
    .line 255
    .line 256
    const v21, 0x418e6666    # 17.8f

    .line 257
    .line 258
    .line 259
    const/high16 v22, 0x41840000    # 16.5f

    .line 260
    .line 261
    const/high16 v23, 0x41900000    # 18.0f

    .line 262
    .line 263
    const v24, 0x4186b852    # 16.84f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v4, 0x41900000    # 18.0f

    .line 270
    .line 271
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    const/16 v16, 0x3800

    .line 282
    .line 283
    const/16 v17, 0x0

    .line 284
    .line 285
    const/high16 v6, 0x3f800000    # 1.0f

    .line 286
    .line 287
    const/high16 v8, 0x3f800000    # 1.0f

    .line 288
    .line 289
    const/4 v7, 0x0

    .line 290
    const/high16 v9, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/high16 v12, 0x3f800000    # 1.0f

    .line 293
    .line 294
    const/4 v13, 0x0

    .line 295
    const/4 v14, 0x0

    .line 296
    const/4 v15, 0x0

    .line 297
    const-string v4, ""

    .line 298
    .line 299
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 300
    .line 301
    .line 302
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 307
    .line 308
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 309
    .line 310
    .line 311
    move-result-wide v6

    .line 312
    const/4 v0, 0x0

    .line 313
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 317
    .line 318
    .line 319
    move-result v10

    .line 320
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 321
    .line 322
    .line 323
    move-result v11

    .line 324
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 327
    .line 328
    .line 329
    const/high16 v0, 0x41200000    # 10.0f

    .line 330
    .line 331
    const/high16 v2, 0x41400000    # 12.0f

    .line 332
    .line 333
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v17, 0x40800000    # 4.0f

    .line 337
    .line 338
    const/16 v18, 0x0

    .line 339
    .line 340
    const v13, 0x3e2e147b    # 0.17f

    .line 341
    .line 342
    .line 343
    const v15, 0x40751eb8    # 3.83f

    .line 344
    .line 345
    .line 346
    const/16 v16, 0x0

    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v17, 0x40400000    # 3.0f

    .line 352
    .line 353
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 354
    .line 355
    const v13, 0x3fd47ae1    # 1.66f

    .line 356
    .line 357
    .line 358
    const/high16 v15, 0x40400000    # 3.0f

    .line 359
    .line 360
    const v16, -0x40547ae1    # -1.34f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v17, -0x40ca3d71    # -0.71f

    .line 367
    .line 368
    .line 369
    const v18, -0x400a3d71    # -1.92f

    .line 370
    .line 371
    .line 372
    const/4 v13, 0x0

    .line 373
    const v14, -0x40c51eb8    # -0.73f

    .line 374
    .line 375
    .line 376
    const v15, -0x4175c28f    # -0.27f

    .line 377
    .line 378
    .line 379
    const v16, -0x404ccccd    # -1.4f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v17, 0x41840000    # 16.5f

    .line 386
    .line 387
    const/high16 v18, 0x40c00000    # 6.0f

    .line 388
    .line 389
    const v13, 0x41835c29    # 16.42f

    .line 390
    .line 391
    .line 392
    const/high16 v14, 0x40d80000    # 6.75f

    .line 393
    .line 394
    const/high16 v15, 0x41840000    # 16.5f

    .line 395
    .line 396
    const v16, 0x40cc28f6    # 6.38f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, -0x4011eb85    # -1.86f

    .line 403
    .line 404
    .line 405
    const v18, -0x3fceb852    # -2.77f

    .line 406
    .line 407
    .line 408
    const/4 v13, 0x0

    .line 409
    const/high16 v14, -0x40600000    # -1.25f

    .line 410
    .line 411
    const v15, -0x40bae148    # -0.77f

    .line 412
    .line 413
    .line 414
    const v16, -0x3feb851f    # -2.32f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v17, 0x41400000    # 12.0f

    .line 421
    .line 422
    const/high16 v18, 0x40000000    # 2.0f

    .line 423
    .line 424
    const/high16 v13, 0x41600000    # 14.0f

    .line 425
    .line 426
    const v14, 0x401eb852    # 2.48f

    .line 427
    .line 428
    .line 429
    const v15, 0x4150f5c3    # 13.06f

    .line 430
    .line 431
    .line 432
    const/high16 v16, 0x40000000    # 2.0f

    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, -0x3fd70a3d    # -2.64f

    .line 438
    .line 439
    .line 440
    const v2, 0x3f9d70a4    # 1.23f

    .line 441
    .line 442
    .line 443
    const/high16 v4, -0x40000000    # -2.0f

    .line 444
    .line 445
    const v6, 0x3ef5c28f    # 0.48f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v17, 0x40f00000    # 7.5f

    .line 452
    .line 453
    const/high16 v18, 0x40c00000    # 6.0f

    .line 454
    .line 455
    const v13, 0x410451ec    # 8.27f

    .line 456
    .line 457
    .line 458
    const v14, 0x406b851f    # 3.68f

    .line 459
    .line 460
    .line 461
    const/high16 v15, 0x40f00000    # 7.5f

    .line 462
    .line 463
    const/high16 v16, 0x40980000    # 4.75f

    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v17, 0x3e570a3d    # 0.21f

    .line 469
    .line 470
    .line 471
    const v18, 0x3f8a3d71    # 1.08f

    .line 472
    .line 473
    .line 474
    const/4 v13, 0x0

    .line 475
    const v14, 0x3ec28f5c    # 0.38f

    .line 476
    .line 477
    .line 478
    const v15, 0x3da3d70a    # 0.08f

    .line 479
    .line 480
    .line 481
    const/high16 v16, 0x3f400000    # 0.75f

    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v17, 0x40e00000    # 7.0f

    .line 487
    .line 488
    const/high16 v18, 0x41100000    # 9.0f

    .line 489
    .line 490
    const v13, 0x40e8a3d7    # 7.27f

    .line 491
    .line 492
    .line 493
    const v14, 0x40f33333    # 7.6f

    .line 494
    .line 495
    .line 496
    const/high16 v15, 0x40e00000    # 7.0f

    .line 497
    .line 498
    const v16, 0x410451ec    # 8.27f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v17, 0x41200000    # 10.0f

    .line 505
    .line 506
    const/high16 v18, 0x41400000    # 12.0f

    .line 507
    .line 508
    const/high16 v13, 0x40e00000    # 7.0f

    .line 509
    .line 510
    const v14, 0x412a8f5c    # 10.66f

    .line 511
    .line 512
    .line 513
    const v15, 0x410570a4    # 8.34f

    .line 514
    .line 515
    .line 516
    const/high16 v16, 0x41400000    # 12.0f

    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v0, 0x4113d70a    # 9.24f

    .line 525
    .line 526
    .line 527
    const v2, 0x4105eb85    # 8.37f

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v17, 0x41180000    # 9.5f

    .line 534
    .line 535
    const/high16 v18, 0x40c00000    # 6.0f

    .line 536
    .line 537
    const v13, 0x4121c28f    # 10.11f

    .line 538
    .line 539
    .line 540
    const v14, 0x40ea8f5c    # 7.33f

    .line 541
    .line 542
    .line 543
    const/high16 v15, 0x41180000    # 9.5f

    .line 544
    .line 545
    const v16, 0x40cbd70a    # 6.37f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v17, 0x3f1eb852    # 0.62f

    .line 552
    .line 553
    .line 554
    const v18, -0x40947ae1    # -0.92f

    .line 555
    .line 556
    .line 557
    const/4 v13, 0x0

    .line 558
    const v14, -0x412e147b    # -0.41f

    .line 559
    .line 560
    .line 561
    const v15, 0x3e75c28f    # 0.24f

    .line 562
    .line 563
    .line 564
    const v16, -0x40bae148    # -0.77f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v17, 0x3f400000    # 0.75f

    .line 571
    .line 572
    const v18, -0x40f5c28f    # -0.54f

    .line 573
    .line 574
    .line 575
    const v13, 0x3e947ae1    # 0.29f

    .line 576
    .line 577
    .line 578
    const v14, -0x420a3d71    # -0.12f

    .line 579
    .line 580
    .line 581
    const v15, 0x3f0ccccd    # 0.55f

    .line 582
    .line 583
    .line 584
    const v16, -0x416147ae    # -0.31f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v17, 0x41400000    # 12.0f

    .line 591
    .line 592
    const/high16 v18, 0x40800000    # 4.0f

    .line 593
    .line 594
    const v13, 0x4130a3d7    # 11.04f

    .line 595
    .line 596
    .line 597
    const v14, 0x408a8f5c    # 4.33f

    .line 598
    .line 599
    .line 600
    const v15, 0x4136b852    # 11.42f

    .line 601
    .line 602
    .line 603
    const/high16 v16, 0x40800000    # 4.0f

    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v0, 0x3f90a3d7    # 1.13f

    .line 609
    .line 610
    .line 611
    const v2, 0x3f07ae14    # 0.53f

    .line 612
    .line 613
    .line 614
    const v4, 0x3f75c28f    # 0.96f

    .line 615
    .line 616
    .line 617
    const v6, 0x3ea8f5c3    # 0.33f

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v17, 0x3f400000    # 0.75f

    .line 624
    .line 625
    const v18, 0x3f0a3d71    # 0.54f

    .line 626
    .line 627
    .line 628
    const v13, 0x3e4ccccd    # 0.2f

    .line 629
    .line 630
    .line 631
    const v14, 0x3e75c28f    # 0.24f

    .line 632
    .line 633
    .line 634
    const v15, 0x3eeb851f    # 0.46f

    .line 635
    .line 636
    .line 637
    const v16, 0x3ed70a3d    # 0.42f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v17, 0x41680000    # 14.5f

    .line 644
    .line 645
    const/high16 v18, 0x40c00000    # 6.0f

    .line 646
    .line 647
    const v13, 0x416428f6    # 14.26f

    .line 648
    .line 649
    .line 650
    const v14, 0x40a75c29    # 5.23f

    .line 651
    .line 652
    .line 653
    const/high16 v15, 0x41680000    # 14.5f

    .line 654
    .line 655
    const v16, 0x40b2e148    # 5.59f

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v17, 0x3e851eb8    # 0.26f

    .line 662
    .line 663
    .line 664
    const v18, 0x4017ae14    # 2.37f

    .line 665
    .line 666
    .line 667
    const/4 v13, 0x0

    .line 668
    const v14, 0x3ebd70a4    # 0.37f

    .line 669
    .line 670
    .line 671
    const v15, -0x40e3d70a    # -0.61f

    .line 672
    .line 673
    .line 674
    const v16, 0x3faa3d71    # 1.33f

    .line 675
    .line 676
    .line 677
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const/high16 v17, 0x41600000    # 14.0f

    .line 681
    .line 682
    const/high16 v18, 0x41200000    # 10.0f

    .line 683
    .line 684
    const v13, 0x417570a4    # 15.34f

    .line 685
    .line 686
    .line 687
    const v14, 0x4110f5c3    # 9.06f

    .line 688
    .line 689
    .line 690
    const v15, 0x416ccccd    # 14.8f

    .line 691
    .line 692
    .line 693
    const/high16 v16, 0x41200000    # 10.0f

    .line 694
    .line 695
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const/high16 v0, -0x3f800000    # -4.0f

    .line 699
    .line 700
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v17, 0x4113d70a    # 9.24f

    .line 704
    .line 705
    .line 706
    const v18, 0x4105eb85    # 8.37f

    .line 707
    .line 708
    .line 709
    const v13, 0x41133333    # 9.2f

    .line 710
    .line 711
    .line 712
    const/high16 v14, 0x41200000    # 10.0f

    .line 713
    .line 714
    const v15, 0x410a8f5c    # 8.66f

    .line 715
    .line 716
    .line 717
    const v16, 0x4110f5c3    # 9.06f

    .line 718
    .line 719
    .line 720
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    const/16 v16, 0x3800

    .line 731
    .line 732
    const/16 v17, 0x0

    .line 733
    .line 734
    const/high16 v6, 0x3f800000    # 1.0f

    .line 735
    .line 736
    const/4 v7, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/outlined/Person3Kt;->_person3:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 753
    .line 754
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 755
    .line 756
    .line 757
    return-object v0
.end method
