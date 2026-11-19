.class public final Landroidx/compose/material/icons/rounded/SettingsAccessibilityKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_settingsAccessibility",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SettingsAccessibility",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSettingsAccessibility",
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
        "SMAP\nSettingsAccessibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsAccessibility.kt\nandroidx/compose/material/icons/rounded/SettingsAccessibilityKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,96:1\n212#2,12:97\n233#2,18:110\n253#2:147\n174#3:109\n705#4,2:128\n717#4,2:130\n719#4,11:136\n72#5,4:132\n*S KotlinDebug\n*F\n+ 1 SettingsAccessibility.kt\nandroidx/compose/material/icons/rounded/SettingsAccessibilityKt\n*L\n29#1:97,12\n30#1:110,18\n30#1:147\n29#1:109\n30#1:128,2\n30#1:130,2\n30#1:136,11\n30#1:132,4\n*E\n"
    }
.end annotation


# static fields
.field private static _settingsAccessibility:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsAccessibility(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SettingsAccessibilityKt;->_settingsAccessibility:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SettingsAccessibility"

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
    const v0, 0x409eb852    # 4.96f

    .line 71
    .line 72
    .line 73
    const v2, 0x41a5eb85    # 20.74f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x40666666    # -1.2f

    .line 80
    .line 81
    .line 82
    const v18, -0x40c51eb8    # -0.73f

    .line 83
    .line 84
    .line 85
    const v13, -0x41fae148    # -0.13f

    .line 86
    .line 87
    .line 88
    const v14, -0x40f851ec    # -0.53f

    .line 89
    .line 90
    .line 91
    const v15, -0x40d47ae1    # -0.67f

    .line 92
    .line 93
    .line 94
    const v16, -0x40a66666    # -0.85f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, 0x41400000    # 12.0f

    .line 101
    .line 102
    const/high16 v18, 0x40a00000    # 5.0f

    .line 103
    .line 104
    const v13, 0x418947ae    # 17.16f

    .line 105
    .line 106
    .line 107
    const v14, 0x4098a3d7    # 4.77f

    .line 108
    .line 109
    .line 110
    const v15, 0x4167d70a    # 14.49f

    .line 111
    .line 112
    .line 113
    const/high16 v16, 0x40a00000    # 5.0f

    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, 0x408eb852    # 4.46f

    .line 119
    .line 120
    .line 121
    const v2, 0x4087ae14    # 4.24f

    .line 122
    .line 123
    .line 124
    const v4, 0x40dae148    # 6.84f

    .line 125
    .line 126
    .line 127
    const v6, 0x4098a3d7    # 4.77f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v17, -0x40666666    # -1.2f

    .line 134
    .line 135
    .line 136
    const v18, 0x3f3ae148    # 0.73f

    .line 137
    .line 138
    .line 139
    const v13, -0x40f5c28f    # -0.54f

    .line 140
    .line 141
    .line 142
    const v14, -0x420a3d71    # -0.12f

    .line 143
    .line 144
    .line 145
    const v15, -0x40770a3d    # -1.07f

    .line 146
    .line 147
    .line 148
    const v16, 0x3e428f5c    # 0.19f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, 0x404f5c29    # 3.24f

    .line 155
    .line 156
    .line 157
    const v2, 0x40a0a3d7    # 5.02f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, 0x407e147b    # 3.97f

    .line 164
    .line 165
    .line 166
    const v18, 0x40c7ae14    # 6.24f

    .line 167
    .line 168
    .line 169
    const v13, 0x40470a3d    # 3.11f

    .line 170
    .line 171
    .line 172
    const v14, 0x40b1eb85    # 5.56f

    .line 173
    .line 174
    .line 175
    const v15, 0x405b851f    # 3.43f

    .line 176
    .line 177
    .line 178
    const v16, 0x40c3d70a    # 6.12f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v17, 0x41100000    # 9.0f

    .line 185
    .line 186
    const/high16 v18, 0x40e00000    # 7.0f

    .line 187
    .line 188
    const v13, 0x40b2e148    # 5.59f

    .line 189
    .line 190
    .line 191
    const v14, 0x40d3851f    # 6.61f

    .line 192
    .line 193
    .line 194
    const v15, 0x40eae148    # 7.34f

    .line 195
    .line 196
    .line 197
    const v16, 0x40db851f    # 6.86f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, 0x41300000    # 11.0f

    .line 204
    .line 205
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v17, 0x3f800000    # 1.0f

    .line 209
    .line 210
    const/high16 v18, 0x3f800000    # 1.0f

    .line 211
    .line 212
    const/4 v13, 0x0

    .line 213
    const v14, 0x3f0ccccd    # 0.55f

    .line 214
    .line 215
    .line 216
    const v15, 0x3ee66666    # 0.45f

    .line 217
    .line 218
    .line 219
    const/high16 v16, 0x3f800000    # 1.0f

    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/4 v0, 0x0

    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v18, -0x40800000    # -1.0f

    .line 229
    .line 230
    const v13, 0x3f0ccccd    # 0.55f

    .line 231
    .line 232
    .line 233
    const/4 v14, 0x0

    .line 234
    const/high16 v15, 0x3f800000    # 1.0f

    .line 235
    .line 236
    const v16, -0x4119999a    # -0.45f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v0, -0x3f600000    # -5.0f

    .line 243
    .line 244
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v0, 0x40000000    # 2.0f

    .line 248
    .line 249
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v0, 0x40a00000    # 5.0f

    .line 253
    .line 254
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v18, 0x3f800000    # 1.0f

    .line 258
    .line 259
    const/4 v13, 0x0

    .line 260
    const v14, 0x3f0ccccd    # 0.55f

    .line 261
    .line 262
    .line 263
    const v15, 0x3ee66666    # 0.45f

    .line 264
    .line 265
    .line 266
    const/high16 v16, 0x3f800000    # 1.0f

    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/4 v0, 0x0

    .line 272
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v18, -0x40800000    # -1.0f

    .line 276
    .line 277
    const v13, 0x3f0ccccd    # 0.55f

    .line 278
    .line 279
    .line 280
    const/4 v14, 0x0

    .line 281
    const/high16 v15, 0x3f800000    # 1.0f

    .line 282
    .line 283
    const v16, -0x4119999a    # -0.45f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v0, 0x40e00000    # 7.0f

    .line 290
    .line 291
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, 0x40a0f5c3    # 5.03f

    .line 295
    .line 296
    .line 297
    const v18, -0x40bd70a4    # -0.76f

    .line 298
    .line 299
    .line 300
    const v13, 0x3fd47ae1    # 1.66f

    .line 301
    .line 302
    .line 303
    const v14, -0x41f0a3d7    # -0.14f

    .line 304
    .line 305
    .line 306
    const v15, 0x405a3d71    # 3.41f

    .line 307
    .line 308
    .line 309
    const v16, -0x413851ec    # -0.39f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, 0x3f3ae148    # 0.73f

    .line 316
    .line 317
    .line 318
    const v18, -0x4063d70a    # -1.22f

    .line 319
    .line 320
    .line 321
    const v13, 0x3f0a3d71    # 0.54f

    .line 322
    .line 323
    .line 324
    const v14, -0x420a3d71    # -0.12f

    .line 325
    .line 326
    .line 327
    const v15, 0x3f5c28f6    # 0.86f

    .line 328
    .line 329
    .line 330
    const v16, -0x40d1eb85    # -0.68f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v0, 0x409eb852    # 4.96f

    .line 337
    .line 338
    .line 339
    const v2, 0x41a5eb85    # 20.74f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, 0x40800000    # 4.0f

    .line 349
    .line 350
    const/high16 v2, 0x41400000    # 12.0f

    .line 351
    .line 352
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v17, 0x40000000    # 2.0f

    .line 356
    .line 357
    const/high16 v18, -0x40000000    # -2.0f

    .line 358
    .line 359
    const v13, 0x3f8ccccd    # 1.1f

    .line 360
    .line 361
    .line 362
    const/4 v14, 0x0

    .line 363
    const/high16 v15, 0x40000000    # 2.0f

    .line 364
    .line 365
    const v16, -0x4099999a    # -0.9f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v0, -0x4099999a    # -0.9f

    .line 372
    .line 373
    .line 374
    const/high16 v2, -0x40000000    # -2.0f

    .line 375
    .line 376
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, 0x3f666666    # 0.9f

    .line 380
    .line 381
    .line 382
    const/high16 v2, 0x40000000    # 2.0f

    .line 383
    .line 384
    const/high16 v4, -0x40000000    # -2.0f

    .line 385
    .line 386
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x412e6666    # 10.9f

    .line 390
    .line 391
    .line 392
    const/high16 v2, 0x40800000    # 4.0f

    .line 393
    .line 394
    const/high16 v4, 0x41400000    # 12.0f

    .line 395
    .line 396
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x41000000    # 8.0f

    .line 403
    .line 404
    const/high16 v2, 0x41c00000    # 24.0f

    .line 405
    .line 406
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v17, 0x3f800000    # 1.0f

    .line 413
    .line 414
    const/high16 v18, -0x40800000    # -1.0f

    .line 415
    .line 416
    const v13, 0x3f0ccccd    # 0.55f

    .line 417
    .line 418
    .line 419
    const/high16 v15, 0x3f800000    # 1.0f

    .line 420
    .line 421
    const v16, -0x4119999a    # -0.45f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/4 v0, 0x0

    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v17, -0x40800000    # -1.0f

    .line 432
    .line 433
    const/4 v13, 0x0

    .line 434
    const v14, -0x40f33333    # -0.55f

    .line 435
    .line 436
    .line 437
    const v15, -0x4119999a    # -0.45f

    .line 438
    .line 439
    .line 440
    const/high16 v16, -0x40800000    # -1.0f

    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v18, 0x3f800000    # 1.0f

    .line 449
    .line 450
    const v13, -0x40f33333    # -0.55f

    .line 451
    .line 452
    .line 453
    const/4 v14, 0x0

    .line 454
    const/high16 v15, -0x40800000    # -1.0f

    .line 455
    .line 456
    const v16, 0x3ee66666    # 0.45f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v17, 0x41000000    # 8.0f

    .line 466
    .line 467
    const/high16 v18, 0x41c00000    # 24.0f

    .line 468
    .line 469
    const/high16 v13, 0x40e00000    # 7.0f

    .line 470
    .line 471
    const v14, 0x41bc6666    # 23.55f

    .line 472
    .line 473
    .line 474
    const v15, 0x40ee6666    # 7.45f

    .line 475
    .line 476
    .line 477
    const/high16 v16, 0x41c00000    # 24.0f

    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v0, 0x41400000    # 12.0f

    .line 486
    .line 487
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v17, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/high16 v18, -0x40800000    # -1.0f

    .line 496
    .line 497
    const v13, 0x3f0ccccd    # 0.55f

    .line 498
    .line 499
    .line 500
    const/4 v14, 0x0

    .line 501
    const/high16 v15, 0x3f800000    # 1.0f

    .line 502
    .line 503
    const v16, -0x4119999a    # -0.45f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/4 v0, 0x0

    .line 510
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v17, -0x40800000    # -1.0f

    .line 514
    .line 515
    const/4 v13, 0x0

    .line 516
    const v14, -0x40f33333    # -0.55f

    .line 517
    .line 518
    .line 519
    const v15, -0x4119999a    # -0.45f

    .line 520
    .line 521
    .line 522
    const/high16 v16, -0x40800000    # -1.0f

    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v18, 0x3f800000    # 1.0f

    .line 531
    .line 532
    const v13, -0x40f33333    # -0.55f

    .line 533
    .line 534
    .line 535
    const/4 v14, 0x0

    .line 536
    const/high16 v15, -0x40800000    # -1.0f

    .line 537
    .line 538
    const v16, 0x3ee66666    # 0.45f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v17, 0x41400000    # 12.0f

    .line 548
    .line 549
    const/high16 v18, 0x41c00000    # 24.0f

    .line 550
    .line 551
    const/high16 v13, 0x41300000    # 11.0f

    .line 552
    .line 553
    const v14, 0x41bc6666    # 23.55f

    .line 554
    .line 555
    .line 556
    const v15, 0x41373333    # 11.45f

    .line 557
    .line 558
    .line 559
    const/high16 v16, 0x41c00000    # 24.0f

    .line 560
    .line 561
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v0, 0x41800000    # 16.0f

    .line 568
    .line 569
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v17, 0x3f800000    # 1.0f

    .line 576
    .line 577
    const/high16 v18, -0x40800000    # -1.0f

    .line 578
    .line 579
    const v13, 0x3f0ccccd    # 0.55f

    .line 580
    .line 581
    .line 582
    const/4 v14, 0x0

    .line 583
    const/high16 v15, 0x3f800000    # 1.0f

    .line 584
    .line 585
    const v16, -0x4119999a    # -0.45f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/4 v0, 0x0

    .line 592
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/high16 v17, -0x40800000    # -1.0f

    .line 596
    .line 597
    const/4 v13, 0x0

    .line 598
    const v14, -0x40f33333    # -0.55f

    .line 599
    .line 600
    .line 601
    const v15, -0x4119999a    # -0.45f

    .line 602
    .line 603
    .line 604
    const/high16 v16, -0x40800000    # -1.0f

    .line 605
    .line 606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const/high16 v18, 0x3f800000    # 1.0f

    .line 613
    .line 614
    const v13, -0x40f33333    # -0.55f

    .line 615
    .line 616
    .line 617
    const/4 v14, 0x0

    .line 618
    const/high16 v15, -0x40800000    # -1.0f

    .line 619
    .line 620
    const v16, 0x3ee66666    # 0.45f

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/high16 v17, 0x41800000    # 16.0f

    .line 630
    .line 631
    const/high16 v18, 0x41c00000    # 24.0f

    .line 632
    .line 633
    const/high16 v13, 0x41700000    # 15.0f

    .line 634
    .line 635
    const v14, 0x41bc6666    # 23.55f

    .line 636
    .line 637
    .line 638
    const v15, 0x41773333    # 15.45f

    .line 639
    .line 640
    .line 641
    const/high16 v16, 0x41c00000    # 24.0f

    .line 642
    .line 643
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    const/16 v16, 0x3800

    .line 654
    .line 655
    const/16 v17, 0x0

    .line 656
    .line 657
    const/high16 v6, 0x3f800000    # 1.0f

    .line 658
    .line 659
    const/high16 v8, 0x3f800000    # 1.0f

    .line 660
    .line 661
    const/4 v7, 0x0

    .line 662
    const/high16 v9, 0x3f800000    # 1.0f

    .line 663
    .line 664
    const/high16 v12, 0x3f800000    # 1.0f

    .line 665
    .line 666
    const/4 v13, 0x0

    .line 667
    const/4 v14, 0x0

    .line 668
    const/4 v15, 0x0

    .line 669
    const-string v4, ""

    .line 670
    .line 671
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    sput-object v0, Landroidx/compose/material/icons/rounded/SettingsAccessibilityKt;->_settingsAccessibility:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 680
    .line 681
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 682
    .line 683
    .line 684
    return-object v0
.end method
