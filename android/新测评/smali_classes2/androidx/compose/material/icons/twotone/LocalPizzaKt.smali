.class public final Landroidx/compose/material/icons/twotone/LocalPizzaKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_localPizza",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "LocalPizza",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getLocalPizza",
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
        "SMAP\nLocalPizza.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalPizza.kt\nandroidx/compose/material/icons/twotone/LocalPizzaKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n233#2,18:133\n253#2:170\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n705#4,2:151\n717#4,2:153\n719#4,11:159\n72#5,4:117\n72#5,4:155\n*S KotlinDebug\n*F\n+ 1 LocalPizza.kt\nandroidx/compose/material/icons/twotone/LocalPizzaKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n50#1:133,18\n50#1:170\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n50#1:151,2\n50#1:153,2\n50#1:159,11\n30#1:117,4\n50#1:155,4\n*E\n"
    }
.end annotation


# static fields
.field private static _localPizza:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalPizza(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LocalPizzaKt;->_localPizza:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.LocalPizza"

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
    const v4, 0x40cb851f    # 6.36f

    .line 71
    .line 72
    .line 73
    const v6, 0x40b051ec    # 5.51f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x418f5c29    # 17.92f

    .line 80
    .line 81
    .line 82
    const/high16 v6, 0x41400000    # 12.0f

    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, -0x3ec73333    # -11.55f

    .line 88
    .line 89
    .line 90
    const v6, 0x40cfae14    # 6.49f

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, 0x41400000    # 12.0f

    .line 97
    .line 98
    const/high16 v26, 0x40800000    # 4.0f

    .line 99
    .line 100
    const v21, 0x418570a4    # 16.68f

    .line 101
    .line 102
    .line 103
    const v22, 0x409b3333    # 4.85f

    .line 104
    .line 105
    .line 106
    const v23, 0x4166147b    # 14.38f

    .line 107
    .line 108
    .line 109
    const/high16 v24, 0x40800000    # 4.0f

    .line 110
    .line 111
    move-object/from16 v20, v2

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v4, -0x3f6a3d71    # -4.68f

    .line 117
    .line 118
    .line 119
    const v6, -0x3f3051ec    # -6.49f

    .line 120
    .line 121
    .line 122
    const v7, 0x40170a3d    # 2.36f

    .line 123
    .line 124
    .line 125
    const v8, 0x3f59999a    # 0.85f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v4, v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, 0x41080000    # 8.5f

    .line 135
    .line 136
    const/high16 v6, 0x41100000    # 9.0f

    .line 137
    .line 138
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v25, -0x40400000    # -1.5f

    .line 142
    .line 143
    const/high16 v26, -0x40400000    # -1.5f

    .line 144
    .line 145
    const v21, -0x40ab851f    # -0.83f

    .line 146
    .line 147
    .line 148
    const/16 v22, 0x0

    .line 149
    .line 150
    const/high16 v23, -0x40400000    # -1.5f

    .line 151
    .line 152
    const v24, -0x40d47ae1    # -0.67f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v4, 0x4102b852    # 8.17f

    .line 159
    .line 160
    .line 161
    const/high16 v6, 0x40b00000    # 5.5f

    .line 162
    .line 163
    const/high16 v7, 0x41100000    # 9.0f

    .line 164
    .line 165
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v4, 0x3f2b851f    # 0.67f

    .line 169
    .line 170
    .line 171
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 172
    .line 173
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, 0x411d1eb8    # 9.82f

    .line 177
    .line 178
    .line 179
    const/high16 v6, 0x41080000    # 8.5f

    .line 180
    .line 181
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v4, 0x41580000    # 13.5f

    .line 188
    .line 189
    const/high16 v6, 0x41500000    # 13.0f

    .line 190
    .line 191
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 195
    .line 196
    const/16 v21, 0x0

    .line 197
    .line 198
    const v22, 0x3f547ae1    # 0.83f

    .line 199
    .line 200
    .line 201
    const v23, -0x40d1eb85    # -0.68f

    .line 202
    .line 203
    .line 204
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 205
    .line 206
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v26, -0x40400000    # -1.5f

    .line 210
    .line 211
    const v21, -0x40ab851f    # -0.83f

    .line 212
    .line 213
    .line 214
    const/16 v22, 0x0

    .line 215
    .line 216
    const/high16 v23, -0x40400000    # -1.5f

    .line 217
    .line 218
    const v24, -0x40d47ae1    # -0.67f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v4, 0x3f2b851f    # 0.67f

    .line 225
    .line 226
    .line 227
    const/high16 v6, -0x40400000    # -1.5f

    .line 228
    .line 229
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 230
    .line 231
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 235
    .line 236
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    const/16 v16, 0x3800

    .line 247
    .line 248
    const/16 v17, 0x0

    .line 249
    .line 250
    const v6, 0x3e99999a    # 0.3f

    .line 251
    .line 252
    .line 253
    const v8, 0x3e99999a    # 0.3f

    .line 254
    .line 255
    .line 256
    const/4 v7, 0x0

    .line 257
    const/high16 v9, 0x3f800000    # 1.0f

    .line 258
    .line 259
    const/high16 v12, 0x3f800000    # 1.0f

    .line 260
    .line 261
    const/4 v13, 0x0

    .line 262
    const/4 v14, 0x0

    .line 263
    const/4 v15, 0x0

    .line 264
    const-string v4, ""

    .line 265
    .line 266
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 267
    .line 268
    .line 269
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 274
    .line 275
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 276
    .line 277
    .line 278
    move-result-wide v6

    .line 279
    const/4 v0, 0x0

    .line 280
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 284
    .line 285
    .line 286
    move-result v10

    .line 287
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 288
    .line 289
    .line 290
    move-result v11

    .line 291
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 294
    .line 295
    .line 296
    const/high16 v0, 0x40000000    # 2.0f

    .line 297
    .line 298
    const/high16 v2, 0x41400000    # 12.0f

    .line 299
    .line 300
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v17, 0x4040a3d7    # 3.01f

    .line 304
    .line 305
    .line 306
    const/high16 v18, 0x40c00000    # 6.0f

    .line 307
    .line 308
    const v13, 0x4106e148    # 8.43f

    .line 309
    .line 310
    .line 311
    const/high16 v14, 0x40000000    # 2.0f

    .line 312
    .line 313
    const v15, 0x40a75c29    # 5.23f

    .line 314
    .line 315
    .line 316
    const v16, 0x40628f5c    # 3.54f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v0, 0x41b00000    # 22.0f

    .line 323
    .line 324
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x410fd70a    # 8.99f

    .line 328
    .line 329
    .line 330
    const/high16 v2, -0x3e800000    # -16.0f

    .line 331
    .line 332
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v17, 0x41400000    # 12.0f

    .line 336
    .line 337
    const/high16 v18, 0x40000000    # 2.0f

    .line 338
    .line 339
    const v13, 0x41963d71    # 18.78f

    .line 340
    .line 341
    .line 342
    const v14, 0x40633333    # 3.55f

    .line 343
    .line 344
    .line 345
    const v15, 0x41791eb8    # 15.57f

    .line 346
    .line 347
    .line 348
    const/high16 v16, 0x40000000    # 2.0f

    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, 0x418f5c29    # 17.92f

    .line 357
    .line 358
    .line 359
    const/high16 v2, 0x41400000    # 12.0f

    .line 360
    .line 361
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v0, 0x40cb851f    # 6.36f

    .line 365
    .line 366
    .line 367
    const v2, 0x40b051ec    # 5.51f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v18, 0x40800000    # 4.0f

    .line 374
    .line 375
    const v13, 0x40ea3d71    # 7.32f

    .line 376
    .line 377
    .line 378
    const v14, 0x409b3333    # 4.85f

    .line 379
    .line 380
    .line 381
    const v15, 0x4119eb85    # 9.62f

    .line 382
    .line 383
    .line 384
    const/high16 v16, 0x40800000    # 4.0f

    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x4095c28f    # 4.68f

    .line 390
    .line 391
    .line 392
    const v2, 0x40170a3d    # 2.36f

    .line 393
    .line 394
    .line 395
    const v4, 0x3f59999a    # 0.85f

    .line 396
    .line 397
    .line 398
    const v6, 0x40cfae14    # 6.49f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0, v4, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x418f5c29    # 17.92f

    .line 405
    .line 406
    .line 407
    const/high16 v2, 0x41400000    # 12.0f

    .line 408
    .line 409
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x40b00000    # 5.5f

    .line 416
    .line 417
    const/high16 v2, 0x41100000    # 9.0f

    .line 418
    .line 419
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v17, -0x40400000    # -1.5f

    .line 423
    .line 424
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 425
    .line 426
    const v13, -0x40ab851f    # -0.83f

    .line 427
    .line 428
    .line 429
    const/4 v14, 0x0

    .line 430
    const/high16 v15, -0x40400000    # -1.5f

    .line 431
    .line 432
    const v16, 0x3f2b851f    # 0.67f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, 0x4102b852    # 8.17f

    .line 439
    .line 440
    .line 441
    const/high16 v2, 0x41080000    # 8.5f

    .line 442
    .line 443
    const/high16 v4, 0x41100000    # 9.0f

    .line 444
    .line 445
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, -0x40d47ae1    # -0.67f

    .line 449
    .line 450
    .line 451
    const/high16 v2, -0x40400000    # -1.5f

    .line 452
    .line 453
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 454
    .line 455
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v0, 0x411d1eb8    # 9.82f

    .line 459
    .line 460
    .line 461
    const/high16 v2, 0x40b00000    # 5.5f

    .line 462
    .line 463
    const/high16 v4, 0x41100000    # 9.0f

    .line 464
    .line 465
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v0, 0x41280000    # 10.5f

    .line 472
    .line 473
    const/high16 v2, 0x41500000    # 13.0f

    .line 474
    .line 475
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 479
    .line 480
    const/4 v13, 0x0

    .line 481
    const v14, 0x3f547ae1    # 0.83f

    .line 482
    .line 483
    .line 484
    const v15, 0x3f2b851f    # 0.67f

    .line 485
    .line 486
    .line 487
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v18, -0x40400000    # -1.5f

    .line 493
    .line 494
    const v13, 0x3f51eb85    # 0.82f

    .line 495
    .line 496
    .line 497
    const/4 v14, 0x0

    .line 498
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 499
    .line 500
    const v16, -0x40d47ae1    # -0.67f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, -0x40d1eb85    # -0.68f

    .line 507
    .line 508
    .line 509
    const/high16 v2, -0x40400000    # -1.5f

    .line 510
    .line 511
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, 0x3f2b851f    # 0.67f

    .line 515
    .line 516
    .line 517
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 518
    .line 519
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    const/16 v16, 0x3800

    .line 530
    .line 531
    const/16 v17, 0x0

    .line 532
    .line 533
    const/high16 v6, 0x3f800000    # 1.0f

    .line 534
    .line 535
    const/high16 v8, 0x3f800000    # 1.0f

    .line 536
    .line 537
    const/4 v7, 0x0

    .line 538
    const/high16 v12, 0x3f800000    # 1.0f

    .line 539
    .line 540
    const/4 v13, 0x0

    .line 541
    const/4 v15, 0x0

    .line 542
    const-string v4, ""

    .line 543
    .line 544
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    sput-object v0, Landroidx/compose/material/icons/twotone/LocalPizzaKt;->_localPizza:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 553
    .line 554
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    return-object v0
.end method
