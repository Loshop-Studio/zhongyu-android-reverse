.class public final Landroidx/compose/material/icons/twotone/PersonalInjuryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_personalInjury",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PersonalInjury",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPersonalInjury",
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
        "SMAP\nPersonalInjury.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalInjury.kt\nandroidx/compose/material/icons/twotone/PersonalInjuryKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,116:1\n212#2,12:117\n233#2,18:130\n253#2:167\n233#2,18:168\n253#2:205\n174#3:129\n705#4,2:148\n717#4,2:150\n719#4,11:156\n705#4,2:186\n717#4,2:188\n719#4,11:194\n72#5,4:152\n72#5,4:190\n*S KotlinDebug\n*F\n+ 1 PersonalInjury.kt\nandroidx/compose/material/icons/twotone/PersonalInjuryKt\n*L\n29#1:117,12\n30#1:130,18\n30#1:167\n63#1:168,18\n63#1:205\n29#1:129\n30#1:148,2\n30#1:150,2\n30#1:156,11\n63#1:186,2\n63#1:188,2\n63#1:194,11\n30#1:152,4\n63#1:190,4\n*E\n"
    }
.end annotation


# static fields
.field private static _personalInjury:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPersonalInjury(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PersonalInjuryKt;->_personalInjury:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PersonalInjury"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v26, 0x40000000    # 2.0f

    .line 80
    .line 81
    const v21, 0x3f8ccccd    # 1.1f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v24, 0x3f666666    # 0.9f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, -0x40000000    # -2.0f

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    const v22, 0x3f8ccccd    # 1.1f

    .line 101
    .line 102
    .line 103
    const v23, -0x4099999a    # -0.9f

    .line 104
    .line 105
    .line 106
    const/high16 v24, 0x40000000    # 2.0f

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, -0x4099999a    # -0.9f

    .line 112
    .line 113
    .line 114
    const/high16 v6, -0x40000000    # -2.0f

    .line 115
    .line 116
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v25, 0x41400000    # 12.0f

    .line 120
    .line 121
    const/high16 v26, 0x40800000    # 4.0f

    .line 122
    .line 123
    const/high16 v21, 0x41200000    # 10.0f

    .line 124
    .line 125
    const v22, 0x409ccccd    # 4.9f

    .line 126
    .line 127
    .line 128
    const v23, 0x412e6666    # 10.9f

    .line 129
    .line 130
    .line 131
    const/high16 v24, 0x40800000    # 4.0f

    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v4, 0x412f0a3d    # 10.94f

    .line 140
    .line 141
    .line 142
    const/high16 v6, 0x41a00000    # 20.0f

    .line 143
    .line 144
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v4, 0x411c0000    # 9.75f

    .line 148
    .line 149
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v25, 0x41100000    # 9.0f

    .line 153
    .line 154
    const/high16 v26, 0x419a0000    # 19.25f

    .line 155
    .line 156
    const v21, 0x411570a4    # 9.34f

    .line 157
    .line 158
    .line 159
    const/high16 v22, 0x41a00000    # 20.0f

    .line 160
    .line 161
    const/high16 v23, 0x41100000    # 9.0f

    .line 162
    .line 163
    const v24, 0x419d47ae    # 19.66f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v25, 0x3f400000    # 0.75f

    .line 170
    .line 171
    const/high16 v26, -0x40c00000    # -0.75f

    .line 172
    .line 173
    const/16 v21, 0x0

    .line 174
    .line 175
    const v22, -0x412e147b    # -0.41f

    .line 176
    .line 177
    .line 178
    const v23, 0x3eae147b    # 0.34f

    .line 179
    .line 180
    .line 181
    const/high16 v24, -0x40c00000    # -0.75f

    .line 182
    .line 183
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, 0x3ff1eb85    # 1.89f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v4, 0x412f0a3d    # 10.94f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v4, 0x41900000    # 18.0f

    .line 202
    .line 203
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v4, -0x3f64cccd    # -4.85f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v4, -0x3f375c29    # -6.27f

    .line 213
    .line 214
    .line 215
    const v6, 0x403c28f6    # 2.94f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v25, 0x3fb33333    # 1.4f

    .line 222
    .line 223
    .line 224
    const v26, 0x3f1c28f6    # 0.61f

    .line 225
    .line 226
    .line 227
    const v21, 0x3f0a3d71    # 0.54f

    .line 228
    .line 229
    .line 230
    const v22, 0x3e4ccccd    # 0.2f

    .line 231
    .line 232
    .line 233
    const v23, 0x3f8147ae    # 1.01f

    .line 234
    .line 235
    .line 236
    const v24, 0x3ed1eb85    # 0.41f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v25, 0x41900000    # 18.0f

    .line 243
    .line 244
    const v26, 0x4173851f    # 15.22f

    .line 245
    .line 246
    .line 247
    const v21, 0x418e6666    # 17.8f

    .line 248
    .line 249
    .line 250
    const/high16 v22, 0x41680000    # 14.5f

    .line 251
    .line 252
    const/high16 v23, 0x41900000    # 18.0f

    .line 253
    .line 254
    const v24, 0x416d70a4    # 14.84f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v4, 0x41a00000    # 20.0f

    .line 261
    .line 262
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v4, 0x41b00000    # 22.0f

    .line 269
    .line 270
    const/high16 v6, 0x411c0000    # 9.75f

    .line 271
    .line 272
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v25, 0x40e00000    # 7.0f

    .line 276
    .line 277
    const/high16 v26, 0x419a0000    # 19.25f

    .line 278
    .line 279
    const v21, 0x4103ae14    # 8.23f

    .line 280
    .line 281
    .line 282
    const/high16 v22, 0x41b00000    # 22.0f

    .line 283
    .line 284
    const/high16 v23, 0x40e00000    # 7.0f

    .line 285
    .line 286
    const v24, 0x41a628f6    # 20.77f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v25, 0x40300000    # 2.75f

    .line 293
    .line 294
    const/high16 v26, -0x3fd00000    # -2.75f

    .line 295
    .line 296
    const/16 v21, 0x0

    .line 297
    .line 298
    const v22, -0x403d70a4    # -1.52f

    .line 299
    .line 300
    .line 301
    const v23, 0x3f9d70a4    # 1.23f

    .line 302
    .line 303
    .line 304
    const/high16 v24, -0x3fd00000    # -2.75f

    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v4, 0x40351eb8    # 2.83f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v4, 0x3fc66666    # 1.55f

    .line 316
    .line 317
    .line 318
    const v6, -0x3faccccd    # -3.3f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v25, 0x41400000    # 12.0f

    .line 325
    .line 326
    const/high16 v26, 0x41500000    # 13.0f

    .line 327
    .line 328
    const v21, 0x4157851f    # 13.47f

    .line 329
    .line 330
    .line 331
    const v22, 0x41511eb8    # 13.07f

    .line 332
    .line 333
    .line 334
    const v23, 0x414c28f6    # 12.76f

    .line 335
    .line 336
    .line 337
    const/high16 v24, 0x41500000    # 13.0f

    .line 338
    .line 339
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v25, -0x3f50a3d7    # -5.48f

    .line 343
    .line 344
    .line 345
    const v26, 0x3fab851f    # 1.34f

    .line 346
    .line 347
    .line 348
    const v21, -0x3fe851ec    # -2.37f

    .line 349
    .line 350
    .line 351
    const/16 v22, 0x0

    .line 352
    .line 353
    const v23, -0x3f76b852    # -4.29f

    .line 354
    .line 355
    .line 356
    const v24, 0x3f3ae148    # 0.73f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v25, 0x40c00000    # 6.0f

    .line 363
    .line 364
    const v26, 0x4173851f    # 15.22f

    .line 365
    .line 366
    .line 367
    const v21, 0x40c66666    # 6.2f

    .line 368
    .line 369
    .line 370
    const/high16 v22, 0x41680000    # 14.5f

    .line 371
    .line 372
    const/high16 v23, 0x40c00000    # 6.0f

    .line 373
    .line 374
    const v24, 0x416d70a4    # 14.84f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v4, 0x41b00000    # 22.0f

    .line 381
    .line 382
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v4, 0x411c0000    # 9.75f

    .line 386
    .line 387
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    const/16 v16, 0x3800

    .line 398
    .line 399
    const/16 v17, 0x0

    .line 400
    .line 401
    const v6, 0x3e99999a    # 0.3f

    .line 402
    .line 403
    .line 404
    const v8, 0x3e99999a    # 0.3f

    .line 405
    .line 406
    .line 407
    const/4 v7, 0x0

    .line 408
    const/high16 v9, 0x3f800000    # 1.0f

    .line 409
    .line 410
    const/high16 v12, 0x3f800000    # 1.0f

    .line 411
    .line 412
    const/4 v13, 0x0

    .line 413
    const/4 v14, 0x0

    .line 414
    const/4 v15, 0x0

    .line 415
    const-string v4, ""

    .line 416
    .line 417
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 418
    .line 419
    .line 420
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 425
    .line 426
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 427
    .line 428
    .line 429
    move-result-wide v6

    .line 430
    const/4 v0, 0x0

    .line 431
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 435
    .line 436
    .line 437
    move-result v10

    .line 438
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 439
    .line 440
    .line 441
    move-result v11

    .line 442
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 445
    .line 446
    .line 447
    const/high16 v0, 0x41200000    # 10.0f

    .line 448
    .line 449
    const/high16 v2, 0x41400000    # 12.0f

    .line 450
    .line 451
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v17, 0x40800000    # 4.0f

    .line 455
    .line 456
    const/high16 v18, -0x3f800000    # -4.0f

    .line 457
    .line 458
    const v13, 0x400d70a4    # 2.21f

    .line 459
    .line 460
    .line 461
    const/high16 v15, 0x40800000    # 4.0f

    .line 462
    .line 463
    const v16, -0x401ae148    # -1.79f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v17, -0x3f800000    # -4.0f

    .line 470
    .line 471
    const/4 v13, 0x0

    .line 472
    const v14, -0x3ff28f5c    # -2.21f

    .line 473
    .line 474
    .line 475
    const v15, -0x401ae148    # -1.79f

    .line 476
    .line 477
    .line 478
    const/high16 v16, -0x3f800000    # -4.0f

    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, 0x40728f5c    # 3.79f

    .line 484
    .line 485
    .line 486
    const/high16 v2, 0x40c00000    # 6.0f

    .line 487
    .line 488
    const/high16 v4, 0x41000000    # 8.0f

    .line 489
    .line 490
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v17, 0x41400000    # 12.0f

    .line 494
    .line 495
    const/high16 v18, 0x41200000    # 10.0f

    .line 496
    .line 497
    const/high16 v13, 0x41000000    # 8.0f

    .line 498
    .line 499
    const v14, 0x41035c29    # 8.21f

    .line 500
    .line 501
    .line 502
    const v15, 0x411ca3d7    # 9.79f

    .line 503
    .line 504
    .line 505
    const/high16 v16, 0x41200000    # 10.0f

    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v0, 0x40800000    # 4.0f

    .line 514
    .line 515
    const/high16 v2, 0x41400000    # 12.0f

    .line 516
    .line 517
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v17, 0x40000000    # 2.0f

    .line 521
    .line 522
    const/high16 v18, 0x40000000    # 2.0f

    .line 523
    .line 524
    const v13, 0x3f8ccccd    # 1.1f

    .line 525
    .line 526
    .line 527
    const/4 v14, 0x0

    .line 528
    const/high16 v15, 0x40000000    # 2.0f

    .line 529
    .line 530
    const v16, 0x3f666666    # 0.9f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v17, -0x40000000    # -2.0f

    .line 537
    .line 538
    const/4 v13, 0x0

    .line 539
    const v14, 0x3f8ccccd    # 1.1f

    .line 540
    .line 541
    .line 542
    const v15, -0x4099999a    # -0.9f

    .line 543
    .line 544
    .line 545
    const/high16 v16, 0x40000000    # 2.0f

    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v0, -0x4099999a    # -0.9f

    .line 551
    .line 552
    .line 553
    const/high16 v2, -0x40000000    # -2.0f

    .line 554
    .line 555
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v17, 0x41400000    # 12.0f

    .line 559
    .line 560
    const/high16 v18, 0x40800000    # 4.0f

    .line 561
    .line 562
    const/high16 v13, 0x41200000    # 10.0f

    .line 563
    .line 564
    const v14, 0x409ccccd    # 4.9f

    .line 565
    .line 566
    .line 567
    const v15, 0x412e6666    # 10.9f

    .line 568
    .line 569
    .line 570
    const/high16 v16, 0x40800000    # 4.0f

    .line 571
    .line 572
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v0, 0x41931eb8    # 18.39f

    .line 579
    .line 580
    .line 581
    const v2, 0x4148f5c3    # 12.56f

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v18, 0x41300000    # 11.0f

    .line 588
    .line 589
    const v13, 0x4185ae14    # 16.71f

    .line 590
    .line 591
    .line 592
    const v14, 0x413b3333    # 11.7f

    .line 593
    .line 594
    .line 595
    const v15, 0x41687ae1    # 14.53f

    .line 596
    .line 597
    .line 598
    const/high16 v16, 0x41300000    # 11.0f

    .line 599
    .line 600
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v17, -0x3f33851f    # -6.39f

    .line 604
    .line 605
    .line 606
    const v18, 0x3fc7ae14    # 1.56f

    .line 607
    .line 608
    .line 609
    const v13, -0x3fde147b    # -2.53f

    .line 610
    .line 611
    .line 612
    const/4 v14, 0x0

    .line 613
    const v15, -0x3f6947ae    # -4.71f

    .line 614
    .line 615
    .line 616
    const v16, 0x3f333333    # 0.7f

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v17, 0x40800000    # 4.0f

    .line 623
    .line 624
    const v18, 0x4173851f    # 15.22f

    .line 625
    .line 626
    .line 627
    const v13, 0x4093851f    # 4.61f

    .line 628
    .line 629
    .line 630
    const v14, 0x41511eb8    # 13.07f

    .line 631
    .line 632
    .line 633
    const/high16 v15, 0x40800000    # 4.0f

    .line 634
    .line 635
    const v16, 0x4161999a    # 14.1f

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/high16 v0, 0x41b00000    # 22.0f

    .line 642
    .line 643
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/high16 v0, 0x40000000    # 2.0f

    .line 647
    .line 648
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v0, -0x3f270a3d    # -6.78f

    .line 652
    .line 653
    .line 654
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v17, 0x3f051eb8    # 0.52f

    .line 658
    .line 659
    .line 660
    const v18, -0x409eb852    # -0.88f

    .line 661
    .line 662
    .line 663
    const/4 v13, 0x0

    .line 664
    const v14, -0x413d70a4    # -0.38f

    .line 665
    .line 666
    .line 667
    const v15, 0x3e4ccccd    # 0.2f

    .line 668
    .line 669
    .line 670
    const v16, -0x40c7ae14    # -0.72f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v17, 0x41400000    # 12.0f

    .line 677
    .line 678
    const/high16 v18, 0x41500000    # 13.0f

    .line 679
    .line 680
    const v13, 0x40f6b852    # 7.71f

    .line 681
    .line 682
    .line 683
    const v14, 0x415bae14    # 13.73f

    .line 684
    .line 685
    .line 686
    const v15, 0x411a147b    # 9.63f

    .line 687
    .line 688
    .line 689
    const/high16 v16, 0x41500000    # 13.0f

    .line 690
    .line 691
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const v17, 0x400851ec    # 2.13f

    .line 695
    .line 696
    .line 697
    const v18, 0x3e4ccccd    # 0.2f

    .line 698
    .line 699
    .line 700
    const v13, 0x3f428f5c    # 0.76f

    .line 701
    .line 702
    .line 703
    const/4 v14, 0x0

    .line 704
    const v15, 0x3fbc28f6    # 1.47f

    .line 705
    .line 706
    .line 707
    const v16, 0x3d8f5c29    # 0.07f

    .line 708
    .line 709
    .line 710
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const v0, -0x4039999a    # -1.55f

    .line 714
    .line 715
    .line 716
    const v2, 0x40533333    # 3.3f

    .line 717
    .line 718
    .line 719
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const/high16 v0, 0x411c0000    # 9.75f

    .line 723
    .line 724
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/high16 v17, 0x40e00000    # 7.0f

    .line 728
    .line 729
    const/high16 v18, 0x419a0000    # 19.25f

    .line 730
    .line 731
    const v13, 0x4103ae14    # 8.23f

    .line 732
    .line 733
    .line 734
    const/high16 v14, 0x41840000    # 16.5f

    .line 735
    .line 736
    const/high16 v15, 0x40e00000    # 7.0f

    .line 737
    .line 738
    const v16, 0x418dd70a    # 17.73f

    .line 739
    .line 740
    .line 741
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const/high16 v17, 0x411c0000    # 9.75f

    .line 745
    .line 746
    const/high16 v18, 0x41b00000    # 22.0f

    .line 747
    .line 748
    const/high16 v13, 0x40e00000    # 7.0f

    .line 749
    .line 750
    const v14, 0x41a628f6    # 20.77f

    .line 751
    .line 752
    .line 753
    const v15, 0x4103ae14    # 8.23f

    .line 754
    .line 755
    .line 756
    const/high16 v16, 0x41b00000    # 22.0f

    .line 757
    .line 758
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v0, 0x400b851f    # 2.18f

    .line 762
    .line 763
    .line 764
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const/high16 v0, 0x41900000    # 18.0f

    .line 768
    .line 769
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const/high16 v17, 0x40000000    # 2.0f

    .line 773
    .line 774
    const/high16 v18, -0x40000000    # -2.0f

    .line 775
    .line 776
    const v13, 0x3f8ccccd    # 1.1f

    .line 777
    .line 778
    .line 779
    const/4 v14, 0x0

    .line 780
    const/high16 v15, 0x40000000    # 2.0f

    .line 781
    .line 782
    const v16, -0x4099999a    # -0.9f

    .line 783
    .line 784
    .line 785
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const v0, -0x3f670a3d    # -4.78f

    .line 789
    .line 790
    .line 791
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const v17, 0x41931eb8    # 18.39f

    .line 795
    .line 796
    .line 797
    const v18, 0x4148f5c3    # 12.56f

    .line 798
    .line 799
    .line 800
    const/high16 v13, 0x41a00000    # 20.0f

    .line 801
    .line 802
    const v14, 0x4161999a    # 14.1f

    .line 803
    .line 804
    .line 805
    const v15, 0x419b1eb8    # 19.39f

    .line 806
    .line 807
    .line 808
    const v16, 0x41511eb8    # 13.07f

    .line 809
    .line 810
    .line 811
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const v0, 0x412f0a3d    # 10.94f

    .line 818
    .line 819
    .line 820
    const/high16 v2, 0x41a00000    # 20.0f

    .line 821
    .line 822
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const/high16 v0, 0x411c0000    # 9.75f

    .line 826
    .line 827
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const/high16 v17, 0x41100000    # 9.0f

    .line 831
    .line 832
    const/high16 v18, 0x419a0000    # 19.25f

    .line 833
    .line 834
    const v13, 0x411570a4    # 9.34f

    .line 835
    .line 836
    .line 837
    const/high16 v14, 0x41a00000    # 20.0f

    .line 838
    .line 839
    const/high16 v15, 0x41100000    # 9.0f

    .line 840
    .line 841
    const v16, 0x419d47ae    # 19.66f

    .line 842
    .line 843
    .line 844
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const/high16 v17, 0x3f400000    # 0.75f

    .line 848
    .line 849
    const/high16 v18, -0x40c00000    # -0.75f

    .line 850
    .line 851
    const/4 v13, 0x0

    .line 852
    const v14, -0x412e147b    # -0.41f

    .line 853
    .line 854
    .line 855
    const v15, 0x3eae147b    # 0.34f

    .line 856
    .line 857
    .line 858
    const/high16 v16, -0x40c00000    # -0.75f

    .line 859
    .line 860
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const v0, 0x3ff1eb85    # 1.89f

    .line 864
    .line 865
    .line 866
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    const v0, 0x412f0a3d    # 10.94f

    .line 870
    .line 871
    .line 872
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    const/high16 v0, 0x41900000    # 18.0f

    .line 879
    .line 880
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const v0, -0x3f64cccd    # -4.85f

    .line 884
    .line 885
    .line 886
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 887
    .line 888
    .line 889
    const v0, -0x3f375c29    # -6.27f

    .line 890
    .line 891
    .line 892
    const v2, 0x403c28f6    # 2.94f

    .line 893
    .line 894
    .line 895
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 896
    .line 897
    .line 898
    const v17, 0x3fb33333    # 1.4f

    .line 899
    .line 900
    .line 901
    const v18, 0x3f1c28f6    # 0.61f

    .line 902
    .line 903
    .line 904
    const v13, 0x3f0a3d71    # 0.54f

    .line 905
    .line 906
    .line 907
    const v14, 0x3e4ccccd    # 0.2f

    .line 908
    .line 909
    .line 910
    const v15, 0x3f8147ae    # 1.01f

    .line 911
    .line 912
    .line 913
    const v16, 0x3ed1eb85    # 0.41f

    .line 914
    .line 915
    .line 916
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 917
    .line 918
    .line 919
    const/high16 v17, 0x41900000    # 18.0f

    .line 920
    .line 921
    const v18, 0x4173851f    # 15.22f

    .line 922
    .line 923
    .line 924
    const v13, 0x418e6666    # 17.8f

    .line 925
    .line 926
    .line 927
    const/high16 v14, 0x41680000    # 14.5f

    .line 928
    .line 929
    const/high16 v15, 0x41900000    # 18.0f

    .line 930
    .line 931
    const v16, 0x416d70a4    # 14.84f

    .line 932
    .line 933
    .line 934
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    const/high16 v0, 0x41a00000    # 20.0f

    .line 938
    .line 939
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 940
    .line 941
    .line 942
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 943
    .line 944
    .line 945
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    const/16 v16, 0x3800

    .line 950
    .line 951
    const/16 v17, 0x0

    .line 952
    .line 953
    const/high16 v6, 0x3f800000    # 1.0f

    .line 954
    .line 955
    const/high16 v8, 0x3f800000    # 1.0f

    .line 956
    .line 957
    const/4 v7, 0x0

    .line 958
    const/high16 v12, 0x3f800000    # 1.0f

    .line 959
    .line 960
    const/4 v13, 0x0

    .line 961
    const/4 v14, 0x0

    .line 962
    const/4 v15, 0x0

    .line 963
    const-string v4, ""

    .line 964
    .line 965
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 970
    .line 971
    .line 972
    move-result-object v0

    .line 973
    sput-object v0, Landroidx/compose/material/icons/twotone/PersonalInjuryKt;->_personalInjury:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 974
    .line 975
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 976
    .line 977
    .line 978
    return-object v0
.end method
