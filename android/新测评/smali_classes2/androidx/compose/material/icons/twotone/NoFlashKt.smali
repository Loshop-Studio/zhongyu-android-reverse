.class public final Landroidx/compose/material/icons/twotone/NoFlashKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_noFlash",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "NoFlash",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getNoFlash",
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
        "SMAP\nNoFlash.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoFlash.kt\nandroidx/compose/material/icons/twotone/NoFlashKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,112:1\n212#2,12:113\n233#2,18:126\n253#2:163\n233#2,18:164\n253#2:201\n174#3:125\n705#4,2:144\n717#4,2:146\n719#4,11:152\n705#4,2:182\n717#4,2:184\n719#4,11:190\n72#5,4:148\n72#5,4:186\n*S KotlinDebug\n*F\n+ 1 NoFlash.kt\nandroidx/compose/material/icons/twotone/NoFlashKt\n*L\n29#1:113,12\n30#1:126,18\n30#1:163\n50#1:164,18\n50#1:201\n29#1:125\n30#1:144,2\n30#1:146,2\n30#1:152,11\n50#1:182,2\n50#1:184,2\n50#1:190,11\n30#1:148,4\n50#1:186,4\n*E\n"
    }
.end annotation


# static fields
.field private static _noFlash:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoFlash(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/NoFlashKt;->_noFlash:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.NoFlash"

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
    const v4, 0x4156b852    # 13.42f

    .line 71
    .line 72
    .line 73
    const v6, 0x4181eb85    # 16.24f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x40233333    # 2.55f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v4, 0x41a00000    # 20.0f

    .line 86
    .line 87
    const v6, 0x417f5c29    # 15.96f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v4, 0x40800000    # 4.0f

    .line 94
    .line 95
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v4, -0x3ef66666    # -8.6f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, 0x404147ae    # 3.02f

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v4, -0x40d9999a    # -0.65f

    .line 111
    .line 112
    .line 113
    const v6, 0x3f170a3d    # 0.59f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v4, -0x41dc28f6    # -0.16f

    .line 120
    .line 121
    .line 122
    const v6, 0x3e19999a    # 0.15f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 129
    .line 130
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v25, 0x40d00000    # 6.5f

    .line 134
    .line 135
    const/high16 v26, 0x41780000    # 15.5f

    .line 136
    .line 137
    const v21, 0x40f5c28f    # 7.68f

    .line 138
    .line 139
    .line 140
    const v22, 0x4146e148    # 12.43f

    .line 141
    .line 142
    .line 143
    const/high16 v23, 0x40d00000    # 6.5f

    .line 144
    .line 145
    const v24, 0x415d1eb8    # 13.82f

    .line 146
    .line 147
    .line 148
    move-object/from16 v20, v2

    .line 149
    .line 150
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v25, 0x40600000    # 3.5f

    .line 154
    .line 155
    const/high16 v26, 0x40600000    # 3.5f

    .line 156
    .line 157
    const/16 v21, 0x0

    .line 158
    .line 159
    const v22, 0x3ff70a3d    # 1.93f

    .line 160
    .line 161
    .line 162
    const v23, 0x3fc8f5c3    # 1.57f

    .line 163
    .line 164
    .line 165
    const/high16 v24, 0x40600000    # 3.5f

    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v25, 0x4156b852    # 13.42f

    .line 171
    .line 172
    .line 173
    const v26, 0x4181eb85    # 16.24f

    .line 174
    .line 175
    .line 176
    const v21, 0x413ae148    # 11.68f

    .line 177
    .line 178
    .line 179
    const/high16 v22, 0x41980000    # 19.0f

    .line 180
    .line 181
    const v23, 0x41511eb8    # 13.07f

    .line 182
    .line 183
    .line 184
    const v24, 0x418e8f5c    # 17.82f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v4, 0x4152b852    # 13.17f

    .line 194
    .line 195
    .line 196
    const/high16 v6, 0x41800000    # 16.0f

    .line 197
    .line 198
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/4 v4, 0x0

    .line 202
    const v6, -0x401d70a4    # -1.77f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v4, -0x401d70a4    # -1.77f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v4, 0x4152b852    # 13.17f

    .line 215
    .line 216
    .line 217
    const/high16 v6, 0x41800000    # 16.0f

    .line 218
    .line 219
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    const/16 v16, 0x3800

    .line 230
    .line 231
    const/16 v17, 0x0

    .line 232
    .line 233
    const v6, 0x3e99999a    # 0.3f

    .line 234
    .line 235
    .line 236
    const v8, 0x3e99999a    # 0.3f

    .line 237
    .line 238
    .line 239
    const/4 v7, 0x0

    .line 240
    const/high16 v9, 0x3f800000    # 1.0f

    .line 241
    .line 242
    const/high16 v12, 0x3f800000    # 1.0f

    .line 243
    .line 244
    const/4 v13, 0x0

    .line 245
    const/4 v14, 0x0

    .line 246
    const/4 v15, 0x0

    .line 247
    const-string v4, ""

    .line 248
    .line 249
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 250
    .line 251
    .line 252
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 257
    .line 258
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 259
    .line 260
    .line 261
    move-result-wide v6

    .line 262
    const/4 v0, 0x0

    .line 263
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 271
    .line 272
    .line 273
    move-result v11

    .line 274
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 277
    .line 278
    .line 279
    const v0, 0x40b33333    # 5.6f

    .line 280
    .line 281
    .line 282
    const v2, 0x41a33333    # 20.4f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v0, 0x41b00000    # 22.0f

    .line 289
    .line 290
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, 0x41980000    # 19.0f

    .line 294
    .line 295
    const/high16 v2, 0x41300000    # 11.0f

    .line 296
    .line 297
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x40e00000    # 7.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v0, -0x40800000    # -1.0f

    .line 306
    .line 307
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v0, 0x40000000    # 2.0f

    .line 311
    .line 312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v0, 0x40800000    # 4.0f

    .line 316
    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v0, 0x40b33333    # 5.6f

    .line 321
    .line 322
    .line 323
    const v2, 0x41a33333    # 20.4f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, 0x41366666    # 11.4f

    .line 333
    .line 334
    .line 335
    const/high16 v2, 0x41800000    # 16.0f

    .line 336
    .line 337
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, 0x3fe28f5c    # 1.77f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v0, 0x40000000    # 2.0f

    .line 347
    .line 348
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v0, 0x41300000    # 11.0f

    .line 352
    .line 353
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v17, -0x40333333    # -1.6f

    .line 357
    .line 358
    .line 359
    const v18, -0x40333333    # -1.6f

    .line 360
    .line 361
    .line 362
    const v14, -0x409eb852    # -0.88f

    .line 363
    .line 364
    .line 365
    const v15, -0x40c7ae14    # -0.72f

    .line 366
    .line 367
    .line 368
    const v16, -0x40333333    # -1.6f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, -0x3fdd70a4    # -2.54f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x414947ae    # 12.58f

    .line 381
    .line 382
    .line 383
    const/high16 v2, 0x41000000    # 8.0f

    .line 384
    .line 385
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v0, -0x40200000    # -1.75f

    .line 389
    .line 390
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, 0x4059999a    # 3.4f

    .line 394
    .line 395
    .line 396
    const v2, 0x4059999a    # 3.4f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x41800000    # 16.0f

    .line 403
    .line 404
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, 0x418fc28f    # 17.97f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v0, 0x40066666    # 2.1f

    .line 417
    .line 418
    .line 419
    const v2, 0x40066666    # 2.1f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, 0x3f30a3d7    # 0.69f

    .line 426
    .line 427
    .line 428
    const v2, 0x4060a3d7    # 3.51f

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v0, 0x40b51eb8    # 5.66f

    .line 435
    .line 436
    .line 437
    const v2, 0x40b51eb8    # 5.66f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, 0x40c47ae1    # 6.14f

    .line 444
    .line 445
    .line 446
    const v2, 0x41166666    # 9.4f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v0, 0x40666666    # 3.6f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v17, 0x40000000    # 2.0f

    .line 459
    .line 460
    const/high16 v18, 0x41300000    # 11.0f

    .line 461
    .line 462
    const v13, 0x402e147b    # 2.72f

    .line 463
    .line 464
    .line 465
    const v14, 0x41166666    # 9.4f

    .line 466
    .line 467
    .line 468
    const/high16 v15, 0x40000000    # 2.0f

    .line 469
    .line 470
    const v16, 0x4121eb85    # 10.12f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x41166666    # 9.4f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v17, 0x40666666    # 3.6f

    .line 483
    .line 484
    .line 485
    const/high16 v18, 0x41b00000    # 22.0f

    .line 486
    .line 487
    const/high16 v13, 0x40000000    # 2.0f

    .line 488
    .line 489
    const v14, 0x41aa3d71    # 21.28f

    .line 490
    .line 491
    .line 492
    const v15, 0x402e147b    # 2.72f

    .line 493
    .line 494
    .line 495
    const/high16 v16, 0x41b00000    # 22.0f

    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v0, 0x414ccccd    # 12.8f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, 0x3fc66666    # 1.55f

    .line 507
    .line 508
    .line 509
    const v18, -0x4063d70a    # -1.22f

    .line 510
    .line 511
    .line 512
    const/high16 v13, 0x3f400000    # 0.75f

    .line 513
    .line 514
    const/4 v14, 0x0

    .line 515
    const v15, 0x3fb0a3d7    # 1.38f

    .line 516
    .line 517
    .line 518
    const v16, -0x40fae148    # -0.52f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v0, 0x40228f5c    # 2.54f

    .line 525
    .line 526
    .line 527
    const v2, 0x40228f5c    # 2.54f

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v0, 0x3fb47ae1    # 1.41f

    .line 534
    .line 535
    .line 536
    const v2, -0x404b851f    # -1.41f

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, 0x418fc28f    # 17.97f

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v0, 0x41780000    # 15.5f

    .line 552
    .line 553
    const/high16 v2, 0x41380000    # 11.5f

    .line 554
    .line 555
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v17, -0x40400000    # -1.5f

    .line 559
    .line 560
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 561
    .line 562
    const/4 v13, 0x0

    .line 563
    const v14, 0x3f547ae1    # 0.83f

    .line 564
    .line 565
    .line 566
    const v15, -0x40d47ae1    # -0.67f

    .line 567
    .line 568
    .line 569
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v0, -0x40d47ae1    # -0.67f

    .line 575
    .line 576
    .line 577
    const/high16 v2, -0x40400000    # -1.5f

    .line 578
    .line 579
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v0, 0x41200000    # 10.0f

    .line 583
    .line 584
    const/high16 v2, 0x41600000    # 14.0f

    .line 585
    .line 586
    const v4, 0x4112b852    # 9.17f

    .line 587
    .line 588
    .line 589
    const/high16 v6, 0x41600000    # 14.0f

    .line 590
    .line 591
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, 0x416ab852    # 14.67f

    .line 595
    .line 596
    .line 597
    const/high16 v2, 0x41780000    # 15.5f

    .line 598
    .line 599
    const/high16 v4, 0x41380000    # 11.5f

    .line 600
    .line 601
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const/high16 v0, 0x41a00000    # 20.0f

    .line 608
    .line 609
    const v2, 0x417f5c29    # 15.96f

    .line 610
    .line 611
    .line 612
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v0, 0x40800000    # 4.0f

    .line 616
    .line 617
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v0, -0x3ef66666    # -8.6f

    .line 621
    .line 622
    .line 623
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v0, 0x4008f5c3    # 2.14f

    .line 627
    .line 628
    .line 629
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v0, 0x3f6147ae    # 0.88f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v0, -0x40d9999a    # -0.65f

    .line 639
    .line 640
    .line 641
    const v2, 0x3f170a3d    # 0.59f

    .line 642
    .line 643
    .line 644
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v0, -0x41dc28f6    # -0.16f

    .line 648
    .line 649
    .line 650
    const v2, 0x3e19999a    # 0.15f

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 657
    .line 658
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const/high16 v17, 0x40d00000    # 6.5f

    .line 662
    .line 663
    const/high16 v18, 0x41780000    # 15.5f

    .line 664
    .line 665
    const v13, 0x40f5c28f    # 7.68f

    .line 666
    .line 667
    .line 668
    const v14, 0x4146e148    # 12.43f

    .line 669
    .line 670
    .line 671
    const/high16 v15, 0x40d00000    # 6.5f

    .line 672
    .line 673
    const v16, 0x415d1eb8    # 13.82f

    .line 674
    .line 675
    .line 676
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v17, 0x40600000    # 3.5f

    .line 680
    .line 681
    const/high16 v18, 0x40600000    # 3.5f

    .line 682
    .line 683
    const/4 v13, 0x0

    .line 684
    const v14, 0x3ff70a3d    # 1.93f

    .line 685
    .line 686
    .line 687
    const v15, 0x3fc8f5c3    # 1.57f

    .line 688
    .line 689
    .line 690
    const/high16 v16, 0x40600000    # 3.5f

    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v17, 0x405ae148    # 3.42f

    .line 696
    .line 697
    .line 698
    const v18, -0x3fcf5c29    # -2.76f

    .line 699
    .line 700
    .line 701
    const v13, 0x3fd70a3d    # 1.68f

    .line 702
    .line 703
    .line 704
    const/4 v14, 0x0

    .line 705
    const v15, 0x40447ae1    # 3.07f

    .line 706
    .line 707
    .line 708
    const v16, -0x4068f5c3    # -1.18f

    .line 709
    .line 710
    .line 711
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v0, 0x40233333    # 2.55f

    .line 715
    .line 716
    .line 717
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const/high16 v0, 0x41a00000    # 20.0f

    .line 721
    .line 722
    const v2, 0x417f5c29    # 15.96f

    .line 723
    .line 724
    .line 725
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 732
    .line 733
    .line 734
    move-result-object v2

    .line 735
    const/16 v16, 0x3800

    .line 736
    .line 737
    const/16 v17, 0x0

    .line 738
    .line 739
    const/high16 v6, 0x3f800000    # 1.0f

    .line 740
    .line 741
    const/high16 v8, 0x3f800000    # 1.0f

    .line 742
    .line 743
    const/4 v7, 0x0

    .line 744
    const/high16 v12, 0x3f800000    # 1.0f

    .line 745
    .line 746
    const/4 v13, 0x0

    .line 747
    const/4 v15, 0x0

    .line 748
    const-string v4, ""

    .line 749
    .line 750
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    sput-object v0, Landroidx/compose/material/icons/twotone/NoFlashKt;->_noFlash:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 759
    .line 760
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 761
    .line 762
    .line 763
    return-object v0
.end method
