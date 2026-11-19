.class public final Landroidx/compose/material/icons/twotone/RestorePageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_restorePage",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "RestorePage",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getRestorePage",
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
        "SMAP\nRestorePage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RestorePage.kt\nandroidx/compose/material/icons/twotone/RestorePageKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n233#2,18:145\n253#2:182\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n705#4,2:163\n717#4,2:165\n719#4,11:171\n72#5,4:129\n72#5,4:167\n*S KotlinDebug\n*F\n+ 1 RestorePage.kt\nandroidx/compose/material/icons/twotone/RestorePageKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n54#1:145,18\n54#1:182\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n54#1:163,2\n54#1:165,2\n54#1:171,11\n30#1:129,4\n54#1:167,4\n*E\n"
    }
.end annotation


# static fields
.field private static _restorePage:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRestorePage(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/RestorePageKt;->_restorePage:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.RestorePage"

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
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41800000    # 16.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41400000    # 12.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, 0x410d47ae    # 8.83f

    .line 88
    .line 89
    .line 90
    const/high16 v6, 0x41900000    # 18.0f

    .line 91
    .line 92
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v4, 0x4152b852    # 13.17f

    .line 96
    .line 97
    .line 98
    const/high16 v6, 0x40800000    # 4.0f

    .line 99
    .line 100
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v4, 0x40800000    # 4.0f

    .line 104
    .line 105
    const/high16 v6, 0x40c00000    # 6.0f

    .line 106
    .line 107
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v4, 0x4185c28f    # 16.72f

    .line 114
    .line 115
    .line 116
    const/high16 v6, 0x41500000    # 13.0f

    .line 117
    .line 118
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, -0x3f700000    # -4.5f

    .line 122
    .line 123
    const/high16 v26, 0x40900000    # 4.5f

    .line 124
    .line 125
    const/16 v21, 0x0

    .line 126
    .line 127
    const v22, 0x401eb852    # 2.48f

    .line 128
    .line 129
    .line 130
    const v23, -0x3ffeb852    # -2.02f

    .line 131
    .line 132
    .line 133
    const/high16 v24, 0x40900000    # 4.5f

    .line 134
    .line 135
    move-object/from16 v20, v2

    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v25, -0x3f7c28f6    # -4.12f

    .line 141
    .line 142
    .line 143
    const v26, -0x3fd33333    # -2.7f

    .line 144
    .line 145
    .line 146
    const v21, -0x40147ae1    # -1.84f

    .line 147
    .line 148
    .line 149
    const/16 v22, 0x0

    .line 150
    .line 151
    const v23, -0x3fa47ae1    # -3.43f

    .line 152
    .line 153
    .line 154
    const v24, -0x4070a3d7    # -1.12f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v4, 0x3fc51eb8    # 1.54f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v25, 0x40251eb8    # 2.58f

    .line 167
    .line 168
    .line 169
    const v26, 0x3faccccd    # 1.35f

    .line 170
    .line 171
    .line 172
    const v21, 0x3f11eb85    # 0.57f

    .line 173
    .line 174
    .line 175
    const v22, 0x3f4f5c29    # 0.81f

    .line 176
    .line 177
    .line 178
    const v23, 0x3fc147ae    # 1.51f

    .line 179
    .line 180
    .line 181
    const v24, 0x3faccccd    # 1.35f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v25, 0x4049999a    # 3.15f

    .line 188
    .line 189
    .line 190
    const v26, -0x3fb66666    # -3.15f

    .line 191
    .line 192
    .line 193
    const v21, 0x3fdeb852    # 1.74f

    .line 194
    .line 195
    .line 196
    const/16 v22, 0x0

    .line 197
    .line 198
    const v23, 0x4049999a    # 3.15f

    .line 199
    .line 200
    .line 201
    const v24, -0x404b851f    # -1.41f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v4, -0x404b851f    # -1.41f

    .line 208
    .line 209
    .line 210
    const v6, -0x3fb66666    # -3.15f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v25, -0x3fcd70a4    # -2.79f

    .line 217
    .line 218
    .line 219
    const v26, 0x3fdae148    # 1.71f

    .line 220
    .line 221
    .line 222
    const v21, -0x40651eb8    # -1.21f

    .line 223
    .line 224
    .line 225
    const v23, -0x3feeb852    # -2.27f

    .line 226
    .line 227
    .line 228
    const v24, 0x3f333333    # 0.7f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v4, 0x412e147b    # 10.88f

    .line 235
    .line 236
    .line 237
    const/high16 v6, 0x41500000    # 13.0f

    .line 238
    .line 239
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v4, -0x3f99999a    # -3.6f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v4, 0x41166666    # 9.4f

    .line 249
    .line 250
    .line 251
    const v6, 0x40e8f5c3    # 7.28f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v4, 0x3f95c28f    # 1.17f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v25, 0x4071eb85    # 3.78f

    .line 264
    .line 265
    .line 266
    const v26, -0x3ffb851f    # -2.07f

    .line 267
    .line 268
    .line 269
    const v21, 0x3f4ccccd    # 0.8f

    .line 270
    .line 271
    .line 272
    const v22, -0x406147ae    # -1.24f

    .line 273
    .line 274
    .line 275
    const v23, 0x400c28f6    # 2.19f

    .line 276
    .line 277
    .line 278
    const v24, -0x3ffb851f    # -2.07f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v25, 0x408fae14    # 4.49f

    .line 285
    .line 286
    .line 287
    const/high16 v26, 0x40900000    # 4.5f

    .line 288
    .line 289
    const v21, 0x401eb852    # 2.48f

    .line 290
    .line 291
    .line 292
    const/16 v22, 0x0

    .line 293
    .line 294
    const v23, 0x408fae14    # 4.49f

    .line 295
    .line 296
    .line 297
    const v24, 0x400147ae    # 2.02f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    const/16 v16, 0x3800

    .line 311
    .line 312
    const/16 v17, 0x0

    .line 313
    .line 314
    const v6, 0x3e99999a    # 0.3f

    .line 315
    .line 316
    .line 317
    const v8, 0x3e99999a    # 0.3f

    .line 318
    .line 319
    .line 320
    const/4 v7, 0x0

    .line 321
    const/high16 v9, 0x3f800000    # 1.0f

    .line 322
    .line 323
    const/high16 v12, 0x3f800000    # 1.0f

    .line 324
    .line 325
    const/4 v13, 0x0

    .line 326
    const/4 v14, 0x0

    .line 327
    const/4 v15, 0x0

    .line 328
    const-string v4, ""

    .line 329
    .line 330
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 331
    .line 332
    .line 333
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 338
    .line 339
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 340
    .line 341
    .line 342
    move-result-wide v6

    .line 343
    const/4 v0, 0x0

    .line 344
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 348
    .line 349
    .line 350
    move-result v10

    .line 351
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 352
    .line 353
    .line 354
    move-result v11

    .line 355
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 358
    .line 359
    .line 360
    const/high16 v0, 0x41600000    # 14.0f

    .line 361
    .line 362
    const/high16 v2, 0x40000000    # 2.0f

    .line 363
    .line 364
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v0, 0x40000000    # 2.0f

    .line 368
    .line 369
    const/high16 v2, 0x40c00000    # 6.0f

    .line 370
    .line 371
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v17, -0x400147ae    # -1.99f

    .line 375
    .line 376
    .line 377
    const/high16 v18, 0x40000000    # 2.0f

    .line 378
    .line 379
    const v13, -0x40733333    # -1.1f

    .line 380
    .line 381
    .line 382
    const v15, -0x400147ae    # -1.99f

    .line 383
    .line 384
    .line 385
    const v16, 0x3f666666    # 0.9f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, 0x41a00000    # 20.0f

    .line 392
    .line 393
    const/high16 v2, 0x40800000    # 4.0f

    .line 394
    .line 395
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, 0x3ffeb852    # 1.99f

    .line 399
    .line 400
    .line 401
    const/4 v13, 0x0

    .line 402
    const v14, 0x3f8ccccd    # 1.1f

    .line 403
    .line 404
    .line 405
    const v15, 0x3f63d70a    # 0.89f

    .line 406
    .line 407
    .line 408
    const/high16 v16, 0x40000000    # 2.0f

    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v0, 0x41b00000    # 22.0f

    .line 414
    .line 415
    const/high16 v2, 0x41900000    # 18.0f

    .line 416
    .line 417
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v17, 0x40000000    # 2.0f

    .line 421
    .line 422
    const/high16 v18, -0x40000000    # -2.0f

    .line 423
    .line 424
    const v13, 0x3f8ccccd    # 1.1f

    .line 425
    .line 426
    .line 427
    const/4 v14, 0x0

    .line 428
    const/high16 v15, 0x40000000    # 2.0f

    .line 429
    .line 430
    const v16, -0x4099999a    # -0.9f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v0, 0x41000000    # 8.0f

    .line 437
    .line 438
    const/high16 v2, 0x41a00000    # 20.0f

    .line 439
    .line 440
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v0, -0x3f400000    # -6.0f

    .line 444
    .line 445
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v0, 0x41a00000    # 20.0f

    .line 452
    .line 453
    const/high16 v2, 0x41900000    # 18.0f

    .line 454
    .line 455
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v2, 0x40c00000    # 6.0f

    .line 459
    .line 460
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v0, 0x40800000    # 4.0f

    .line 464
    .line 465
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, 0x40e570a4    # 7.17f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x410d47ae    # 8.83f

    .line 475
    .line 476
    .line 477
    const/high16 v2, 0x41900000    # 18.0f

    .line 478
    .line 479
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v0, 0x41a00000    # 20.0f

    .line 483
    .line 484
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, 0x41073333    # 8.45f

    .line 491
    .line 492
    .line 493
    const v2, 0x41291eb8    # 10.57f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, 0x41166666    # 9.4f

    .line 500
    .line 501
    .line 502
    const v2, 0x40e8f5c3    # 7.28f

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, 0x40e8f5c3    # 7.28f

    .line 509
    .line 510
    .line 511
    const/high16 v2, 0x41500000    # 13.0f

    .line 512
    .line 513
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v0, 0x40666666    # 3.6f

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v0, -0x4047ae14    # -1.44f

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v17, 0x40328f5c    # 2.79f

    .line 529
    .line 530
    .line 531
    const v18, -0x40251eb8    # -1.71f

    .line 532
    .line 533
    .line 534
    const v13, 0x3f051eb8    # 0.52f

    .line 535
    .line 536
    .line 537
    const v14, -0x407eb852    # -1.01f

    .line 538
    .line 539
    .line 540
    const v15, 0x3fca3d71    # 1.58f

    .line 541
    .line 542
    .line 543
    const v16, -0x40251eb8    # -1.71f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v17, 0x4049999a    # 3.15f

    .line 550
    .line 551
    .line 552
    const v18, 0x4049999a    # 3.15f

    .line 553
    .line 554
    .line 555
    const v13, 0x3fdeb852    # 1.74f

    .line 556
    .line 557
    .line 558
    const/4 v14, 0x0

    .line 559
    const v15, 0x4049999a    # 3.15f

    .line 560
    .line 561
    .line 562
    const v16, 0x3fb47ae1    # 1.41f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v0, 0x4049999a    # 3.15f

    .line 569
    .line 570
    .line 571
    const v2, -0x404b851f    # -1.41f

    .line 572
    .line 573
    .line 574
    const v4, -0x3fb66666    # -3.15f

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v17, -0x3fdae148    # -2.58f

    .line 581
    .line 582
    .line 583
    const v18, -0x40533333    # -1.35f

    .line 584
    .line 585
    .line 586
    const v13, -0x40770a3d    # -1.07f

    .line 587
    .line 588
    .line 589
    const v15, -0x3ffeb852    # -2.02f

    .line 590
    .line 591
    .line 592
    const v16, -0x40f5c28f    # -0.54f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v0, 0x4101999a    # 8.1f

    .line 599
    .line 600
    .line 601
    const v2, 0x416ccccd    # 14.8f

    .line 602
    .line 603
    .line 604
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v17, 0x4083d70a    # 4.12f

    .line 608
    .line 609
    .line 610
    const v18, 0x402ccccd    # 2.7f

    .line 611
    .line 612
    .line 613
    const v13, 0x3f30a3d7    # 0.69f

    .line 614
    .line 615
    .line 616
    const v14, 0x3fca3d71    # 1.58f

    .line 617
    .line 618
    .line 619
    const v15, 0x4011eb85    # 2.28f

    .line 620
    .line 621
    .line 622
    const v16, 0x402ccccd    # 2.7f

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v17, 0x40900000    # 4.5f

    .line 629
    .line 630
    const/high16 v18, -0x3f700000    # -4.5f

    .line 631
    .line 632
    const v13, 0x401eb852    # 2.48f

    .line 633
    .line 634
    .line 635
    const/4 v14, 0x0

    .line 636
    const/high16 v15, 0x40900000    # 4.5f

    .line 637
    .line 638
    const v16, -0x3ffeb852    # -2.02f

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v0, -0x3ffeb852    # -2.02f

    .line 645
    .line 646
    .line 647
    const/high16 v2, -0x3f700000    # -4.5f

    .line 648
    .line 649
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v17, -0x3f8eb852    # -3.77f

    .line 653
    .line 654
    .line 655
    const v18, 0x40047ae1    # 2.07f

    .line 656
    .line 657
    .line 658
    const v13, -0x40347ae1    # -1.59f

    .line 659
    .line 660
    .line 661
    const v15, -0x3fc1eb85    # -2.97f

    .line 662
    .line 663
    .line 664
    const v16, 0x3f547ae1    # 0.83f

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 674
    .line 675
    .line 676
    move-result-object v2

    .line 677
    const/16 v16, 0x3800

    .line 678
    .line 679
    const/16 v17, 0x0

    .line 680
    .line 681
    const/high16 v6, 0x3f800000    # 1.0f

    .line 682
    .line 683
    const/high16 v8, 0x3f800000    # 1.0f

    .line 684
    .line 685
    const/4 v7, 0x0

    .line 686
    const/high16 v12, 0x3f800000    # 1.0f

    .line 687
    .line 688
    const/4 v13, 0x0

    .line 689
    const/4 v15, 0x0

    .line 690
    const-string v4, ""

    .line 691
    .line 692
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    sput-object v0, Landroidx/compose/material/icons/twotone/RestorePageKt;->_restorePage:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 701
    .line 702
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 703
    .line 704
    .line 705
    return-object v0
.end method
